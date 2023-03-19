package com.twitter.teruteru128.study;

import java.nio.channels.SocketChannel;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.net.ssl.SSLContext;

public class SSLSocketChannelFactory {

    private SSLContext context;

    public SSLSocketChannelFactory(SSLContext context) {
        super();
        this.context = context;
    }

    public static SSLSocketChannelFactory getChannelFactory() {
        try {
            var context = SSLContext.getInstance("TLSv1.2");
            var engine = context.createSSLEngine();
            var parameters = engine.getSSLParameters();
            var cipherSuites = parameters.getCipherSuites();
            if (!com.twitter.teruteru128.util.Arrays.contains(cipherSuites, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA")) {
                int newLength = cipherSuites.length + 1;
                cipherSuites = Arrays.copyOf(cipherSuites, newLength);
                cipherSuites[newLength - 1] = "TLS_ECDH_anon_WITH_AES_256_CBC_SHA";
                parameters.setCipherSuites(cipherSuites);
                engine.setSSLParameters(parameters);
            }
            return null;
        } catch (NoSuchAlgorithmException e) {
            throw new InternalError(e);
        }
    }

    public SSLSocketChannel createChannel(SocketChannel channel, String peerHost, int peerPort) {
        return new SSLSocketChannel(channel, context.createSSLEngine(peerHost, peerPort));
    }
}
