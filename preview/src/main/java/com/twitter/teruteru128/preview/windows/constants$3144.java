// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3144 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3144() {}
    static final VarHandle const$0 = constants$3142.const$2.varHandle(MemoryLayout.PathElement.groupElement("UpdateAddrExclusionList"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IAddrExclusionControl");
    static final VarHandle const$2 = constants$3144.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$3 = RuntimeHelper.lookupGlobalVariable("IID_IPipeByte", constants$27.const$0);
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("Pull"),
        RuntimeHelper.POINTER.withName("Push")
    ).withName("IPipeByteVtbl");
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IPipeByteVtbl.QueryInterface.class, "apply", constants$37.const$3);
}


