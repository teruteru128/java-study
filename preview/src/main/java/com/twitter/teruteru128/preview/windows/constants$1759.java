// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1759 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1759() {}
    static final VarHandle const$0 = constants$1758.const$2.varHandle(MemoryLayout.PathElement.groupElement("CallTimeout"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "RpcBindingCreateA",
        constants$1.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "RpcBindingCreateW",
        constants$1.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "RpcBindingGetTrainingContextHandle",
        constants$34.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "RpcServerInqBindingHandle",
        constants$18.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
}


