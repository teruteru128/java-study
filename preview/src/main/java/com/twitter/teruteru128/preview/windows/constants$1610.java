// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1610 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1610() {}
    static final VarHandle const$0 = constants$1609.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwFormats"));
    static final VarHandle const$1 = constants$1609.const$2.varHandle(MemoryLayout.PathElement.groupElement("wChannels"));
    static final VarHandle const$2 = constants$1609.const$2.varHandle(MemoryLayout.PathElement.groupElement("wReserved1"));
    static final VarHandle const$3 = constants$1609.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_SHORT.withByteAlignment(1).withName("wMid"),
        JAVA_SHORT.withByteAlignment(1).withName("wPid"),
        JAVA_INT.withByteAlignment(1).withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, JAVA_SHORT.withByteAlignment(1)).withName("szPname"),
        JAVA_INT.withByteAlignment(1).withName("dwFormats"),
        JAVA_SHORT.withByteAlignment(1).withName("wChannels"),
        JAVA_SHORT.withByteAlignment(1).withName("wReserved1"),
        JAVA_INT.withByteAlignment(1).withName("dwSupport")
    ).withName("tagWAVEOUTCAPSW");
    static final VarHandle const$5 = constants$1610.const$4.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
}

