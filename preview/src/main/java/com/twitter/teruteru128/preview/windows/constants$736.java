// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$736 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$736() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "SetSecurityAccessMask",
        constants$605.const$4
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        JAVA_SHORT
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorControl",
        constants$736.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorDacl",
        constants$590.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorGroup",
        constants$570.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "SetSecurityDescriptorOwner",
        constants$570.const$5
    );
}


