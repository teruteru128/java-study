// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$139 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$139() {}
    static final VarHandle const$0 = constants$138.const$5.varHandle(MemoryLayout.PathElement.groupElement("ExceptionRecord"));
    static final VarHandle const$1 = constants$138.const$5.varHandle(MemoryLayout.PathElement.groupElement("ContextRecord"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("GenericRead"),
        JAVA_INT.withName("GenericWrite"),
        JAVA_INT.withName("GenericExecute"),
        JAVA_INT.withName("GenericAll")
    ).withName("_GENERIC_MAPPING");
    static final VarHandle const$3 = constants$139.const$2.varHandle(MemoryLayout.PathElement.groupElement("GenericRead"));
    static final VarHandle const$4 = constants$139.const$2.varHandle(MemoryLayout.PathElement.groupElement("GenericWrite"));
    static final VarHandle const$5 = constants$139.const$2.varHandle(MemoryLayout.PathElement.groupElement("GenericExecute"));
}

