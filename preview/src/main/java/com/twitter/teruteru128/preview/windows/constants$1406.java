// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1406 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1406() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("deviceType"),
        JAVA_INT.withName("originId")
    ).withName("tagINPUT_MESSAGE_SOURCE");
    static final VarHandle const$1 = constants$1406.const$0.varHandle(MemoryLayout.PathElement.groupElement("deviceType"));
    static final VarHandle const$2 = constants$1406.const$0.varHandle(MemoryLayout.PathElement.groupElement("originId"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "GetCurrentInputMessageSource",
        constants$18.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "GetCIMSSM",
        constants$18.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "GetAutoRotationState",
        constants$18.const$5
    );
}


