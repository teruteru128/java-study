// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3706 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3706() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IContinueVtbl.FContinue.class, "apply", constants$18.const$5);
    static final VarHandle const$1 = constants$3704.const$5.varHandle(MemoryLayout.PathElement.groupElement("FContinue"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IContinue");
    static final VarHandle const$3 = constants$3706.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("IID_IViewObject", constants$27.const$0);
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("Draw"),
        RuntimeHelper.POINTER.withName("GetColorSet"),
        RuntimeHelper.POINTER.withName("Freeze"),
        RuntimeHelper.POINTER.withName("Unfreeze"),
        RuntimeHelper.POINTER.withName("SetAdvise"),
        RuntimeHelper.POINTER.withName("GetAdvise")
    ).withName("IViewObjectVtbl");
}


