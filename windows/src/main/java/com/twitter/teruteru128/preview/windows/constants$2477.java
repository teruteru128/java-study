// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2477 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2477() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("TimeoutInSeconds"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(4)
        ).withName("SanitizeOption")
    ).withName("_STORAGE_REINITIALIZE_MEDIA");
    static final VarHandle const$1 = constants$2477.const$0.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$2 = constants$2477.const$0.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$3 = constants$2477.const$0.varHandle(MemoryLayout.PathElement.groupElement("TimeoutInSeconds"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("Reserved"),
        JAVA_SHORT.withName("SerialNumberLength"),
        MemoryLayout.sequenceLayout(0, JAVA_BYTE).withName("SerialNumber")
    ).withName("_STORAGE_MEDIA_SERIAL_NUMBER_DATA");
    static final VarHandle const$5 = constants$2477.const$4.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
}

