// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$10 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$10() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "bsearch_s",
        constants$10.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "qsort_s",
        constants$10.const$2
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "bsearch",
        constants$10.const$4
    );
}


