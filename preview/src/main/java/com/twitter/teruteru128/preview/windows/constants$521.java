// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$521 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$521() {}
    static final VarHandle const$0 = constants$520.const$5.varHandle(MemoryLayout.PathElement.groupElement("Method"));
    static final VarHandle const$1 = constants$520.const$5.varHandle(MemoryLayout.PathElement.groupElement("DataBufferSize"));
    static final VarHandle const$2 = constants$520.const$5.varHandle(MemoryLayout.PathElement.groupElement("DataBuffer"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("TransactionKey"),
        JAVA_INT.withName("TransactionNotification"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("LowPart"),
                JAVA_INT.withName("HighPart")
            ).withName("u"),
            JAVA_LONG.withName("QuadPart")
        ).withName("TmVirtualClock"),
        JAVA_INT.withName("ArgumentLength"),
        MemoryLayout.paddingLayout(4)
    ).withName("_TRANSACTION_NOTIFICATION");
    static final VarHandle const$4 = constants$521.const$3.varHandle(MemoryLayout.PathElement.groupElement("TransactionKey"));
    static final VarHandle const$5 = constants$521.const$3.varHandle(MemoryLayout.PathElement.groupElement("TransactionNotification"));
}

