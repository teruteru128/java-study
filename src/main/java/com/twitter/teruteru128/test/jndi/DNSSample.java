package com.twitter.teruteru128.test.jndi;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class DNSSample {

    public static void main(String[] args) {
        String name = "google.co.jp";
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.dns.DnsContextFactory");
        props.put(Context.PROVIDER_URL, "dns://192.168.0.1");
        try {
            InitialDirContext idctx = new InitialDirContext(props);
            Attributes attrs = idctx.getAttributes(name);
            NamingEnumeration<? extends Attribute> allAttr = attrs.getAll();
            while (allAttr.hasMore()) {
                Attribute attr = allAttr.next();
                System.out.println("Attribute: " + attr.getID());
                NamingEnumeration<?> values = attr.getAll();
                while (values.hasMore()) {
                    Object tmp =values.next();
                    System.out.print("Value: " + tmp.getClass());
                    System.out.println(", Value: " + tmp);
                }
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
