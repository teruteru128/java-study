// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4145 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4145() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(ICodeInstallVtbl.OnCodeInstallProblem.class, "apply", constants$657.const$2);
    static final VarHandle const$1 = constants$4143.const$3.varHandle(MemoryLayout.PathElement.groupElement("OnCodeInstallProblem"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("ICodeInstall");
    static final VarHandle const$3 = constants$4145.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0014_v0_0_c_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0014_v0_0_s_ifspec", RuntimeHelper.POINTER);
}

