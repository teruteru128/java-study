// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$647 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$647() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "SetProcessDynamicEHContinuationTargets",
        constants$647.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SetProcessDynamicEnforcedCetCompatibleRanges",
        constants$647.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SetProcessAffinityUpdateMode",
        constants$65.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "QueryProcessAffinityUpdateMode",
        constants$34.const$0
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "CreateRemoteThreadEx",
        constants$647.const$5
    );
}

