// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2326 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2326() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "NdrMapCommAndFaultStatus",
        constants$607.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(RPC_CLIENT_ALLOC.class, "apply", constants$1977.const$2);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(RPC_CLIENT_FREE.class, "apply", constants$0.const$0);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "RpcSsAllocate",
        constants$1977.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "RpcSsDisableAllocate",
        constants$0.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "RpcSsEnableAllocate",
        constants$0.const$2
    );
}

