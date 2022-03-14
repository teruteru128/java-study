package com.twitter.teruteru128.study.bitmessage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddress;
import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddressGenerator;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/a5773999fe1d6791bfc0cbb830527a5b29b84f5d/src/class_addressGenerator.py
 */
public class DeterministicAddressesGenerator implements Function<String, byte[]> {

    private static final class SearchRangeFactoryImplementation implements SearchRangeFactory {
        private SearchRange range = new SearchRange(0, Integer.MAX_VALUE);

        @Override
        public synchronized SearchRange getInstance() {
            var r = range;
            range = null;
            return r;
        }
    }

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }
    SearchRangeFactory factory;

    public DeterministicAddressesGenerator(SearchRangeFactory factory) {
        this.factory = factory;
    }

    public DeterministicAddressesGenerator() {
        this(new SearchRangeFactoryImplementation());
    }

    /**
     * private key = sha512(passphraseBytes || nonce)
     * 
     * @param privateKey
     * @param passphraseBytes
     * @param nonce
     */
    public void deriviedPrivateKey(byte[] privateKey, byte[] passphraseBytes, int nonce) {
        try {
            MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
            deriviedPrivateKey(privateKey, passphraseBytes, nonce, sha512);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * private key = sha512(passphraseBytes || nonce)
     * 
     * @param privateKey
     * @param passphraseBytes
     * @param nonce
     */
    public void deriviedPrivateKey(byte[] privateKey, byte[] passphraseBytes, long nonce, MessageDigest sha512) {
        Objects.requireNonNull(privateKey);
        if (privateKey.length < Const.SHA512_DIGEST_LENGTH) {
            throw new IllegalArgumentException("private key is too short");
        }
        try {
            sha512.update(passphraseBytes);
            sha512.update(Structs.encodeVarint(nonce));
            sha512.digest(privateKey, 0, Const.SHA512_DIGEST_LENGTH);
        } catch (DigestException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 
     * @param privateKey
     * @return
     */
    public byte[] deriviedPublicKey(byte[] privateKey) {
        Objects.requireNonNull(privateKey);
        if (privateKey.length < Const.PRIVATE_KEY_LENGTH) {
            throw new IllegalArgumentException("public key is too short");
        }
        return Const.G.multiply(new BigInteger(1, privateKey, 0, Const.PRIVATE_KEY_LENGTH)).normalize()
                .getEncoded(false);
    }

    public void deriviedRipeHash(byte[] ripe, byte[] signPubKey, byte[] encPubKey) {
        try {
            MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
            MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
            deriviedRipeHash(ripe, signPubKey, encPubKey, sha512, ripemd160);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public void deriviedRipeHash(byte[] ripe, byte[] signPubKey, byte[] encPubKey, MessageDigest sha512,
            MessageDigest ripemd160) {
        Objects.requireNonNull(ripe);
        if (ripe.length < 20) {
            throw new IllegalArgumentException("ripe is too short");
        }
        Objects.requireNonNull(signPubKey);
        Objects.requireNonNull(encPubKey);
        try {
            sha512.update(signPubKey);
            sha512.update(encPubKey);

            byte[] cache64 = new byte[Const.SHA512_DIGEST_LENGTH];
            sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
            ripemd160.update(cache64);
            ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);
        } catch (DigestException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public byte[] apply(String passphrase) {
        int numberOfNullBytesDemandedOnFrontOfRipeHash = 32;
        long signingKeyNonce = 0;
        long signingKeyNonceMax = 0;
        long encryptionKeyNonce = 1;
        final byte[] potentialPrivSigningKey = new byte[64];
        byte[] potentialPubSigningKey = null;
        final byte[] potentialPrivEncryptionKey = new byte[64];
        byte[] potentialPubEncryptionKey = null;

        int nlz = 0;
        var buffer = ByteBuffer.allocate(20);
        var longBuffer = buffer.asLongBuffer();
        final byte[] ripe = buffer.array();
        final byte[] passphraseBytes = passphrase.getBytes(StandardCharsets.UTF_8);
        SearchRange range = null;
        try {
            MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
            MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
            while (nlz < numberOfNullBytesDemandedOnFrontOfRipeHash && (range = factory.getInstance()) != null) {
                System.out.printf("%12d以上%12d以下の探索を始めるのだ！%n", range.getMin(), range.getMax());
                signingKeyNonce = range.getMin();
                encryptionKeyNonce = range.getMin() + 1;
                signingKeyNonceMax = range.getMax();
                for (; signingKeyNonce <= signingKeyNonceMax
                        && nlz < numberOfNullBytesDemandedOnFrontOfRipeHash; signingKeyNonce += 2, encryptionKeyNonce += 2) {
                    deriviedPrivateKey(potentialPrivSigningKey, passphraseBytes, signingKeyNonce, sha512);
                    deriviedPrivateKey(potentialPrivEncryptionKey, passphraseBytes, encryptionKeyNonce, sha512);
                    potentialPubSigningKey = deriviedPublicKey(potentialPrivSigningKey);
                    potentialPubEncryptionKey = deriviedPublicKey(potentialPrivEncryptionKey);
                    deriviedRipeHash(ripe, potentialPubSigningKey, potentialPubEncryptionKey, sha512, ripemd160);
                    nlz = Long.numberOfLeadingZeros(longBuffer.get(0));
                }
                System.out.printf("%12d以上%12d以下の探索が終わったのだ！%n", range.getMin(), range.getMax());
            }
        } catch (NoSuchAlgorithmException e) {
            throw new InternalError(e);
        }
        if (nlz < numberOfNullBytesDemandedOnFrontOfRipeHash) {
            System.out.println("ぐえー");
        }
        var signPrivateKeyWIF = BMAddressGenerator.encodeWIF(Arrays.copyOf(potentialPrivSigningKey, 32));
        var encPrivateKeyWIF = BMAddressGenerator.encodeWIF(Arrays.copyOf(potentialPrivEncryptionKey, 32));
        System.out.printf(
                "{\"signingKeyNonce\" : %d, \"encryptionKeyNonce\" : %d, \"privsigningkey\" :\"%s\", \"privencryptionkey\" : \"%s\"}%n",
                signingKeyNonce, encryptionKeyNonce, signPrivateKeyWIF, encPrivateKeyWIF);
        return ripe;
    }

    public static void main(String[] args) throws Exception {
        var calcurator = new DeterministicAddressesGenerator();
        var passphrase = "UVB-76";
        var ripe = calcurator.apply(passphrase);
        var address3 = BMAddress.encodeAddress(3, 1, ripe);
        var address4 = BMAddress.encodeAddress(4, 1, ripe);
        System.out.println(address3);
        System.out.println(address4);
    }

}
