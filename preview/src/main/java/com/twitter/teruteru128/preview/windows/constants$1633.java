// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1633 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1633() {}
    static final VarHandle const$0 = constants$1632.const$0.varHandle(MemoryLayout.PathElement.groupElement("wNotes"));
    static final VarHandle const$1 = constants$1632.const$0.varHandle(MemoryLayout.PathElement.groupElement("wChannelMask"));
    static final VarHandle const$2 = constants$1632.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_SHORT.withByteAlignment(1).withName("wMid"),
        JAVA_SHORT.withByteAlignment(1).withName("wPid"),
        JAVA_INT.withByteAlignment(1).withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("szPname"),
        JAVA_SHORT.withByteAlignment(1).withName("wTechnology"),
        JAVA_SHORT.withByteAlignment(1).withName("wVoices"),
        JAVA_SHORT.withByteAlignment(1).withName("wNotes"),
        JAVA_SHORT.withByteAlignment(1).withName("wChannelMask"),
        JAVA_INT.withByteAlignment(1).withName("dwSupport"),
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
    ).withName("tagMIDIOUTCAPS2A");
    static final VarHandle const$4 = constants$1633.const$3.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    static final VarHandle const$5 = constants$1633.const$3.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
}


