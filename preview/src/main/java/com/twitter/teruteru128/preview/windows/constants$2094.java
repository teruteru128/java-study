// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2094 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2094() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CryptMsgOpenToDecode",
        constants$2094.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CryptMsgDuplicate",
        constants$33.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CryptMsgClose",
        constants$18.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CryptMsgUpdate",
        constants$584.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CryptMsgGetParam",
        constants$1007.const$4
    );
}


