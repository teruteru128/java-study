// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2905 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2905() {}
    static final VarHandle const$0 = constants$2904.const$5.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    static final VarHandle const$1 = constants$2904.const$5.varHandle(MemoryLayout.PathElement.groupElement("pDevMode"));
    static final VarHandle const$2 = constants$2904.const$5.varHandle(MemoryLayout.PathElement.groupElement("DesiredAccess"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pValueName"),
        JAVA_INT.withName("cbValueName"),
        JAVA_INT.withName("dwType"),
        RuntimeHelper.POINTER.withName("pData"),
        JAVA_INT.withName("cbData"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PRINTER_ENUM_VALUESA");
    static final VarHandle const$4 = constants$2905.const$3.varHandle(MemoryLayout.PathElement.groupElement("pValueName"));
    static final VarHandle const$5 = constants$2905.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbValueName"));
}


