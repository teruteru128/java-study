// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1639 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1639() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_SHORT.withByteAlignment(1).withName("wMid"),
        JAVA_SHORT.withByteAlignment(1).withName("wPid"),
        JAVA_INT.withByteAlignment(1).withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, JAVA_SHORT.withByteAlignment(1)).withName("szPname"),
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
    ).withName("tagMIDIINCAPS2W");
    static final VarHandle const$1 = constants$1639.const$0.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    static final VarHandle const$2 = constants$1639.const$0.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    static final VarHandle const$3 = constants$1639.const$0.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    static final VarHandle const$4 = constants$1639.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withByteAlignment(1).withName("lpData"),
        JAVA_INT.withByteAlignment(1).withName("dwBufferLength"),
        JAVA_INT.withByteAlignment(1).withName("dwBytesRecorded"),
        JAVA_LONG.withByteAlignment(1).withName("dwUser"),
        JAVA_INT.withByteAlignment(1).withName("dwFlags"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("lpNext"),
        JAVA_LONG.withByteAlignment(1).withName("reserved"),
        JAVA_INT.withByteAlignment(1).withName("dwOffset"),
        MemoryLayout.sequenceLayout(8, JAVA_LONG.withByteAlignment(1)).withName("dwReserved")
    ).withName("midihdr_tag");
}

