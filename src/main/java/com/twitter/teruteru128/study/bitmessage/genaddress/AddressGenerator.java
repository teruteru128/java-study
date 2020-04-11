package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.bind.DatatypeConverter;

import com.twitter.teruteru128.study.Base58;

import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;

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
            random.nextBytes(potentialPrivSigningKey);
            ECPoint g = CustomNamedCurves.getByName("secp256k1").getG();
            potentialPubSigningKey = g.multiply(new BigInteger(1, potentialPrivSigningKey)).normalize().getEncoded(false);
            var list = new ArrayList<Task>();
            int requireNlz = 5;
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
                    list.add(new Task(new RequestComponent(potentialPubSigningKey, requireNlz)));
                }
            }
            var responseComponent = service.invokeAny(list);
            service.shutdown();
            byte[] potentialPrivEncryptionKey = responseComponent.getPrivateEncryptionKey();
            byte[] ripe = responseComponent.getRipe();
            System.out.println(DatatypeConverter.printHexBinary(ripe));
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            var bmaddress = new BMAddress();
            var address4 = bmaddress.encodeAddress(4, 1, ripe);
            var address3 = bmaddress.encodeAddress(3, 1, ripe);
            var privSigningKey = new byte[33];
            privSigningKey[0] = (byte) 0x80;
            System.arraycopy(potentialPrivSigningKey, 0, privSigningKey, 1, 32);
            byte[] checksum = new byte[32];
            sha256.update(privSigningKey);
            sha256.digest(checksum, 0, 32);
            sha256.update(checksum);
            sha256.digest(checksum, 0, 32);
            var tmp = new byte[privSigningKey.length + 4];
            System.arraycopy(privSigningKey, 0, tmp, 0, privSigningKey.length);
            System.arraycopy(checksum, 0, tmp, privSigningKey.length, 4);
            // encode to base58
            var privSigningKeyWIF = Base58.encode(tmp);

            var privEncryptionKey = new byte[33];
            privEncryptionKey[0] = (byte) 0x80;
            System.arraycopy(potentialPrivEncryptionKey, 0, privEncryptionKey, 1, 32);
            sha256.update(privEncryptionKey);
            sha256.digest(checksum, 0, 32);
            sha256.update(checksum);
            sha256.digest(checksum, 0, 32);
            System.arraycopy(privEncryptionKey, 0, tmp, 0, privEncryptionKey.length);
            System.arraycopy(checksum, 0, tmp, privEncryptionKey.length, 4);
            var privEncryptionKeyWIF = Base58.encode(tmp);
            System.out.printf("[%s]%n", address3);
            System.out.println("label = relpace this label");
            System.out.println("enabled = true");
            System.out.println("decoy = false");
            System.out.println("noncetrialsperbyte = 1000");
            System.out.println("payloadlengthextrabytes = 1000");
            System.out.printf("privsigningkey = %s%n", privSigningKeyWIF);
            System.out.printf("privencryptionkey = %s%n", privEncryptionKeyWIF);
            System.out.println();
            System.out.printf("[%s]%n", address4);
            System.out.println("label = relpace this label");
            System.out.println("enabled = true");
            System.out.println("decoy = false");
            System.out.println("noncetrialsperbyte = 1000");
            System.out.println("payloadlengthextrabytes = 1000");
            System.out.printf("privsigningkey = %s%n", privSigningKeyWIF);
            System.out.printf("privencryptionkey = %s%n", privEncryptionKeyWIF);
            System.out.println();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
            if (!service.isShutdown())
                service.shutdown();
        }
    }
}
