// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3346 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3346() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IFillLockBytesVtbl.Terminate.class, "apply", constants$65.const$2);
    static final VarHandle const$1 = constants$3343.const$5.varHandle(MemoryLayout.PathElement.groupElement("Terminate"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IFillLockBytes");
    static final VarHandle const$3 = constants$3346.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "IFillLockBytes_RemoteFillAppend_Proxy",
        constants$586.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "IFillLockBytes_RemoteFillAppend_Stub",
        constants$467.const$0
    );
}

