// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1786 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1786() {}
    static final VarHandle const$0 = constants$1784.const$5.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "I_RpcNegotiateTransferSyntax",
        constants$18.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "I_RpcGetBuffer",
        constants$18.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "I_RpcGetBufferWithObject",
        constants$34.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "I_RpcSendReceive",
        constants$18.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "I_RpcFreeBuffer",
        constants$18.const$5
    );
}

