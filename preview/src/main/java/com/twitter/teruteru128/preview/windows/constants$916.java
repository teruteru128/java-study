// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$916 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$916() {}
    static final VarHandle const$0 = constants$913.const$1.varHandle(MemoryLayout.PathElement.groupElement("tmUnderlined"));
    static final VarHandle const$1 = constants$913.const$1.varHandle(MemoryLayout.PathElement.groupElement("tmStruckOut"));
    static final VarHandle const$2 = constants$913.const$1.varHandle(MemoryLayout.PathElement.groupElement("tmPitchAndFamily"));
    static final VarHandle const$3 = constants$913.const$1.varHandle(MemoryLayout.PathElement.groupElement("tmCharSet"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("tmHeight"),
        JAVA_INT.withName("tmAscent"),
        JAVA_INT.withName("tmDescent"),
        JAVA_INT.withName("tmInternalLeading"),
        JAVA_INT.withName("tmExternalLeading"),
        JAVA_INT.withName("tmAveCharWidth"),
        JAVA_INT.withName("tmMaxCharWidth"),
        JAVA_INT.withName("tmWeight"),
        JAVA_INT.withName("tmOverhang"),
        JAVA_INT.withName("tmDigitizedAspectX"),
        JAVA_INT.withName("tmDigitizedAspectY"),
        JAVA_SHORT.withName("tmFirstChar"),
        JAVA_SHORT.withName("tmLastChar"),
        JAVA_SHORT.withName("tmDefaultChar"),
        JAVA_SHORT.withName("tmBreakChar"),
        JAVA_BYTE.withName("tmItalic"),
        JAVA_BYTE.withName("tmUnderlined"),
        JAVA_BYTE.withName("tmStruckOut"),
        JAVA_BYTE.withName("tmPitchAndFamily"),
        JAVA_BYTE.withName("tmCharSet"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagTEXTMETRICW");
    static final VarHandle const$5 = constants$916.const$4.varHandle(MemoryLayout.PathElement.groupElement("tmHeight"));
}


