// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3078 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3078() {}
    static final VarHandle const$0 = constants$3076.const$4.varHandle(MemoryLayout.PathElement.groupElement("NegotiateSyntax"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IRpcSyntaxNegotiate");
    static final VarHandle const$2 = constants$3078.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("IID_IRpcProxyBuffer", constants$27.const$0);
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("Connect"),
        RuntimeHelper.POINTER.withName("Disconnect")
    ).withName("IRpcProxyBufferVtbl");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IRpcProxyBufferVtbl.QueryInterface.class, "apply", constants$37.const$3);
}


