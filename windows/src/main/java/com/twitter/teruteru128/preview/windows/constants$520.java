// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$520 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$520() {}
    static final VarHandle const$0 = constants$519.const$5.varHandle(MemoryLayout.PathElement.groupElement("BlockSize"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Method"),
        JAVA_INT.withName("Count"),
        JAVA_INT.withName("Size")
    ).withName("_TAPE_CREATE_PARTITION");
    static final VarHandle const$2 = constants$520.const$1.varHandle(MemoryLayout.PathElement.groupElement("Method"));
    static final VarHandle const$3 = constants$520.const$1.varHandle(MemoryLayout.PathElement.groupElement("Count"));
    static final VarHandle const$4 = constants$520.const$1.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("Method"),
        JAVA_INT.withName("DataBufferSize"),
        RuntimeHelper.POINTER.withName("DataBuffer")
    ).withName("_TAPE_WMI_OPERATIONS");
}

