// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1652 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1652() {}
    static final VarHandle const$0 = constants$1651.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwSupport"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_SHORT.withByteAlignment(1).withName("wMid"),
        JAVA_SHORT.withByteAlignment(1).withName("wPid"),
        JAVA_INT.withByteAlignment(1).withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, JAVA_SHORT.withByteAlignment(1)).withName("szPname"),
        JAVA_SHORT.withByteAlignment(1).withName("wTechnology"),
        JAVA_SHORT.withByteAlignment(1).withName("wReserved1"),
        JAVA_INT.withByteAlignment(1).withName("dwSupport")
    ).withName("tagAUXCAPSW");
    static final VarHandle const$2 = constants$1652.const$1.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    static final VarHandle const$3 = constants$1652.const$1.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    static final VarHandle const$4 = constants$1652.const$1.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
    static final VarHandle const$5 = constants$1652.const$1.varHandle(MemoryLayout.PathElement.groupElement("wTechnology"));
}


