// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1378 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1378() {}
    static final VarHandle const$0 = constants$1377.const$5.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetTitleBarInfo",
        constants$34.const$0
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("rcTitleBar"),
        MemoryLayout.sequenceLayout(6, JAVA_INT).withName("rgstate"),
        MemoryLayout.sequenceLayout(6, MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("tagRECT")).withName("rgrect")
    ).withName("tagTITLEBARINFOEX");
    static final VarHandle const$3 = constants$1378.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("rcBar"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hMenu"),
        RuntimeHelper.POINTER.withName("hwndMenu"),
        MemoryLayout.paddingLayout(8)
    ).withName("tagMENUBARINFO");
    static final VarHandle const$5 = constants$1378.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
}


