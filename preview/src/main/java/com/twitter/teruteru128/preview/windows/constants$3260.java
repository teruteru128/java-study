// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3260 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3260() {}
    static final VarHandle const$0 = constants$3259.const$0.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IROTDataVtbl.GetComparisonData.class, "apply", constants$586.const$5);
    static final VarHandle const$2 = constants$3259.const$0.varHandle(MemoryLayout.PathElement.groupElement("GetComparisonData"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IROTData");
    static final VarHandle const$4 = constants$3260.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0064_v0_0_c_ifspec", RuntimeHelper.POINTER);
}

