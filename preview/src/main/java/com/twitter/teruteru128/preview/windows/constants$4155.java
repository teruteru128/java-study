// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4155 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4155() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IUriVtbl.GetProperties.class, "apply", constants$34.const$0);
    static final VarHandle const$1 = constants$4146.const$1.varHandle(MemoryLayout.PathElement.groupElement("GetProperties"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IUriVtbl.IsEqual.class, "apply", constants$37.const$3);
    static final VarHandle const$3 = constants$4146.const$1.varHandle(MemoryLayout.PathElement.groupElement("IsEqual"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IUri");
    static final VarHandle const$5 = constants$4155.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
}

