// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4186 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4186() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IWinInetCacheHints2Vtbl.SetCacheExtension.class, "apply", constants$737.const$4);
    static final VarHandle const$1 = constants$4184.const$5.varHandle(MemoryLayout.PathElement.groupElement("SetCacheExtension"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IWinInetCacheHints2Vtbl.SetCacheExtension2.class, "apply", constants$737.const$4);
    static final VarHandle const$3 = constants$4184.const$5.varHandle(MemoryLayout.PathElement.groupElement("SetCacheExtension2"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IWinInetCacheHints2");
    static final VarHandle const$5 = constants$4186.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
}

