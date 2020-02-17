package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;
import java.util.logging.Logger;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.rfc8032.Ed25519;

public class AddressGenerator implements Runnable {

    public AddressGenerator() {

    }

    @Override
    public void run() {
        while (State.getShutdown().get() == 0) {
            try {
                AddressGeneratorRequest request = Queues.getAddressGeneratorQueue().take();
                int nonceTraialsPerByte = 0;
                int payloadLengthExtraBytes = 0;
                boolean live = true;
                String command = "";
                int numberOfNullBytesDemandedOnFrontOfRipeHash = 1;
                if (request.getCommand().equals("")) {

                }
                if (command.equals("createRandomAddress")) {
                    int numberOfAddressesWeHadToMakeBeforeWeFoundOneWithTheCorrectRipePrefix = 0;
                    SecureRandom random = SecureRandom.getInstanceStrong();
                    byte[] potentialPrivSigningKey = new byte[32];
                    random.nextBytes(potentialPrivSigningKey);
                    byte[] potentialPubSigningKey = null;
                    byte[] potentialPrivEncryptionKey = new byte[32];
                    byte[] potentialPubEncryptionKey = null;
                    var ripe = MessageDigest.getInstance("ripemd160");
                    var sha = MessageDigest.getInstance("SHA512");
                    while (true) {
                        numberOfAddressesWeHadToMakeBeforeWeFoundOneWithTheCorrectRipePrefix++;
                        random.nextBytes(potentialPrivEncryptionKey);
                        sha.update(potentialPubSigningKey);
                        sha.update(potentialPubEncryptionKey);
                        ripe.update(sha.digest());
                        byte[] digest = ripe.digest();
                        if (Arrays.equals(Arrays.copyOf(digest, numberOfNullBytesDemandedOnFrontOfRipeHash),
                                new byte[numberOfNullBytesDemandedOnFrontOfRipeHash])) {
                            break;
                        }
                    }
                    Logger.getLogger("").info("");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * TODO WTF? bitmessageってed25519でしたっけ？
     * 
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py#L131
     * @see https://en.bitcoin.it/wiki/Wallet_import_format
     * @param args
     */
    public static void main(String[] args) {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        Ed25519.precompute();
        byte[] potentialPrivSigningKey = new byte[Ed25519.SECRET_KEY_SIZE];
        byte[] potentialPubSigningKey = new byte[Ed25519.PUBLIC_KEY_SIZE];
        SecureRandom random = new SecureRandom();
        random.nextBytes(potentialPrivSigningKey);
        Ed25519.generatePublicKey(potentialPrivSigningKey, 0, potentialPubSigningKey, 0);
        byte[] potentialPrivEncryptionKey = new byte[Ed25519.SECRET_KEY_SIZE];
        byte[] potentialPubEncryptionKey = new byte[Ed25519.PUBLIC_KEY_SIZE];
        byte[] nullbytes = new byte[20];
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
            MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
            byte[] ripe;
            while (true) {
                random.nextBytes(potentialPrivEncryptionKey);
                Ed25519.generatePublicKey(potentialPrivEncryptionKey, 0, potentialPubEncryptionKey, 0);
                sha512.update(potentialPubSigningKey, 0, Ed25519.PUBLIC_KEY_SIZE);
                sha512.update(potentialPubEncryptionKey, 0, Ed25519.PUBLIC_KEY_SIZE);
                ripe = ripemd160.digest(sha512.digest());
                if (Arrays.equals(ripe, 0, 2, nullbytes, 0, 2)) {
                    break;
                }
            }
            BMAddress bmaddress = new BMAddress();
            String address = bmaddress.encodeAddress(4, 1, ripe);
            byte[] privSigningKey = new byte[Ed25519.SECRET_KEY_SIZE + 1];
            privSigningKey[0] = (byte) 0x80;
            System.arraycopy(potentialPrivSigningKey, 0, privSigningKey, 1, Ed25519.SECRET_KEY_SIZE);
            byte[] checksum = Arrays.copyOfRange(sha256.digest(sha256.digest(privSigningKey)), 0, 4);
            byte[] tmp = new byte[privSigningKey.length + checksum.length];
            System.arraycopy(privSigningKey, 0, tmp, 0, privSigningKey.length);
            System.arraycopy(checksum, 0, tmp, privSigningKey.length, checksum.length);
            // encode to base58
            Base58 base58 = new Base58();
            String privSigningKeyWIF = base58.encode(tmp);

            byte[] privEncryptionKey = new byte[Ed25519.SECRET_KEY_SIZE + 1];
            privEncryptionKey[0] = (byte) 0x80;
            System.arraycopy(potentialPubEncryptionKey, 0, privEncryptionKey, 1, Ed25519.SECRET_KEY_SIZE);
            checksum = Arrays.copyOfRange(sha256.digest(sha256.digest(privEncryptionKey)), 0, 4);
            System.arraycopy(privEncryptionKey, 0, tmp, 0, privEncryptionKey.length);
            System.arraycopy(checksum, 0, tmp, privEncryptionKey.length, checksum.length);
            String privEncryptionKeyWIF = base58.encode(tmp);
            System.out.println(address);
            System.out.println(privSigningKeyWIF);
            System.out.println(privEncryptionKeyWIF);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}