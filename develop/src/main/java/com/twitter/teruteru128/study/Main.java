package com.twitter.teruteru128.study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.Provider;
import java.security.Security;
import java.util.Base64;

/**
 * Main
 */
public class Main {

    private static final String ORG_BOUNCYCASTLE_JCE_PROVIDER_BOUNCY_CASTLE_PROVIDER = "org.bouncycastle.jce.provider.BouncyCastleProvider";

    static {
        try {
            var bcpc = Class.forName(ORG_BOUNCYCASTLE_JCE_PROVIDER_BOUNCY_CASTLE_PROVIDER);
            var p = Provider.class;
            if (p.isAssignableFrom(bcpc) && Security.getProvider("BC") == null) {
                Security.addProvider(bcpc.asSubclass(p).getConstructor().newInstance());
            }
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException | SecurityException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        var proxyAddress = new InetSocketAddress("localhost", 9150);
        var proxy = new Proxy(Proxy.Type.SOCKS, proxyAddress);
        var endpoint = new InetSocketAddress("koukoku.shadan.open.ad.jp", 23);
        try (var socket = new Socket(proxy)) {
            socket.connect(endpoint, 5000);
            var os = new BufferedOutputStream(socket.getOutputStream());
            var nobody = "nobody\n".getBytes(StandardCharsets.US_ASCII);
            os.write(nobody);
            os.flush();
            byte[] buffer = new byte[4096];
            int len = 0;
            try (var stream = new BufferedInputStream(socket.getInputStream())) {
                while ((len = stream.read(buffer)) >= 0) {
                    System.out.print(new String(buffer, 0, len));
                    System.out.flush();
                }
            }
        }
    }

}
