// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1180 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1180() {}
    static final VarHandle const$0 = constants$1179.const$2.varHandle(MemoryLayout.PathElement.groupElement("itemWidth"));
    static final VarHandle const$1 = constants$1179.const$2.varHandle(MemoryLayout.PathElement.groupElement("itemHeight"));
    static final VarHandle const$2 = constants$1179.const$2.varHandle(MemoryLayout.PathElement.groupElement("itemData"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("CtlType"),
        JAVA_INT.withName("CtlID"),
        JAVA_INT.withName("itemID"),
        JAVA_INT.withName("itemAction"),
        JAVA_INT.withName("itemState"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hwndItem"),
        RuntimeHelper.POINTER.withName("hDC"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("rcItem"),
        JAVA_LONG.withName("itemData")
    ).withName("tagDRAWITEMSTRUCT");
    static final VarHandle const$4 = constants$1180.const$3.varHandle(MemoryLayout.PathElement.groupElement("CtlType"));
    static final VarHandle const$5 = constants$1180.const$3.varHandle(MemoryLayout.PathElement.groupElement("CtlID"));
}


