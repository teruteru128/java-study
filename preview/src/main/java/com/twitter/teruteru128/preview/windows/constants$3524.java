// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3524 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3524() {}
    static final VarHandle const$0 = constants$3521.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetLibAttr"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(ITypeLibVtbl.GetTypeComp.class, "apply", constants$34.const$0);
    static final VarHandle const$2 = constants$3521.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetTypeComp"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(ITypeLibVtbl.GetDocumentation.class, "apply", constants$2151.const$4);
    static final VarHandle const$4 = constants$3521.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetDocumentation"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(ITypeLibVtbl.IsName.class, "apply", constants$586.const$5);
}


