// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1140 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1140() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwSessionId")
    ).withName("tagWTSSESSION_NOTIFICATION");
    static final VarHandle const$1 = constants$1140.const$0.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$2 = constants$1140.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwSessionId"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("hwnd"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("left"),
            JAVA_INT.withName("top"),
            JAVA_INT.withName("right"),
            JAVA_INT.withName("bottom")
        ).withName("rc")
    ).withName("");
    static final VarHandle const$4 = constants$1140.const$3.varHandle(MemoryLayout.PathElement.groupElement("hwnd"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("message"),
        JAVA_INT.withName("paramL"),
        JAVA_INT.withName("paramH"),
        JAVA_INT.withName("time"),
        RuntimeHelper.POINTER.withName("hwnd")
    ).withName("tagEVENTMSG");
}

