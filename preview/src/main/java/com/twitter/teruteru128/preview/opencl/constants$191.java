// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$191 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$191() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "clCloneKernel",
        constants$191.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "clRetainKernel",
        constants$18.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "clReleaseKernel",
        constants$18.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clSetKernelArg",
        constants$189.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "clSetKernelArgSVMPointer",
        constants$191.const$5
    );
}

