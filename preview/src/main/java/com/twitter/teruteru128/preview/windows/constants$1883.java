// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1883 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1883() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwSize"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pszSheetName"),
        JAVA_INT.withName("uSheetIndex"),
        JAVA_INT.withName("dwFlags"),
        JAVA_INT.withName("bModal"),
        MemoryLayout.paddingLayout(4)
    ).withName("_OPEN_PRINTER_PROPS_INFOA");
    static final VarHandle const$1 = constants$1883.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    static final VarHandle const$2 = constants$1883.const$0.varHandle(MemoryLayout.PathElement.groupElement("pszSheetName"));
    static final VarHandle const$3 = constants$1883.const$0.varHandle(MemoryLayout.PathElement.groupElement("uSheetIndex"));
    static final VarHandle const$4 = constants$1883.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$5 = constants$1883.const$0.varHandle(MemoryLayout.PathElement.groupElement("bModal"));
}


