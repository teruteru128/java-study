// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3231 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3231() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IBindCtxVtbl.RevokeObjectParam.class, "apply", constants$34.const$0);
    static final VarHandle const$1 = constants$3226.const$5.varHandle(MemoryLayout.PathElement.groupElement("RevokeObjectParam"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IBindCtx");
    static final VarHandle const$3 = constants$3231.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "IBindCtx_RemoteSetBindOptions_Proxy",
        constants$34.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "IBindCtx_RemoteSetBindOptions_Stub",
        constants$467.const$0
    );
}

