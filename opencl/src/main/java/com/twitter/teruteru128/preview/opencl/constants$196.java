// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$196 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$196() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "clEnqueueWriteBuffer",
        constants$195.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "clEnqueueWriteBufferRect",
        constants$195.const$5
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "clEnqueueFillBuffer",
        constants$196.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clEnqueueCopyBuffer",
        constants$196.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "clEnqueueCopyBufferRect",
        constants$196.const$5
    );
}

