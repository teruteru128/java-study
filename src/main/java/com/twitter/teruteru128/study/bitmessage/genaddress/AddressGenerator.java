package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.twitter.teruteru128.study.Base58;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;

import jakarta.xml.bind.DatatypeConverter;

public class AddressGenerator implements Runnable {

    public AddressGenerator() {

    }

    @Override
    public void run() {
    }

    /**
     * 
     * @see https://github.com/Bitmessage/PyBitmessage/blob/6f35da4096770a668c4944c3024cd7ddb34be092/src/class_addressGenerator.py#L131
     * @see https://en.bitcoin.it/wiki/Wallet_import_format
     * @see https://stackoverflow.com/questions/49204787/deriving-ecdsa-public-key-from-private-key
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        ExecutorService service = Executors.newCachedThreadPool();
        try {
            byte[] potentialPrivSigningKey = new byte[32];
            byte[] potentialPubSigningKey = new byte[32];
            SecureRandom random = new SecureRandom();
            ArrayList<KeyPair> pairs = new ArrayList<>();
            for (int i = 0; i < 2500; i++) {
                random.nextBytes(potentialPrivSigningKey);
                ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
                potentialPubSigningKey = g.multiply(new BigInteger(1, potentialPrivSigningKey)).normalize().getEncoded(false);
                pairs.add(new KeyPair(potentialPrivSigningKey, potentialPubSigningKey));
            }
            var list = new ArrayList<Task>();
            int requireNlz = 4;
            {
                int tasknum = 2;
                int tmp = 2;
                for (var arg : args) {
                    try {
                        tmp = Integer.parseInt(arg, 10);
                        if(tmp >= 1){
                            tasknum = tmp;
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < tasknum; i++) {
                    list.add(new Task(new RequestComponent(pairs, requireNlz)));
                }
            }
            System.out.printf("start : %s%n", LocalDateTime.now());
            var responseComponent = service.invokeAny(list);
            System.out.printf("found : %s%n", LocalDateTime.now());
            service.shutdown();
            State.shutdown = 1;

            var bmaddress = new BMAddress();
            byte[] ripe = responseComponent.getRipe();
            System.out.println(DatatypeConverter.printHexBinary(ripe));
            var address4 = bmaddress.encodeAddress(4, 1, ripe);

            var privSigningKeyWIF = encodeWIF(responseComponent.getPrivateSigningKey());
            var privEncryptionKeyWIF = encodeWIF(responseComponent.getPrivateEncryptionKey());

            System.out.printf("[%s]%n", address4);
            System.out.println("label = relpace this label");
            System.out.println("enabled = true");
            System.out.println("decoy = false");
            System.out.println("noncetrialsperbyte = 1000");
            System.out.println("payloadlengthextrabytes = 1000");
            System.out.printf("privsigningkey = %s%n", privSigningKeyWIF);
            System.out.printf("privencryptionkey = %s%n", privEncryptionKeyWIF);
            System.out.println();
        } finally {
            if (!service.isShutdown()) {
                service.shutdown();
            }
        }
    }

    private static String encodeWIF(byte[] key) {
        byte[] wrappedKey = new byte[37];
        byte[] checksum = new byte[32];

        wrappedKey[0] = (byte) 0x80;
        System.arraycopy(key, 0, wrappedKey, 1, key.length);
        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            sha256.update(wrappedKey, 0, 33);
            sha256.digest(checksum, 0, 32);
            sha256.update(checksum, 0, 32);
            sha256.digest(checksum, 0, 32);
        } catch (NoSuchAlgorithmException e) {
        } catch (DigestException e){
        }
        System.arraycopy(checksum, 0, wrappedKey, 33, 4);
        return Base58.encode(wrappedKey);
    }
}
