// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4325 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4325() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0054_v0_0_c_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0054_v0_0_s_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("IID_IBindHttpSecurity", constants$27.const$0);
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetIgnoreCertMask")
    ).withName("IBindHttpSecurityVtbl");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IBindHttpSecurityVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$5 = constants$4325.const$3.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
}


