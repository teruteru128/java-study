// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3654 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3654() {}
    static final VarHandle const$0 = constants$3652.const$0.varHandle(MemoryLayout.PathElement.groupElement("LockContainer"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IOleContainer");
    static final VarHandle const$2 = constants$3654.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("IID_IOleClientSite", constants$27.const$0);
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("SaveObject"),
        RuntimeHelper.POINTER.withName("GetMoniker"),
        RuntimeHelper.POINTER.withName("GetContainer"),
        RuntimeHelper.POINTER.withName("ShowObject"),
        RuntimeHelper.POINTER.withName("OnShowWindow"),
        RuntimeHelper.POINTER.withName("RequestNewObjectLayout")
    ).withName("IOleClientSiteVtbl");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IOleClientSiteVtbl.QueryInterface.class, "apply", constants$37.const$3);
}


