// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2328 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2328() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(RpcSsSwapClientAllocFree$ClientAlloc.class, "apply", constants$1977.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(RpcSsSwapClientAllocFree$ClientFree.class, "apply", constants$0.const$0);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(RpcSsSwapClientAllocFree$OldClientAlloc.class, "apply", constants$1977.const$2);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(RpcSsSwapClientAllocFree$OldClientFree.class, "apply", constants$0.const$0);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "RpcSsSwapClientAllocFree",
        constants$467.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "RpcSmAllocate",
        constants$89.const$1
    );
}


