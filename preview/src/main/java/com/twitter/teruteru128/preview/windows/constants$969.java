// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$969 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$969() {}
    static final VarHandle const$0 = constants$968.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    static final VarHandle const$1 = constants$968.const$5.varHandle(MemoryLayout.PathElement.groupElement("iType"));
    static final VarHandle const$2 = constants$968.const$5.varHandle(MemoryLayout.PathElement.groupElement("nCount"));
    static final VarHandle const$3 = constants$968.const$5.varHandle(MemoryLayout.PathElement.groupElement("nRgnSize"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwSize"),
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nCount"),
            JAVA_INT.withName("nRgnSize"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("left"),
                JAVA_INT.withName("top"),
                JAVA_INT.withName("right"),
                JAVA_INT.withName("bottom")
            ).withName("rcBound")
        ).withName("rdh"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("Buffer"),
        MemoryLayout.paddingLayout(3)
    ).withName("_RGNDATA");
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("abcA"),
        JAVA_INT.withName("abcB"),
        JAVA_INT.withName("abcC")
    ).withName("_ABC");
}

