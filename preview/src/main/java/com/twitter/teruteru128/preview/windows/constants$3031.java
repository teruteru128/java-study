// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3031 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3031() {}
    static final VarHandle const$0 = constants$3030.const$5.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pIID"),
        RuntimeHelper.POINTER.withName("pItf"),
        JAVA_INT.withName("hr"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagMULTI_QI");
    static final VarHandle const$2 = constants$3031.const$1.varHandle(MemoryLayout.PathElement.groupElement("pIID"));
    static final VarHandle const$3 = constants$3031.const$1.varHandle(MemoryLayout.PathElement.groupElement("pItf"));
    static final VarHandle const$4 = constants$3031.const$1.varHandle(MemoryLayout.PathElement.groupElement("hr"));
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidlbase_0000_0008_v0_0_c_ifspec", RuntimeHelper.POINTER);
}


