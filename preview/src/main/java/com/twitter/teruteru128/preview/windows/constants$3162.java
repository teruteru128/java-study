// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3162 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3162() {}
    static final VarHandle const$0 = constants$3161.const$0.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IComThreadingInfoVtbl.GetCurrentApartmentType.class, "apply", constants$34.const$0);
    static final VarHandle const$2 = constants$3161.const$0.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentApartmentType"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IComThreadingInfoVtbl.GetCurrentThreadType.class, "apply", constants$34.const$0);
    static final VarHandle const$4 = constants$3161.const$0.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentThreadType"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IComThreadingInfoVtbl.GetCurrentLogicalThreadId.class, "apply", constants$34.const$0);
}


