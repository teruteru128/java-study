// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3017 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3017() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("HandleActivation")
    ).withName("IActivationFilterVtbl");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IActivationFilterVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$2 = constants$3017.const$0.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IActivationFilterVtbl.AddRef.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$3017.const$0.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IActivationFilterVtbl.Release.class, "apply", constants$18.const$5);
}


