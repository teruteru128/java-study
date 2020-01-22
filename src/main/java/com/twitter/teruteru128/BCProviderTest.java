package com.twitter.teruteru128;

import java.lang.reflect.Constructor;
import java.security.Provider;
import java.security.Security;
import java.util.Optional;

public class BCProviderTest {
    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            ModuleLayer layer = ModuleLayer.boot();
            Optional<Module> optional = layer.findModule("org.bouncycastle.provider");
            layer.findModule("org.bouncycastle.pg").ifPresentOrElse(System.out::println,
                    () -> System.out.println("none"));
            layer.findModule("org.bouncycastle.provider").ifPresentOrElse(System.out::println,
                    () -> System.out.println("none"));
            Class<?> class1 = null;
            if (optional.isPresent()) {
                System.out.println("module found");
                class1 = Class.forName(optional.get(), "org.bouncycastle.jce.provider.BouncyCastleProvider");
            } else {
                System.out.println("module not found");
                class1 = Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
            }
            Constructor<?> constructor = class1.getConstructor();
            var obj = constructor.newInstance();
            if (obj instanceof Provider) {
                Security.addProvider(provider = (Provider) obj);
                System.out.println(provider);
            }
        }
    }
}
