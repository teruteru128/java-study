// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$701 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$701() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_LONG.withName("MaxIops"),
        JAVA_LONG.withName("MaxBandwidth"),
        JAVA_LONG.withName("ReservationIops"),
        RuntimeHelper.POINTER.withName("VolumeName"),
        JAVA_INT.withName("BaseIoSize"),
        JAVA_INT.withName("ControlFlags")
    ).withName("JOBOBJECT_IO_RATE_CONTROL_INFORMATION");
    static final VarHandle const$1 = constants$701.const$0.varHandle(MemoryLayout.PathElement.groupElement("MaxIops"));
    static final VarHandle const$2 = constants$701.const$0.varHandle(MemoryLayout.PathElement.groupElement("MaxBandwidth"));
    static final VarHandle const$3 = constants$701.const$0.varHandle(MemoryLayout.PathElement.groupElement("ReservationIops"));
    static final VarHandle const$4 = constants$701.const$0.varHandle(MemoryLayout.PathElement.groupElement("VolumeName"));
    static final VarHandle const$5 = constants$701.const$0.varHandle(MemoryLayout.PathElement.groupElement("BaseIoSize"));
}


