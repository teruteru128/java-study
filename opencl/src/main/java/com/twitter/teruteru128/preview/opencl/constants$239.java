// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$239 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$239() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(clReleaseSemaphoreKHR_fn.class, "apply", constants$18.const$1);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(clRetainSemaphoreKHR_fn.class, "apply", constants$18.const$1);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "clCreateSemaphoreWithPropertiesKHR",
        constants$185.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "clEnqueueWaitSemaphoresKHR",
        constants$238.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clEnqueueSignalSemaphoresKHR",
        constants$238.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "clGetSemaphoreInfoKHR",
        constants$176.const$4
    );
}

