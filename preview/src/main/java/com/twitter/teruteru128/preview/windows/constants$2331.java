// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2331 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2331() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(RpcSmSwapClientAllocFree$OldClientAlloc.class, "apply", constants$1977.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(RpcSmSwapClientAllocFree$OldClientFree.class, "apply", constants$0.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "RpcSmSwapClientAllocFree",
        constants$1.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "NdrRpcSsEnableAllocate",
        constants$0.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "NdrRpcSsDisableAllocate",
        constants$0.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "NdrRpcSmSetClientToOsf",
        constants$0.const$0
    );
}

