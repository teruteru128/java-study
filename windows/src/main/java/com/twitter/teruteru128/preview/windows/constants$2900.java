// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2900 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2900() {}
    static final VarHandle const$0 = constants$2899.const$1.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwStatus"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pszStatus"),
        JAVA_INT.withName("dwSeverity"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PORT_INFO_3A");
    static final VarHandle const$2 = constants$2900.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwStatus"));
    static final VarHandle const$3 = constants$2900.const$1.varHandle(MemoryLayout.PathElement.groupElement("pszStatus"));
    static final VarHandle const$4 = constants$2900.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwSeverity"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwStatus"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pszStatus"),
        JAVA_INT.withName("dwSeverity"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PORT_INFO_3W");
}

