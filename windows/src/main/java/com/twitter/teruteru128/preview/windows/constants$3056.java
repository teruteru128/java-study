// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3056 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3056() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(IStreamVtbl.Clone.class, "apply", constants$34.const$0);
    static final VarHandle const$1 = constants$3050.const$1.varHandle(MemoryLayout.PathElement.groupElement("Clone"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpVtbl")
    ).withName("IStream");
    static final VarHandle const$3 = constants$3056.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpVtbl"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "IStream_RemoteSeek_Proxy",
        constants$3052.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "IStream_RemoteSeek_Stub",
        constants$467.const$0
    );
}

