package com.twitter.teruteru128.study.bitmessage.client;

import java.net.URL;
import java.util.List;
import java.util.concurrent.Callable;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class BitMessageHelloWorld implements Callable<Void> {

    @Override
    public Void call() throws Exception {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setEncoding("UTF-8");
        // set endpoint
        config.setServerURL(new URL("http://localhost:8442/"));
        config.setBasicUserName("username");
        config.setBasicPassword("password");

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        Object o = client.execute("clientStatus", (List<?>)null);
        System.out.println(o);
        return null;
    }
}
