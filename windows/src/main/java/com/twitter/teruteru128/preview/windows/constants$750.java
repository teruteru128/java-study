// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$750 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$750() {}
    static final VarHandle const$0 = constants$749.const$2.varHandle(MemoryLayout.PathElement.groupElement("WriteTotalTimeoutMultiplier"));
    static final VarHandle const$1 = constants$749.const$2.varHandle(MemoryLayout.PathElement.groupElement("WriteTotalTimeoutConstant"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwSize"),
        JAVA_SHORT.withName("wVersion"),
        JAVA_SHORT.withName("wReserved"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("DCBlength"),
            JAVA_INT.withName("BaudRate"),
            MemoryLayout.paddingLayout(4),
            JAVA_SHORT.withName("wReserved"),
            JAVA_SHORT.withName("XonLim"),
            JAVA_SHORT.withName("XoffLim"),
            JAVA_BYTE.withName("ByteSize"),
            JAVA_BYTE.withName("Parity"),
            JAVA_BYTE.withName("StopBits"),
            JAVA_BYTE.withName("XonChar"),
            JAVA_BYTE.withName("XoffChar"),
            JAVA_BYTE.withName("ErrorChar"),
            JAVA_BYTE.withName("EofChar"),
            JAVA_BYTE.withName("EvtChar"),
            JAVA_SHORT.withName("wReserved1")
        ).withName("dcb"),
        JAVA_INT.withName("dwProviderSubType"),
        JAVA_INT.withName("dwProviderOffset"),
        JAVA_INT.withName("dwProviderSize"),
        MemoryLayout.sequenceLayout(1, JAVA_SHORT).withName("wcProviderData"),
        MemoryLayout.paddingLayout(2)
    ).withName("_COMMCONFIG");
    static final VarHandle const$3 = constants$750.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    static final VarHandle const$4 = constants$750.const$2.varHandle(MemoryLayout.PathElement.groupElement("wVersion"));
    static final VarHandle const$5 = constants$750.const$2.varHandle(MemoryLayout.PathElement.groupElement("wReserved"));
}

