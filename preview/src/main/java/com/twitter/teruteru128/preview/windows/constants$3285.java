// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3285 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3285() {}
    static final VarHandle const$0 = constants$3282.const$0.varHandle(MemoryLayout.PathElement.groupElement("LockRegion"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(ILockBytesVtbl.UnlockRegion.class, "apply", constants$3054.const$4);
    static final VarHandle const$2 = constants$3282.const$0.varHandle(MemoryLayout.PathElement.groupElement("UnlockRegion"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(ILockBytesVtbl.Stat.class, "apply", constants$570.const$5);
    static final VarHandle const$4 = constants$3282.const$0.varHandle(MemoryLayout.PathElement.groupElement("Stat"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("ILockBytes");
}


