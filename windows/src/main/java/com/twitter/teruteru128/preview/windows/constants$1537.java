// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1537 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1537() {}
    static final VarHandle const$0 = constants$1536.const$4.varHandle(MemoryLayout.PathElement.groupElement("uiHi"));
    static final VarHandle const$1 = constants$1536.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cb"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hwndTo"),
        JAVA_INT.withName("dwTime"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hTask"),
        JAVA_INT.withName("wMsg"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("wParam"),
        JAVA_LONG.withName("lParam"),
        MemoryLayout.structLayout(
            JAVA_LONG.withName("uiLo"),
            JAVA_LONG.withName("uiHi"),
            JAVA_INT.withName("cbData"),
            MemoryLayout.sequenceLayout(8, JAVA_INT).withName("Data"),
            MemoryLayout.paddingLayout(4)
        ).withName("dmhd")
    ).withName("tagMONMSGSTRUCT");
    static final VarHandle const$3 = constants$1537.const$2.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    static final VarHandle const$4 = constants$1537.const$2.varHandle(MemoryLayout.PathElement.groupElement("hwndTo"));
    static final VarHandle const$5 = constants$1537.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwTime"));
}

