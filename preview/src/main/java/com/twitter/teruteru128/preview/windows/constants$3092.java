// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3092 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3092() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IChannelHookVtbl.ServerNotify.class, "apply", constants$3091.const$5);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$3091.const$5
    );
    static final VarHandle const$2 = constants$3089.const$0.varHandle(MemoryLayout.PathElement.groupElement("ServerNotify"));
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IChannelHookVtbl.ServerGetSize.class, "apply", constants$3092.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$3092.const$3
    );
}


