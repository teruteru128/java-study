// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4125 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4125() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IAuthenticateVtbl.Authenticate.class, "apply", constants$1.const$3);
    static final VarHandle const$1 = constants$4123.const$5.varHandle(MemoryLayout.PathElement.groupElement("Authenticate"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IAuthenticate");
    static final VarHandle const$3 = constants$4125.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0007_v0_0_c_ifspec", RuntimeHelper.POINTER);
    static final MemorySegment const$5 = RuntimeHelper.lookupGlobalVariable("__MIDL_itf_urlmon_0000_0007_v0_0_s_ifspec", RuntimeHelper.POINTER);
}


