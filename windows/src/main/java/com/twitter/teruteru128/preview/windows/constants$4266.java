// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4266 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4266() {}
    static final VarHandle const$0 = constants$4265.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0042_v0_0_c_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0042_v0_0_s_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("IID_IZoneIdentifier2", constants$27.const$0);
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetId"),
        RuntimeHelper.POINTER.withName("SetId"),
        RuntimeHelper.POINTER.withName("Remove"),
        RuntimeHelper.POINTER.withName("GetLastWriterPackageFamilyName"),
        RuntimeHelper.POINTER.withName("SetLastWriterPackageFamilyName"),
        RuntimeHelper.POINTER.withName("RemoveLastWriterPackageFamilyName"),
        RuntimeHelper.POINTER.withName("GetAppZoneId"),
        RuntimeHelper.POINTER.withName("SetAppZoneId"),
        RuntimeHelper.POINTER.withName("RemoveAppZoneId")
    ).withName("IZoneIdentifier2Vtbl");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IZoneIdentifier2Vtbl.QueryInterface.class, "apply", constants$37.const$3);
}

