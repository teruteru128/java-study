// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1072 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1072() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "ColorCorrectPalette",
        constants$584.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("iType"),
        JAVA_INT.withName("nSize")
    ).withName("tagEMR");
    static final VarHandle const$2 = constants$1072.const$1.varHandle(MemoryLayout.PathElement.groupElement("iType"));
    static final VarHandle const$3 = constants$1072.const$1.varHandle(MemoryLayout.PathElement.groupElement("nSize"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y")
        ).withName("ptlReference"),
        JAVA_INT.withName("nChars"),
        JAVA_INT.withName("offString"),
        JAVA_INT.withName("fOptions"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("rcl"),
        JAVA_INT.withName("offDx")
    ).withName("tagEMRTEXT");
    static final VarHandle const$5 = constants$1072.const$4.varHandle(MemoryLayout.PathElement.groupElement("nChars"));
}

