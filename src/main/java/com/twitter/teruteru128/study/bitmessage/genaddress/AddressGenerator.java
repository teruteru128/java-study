package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.twitter.teruteru128.study.Base58;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * Producer-Consumerパターンを使い、プロデューサースレッドで鍵ペアを生成、コンシューマースレッドでサーバーへ送信
 */
public class AddressGenerator implements Runnable {

    private String[] args;

    public AddressGenerator() {
        this(new String[0]);
    }

    public AddressGenerator(String[] args) {
        this.args = args;
    }

    private ExecutorService service1 = Executors.newCachedThreadPool();
    //private ScheduledExecutorService service2 = Executors.newScheduledThreadPool(1);

    @Override
    public void run() {
        try {
            var tasks = new ArrayList<Producer>();
            int requireNlz = 5;
            service1.submit(new Consumer());
            {
                int tasknum = 1;
                int tmp = 2;
                for (var arg : args) {
                    try {
                        tmp = Integer.parseInt(arg, 10);
                        if (tmp >= 1) {
                            tasknum = tmp;
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < tasknum; i++) {
                    tasks.add(new Producer(new Request(requireNlz, i)));
                }
            }
            System.err.printf("start : %s%n", LocalDateTime.now());
            service1.invokeAny(tasks);
        } catch(InterruptedException e){
        } catch(ExecutionException e){
        } finally {
            if (!service1.isShutdown()) {
                service1.shutdown();
            }
            //service2.shutdown();
        }
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
        Thread thread = new Thread(new AddressGenerator(args));
        thread.start();
    }

    public static void exportAddress(Response component) {
        byte[] ripe = component.getRipe();
        var address4 = BMAddress.encodeAddress(4, 1, ripe);
        var privSigningKeyWIF = encodeWIF(component.getPrivateSigningKey());
        var privEncryptionKeyWIF = encodeWIF(component.getPrivateEncryptionKey());
        synchronized (System.out) {
            System.out.print("[");
            System.out.print(address4);
            System.out.println("]");
            System.out.println("label = relpace this label");
            System.out.println("enabled = true");
            System.out.println("decoy = false");
            System.out.println("noncetrialsperbyte = 1000");
            System.out.println("payloadlengthextrabytes = 1000");
            System.out.print("privsigningkey = ");
            System.out.println(privSigningKeyWIF);
            System.out.print("privencryptionkey = ");
            System.out.println(privEncryptionKeyWIF);
            System.out.println();
        }
    }

    public static String encodeWIF(byte[] key) {
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
        } catch (DigestException e) {
        }
        System.arraycopy(checksum, 0, wrappedKey, 33, 4);
        return Base58.encode(wrappedKey);
    }
}
