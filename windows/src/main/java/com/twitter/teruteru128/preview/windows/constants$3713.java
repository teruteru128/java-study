// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3713 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3713() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IViewObject2Vtbl.AddRef.class, "apply", constants$18.const$5);
    static final VarHandle const$1 = constants$3712.const$3.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(IViewObject2Vtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$3 = constants$3712.const$3.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IViewObject2Vtbl.Draw.class, "apply", constants$3708.const$0);
    static final VarHandle const$5 = constants$3712.const$3.varHandle(MemoryLayout.PathElement.groupElement("Draw"));
}

