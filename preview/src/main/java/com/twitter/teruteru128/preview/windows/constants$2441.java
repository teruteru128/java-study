// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2441 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2441() {}
    static final VarHandle const$0 = constants$2440.const$3.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$1 = constants$2440.const$3.varHandle(MemoryLayout.PathElement.groupElement("ParameterBlockOffset"));
    static final VarHandle const$2 = constants$2440.const$3.varHandle(MemoryLayout.PathElement.groupElement("ParameterBlockLength"));
    static final VarHandle const$3 = constants$2440.const$3.varHandle(MemoryLayout.PathElement.groupElement("DataSetRangesOffset"));
    static final VarHandle const$4 = constants$2440.const$3.varHandle(MemoryLayout.PathElement.groupElement("DataSetRangesLength"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("Action"),
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("OperationStatus"),
        JAVA_INT.withName("ExtendedError"),
        JAVA_INT.withName("TargetDetailedError"),
        JAVA_INT.withName("ReservedStatus"),
        JAVA_INT.withName("OutputBlockOffset"),
        JAVA_INT.withName("OutputBlockLength")
    ).withName("_DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT");
}


