package com.twitter.teruteru128.jaxb;

import java.util.Optional;

import jakarta.xml.bind.JAXB;

/**
 * @author Teruteru
 * @see {@link https://qiita.com/opengl-8080/items/f7112240c72d61d4cdf4 JAXB使い方メモ}
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
        JAXB.marshal(new User(), System.out);
    }

}
