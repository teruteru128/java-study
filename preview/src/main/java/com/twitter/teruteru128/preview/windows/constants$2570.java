// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2570 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2570() {}
    static final VarHandle const$0 = constants$2569.const$5.varHandle(MemoryLayout.PathElement.groupElement("BarCodeScan"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("ElementType"),
            JAVA_INT.withName("ElementAddress")
        ).withName("Transport"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("ElementType"),
            JAVA_INT.withName("ElementAddress")
        ).withName("Destination"),
        JAVA_BYTE.withName("Flip"),
        MemoryLayout.paddingLayout(3)
    ).withName("_CHANGER_SET_POSITION");
    static final VarHandle const$2 = constants$2570.const$1.varHandle(MemoryLayout.PathElement.groupElement("Flip"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("ElementType"),
            JAVA_INT.withName("ElementAddress")
        ).withName("Transport"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("ElementType"),
            JAVA_INT.withName("ElementAddress")
        ).withName("Source"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("ElementType"),
            JAVA_INT.withName("ElementAddress")
        ).withName("Destination1"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("ElementType"),
            JAVA_INT.withName("ElementAddress")
        ).withName("Destination2"),
        JAVA_BYTE.withName("Flip1"),
        JAVA_BYTE.withName("Flip2"),
        MemoryLayout.paddingLayout(2)
    ).withName("_CHANGER_EXCHANGE_MEDIUM");
    static final VarHandle const$4 = constants$2570.const$3.varHandle(MemoryLayout.PathElement.groupElement("Flip1"));
    static final VarHandle const$5 = constants$2570.const$3.varHandle(MemoryLayout.PathElement.groupElement("Flip2"));
}

