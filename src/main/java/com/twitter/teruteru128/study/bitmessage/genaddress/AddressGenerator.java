package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.logging.Logger;

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
}