// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1507 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1507() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "WNetCancelConnection2W",
        constants$67.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "WNetGetConnectionA",
        constants$37.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "WNetGetConnectionW",
        constants$37.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "WNetRestoreSingleConnectionW",
        constants$570.const$5
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "WNetUseConnectionA",
        constants$1507.const$4
    );
}

