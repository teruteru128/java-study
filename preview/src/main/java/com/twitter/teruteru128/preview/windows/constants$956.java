// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$956 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$956() {}
    static final VarHandle const$0 = constants$950.const$3.varHandle(MemoryLayout.PathElement.groupElement("dmReserved2"));
    static final VarHandle const$1 = constants$950.const$3.varHandle(MemoryLayout.PathElement.groupElement("dmPanningWidth"));
    static final VarHandle const$2 = constants$950.const$3.varHandle(MemoryLayout.PathElement.groupElement("dmPanningHeight"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cb"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("DeviceName"),
        MemoryLayout.sequenceLayout(128, JAVA_BYTE).withName("DeviceString"),
        JAVA_INT.withName("StateFlags"),
        MemoryLayout.sequenceLayout(128, JAVA_BYTE).withName("DeviceID"),
        MemoryLayout.sequenceLayout(128, JAVA_BYTE).withName("DeviceKey")
    ).withName("_DISPLAY_DEVICEA");
    static final VarHandle const$4 = constants$956.const$3.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    static final VarHandle const$5 = constants$956.const$3.varHandle(MemoryLayout.PathElement.groupElement("StateFlags"));
}


