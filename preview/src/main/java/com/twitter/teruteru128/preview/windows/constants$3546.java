// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3546 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3546() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(ISupportErrorInfoVtbl.InterfaceSupportsErrorInfo.class, "apply", constants$34.const$0);
    static final VarHandle const$1 = constants$3544.const$5.varHandle(MemoryLayout.PathElement.groupElement("InterfaceSupportsErrorInfo"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("ISupportErrorInfo");
    static final VarHandle const$3 = constants$3546.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("IID_ITypeFactory", constants$27.const$0);
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("CreateFromTypeInfo")
    ).withName("ITypeFactoryVtbl");
}

