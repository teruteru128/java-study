// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$906 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$906() {}
    static final VarHandle const$0 = constants$905.const$3.varHandle(MemoryLayout.PathElement.groupElement("bfReserved1"));
    static final VarHandle const$1 = constants$905.const$3.varHandle(MemoryLayout.PathElement.groupElement("bfReserved2"));
    static final VarHandle const$2 = constants$905.const$3.varHandle(MemoryLayout.PathElement.groupElement("bfOffBits"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, JAVA_INT).withName("fsUsb"),
        MemoryLayout.sequenceLayout(2, JAVA_INT).withName("fsCsb")
    ).withName("tagFONTSIGNATURE");
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("ciCharset"),
        JAVA_INT.withName("ciACP"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, JAVA_INT).withName("fsUsb"),
            MemoryLayout.sequenceLayout(2, JAVA_INT).withName("fsCsb")
        ).withName("fs")
    ).withName("tagCHARSETINFO");
    static final VarHandle const$5 = constants$906.const$4.varHandle(MemoryLayout.PathElement.groupElement("ciCharset"));
}


