// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2425 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2425() {}
    static final VarHandle const$0 = constants$2424.const$2.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("LunMaxIoCount"),
        JAVA_INT.withName("AdapterMaxIoCount")
    ).withName("_STORAGE_DEVICE_IO_CAPABILITY_DESCRIPTOR");
    static final VarHandle const$2 = constants$2425.const$1.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$3 = constants$2425.const$1.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$2425.const$1.varHandle(MemoryLayout.PathElement.groupElement("LunMaxIoCount"));
    static final VarHandle const$5 = constants$2425.const$1.varHandle(MemoryLayout.PathElement.groupElement("AdapterMaxIoCount"));
}

