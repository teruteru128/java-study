// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2283 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2283() {}
    static final VarHandle const$0 = constants$2282.const$2.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("CommOffset"),
        JAVA_SHORT.withName("FaultOffset")
    ).withName("_COMM_FAULT_OFFSETS");
    static final VarHandle const$2 = constants$2283.const$1.varHandle(MemoryLayout.PathElement.groupElement("CommOffset"));
    static final VarHandle const$3 = constants$2283.const$1.varHandle(MemoryLayout.PathElement.groupElement("FaultOffset"));
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(CS_TYPE_NET_SIZE_ROUTINE.class, "apply", constants$2283.const$4);
}

