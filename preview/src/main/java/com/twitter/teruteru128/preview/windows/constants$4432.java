// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4432 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4432() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("hwndFrom"),
            JAVA_LONG.withName("idFrom"),
            JAVA_INT.withName("code"),
            MemoryLayout.paddingLayout(4)
        ).withName("hdr"),
        RuntimeHelper.POINTER.withName("lpOFN"),
        RuntimeHelper.POINTER.withName("psf"),
        RuntimeHelper.POINTER.withName("pidl")
    ).withName("_OFNOTIFYEXA");
    static final VarHandle const$1 = constants$4432.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpOFN"));
    static final VarHandle const$2 = constants$4432.const$0.varHandle(MemoryLayout.PathElement.groupElement("psf"));
    static final VarHandle const$3 = constants$4432.const$0.varHandle(MemoryLayout.PathElement.groupElement("pidl"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("hwndFrom"),
            JAVA_LONG.withName("idFrom"),
            JAVA_INT.withName("code"),
            MemoryLayout.paddingLayout(4)
        ).withName("hdr"),
        RuntimeHelper.POINTER.withName("lpOFN"),
        RuntimeHelper.POINTER.withName("psf"),
        RuntimeHelper.POINTER.withName("pidl")
    ).withName("_OFNOTIFYEXW");
    static final VarHandle const$5 = constants$4432.const$4.varHandle(MemoryLayout.PathElement.groupElement("lpOFN"));
}

