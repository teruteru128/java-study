// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1076 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1076() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        JAVA_INT.withName("ihPal")
    ).withName("tagEMRSELECTPALETTE");
    static final VarHandle const$1 = constants$1076.const$0.varHandle(MemoryLayout.PathElement.groupElement("ihPal"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        JAVA_INT.withName("ihPal"),
        JAVA_INT.withName("cEntries")
    ).withName("tagEMRRESIZEPALETTE");
    static final VarHandle const$3 = constants$1076.const$2.varHandle(MemoryLayout.PathElement.groupElement("ihPal"));
    static final VarHandle const$4 = constants$1076.const$2.varHandle(MemoryLayout.PathElement.groupElement("cEntries"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        JAVA_INT.withName("ihPal"),
        JAVA_INT.withName("iStart"),
        JAVA_INT.withName("cEntries"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            JAVA_BYTE.withName("peRed"),
            JAVA_BYTE.withName("peGreen"),
            JAVA_BYTE.withName("peBlue"),
            JAVA_BYTE.withName("peFlags")
        ).withName("tagPALETTEENTRY")).withName("aPalEntries")
    ).withName("tagEMRSETPALETTEENTRIES");
}

