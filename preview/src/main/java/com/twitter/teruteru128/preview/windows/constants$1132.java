// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1132 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1132() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$1131.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(DLGPROC.class, "apply", constants$1131.const$4);
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_LONG,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(TIMERPROC.class, "apply", constants$1132.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$1132.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(GRAYSTRINGPROC.class, "apply", constants$36.const$4);
}


