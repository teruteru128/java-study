// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2970 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2970() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "_onexit",
        constants$33.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(at_quick_exit$x0.class, "apply", constants$0.const$2);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "at_quick_exit",
        constants$18.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_purecall_handler.class, "apply", constants$0.const$2);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_invalid_parameter_handler.class, "apply", constants$2.const$5);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$2.const$5
    );
}


