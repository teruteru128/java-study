// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1597 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1597() {}
    static final VarHandle const$0 = constants$1596.const$5.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(MMIOPROC.class, "apply", constants$1131.const$4);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(LPMMIOPROC.class, "apply", constants$1131.const$4);
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("dwFlags"),
        JAVA_INT.withByteAlignment(1).withName("fccIOProc"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("pIOProc"),
        JAVA_INT.withByteAlignment(1).withName("wErrorRet"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("htask"),
        JAVA_INT.withByteAlignment(1).withName("cchBuffer"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("pchBuffer"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("pchNext"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("pchEndRead"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("pchEndWrite"),
        JAVA_INT.withByteAlignment(1).withName("lBufOffset"),
        JAVA_INT.withByteAlignment(1).withName("lDiskOffset"),
        MemoryLayout.sequenceLayout(3, JAVA_INT.withByteAlignment(1)).withName("adwInfo"),
        JAVA_INT.withByteAlignment(1).withName("dwReserved1"),
        JAVA_INT.withByteAlignment(1).withName("dwReserved2"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("hmmio")
    ).withName("_MMIOINFO");
    static final VarHandle const$4 = constants$1597.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$5 = constants$1597.const$3.varHandle(MemoryLayout.PathElement.groupElement("fccIOProc"));
}

