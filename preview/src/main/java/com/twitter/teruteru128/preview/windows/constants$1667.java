// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1667 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1667() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("dwType"),
        JAVA_INT.withByteAlignment(1).withName("dwDeviceID"),
        JAVA_SHORT.withByteAlignment(1).withName("wMid"),
        JAVA_SHORT.withByteAlignment(1).withName("wPid"),
        JAVA_INT.withByteAlignment(1).withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, JAVA_SHORT.withByteAlignment(1)).withName("szPname")
    ).withName("");
    static final VarHandle const$1 = constants$1667.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwType"));
    static final VarHandle const$2 = constants$1667.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwDeviceID"));
    static final VarHandle const$3 = constants$1667.const$0.varHandle(MemoryLayout.PathElement.groupElement("wMid"));
    static final VarHandle const$4 = constants$1667.const$0.varHandle(MemoryLayout.PathElement.groupElement("wPid"));
    static final VarHandle const$5 = constants$1667.const$0.varHandle(MemoryLayout.PathElement.groupElement("vDriverVersion"));
}


