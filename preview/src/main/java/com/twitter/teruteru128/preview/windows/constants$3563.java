// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3563 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3563() {}
    static final VarHandle const$0 = constants$3562.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "IPropertyBag_RemoteRead_Proxy",
        constants$798.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "IPropertyBag_RemoteRead_Stub",
        constants$467.const$0
    );
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("IID_ITypeLibRegistrationReader", constants$27.const$0);
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("EnumTypeLibRegistrations")
    ).withName("ITypeLibRegistrationReaderVtbl");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(ITypeLibRegistrationReaderVtbl.QueryInterface.class, "apply", constants$37.const$3);
}


