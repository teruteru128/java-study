package com.twitter.teruteru128;

import java.lang.reflect.Constructor;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.Optional;

import javax.crypto.Cipher;

public class BCProviderTest {
    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            ModuleLayer layer = ModuleLayer.boot();
            Optional<Module> optional = layer.findModule("org.bouncycastle.provider");
            List.of("org.bouncycastle.provider", "org.bouncycastle.pg").stream().map(i->layer.findModule(i)).filter(Optional::isPresent).map(Optional::get).forEach(System.out::println);;
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
        var digest = MessageDigest.getInstance("ripemd160");
        System.out.println(digest.getProvider());
        var cipher = Cipher.getInstance("ChaCha20-Poly1305");
        System.out.println(cipher.getAlgorithm());
    }
}
