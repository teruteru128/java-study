// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1343 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1343() {}
    static final VarHandle const$0 = constants$1342.const$1.varHandle(MemoryLayout.PathElement.groupElement("iArrange"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("iHorzSpacing"),
        JAVA_INT.withName("iVertSpacing"),
        JAVA_INT.withName("iTitleWrap"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("lfHeight"),
            JAVA_INT.withName("lfWidth"),
            JAVA_INT.withName("lfEscapement"),
            JAVA_INT.withName("lfOrientation"),
            JAVA_INT.withName("lfWeight"),
            JAVA_BYTE.withName("lfItalic"),
            JAVA_BYTE.withName("lfUnderline"),
            JAVA_BYTE.withName("lfStrikeOut"),
            JAVA_BYTE.withName("lfCharSet"),
            JAVA_BYTE.withName("lfOutPrecision"),
            JAVA_BYTE.withName("lfClipPrecision"),
            JAVA_BYTE.withName("lfQuality"),
            JAVA_BYTE.withName("lfPitchAndFamily"),
            MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("lfFaceName")
        ).withName("lfFont")
    ).withName("tagICONMETRICSA");
    static final VarHandle const$2 = constants$1343.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$3 = constants$1343.const$1.varHandle(MemoryLayout.PathElement.groupElement("iHorzSpacing"));
    static final VarHandle const$4 = constants$1343.const$1.varHandle(MemoryLayout.PathElement.groupElement("iVertSpacing"));
    static final VarHandle const$5 = constants$1343.const$1.varHandle(MemoryLayout.PathElement.groupElement("iTitleWrap"));
}

