// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3243 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3243() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IRunningObjectTableVtbl.EnumRunning.class, "apply", constants$34.const$0);
    static final VarHandle const$1 = constants$3239.const$5.varHandle(MemoryLayout.PathElement.groupElement("EnumRunning"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IRunningObjectTable");
    static final VarHandle const$3 = constants$3243.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0060_v0_0_c_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_objidl_0000_0060_v0_0_s_ifspec", RuntimeHelper.POINTER);
}


