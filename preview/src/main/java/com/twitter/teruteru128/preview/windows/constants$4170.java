// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4170 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4170() {}
    static final VarHandle const$0 = constants$4169.const$0.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IUriBuilderFactoryVtbl.CreateIUriBuilder.class, "apply", constants$616.const$4);
    static final VarHandle const$2 = constants$4169.const$0.varHandle(MemoryLayout.PathElement.groupElement("CreateIUriBuilder"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IUriBuilderFactoryVtbl.CreateInitializedIUriBuilder.class, "apply", constants$616.const$4);
    static final VarHandle const$4 = constants$4169.const$0.varHandle(MemoryLayout.PathElement.groupElement("CreateInitializedIUriBuilder"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IUriBuilderFactory");
}

