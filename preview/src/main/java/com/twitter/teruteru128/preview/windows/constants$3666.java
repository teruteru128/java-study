// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3666 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3666() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IOleObjectVtbl.GetMiscStatus.class, "apply", constants$485.const$5);
    static final VarHandle const$1 = constants$3658.const$2.varHandle(MemoryLayout.PathElement.groupElement("GetMiscStatus"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IOleObjectVtbl.SetColorScheme.class, "apply", constants$34.const$0);
    static final VarHandle const$3 = constants$3658.const$2.varHandle(MemoryLayout.PathElement.groupElement("SetColorScheme"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IOleObject");
    static final VarHandle const$5 = constants$3666.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
}


