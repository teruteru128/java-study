// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4041 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4041() {}
    static final VarHandle const$0 = constants$4037.const$2.varHandle(MemoryLayout.PathElement.groupElement("put_JavaDSOCompatible"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IXMLDSOControlVtbl.get_readyState.class, "apply", constants$34.const$0);
    static final VarHandle const$2 = constants$4037.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_readyState"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IXMLDSOControl");
    static final VarHandle const$4 = constants$4041.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("CLSID_XMLDSOControl", constants$27.const$0);
}

