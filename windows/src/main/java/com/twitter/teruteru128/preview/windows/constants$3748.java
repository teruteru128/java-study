// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3748 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3748() {}
    static final VarHandle const$0 = constants$3745.const$4.varHandle(MemoryLayout.PathElement.groupElement("Invoke"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IXMLDOMImplementationVtbl.hasFeature.class, "apply", constants$1.const$3);
    static final VarHandle const$2 = constants$3745.const$4.varHandle(MemoryLayout.PathElement.groupElement("hasFeature"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IXMLDOMImplementation");
    static final VarHandle const$4 = constants$3748.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("IID_IXMLDOMNode", constants$27.const$0);
}

