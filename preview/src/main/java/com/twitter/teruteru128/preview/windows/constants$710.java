// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$710 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$710() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "FreeResource",
        constants$18.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetModuleFileNameA",
        constants$570.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "GetModuleFileNameW",
        constants$570.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetModuleHandleA",
        constants$33.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetModuleHandleW",
        constants$33.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(PGET_MODULE_HANDLE_EXA.class, "apply", constants$569.const$3);
}


