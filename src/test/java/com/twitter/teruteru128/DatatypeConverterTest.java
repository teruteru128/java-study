package com.twitter.teruteru128;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class DatatypeConverterTest{
    @Test
    void classFoundTest() throws Exception{
        Optional<Module> optional = ModuleLayer.boot().findModule("java.xml.bind");// org.bouncycastle.provider
        assertTrue(optional.isPresent());
        assertNotNull(Class.forName(optional.get(), "javax.xml.bind.DatatypeConverter"));
    }
}
