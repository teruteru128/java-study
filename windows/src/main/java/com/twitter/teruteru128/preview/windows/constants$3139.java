// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3139 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3139() {}
    static final VarHandle const$0 = constants$3137.const$4.varHandle(MemoryLayout.PathElement.groupElement("WaitMultiple"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IWaitMultipleVtbl.AddSynchronize.class, "apply", constants$34.const$0);
    static final VarHandle const$2 = constants$3137.const$4.varHandle(MemoryLayout.PathElement.groupElement("AddSynchronize"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IWaitMultiple");
    static final VarHandle const$4 = constants$3139.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("IID_IAddrTrackingControl", constants$27.const$0);
}

