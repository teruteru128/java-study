// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$186 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$186() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "clRetainSampler",
        constants$18.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "clReleaseSampler",
        constants$18.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "clGetSamplerInfo",
        constants$176.const$4
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clCreateProgramWithSource",
        constants$186.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "clCreateProgramWithBinary",
        constants$186.const$5
    );
}


