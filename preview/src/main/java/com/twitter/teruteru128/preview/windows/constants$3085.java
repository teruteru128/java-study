// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3085 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3085() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IRpcStubBuffer");
    static final VarHandle const$1 = constants$3085.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("IID_IPSFactoryBuffer", constants$27.const$0);
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("CreateProxy"),
        RuntimeHelper.POINTER.withName("CreateStub")
    ).withName("IPSFactoryBufferVtbl");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IPSFactoryBufferVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$5 = constants$3085.const$3.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
}

