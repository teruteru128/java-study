// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3055 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3055() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$3054.const$4
    );
    static final VarHandle const$1 = constants$3050.const$1.varHandle(MemoryLayout.PathElement.groupElement("LockRegion"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IStreamVtbl.UnlockRegion.class, "apply", constants$3054.const$4);
    static final VarHandle const$3 = constants$3050.const$1.varHandle(MemoryLayout.PathElement.groupElement("UnlockRegion"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IStreamVtbl.Stat.class, "apply", constants$570.const$5);
    static final VarHandle const$5 = constants$3050.const$1.varHandle(MemoryLayout.PathElement.groupElement("Stat"));
}

