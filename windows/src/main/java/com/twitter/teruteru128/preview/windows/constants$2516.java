// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2516 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2516() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size")
    ).withName("_SCM_PD_DESCRIPTOR_HEADER");
    static final VarHandle const$1 = constants$2516.const$0.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$2 = constants$2516.const$0.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("DeviceGuid"),
        JAVA_INT.withName("DeviceHandle")
    ).withName("_SCM_PD_DEVICE_HANDLE");
    static final VarHandle const$4 = constants$2516.const$3.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$5 = constants$2516.const$3.varHandle(MemoryLayout.PathElement.groupElement("Size"));
}

