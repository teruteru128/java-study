// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3366 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3366() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IUrlMonVtbl.AsyncGetClassBits.class, "apply", constants$3366.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$3366.const$0
    );
    static final VarHandle const$3 = constants$3364.const$5.varHandle(MemoryLayout.PathElement.groupElement("AsyncGetClassBits"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IUrlMon");
    static final VarHandle const$5 = constants$3366.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
}


