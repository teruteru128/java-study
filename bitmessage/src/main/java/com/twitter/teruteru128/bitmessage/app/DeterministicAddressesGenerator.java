package com.twitter.teruteru128.bitmessage.app;

import com.twitter.teruteru128.bitmessage.Const;
import com.twitter.teruteru128.bitmessage.DeterministicAddress;
import com.twitter.teruteru128.bitmessage.Structs;
import com.twitter.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.twitter.teruteru128.bitmessage.spec.AddressFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.Serializable;
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

/**
 * @see <a href="https://github.com/Bitmessage/PyBitmessage/blob/a5773999fe1d6791bfc0cbb830527a5b29b84f5d/src/class_addressGenerator.py">class_addressGenerator.py</a>
 */
public class DeterministicAddressesGenerator implements Function<String, DeterministicAddress> {

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
    public static void deriviedPrivateKey(byte[] privateKey, byte[] passphraseBytes, int nonce) {
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
    public static void deriviedPrivateKey(byte[] privateKey, byte[] passphraseBytes, long nonce, MessageDigest sha512) {
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
     * @param privateKey
     * @return
     */
    public static byte[] deriviedPublicKey(byte[] privateKey) {
        Objects.requireNonNull(privateKey);
        if (privateKey.length < Const.PRIVATE_KEY_LENGTH) {
            throw new IllegalArgumentException("public key is too short");
        }
        return Const.G.multiply(new BigInteger(1, privateKey, 0, Const.PRIVATE_KEY_LENGTH)).normalize()
                .getEncoded(false);
    }

    public static void deriviedRipeHash(byte[] ripe, byte[] signPubKey, byte[] encPubKey) {
        try {
            MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
            MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
            deriviedRipeHash(ripe, signPubKey, encPubKey, sha512, ripemd160);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deriviedRipeHash(byte[] ripe, byte[] signPubKey, byte[] encPubKey, MessageDigest sha512,
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

    public static String encodeAddress(DeterministicAddress address, int addressVersion, String passphrase) {
        var encodedAddress = AddressFactory.encodeAddress(addressVersion, 1, address.getRipe());
        var privateSigningKey = BMAddressGenerator
                .encodeWIF(Arrays.copyOf(address.getSigningPrivateKey(), 32));
        var privateEncryptionKey = BMAddressGenerator
                .encodeWIF(Arrays.copyOf(address.getEncryptionPrivateKey(), 32));
        return '[' + encodedAddress +
                "]\nlabel = [chan] " + passphrase +
                "\nenabled = true\ndecoy = false\nchan = true\nnoncetrialsperbyte = 1000\npayloadlengthextrabytes = 1000\nsigningKeyNonce = " +
                address.getSigningKeyNonce() + "\nencryptionKeyNonce = " +
                address.getEncryptionKeyNonce() + "\nprivsigningkey = " + privateSigningKey +
                "\nprivencryptionkey = " + privateEncryptionKey +
                "\n";
    }

    public static void main(String channelName) throws Exception {
        Objects.requireNonNull(channelName, "チャンネル名を指定してください。");
        var calcurator = new DeterministicAddressesGenerator();
        // XXX findFirstで探せるようにSteamでやるべき……？
        var address = calcurator.apply(channelName);
        for (int addressVersion = 3; addressVersion < 5; addressVersion++) {
            System.out.println(encodeAddress(address, addressVersion, channelName));
        }
    }

    @Override
    public DeterministicAddress apply(String passphrase) {
        int numberOfNullBytesDemandedOnFrontOfRipeHash = 8;
        long signingKeyNonce = 0;
        long encryptionKeyNonce = 1;
        final byte[] potentialPrivSigningKey = new byte[64];
        byte[] potentialPubSigningKey = null;
        final byte[] potentialPrivEncryptionKey = new byte[64];
        byte[] potentialPubEncryptionKey = null;

        int nlz = 0;
        var hashBuffer = ByteBuffer.allocate(20);
        var hashLongBuffer = hashBuffer.asLongBuffer();
        final byte[] ripe = hashBuffer.array();
        final byte[] passphraseBytes = passphrase.getBytes(StandardCharsets.UTF_8);
        ByteBuffer nonceBuffer = ByteBuffer.allocate(9);

        try {
            MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
            MessageDigest sha512work = null;
            MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
            sha512.update(passphraseBytes);
            while (true) {
                sha512work = (MessageDigest) sha512.clone();
                Structs.encodeVarint(nonceBuffer, signingKeyNonce);
                nonceBuffer.flip();
                sha512work.update(nonceBuffer);
                sha512work.digest(potentialPrivSigningKey, 0, 64);
                sha512work = (MessageDigest) sha512.clone();
                nonceBuffer.clear();
                Structs.encodeVarint(nonceBuffer, encryptionKeyNonce);
                nonceBuffer.flip();
                sha512work.update(nonceBuffer);
                sha512work.digest(potentialPrivEncryptionKey, 0, 64);
                potentialPubSigningKey = deriviedPublicKey(potentialPrivSigningKey);
                potentialPubEncryptionKey = deriviedPublicKey(potentialPrivEncryptionKey);
                deriviedRipeHash(ripe, potentialPubSigningKey, potentialPubEncryptionKey, sha512work, ripemd160);
                nlz = Long.numberOfLeadingZeros(hashLongBuffer.get(0));
                if (nlz >= numberOfNullBytesDemandedOnFrontOfRipeHash) {
                    return new DeterministicAddressesImplementation(ripe, potentialPrivSigningKey,
                            potentialPrivEncryptionKey, signingKeyNonce, encryptionKeyNonce);
                }
                signingKeyNonce += 2;
                encryptionKeyNonce += 2;
                nonceBuffer.clear();
            }
        } catch (CloneNotSupportedException | DigestException | NoSuchAlgorithmException e) {
            throw new InternalError(e);
        }
    }

    private final class DeterministicAddressesImplementation implements DeterministicAddress, Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] ripe;
        private final byte[] signingPrivateKey;
        private final byte[] encryptionPrivateKey;
        private final long signingKeyNonce;
        private final long encryptionKeyNonce;

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

}
