// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1805 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1805() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        JAVA_INT,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(I_RpcProxyUpdatePerfCounterFn.class, "apply", constants$1805.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$1805.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(I_RpcProxyUpdatePerfCounterBackendServerFn.class, "apply", constants$72.const$3);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$72.const$3
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("IsValidMachineFn"),
        RuntimeHelper.POINTER.withName("GetClientAddressFn"),
        RuntimeHelper.POINTER.withName("GetConnectionTimeoutFn"),
        RuntimeHelper.POINTER.withName("PerformCalloutFn"),
        RuntimeHelper.POINTER.withName("FreeCalloutStateFn"),
        RuntimeHelper.POINTER.withName("GetClientSessionAndResourceUUIDFn"),
        RuntimeHelper.POINTER.withName("ProxyFilterIfFn"),
        RuntimeHelper.POINTER.withName("RpcProxyUpdatePerfCounterFn"),
        RuntimeHelper.POINTER.withName("RpcProxyUpdatePerfCounterBackendServerFn")
    ).withName("tagI_RpcProxyCallbackInterface");
}

