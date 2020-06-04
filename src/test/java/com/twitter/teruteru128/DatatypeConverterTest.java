package com.twitter.teruteru128;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class DatatypeConverterTest {

    @Test
    public void classFoundTest() throws Exception {
        Optional<Module> optional = ModuleLayer.boot().findModule("jakarta.xml.bind");
        assertTrue(optional.isPresent());
        assertNotNull(Class.forName(optional.get(), "jakarta.xml.bind.DatatypeConverter"));
    }
}
