// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3245 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3245() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IPersistVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$1 = constants$3244.const$1.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IPersistVtbl.GetClassID.class, "apply", constants$34.const$0);
    static final VarHandle const$3 = constants$3244.const$1.varHandle(MemoryLayout.PathElement.groupElement("GetClassID"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IPersist");
    static final VarHandle const$5 = constants$3245.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
}

