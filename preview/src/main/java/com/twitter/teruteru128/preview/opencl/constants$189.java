// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$189 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$189() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "clLinkProgram",
        constants$189.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(clSetProgramReleaseCallback$pfn_notify.class, "apply", constants$180.const$3);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "clSetProgramReleaseCallback",
        constants$9.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "clSetProgramSpecializationConstant",
        constants$189.const$4
    );
}


