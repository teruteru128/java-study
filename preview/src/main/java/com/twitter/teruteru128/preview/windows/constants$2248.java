// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2248 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2248() {}
    static final VarHandle const$0 = constants$2247.const$4.varHandle(MemoryLayout.PathElement.groupElement("pbData"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbData"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pbData")
    ).withName("_EFS_RPC_BLOB");
    static final VarHandle const$2 = constants$2248.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    static final VarHandle const$3 = constants$2248.const$1.varHandle(MemoryLayout.PathElement.groupElement("pbData"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbPadding"),
        JAVA_INT.withName("cbData"),
        RuntimeHelper.POINTER.withName("pbData")
    ).withName("_EFS_PIN_BLOB");
    static final VarHandle const$5 = constants$2248.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbPadding"));
}

