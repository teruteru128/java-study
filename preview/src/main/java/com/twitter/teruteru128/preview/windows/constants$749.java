// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$749 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$749() {}
    static final VarHandle const$0 = constants$746.const$5.varHandle(MemoryLayout.PathElement.groupElement("EvtChar"));
    static final VarHandle const$1 = constants$746.const$5.varHandle(MemoryLayout.PathElement.groupElement("wReserved1"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("ReadIntervalTimeout"),
        JAVA_INT.withName("ReadTotalTimeoutMultiplier"),
        JAVA_INT.withName("ReadTotalTimeoutConstant"),
        JAVA_INT.withName("WriteTotalTimeoutMultiplier"),
        JAVA_INT.withName("WriteTotalTimeoutConstant")
    ).withName("_COMMTIMEOUTS");
    static final VarHandle const$3 = constants$749.const$2.varHandle(MemoryLayout.PathElement.groupElement("ReadIntervalTimeout"));
    static final VarHandle const$4 = constants$749.const$2.varHandle(MemoryLayout.PathElement.groupElement("ReadTotalTimeoutMultiplier"));
    static final VarHandle const$5 = constants$749.const$2.varHandle(MemoryLayout.PathElement.groupElement("ReadTotalTimeoutConstant"));
}


