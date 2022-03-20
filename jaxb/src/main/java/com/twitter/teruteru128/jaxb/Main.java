package com.twitter.teruteru128.jaxb;

import java.util.Optional;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        // そもそもモジュールが有効になってないとダメ
        // org.glassfish.jaxb.runtime
        ModuleLayer layer = ModuleLayer.boot();
        Optional<Module> optional = layer.findModule("org.glassfish.jaxb.runtime");
        Class<?> clazz = null;
        if (optional.isPresent()) {
            System.out.println("module is found");
            clazz = Class.forName(optional.get(), "org.glassfish.jaxb.runtime.v2.ContextFactory");
        } else {
            System.out.println("ないです。");
            clazz = Class.forName("org.glassfish.jaxb.runtime.v2.ContextFactory");
        }
        System.out.println(clazz);
    }

}
