// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3742 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3742() {}
    static final VarHandle const$0 = constants$3740.const$4.varHandle(MemoryLayout.PathElement.groupElement("QueryService"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IServiceProvider");
    static final VarHandle const$2 = constants$3742.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "IServiceProvider_RemoteQueryService_Proxy",
        constants$1.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "IServiceProvider_RemoteQueryService_Stub",
        constants$467.const$0
    );
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_servprov_0000_0001_v0_0_c_ifspec", RuntimeHelper.POINTER);
}


