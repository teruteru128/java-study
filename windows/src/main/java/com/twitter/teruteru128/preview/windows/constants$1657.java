// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1657 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1657() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("unused")
    ).withName("HMIXER__");
    static final VarHandle const$1 = constants$1657.const$0.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "mixerGetNumDevs",
        constants$1.const$5
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_SHORT.withByteAlignment(1).withName("wMid"),
        JAVA_SHORT.withByteAlignment(1).withName("wPid"),
        JAVA_INT.withByteAlignment(1).withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("szPname"),
        JAVA_INT.withByteAlignment(1).withName("fdwSupport"),
        JAVA_INT.withByteAlignment(1).withName("cDestinations")
    ).withName("tagMIXERCAPSA");
    static final VarHandle const$4 = constants$1657.const$3.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    static final VarHandle const$5 = constants$1657.const$3.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
}

