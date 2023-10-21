package com.twitter.teruteru128.study;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;

public class BCProviderLoader {
    static {
        try {
            Security.addProvider(Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider")
                    .asSubclass(Provider.class).getConstructor().newInstance());
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException | SecurityException e) {
            throw new InternalError(e);
        }
    }
}
