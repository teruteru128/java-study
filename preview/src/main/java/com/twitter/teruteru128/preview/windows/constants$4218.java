// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4218 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4218() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0031_v0_0_s_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("IID_IInternetProtocolSink", constants$27.const$0);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("Switch"),
        RuntimeHelper.POINTER.withName("ReportProgress"),
        RuntimeHelper.POINTER.withName("ReportData"),
        RuntimeHelper.POINTER.withName("ReportResult")
    ).withName("IInternetProtocolSinkVtbl");
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IInternetProtocolSinkVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$4 = constants$4218.const$2.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IInternetProtocolSinkVtbl.AddRef.class, "apply", constants$18.const$5);
}


