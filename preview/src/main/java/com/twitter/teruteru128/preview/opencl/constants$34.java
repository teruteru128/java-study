// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$34 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$34() {}
    static final VarHandle const$0 = constants$33.const$4.varHandle(MemoryLayout.PathElement.groupElement("rem"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "abs",
        constants$29.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "labs",
        constants$29.const$4
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "llabs",
        constants$34.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "_abs64",
        constants$34.const$3
    );
}

