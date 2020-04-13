package com.twitter.teruteru128.study.jndi;

import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

public class DNSSample {

    public static void main(String[] args) throws Exception {
        String name = "google.co.jp";
        Hashtable<Object, Object> props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.dns.DnsContextFactory");
        props.put(Context.PROVIDER_URL, "dns://192.168.0.1/");
        // こっちにも付けられる
        // props.put(Context.PROVIDER_URL, "dns://192.168.0.1/" + name);
        try {
            InitialDirContext idctx = new InitialDirContext(props);
            Attributes attrs = idctx.getAttributes(name, new String[]{ "AAAA" });
            NamingEnumeration<? extends Attribute> allAttr = attrs.getAll();
            while (allAttr.hasMore()) {
                Attribute attr = allAttr.next();
                System.out.println("Attribute: " + attr.getID());
                NamingEnumeration<?> values = attr.getAll();
                while (values.hasMore()) {
                    Object tmp = values.next();
                    System.out.print("\t");
                    System.out.println(tmp);
                }
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
        Hashtable<Object, Object> env = new Hashtable<>();
        env.put("java.naming.factory.initial", "com.sun.jndi.dns.DnsContextFactory");
        env.put("java.naming.provider.url",    "dns://192.168.1.1/sun.com");
        var ictx = new InitialDirContext(env);
        Attributes attrs1 = ictx.getAttributes("", new String[] {"A"});
        System.out.println(attrs1);
        Attributes attrs2 = ictx.getAttributes("", new String[] {"MX"});
        System.out.println(attrs2);
    }
}
