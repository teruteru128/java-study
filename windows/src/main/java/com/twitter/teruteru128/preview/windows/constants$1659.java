// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1659 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1659() {}
    static final VarHandle const$0 = constants$1658.const$3.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    static final VarHandle const$1 = constants$1658.const$3.varHandle(MemoryLayout.PathElement.groupElement("fdwSupport"));
    static final VarHandle const$2 = constants$1658.const$3.varHandle(MemoryLayout.PathElement.groupElement("cDestinations"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_SHORT.withByteAlignment(1).withName("wMid"),
        JAVA_SHORT.withByteAlignment(1).withName("wPid"),
        JAVA_INT.withByteAlignment(1).withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("szPname"),
        JAVA_INT.withByteAlignment(1).withName("fdwSupport"),
        JAVA_INT.withByteAlignment(1).withName("cDestinations"),
        MemoryLayout.structLayout(
            JAVA_INT.withByteAlignment(1).withName("Data1"),
            JAVA_SHORT.withByteAlignment(1).withName("Data2"),
            JAVA_SHORT.withByteAlignment(1).withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("ManufacturerGuid"),
        MemoryLayout.structLayout(
            JAVA_INT.withByteAlignment(1).withName("Data1"),
            JAVA_SHORT.withByteAlignment(1).withName("Data2"),
            JAVA_SHORT.withByteAlignment(1).withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("ProductGuid"),
        MemoryLayout.structLayout(
            JAVA_INT.withByteAlignment(1).withName("Data1"),
            JAVA_SHORT.withByteAlignment(1).withName("Data2"),
            JAVA_SHORT.withByteAlignment(1).withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("NameGuid")
    ).withName("tagMIXERCAPS2A");
    static final VarHandle const$4 = constants$1659.const$3.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    static final VarHandle const$5 = constants$1659.const$3.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
}

