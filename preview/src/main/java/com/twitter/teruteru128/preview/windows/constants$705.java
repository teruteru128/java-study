// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$705 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$705() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "IsWow64Process2",
        constants$37.const$3
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_SHORT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "GetSystemWow64Directory2A",
        constants$705.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetSystemWow64Directory2W",
        constants$705.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "IsWow64GuestMachineSupported",
        constants$7.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "Wow64GetThreadContext",
        constants$34.const$0
    );
}

