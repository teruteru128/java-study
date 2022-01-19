package com.twitter.teruteru128.study.jaxb;

import java.util.Optional;

import jakarta.xml.bind.JAXB;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        User user = new User();
        JAXB.marshal(user, System.out);
        // org.glassfish.jaxb.runtime
        ModuleLayer layer = ModuleLayer.boot();
        Optional<Module> optional = layer.findModule("org.glassfish.jaxb.runtime");
        if (optional.isPresent()) {
            System.out.println(Class.forName(optional.get(), "com.sun.xml.bind.v2.ContextFactory"));
        } else {
            System.out.println("ないです。");
        }
    }

}
