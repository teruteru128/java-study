// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$935 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$935() {}
    static final VarHandle const$0 = constants$934.const$5.varHandle(MemoryLayout.PathElement.groupElement("palVersion"));
    static final VarHandle const$1 = constants$934.const$5.varHandle(MemoryLayout.PathElement.groupElement("palNumEntries"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
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
    ).withName("tagLOGFONTA");
    static final VarHandle const$3 = constants$935.const$2.varHandle(MemoryLayout.PathElement.groupElement("lfHeight"));
    static final VarHandle const$4 = constants$935.const$2.varHandle(MemoryLayout.PathElement.groupElement("lfWidth"));
    static final VarHandle const$5 = constants$935.const$2.varHandle(MemoryLayout.PathElement.groupElement("lfEscapement"));
}

