// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3249 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3249() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IPersistStream");
    static final VarHandle const$1 = constants$3249.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("IID_IMoniker", constants$27.const$0);
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("GetClassID"),
        RuntimeHelper.POINTER.withName("IsDirty"),
        RuntimeHelper.POINTER.withName("Load"),
        RuntimeHelper.POINTER.withName("Save"),
        RuntimeHelper.POINTER.withName("GetSizeMax"),
        RuntimeHelper.POINTER.withName("BindToObject"),
        RuntimeHelper.POINTER.withName("BindToStorage"),
        RuntimeHelper.POINTER.withName("Reduce"),
        RuntimeHelper.POINTER.withName("ComposeWith"),
        RuntimeHelper.POINTER.withName("Enum"),
        RuntimeHelper.POINTER.withName("IsEqual"),
        RuntimeHelper.POINTER.withName("Hash"),
        RuntimeHelper.POINTER.withName("IsRunning"),
        RuntimeHelper.POINTER.withName("GetTimeOfLastChange"),
        RuntimeHelper.POINTER.withName("Inverse"),
        RuntimeHelper.POINTER.withName("CommonPrefixWith"),
        RuntimeHelper.POINTER.withName("RelativePathTo"),
        RuntimeHelper.POINTER.withName("GetDisplayName"),
        RuntimeHelper.POINTER.withName("ParseDisplayName"),
        RuntimeHelper.POINTER.withName("IsSystemMoniker")
    ).withName("IMonikerVtbl");
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(IMonikerVtbl.QueryInterface.class, "apply", constants$37.const$3);
    static final VarHandle const$5 = constants$3249.const$3.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
}


