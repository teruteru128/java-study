// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2288 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2288() {}
    static final VarHandle const$0 = constants$2287.const$5.varHandle(MemoryLayout.PathElement.groupElement("RpcInterfaceInformation"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_MIDL_STUB_DESC.pfnAllocate.class, "apply", constants$1977.const$2);
    static final VarHandle const$2 = constants$2287.const$5.varHandle(MemoryLayout.PathElement.groupElement("pfnAllocate"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_MIDL_STUB_DESC.pfnFree.class, "apply", constants$0.const$0);
    static final VarHandle const$4 = constants$2287.const$5.varHandle(MemoryLayout.PathElement.groupElement("pfnFree"));
    static final UnionLayout const$5 = MemoryLayout.unionLayout(
        RuntimeHelper.POINTER.withName("pAutoHandle"),
        RuntimeHelper.POINTER.withName("pPrimitiveHandle"),
        RuntimeHelper.POINTER.withName("pGenericBindingInfo")
    ).withName("");
}

