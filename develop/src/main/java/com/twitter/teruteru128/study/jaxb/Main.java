package com.twitter.teruteru128.study.jaxb;

import java.util.Optional;
import java.util.ServiceLoader;

import jakarta.xml.bind.JAXBContext;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // org.glassfish.jaxb.runtime
        ModuleLayer layer = ModuleLayer.boot();
        Optional<Module> optional = layer.findModule("org.glassfish.jaxb.runtime");
        if (optional.isPresent()) {
            System.out.println(Class.forName(optional.get(), "org.glassfish.jaxb.runtime.v2.ContextFactory"));
        } else {
            System.out.println("ないです。");
        }
    }

}
