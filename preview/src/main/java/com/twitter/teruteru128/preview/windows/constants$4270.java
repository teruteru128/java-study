// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4270 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4270() {}
    static final VarHandle const$0 = constants$4266.const$4.varHandle(MemoryLayout.PathElement.groupElement("GetAppZoneId"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IZoneIdentifier2Vtbl.SetAppZoneId.class, "apply", constants$65.const$2);
    static final VarHandle const$2 = constants$4266.const$4.varHandle(MemoryLayout.PathElement.groupElement("SetAppZoneId"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IZoneIdentifier2Vtbl.RemoveAppZoneId.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$4266.const$4.varHandle(MemoryLayout.PathElement.groupElement("RemoveAppZoneId"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IZoneIdentifier2");
}


