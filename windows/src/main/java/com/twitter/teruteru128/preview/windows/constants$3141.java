// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3141 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3141() {}
    static final VarHandle const$0 = constants$3140.const$0.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IAddrTrackingControlVtbl.EnableCOMDynamicAddrTracking.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$3140.const$0.varHandle(MemoryLayout.PathElement.groupElement("EnableCOMDynamicAddrTracking"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IAddrTrackingControlVtbl.DisableCOMDynamicAddrTracking.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$3140.const$0.varHandle(MemoryLayout.PathElement.groupElement("DisableCOMDynamicAddrTracking"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IAddrTrackingControl");
}

