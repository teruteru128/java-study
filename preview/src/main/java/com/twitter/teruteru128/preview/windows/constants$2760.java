// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2760 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2760() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SCardSetAttrib",
        constants$1931.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(LPOCNCONNPROCA.class, "apply", constants$2760.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$2760.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(LPOCNCONNPROCW.class, "apply", constants$2760.const$1);
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
}


