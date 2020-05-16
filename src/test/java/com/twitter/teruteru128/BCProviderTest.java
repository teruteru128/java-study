package com.twitter.teruteru128;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Optional;
import java.util.stream.Stream;

import javax.crypto.Cipher;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class BCProviderTest {

    private ModuleLayer getModuleLayer() {
        return ModuleLayer.boot();
    }

    private Optional<Module> findModule(String moduleName) {
        return getModuleLayer().findModule(moduleName);
    }

    @ParameterizedTest
    @MethodSource("getModuleStream")
    public void findModules(String moduleName) {
        Optional<Module> optional = findModule(moduleName);
        assertTrue(optional.isPresent());
    }

    public static Stream<Arguments> getModuleStream() {
        return Stream.of(Arguments.of("org.bouncycastle.provider"), Arguments.of("org.bouncycastle.pg"));
    }

    private Class<?> getProviderClass() {
        return Class.forName(findModule("org.bouncycastle.provider").get(),
                "org.bouncycastle.jce.provider.BouncyCastleProvider");
    }

    @Test
    public void forNameWithModuleTest() throws Throwable {
        assertNotNull(getProviderClass());
    }

    private Object getProviderObject() throws Throwable {
        return getProviderClass().getConstructor().newInstance();
    }

    @Test
    public void newInstanceTest() throws Throwable {
        assertTrue(getProviderObject() instanceof Provider);
    }

    @Test
    public void detailedAlgorithmReferenceTest() throws Throwable {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = (Provider) getProviderObject());
            System.out.printf("BCProviderTest.detailedAlgorithmReferenceTest() : Security provider %s was added.%n", provider);
        }
        assertNotNull(MessageDigest.getInstance("ripemd160"));
        assertNotNull(Cipher.getInstance("ChaCha20-Poly1305/None/NoPadding"));
    }

    @AfterAll
    public static void clearBCProvider() {
        Security.removeProvider("BC");
    }

}
