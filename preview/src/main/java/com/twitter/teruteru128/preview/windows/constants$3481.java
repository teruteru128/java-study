// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3481 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3481() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("ICreateTypeLib2");
    static final VarHandle const$1 = constants$3481.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oaidl_0000_0005_v0_0_c_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_oaidl_0000_0005_v0_0_s_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("IID_IDispatch", constants$27.const$0);
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetTypeInfoCount"),
        RuntimeHelper.POINTER.withName("GetTypeInfo"),
        RuntimeHelper.POINTER.withName("GetIDsOfNames"),
        RuntimeHelper.POINTER.withName("Invoke")
    ).withName("IDispatchVtbl");
}

