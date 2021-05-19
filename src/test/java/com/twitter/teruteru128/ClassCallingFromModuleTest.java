package com.twitter.teruteru128;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ClassCallingFromModuleTest {

    private static String MODULE_NAME = "jakarta.xml.bind";

    private static String CLASS_NAME = "jakarta.xml.bind.DatatypeConverter";

    @Test
    public void classFoundTest() throws Exception {
        var moduleLayer = ModuleLayer.boot();
        var optional = moduleLayer.findModule(MODULE_NAME);
        assertTrue(optional.isPresent());
        var module = optional.get();
        var clazz = Class.forName(module, CLASS_NAME);
        assertNotNull(clazz);
        assertEquals(CLASS_NAME, clazz.getName());
    }
}
