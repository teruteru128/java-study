// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$37 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$37() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "_rotl64",
        constants$37.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_rotr",
        constants$26.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_lrotr",
        constants$26.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_rotr64",
        constants$37.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "srand",
        constants$25.const$2
    );
}


