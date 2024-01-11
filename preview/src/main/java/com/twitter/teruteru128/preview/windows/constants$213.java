// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$213 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$213() {}
    static final VarHandle const$0 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("IoWriteBytesLimit"));
    static final VarHandle const$1 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("JobMemory"));
    static final VarHandle const$2 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("JobMemoryLimit"));
    static final VarHandle const$3 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("RateControlTolerance"));
    static final VarHandle const$4 = constants$212.const$0.varHandle(MemoryLayout.PathElement.groupElement("RateControlToleranceLimit"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("LimitFlags"),
        JAVA_INT.withName("ViolationLimitFlags"),
        JAVA_LONG.withName("IoReadBytes"),
        JAVA_LONG.withName("IoReadBytesLimit"),
        JAVA_LONG.withName("IoWriteBytes"),
        JAVA_LONG.withName("IoWriteBytesLimit"),
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
        ).withName("PerJobUserTime"),
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
        ).withName("PerJobUserTimeLimit"),
        JAVA_LONG.withName("JobMemory"),
        MemoryLayout.unionLayout(
            JAVA_LONG.withName("JobHighMemoryLimit"),
            JAVA_LONG.withName("JobMemoryLimit")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("RateControlTolerance"),
            JAVA_INT.withName("CpuRateControlTolerance")
        ).withName("$anon$1"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("RateControlToleranceLimit"),
            JAVA_INT.withName("CpuRateControlToleranceLimit")
        ).withName("$anon$2"),
        JAVA_LONG.withName("JobLowMemoryLimit"),
        JAVA_INT.withName("IoRateControlTolerance"),
        JAVA_INT.withName("IoRateControlToleranceLimit"),
        JAVA_INT.withName("NetRateControlTolerance"),
        JAVA_INT.withName("NetRateControlToleranceLimit")
    ).withName("JOBOBJECT_LIMIT_VIOLATION_INFORMATION_2");
}

