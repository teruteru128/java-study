// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3126 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3126() {}
    static final VarHandle const$0 = constants$3125.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("IID_ICancelMethodCalls", constants$27.const$0);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("Cancel"),
        RuntimeHelper.POINTER.withName("TestCancel")
    ).withName("ICancelMethodCallsVtbl");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(ICancelMethodCallsVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$4 = constants$3126.const$2.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(ICancelMethodCallsVtbl.AddRef.class, "apply", constants$18.const$5);
}


