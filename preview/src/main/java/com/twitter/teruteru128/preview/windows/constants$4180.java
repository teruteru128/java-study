// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4180 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4180() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("IID_IWinInetHttpTimeouts", constants$27.const$0);
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetRequestTimeouts")
    ).withName("IWinInetHttpTimeoutsVtbl");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IWinInetHttpTimeoutsVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$3 = constants$4180.const$1.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IWinInetHttpTimeoutsVtbl.AddRef.class, "apply", constants$18.const$5);
    static final VarHandle const$5 = constants$4180.const$1.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
}


