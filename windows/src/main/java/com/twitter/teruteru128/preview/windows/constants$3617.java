// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3617 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3617() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IEnumSTATPROPSTG");
    static final VarHandle const$1 = constants$3617.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "IEnumSTATPROPSTG_RemoteNext_Proxy",
        constants$585.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "IEnumSTATPROPSTG_RemoteNext_Stub",
        constants$467.const$0
    );
    static final MemorySegment const$4 = RuntimeHelper.lookupGlobalVariable("IID_IEnumSTATPROPSETSTG", constants$27.const$0);
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("QueryInterface"),
        RuntimeHelper.POINTER.withName("AddRef"),
        RuntimeHelper.POINTER.withName("Release"),
        RuntimeHelper.POINTER.withName("Next"),
        RuntimeHelper.POINTER.withName("Skip"),
        RuntimeHelper.POINTER.withName("Reset"),
        RuntimeHelper.POINTER.withName("Clone")
    ).withName("IEnumSTATPROPSETSTGVtbl");
}

