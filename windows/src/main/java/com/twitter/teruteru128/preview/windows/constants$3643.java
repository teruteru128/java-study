// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3643 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3643() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("Cache"),
        RuntimeHelper.POINTER.withName("Uncache"),
        RuntimeHelper.POINTER.withName("EnumCache"),
        RuntimeHelper.POINTER.withName("InitCache"),
        RuntimeHelper.POINTER.withName("SetData"),
        RuntimeHelper.POINTER.withName("UpdateCache"),
        RuntimeHelper.POINTER.withName("DiscardCache")
    ).withName("IOleCache2Vtbl");
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(IOleCache2Vtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$2 = constants$3643.const$0.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(IOleCache2Vtbl.AddRef.class, "apply", constants$18.const$5);
    static final VarHandle const$4 = constants$3643.const$0.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(IOleCache2Vtbl.Release.class, "apply", constants$18.const$5);
}

