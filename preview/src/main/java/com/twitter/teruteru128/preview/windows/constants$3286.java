// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3286 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3286() {}
    static final VarHandle const$0 = constants$3285.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "ILockBytes_RemoteReadAt_Proxy",
        constants$3283.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ILockBytes_RemoteReadAt_Stub",
        constants$467.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "ILockBytes_RemoteWriteAt_Proxy",
        constants$3283.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ILockBytes_RemoteWriteAt_Stub",
        constants$467.const$0
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("tdSize"),
        JAVA_SHORT.withName("tdDriverNameOffset"),
        JAVA_SHORT.withName("tdDeviceNameOffset"),
        JAVA_SHORT.withName("tdPortNameOffset"),
        JAVA_SHORT.withName("tdExtDevmodeOffset"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("tdData"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagDVTARGETDEVICE");
}


