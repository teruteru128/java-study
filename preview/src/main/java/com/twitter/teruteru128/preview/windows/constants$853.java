// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$853 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$853() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CreateActCtxW",
        constants$33.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "AddRefActCtx",
        constants$0.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ReleaseActCtx",
        constants$0.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "ZombifyActCtx",
        constants$18.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "ActivateActCtx",
        constants$34.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_LONG
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "DeactivateActCtx",
        constants$853.const$5
    );
}

