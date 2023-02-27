package com.twitter.teruteru128.bitmessage.app;

import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.twitter.teruteru128.bitmessage.Const;
import com.twitter.teruteru128.bitmessage.DeterministicAddress;
import com.twitter.teruteru128.bitmessage.Structs;
import com.twitter.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.twitter.teruteru128.bitmessage.spec.BMAddress;

/**
 * @see https://github.com/Bitmessage/PyBitmessage/blob/a5773999fe1d6791bfc0cbb830527a5b29b84f5d/src/class_addressGenerator.py
 */
public class DeterministicAddressesGenerator implements Function<String, List<DeterministicAddress>> {

    private final class DeterministicAddressesImplementation implements DeterministicAddress, Serializable {
        private static final long serialVersionUID = 0;
        private byte[] ripe;
        private byte[] signingPrivateKey;
        private byte[] encryptionPrivateKey;
        private long signingKeyNonce;
        private long encryptionKeyNonce;

        public DeterministicAddressesImplementation(byte[] ripe, byte[] a, byte[] b, long signingKeyNonce,
                long encryptionKeyNonce) {
            this.ripe = ripe.clone();
            this.signingPrivateKey = a.clone();
            this.encryptionPrivateKey = b.clone();
            this.signingKeyNonce = signingKeyNonce;
            this.encryptionKeyNonce = encryptionKeyNonce;
        }

        @Override
        public byte[] getRipe() {
            return ripe;
        }

        @Override
        public byte[] getSigningPrivateKey() {
            return signingPrivateKey;
        }

        @Override
        public byte[] getEncryptionPrivateKey() {
            return encryptionPrivateKey;
        }

        @Override
        public long getSigningKeyNonce() {
            return signingKeyNonce;
        }

        @Override
        public long getEncryptionKeyNonce() {
            return encryptionKeyNonce;
        }
    }

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    public DeterministicAddressesGenerator() {
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
    public List<DeterministicAddress> apply(String passphrase) {
        int numberOfNullBytesDemandedOnFrontOfRipeHash = 8;
        long signingKeyNonce = 0;
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
        List<DeterministicAddress> list = new LinkedList<>();
        try {
            MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
            MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
            for (; nlz < numberOfNullBytesDemandedOnFrontOfRipeHash; signingKeyNonce += 2, encryptionKeyNonce += 2) {
                deriviedPrivateKey(potentialPrivSigningKey, passphraseBytes, signingKeyNonce, sha512);
                deriviedPrivateKey(potentialPrivEncryptionKey, passphraseBytes, encryptionKeyNonce, sha512);
                potentialPubSigningKey = deriviedPublicKey(potentialPrivSigningKey);
                potentialPubEncryptionKey = deriviedPublicKey(potentialPrivEncryptionKey);
                deriviedRipeHash(ripe, potentialPubSigningKey, potentialPubEncryptionKey, sha512, ripemd160);
                nlz = Long.numberOfLeadingZeros(longBuffer.get(0));
                if (nlz >= numberOfNullBytesDemandedOnFrontOfRipeHash) {
                    deriviedPrivateKey(potentialPrivSigningKey, passphraseBytes, signingKeyNonce, sha512);
                    list.add(new DeterministicAddressesImplementation(ripe, potentialPrivSigningKey,
                            potentialPrivEncryptionKey, signingKeyNonce, encryptionKeyNonce));
                }
            }
        } catch (NoSuchAlgorithmException e) {
            throw new InternalError(e);
        }
        return list;
    }

    public static String encodeAddress(DeterministicAddress address, int addressVersion, String passphrase) {
        return new StringBuilder(351 + passphrase.length()).append('[').append(BMAddress.encodeAddress(addressVersion, 1, address.getRipe()))
                .append("]\nlabel = [chan] ").append(passphrase)
                .append("\nenabled = true\ndecoy = false\nchan = true\nnoncetrialsperbyte = 1000\npayloadlengthextrabytes = 1000\nsigningKeyNonce = ")
                .append(address.getSigningKeyNonce()).append("\nencryptionKeyNonce = ")
                .append(address.getEncryptionKeyNonce()).append("\nprivsigningkey = ").append(BMAddressGenerator
                        .encodeWIF(Arrays.copyOf(address.getSigningPrivateKey(), 32)))
                .append("\nprivencryptionkey = ").append(BMAddressGenerator
                        .encodeWIF(Arrays.copyOf(address.getEncryptionPrivateKey(), 32)))
                .append("\n").toString();
    }

    public static void main(String channelName) throws Exception {
        Objects.requireNonNull(channelName, "チャンネル名を指定してください。");
        var calcurator = new DeterministicAddressesGenerator();
        var passphrase = channelName;
        // XXX findFirstで探せるようにSteamでやるべき……？
        var addressList = calcurator.apply(passphrase);
        if (addressList.isEmpty()) {
            System.out.println("ぐえー");
        } else {
            for (DeterministicAddress address : addressList) {
                for (int addressVersion = 3; addressVersion < 5; addressVersion++) {
                    System.out.println(encodeAddress(address, addressVersion, passphrase));
                }
            }
        }
    }

}
