// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$69 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$69() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "_InterlockedExchangePointer",
        constants$30.const$3
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_BYTE,
        RuntimeHelper.POINTER,
        JAVA_BYTE
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_InterlockedExchange8",
        constants$69.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_SHORT,
        RuntimeHelper.POINTER,
        JAVA_SHORT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_InterlockedExchange16",
        constants$69.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "_InterlockedExchangeAdd8",
        constants$69.const$1
    );
}


