// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1400 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1400() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "GetRawPointerDeviceData",
        constants$1400.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "ChangeWindowMessageFilter",
        constants$12.const$3
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("ExtStatus")
    ).withName("tagCHANGEFILTERSTRUCT");
    static final VarHandle const$4 = constants$1400.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$5 = constants$1400.const$3.varHandle(MemoryLayout.PathElement.groupElement("ExtStatus"));
}


