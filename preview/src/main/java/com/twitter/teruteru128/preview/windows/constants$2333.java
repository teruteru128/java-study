// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2333 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2333() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "NdrAllocate",
        constants$2333.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "NdrClearOutParameters",
        constants$508.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "NdrOleAllocate",
        constants$1977.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "NdrOleFree",
        constants$0.const$0
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("Buffer"),
        JAVA_INT.withName("BufferSize"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pfnAllocate"),
        RuntimeHelper.POINTER.withName("pfnFree"),
        RuntimeHelper.POINTER.withName("pRpcChannelBuffer"),
        MemoryLayout.sequenceLayout(5, JAVA_LONG).withName("Reserved")
    ).withName("_NDR_USER_MARSHAL_INFO_LEVEL1");
}

