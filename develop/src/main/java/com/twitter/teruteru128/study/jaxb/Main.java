package com.twitter.teruteru128.study.jaxb;

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
        if (optional.isPresent()) {
            System.out.println(Class.forName(optional.get(), "org.glassfish.jaxb.runtime.v2.ContextFactory"));
        } else {
            System.out.println("ないです。");
        }
        System.out.println(Class.forName("org.glassfish.jaxb.runtime.v2.ContextFactory"));
    }

}
