// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$761 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$761() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SetProcessAffinityMask",
        constants$39.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetProcessIoCounters",
        constants$34.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "FatalExit",
        constants$73.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SetEnvironmentStringsA",
        constants$18.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SwitchToFiber",
        constants$0.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "DeleteFiber",
        constants$0.const$0
    );
}

