// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$252 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$252() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "clEnqueueMemAdviseINTEL",
        constants$250.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(clEnqueueMigrateMemINTEL_fn.class, "apply", constants$252.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$252.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clEnqueueMigrateMemINTEL",
        constants$252.const$1
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
}


