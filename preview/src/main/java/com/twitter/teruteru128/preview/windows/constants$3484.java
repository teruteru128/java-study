// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3484 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3484() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_SHORT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IDispatchVtbl.Invoke.class, "apply", constants$3484.const$0);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        constants$3484.const$0
    );
    static final VarHandle const$3 = constants$3481.const$5.varHandle(MemoryLayout.PathElement.groupElement("Invoke"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IDispatch");
    static final VarHandle const$5 = constants$3484.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
}

