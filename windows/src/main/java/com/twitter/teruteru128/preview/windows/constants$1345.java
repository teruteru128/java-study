// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1345 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1345() {}
    static final VarHandle const$0 = constants$1344.const$5.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$1 = constants$1344.const$5.varHandle(MemoryLayout.PathElement.groupElement("iMinAnimate"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwFlags"),
        RuntimeHelper.POINTER.withName("lpszActivePort"),
        RuntimeHelper.POINTER.withName("lpszPort"),
        JAVA_INT.withName("iBaudRate"),
        JAVA_INT.withName("iPortState"),
        JAVA_INT.withName("iActive"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagSERIALKEYSA");
    static final VarHandle const$3 = constants$1345.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$4 = constants$1345.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final VarHandle const$5 = constants$1345.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpszActivePort"));
}

