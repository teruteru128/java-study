// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$246 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$246() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(clRetainAcceleratorINTEL_fn.class, "apply", constants$18.const$1);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(clReleaseAcceleratorINTEL_fn.class, "apply", constants$18.const$1);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "clCreateAcceleratorINTEL",
        constants$245.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "clGetAcceleratorInfoINTEL",
        constants$176.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clRetainAcceleratorINTEL",
        constants$18.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "clReleaseAcceleratorINTEL",
        constants$18.const$1
    );
}

