// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1722 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1722() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "RpcServerListen",
        constants$599.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "RpcServerRegisterIf",
        constants$37.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(RpcServerRegisterIfEx$IfCallback.class, "apply", constants$34.const$0);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "RpcServerRegisterIfEx",
        constants$836.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(RpcServerRegisterIf2$IfCallbackFn.class, "apply", constants$34.const$0);
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "RpcServerRegisterIf2",
        constants$1722.const$5
    );
}


