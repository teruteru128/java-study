// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$229 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$229() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(clCreateSubDevicesEXT_fn.class, "apply", constants$177.const$3);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$177.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "clReleaseDeviceEXT",
        constants$18.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "clRetainDeviceEXT",
        constants$18.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "clCreateSubDevicesEXT",
        constants$177.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(clEnqueueMigrateMemObjectEXT_fn.class, "apply", constants$199.const$4);
}


