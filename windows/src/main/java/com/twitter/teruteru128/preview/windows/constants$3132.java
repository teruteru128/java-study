// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3132 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3132() {}
    static final VarHandle const$0 = constants$3131.const$2.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(ICallFactoryVtbl.Release.class, "apply", constants$18.const$5);
    static final VarHandle const$2 = constants$3131.const$2.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(ICallFactoryVtbl.CreateCall.class, "apply", constants$577.const$5);
    static final VarHandle const$4 = constants$3131.const$2.varHandle(MemoryLayout.PathElement.groupElement("CreateCall"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("ICallFactory");
}

