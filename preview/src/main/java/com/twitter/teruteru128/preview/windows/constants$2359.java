// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2359 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2359() {}
    static final VarHandle const$0 = constants$2358.const$5.varHandle(MemoryLayout.PathElement.groupElement("fContext"));
    static final UnionLayout const$1 = MemoryLayout.unionLayout(
        JAVA_INT.withName("hInproc"),
        RuntimeHelper.POINTER.withName("hRemote"),
        JAVA_LONG.withName("hInproc64")
    ).withName("__MIDL_IWinTypes_0008");
    static final VarHandle const$2 = constants$2359.const$1.varHandle(MemoryLayout.PathElement.groupElement("hInproc"));
    static final VarHandle const$3 = constants$2359.const$1.varHandle(MemoryLayout.PathElement.groupElement("hRemote"));
    static final VarHandle const$4 = constants$2359.const$1.varHandle(MemoryLayout.PathElement.groupElement("hInproc64"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("fContext"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("hInproc"),
            JAVA_INT.withName("hRemote")
        ).withName("u")
    ).withName("_RemotableHandle");
}

