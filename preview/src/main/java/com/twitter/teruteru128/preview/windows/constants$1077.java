// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1077 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1077() {}
    static final VarHandle const$0 = constants$1076.const$5.varHandle(MemoryLayout.PathElement.groupElement("ihPal"));
    static final VarHandle const$1 = constants$1076.const$5.varHandle(MemoryLayout.PathElement.groupElement("iStart"));
    static final VarHandle const$2 = constants$1076.const$5.varHandle(MemoryLayout.PathElement.groupElement("cEntries"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("caSize"),
            JAVA_SHORT.withName("caFlags"),
            JAVA_SHORT.withName("caIlluminantIndex"),
            JAVA_SHORT.withName("caRedGamma"),
            JAVA_SHORT.withName("caGreenGamma"),
            JAVA_SHORT.withName("caBlueGamma"),
            JAVA_SHORT.withName("caReferenceBlack"),
            JAVA_SHORT.withName("caReferenceWhite"),
            JAVA_SHORT.withName("caContrast"),
            JAVA_SHORT.withName("caBrightness"),
            JAVA_SHORT.withName("caColorfulness"),
            JAVA_SHORT.withName("caRedGreenTint")
        ).withName("ColorAdjustment")
    ).withName("tagEMRSETCOLORADJUSTMENT");
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        JAVA_INT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("Data"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagEMRGDICOMMENT");
    static final VarHandle const$5 = constants$1077.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
}

