// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4181 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4181() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IWinInetHttpTimeoutsVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$1 = constants$4180.const$1.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IWinInetHttpTimeoutsVtbl.GetRequestTimeouts.class, "apply", constants$1.const$3);
    static final VarHandle const$3 = constants$4180.const$1.varHandle(MemoryLayout.PathElement.groupElement("GetRequestTimeouts"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IWinInetHttpTimeouts");
    static final VarHandle const$5 = constants$4181.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
}

