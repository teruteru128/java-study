// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4301 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4301() {}
    static final VarHandle const$0 = constants$4298.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0047_v0_0_c_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0047_v0_0_s_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("IID_ISoftDistExt", constants$27.const$0);
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("ProcessSoftDist"),
        RuntimeHelper.POINTER.withName("GetFirstCodeBase"),
        RuntimeHelper.POINTER.withName("GetNextCodeBase"),
        RuntimeHelper.POINTER.withName("AsyncInstallDistributionUnit")
    ).withName("ISoftDistExtVtbl");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(ISoftDistExtVtbl.QueryInterface.class, "apply", constants$37.const$3);
}

