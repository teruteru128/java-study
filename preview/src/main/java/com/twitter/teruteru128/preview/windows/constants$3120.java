// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3120 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3120() {}
    static final VarHandle const$0 = constants$3118.const$4.varHandle(MemoryLayout.PathElement.groupElement("GetHandle"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(ISynchronizeEventVtbl.SetEventHandle.class, "apply", constants$34.const$0);
    static final VarHandle const$2 = constants$3118.const$4.varHandle(MemoryLayout.PathElement.groupElement("SetEventHandle"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("ISynchronizeEvent");
    static final VarHandle const$4 = constants$3120.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("IID_ISynchronizeContainer", constants$27.const$0);
}


