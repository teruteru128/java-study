// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$62 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$62() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "_bittestandcomplement",
        constants$61.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "_bittestandset",
        constants$61.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "_bittestandreset",
        constants$61.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "_interlockedbittestandset",
        constants$61.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "_interlockedbittestandreset",
        constants$61.const$4
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_BYTE,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "_bittest64",
        constants$62.const$5
    );
}

