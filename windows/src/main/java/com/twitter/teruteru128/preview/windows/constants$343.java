// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$343 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$343() {}
    static final VarHandle const$0 = constants$342.const$5.varHandle(MemoryLayout.PathElement.groupElement("MaxPhysicalMemory"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("PowerButtonPresent"),
        JAVA_BYTE.withName("SleepButtonPresent"),
        JAVA_BYTE.withName("LidPresent"),
        JAVA_BYTE.withName("SystemS1"),
        JAVA_BYTE.withName("SystemS2"),
        JAVA_BYTE.withName("SystemS3"),
        JAVA_BYTE.withName("SystemS4"),
        JAVA_BYTE.withName("SystemS5"),
        JAVA_BYTE.withName("HiberFilePresent"),
        JAVA_BYTE.withName("FullWake"),
        JAVA_BYTE.withName("VideoDimPresent"),
        JAVA_BYTE.withName("ApmPresent"),
        JAVA_BYTE.withName("UpsPresent"),
        JAVA_BYTE.withName("ThermalControl"),
        JAVA_BYTE.withName("ProcessorThrottle"),
        JAVA_BYTE.withName("ProcessorMinThrottle"),
        JAVA_BYTE.withName("ProcessorMaxThrottle"),
        JAVA_BYTE.withName("FastSystemS4"),
        JAVA_BYTE.withName("Hiberboot"),
        JAVA_BYTE.withName("WakeAlarmPresent"),
        JAVA_BYTE.withName("AoAc"),
        JAVA_BYTE.withName("DiskSpinDown"),
        JAVA_BYTE.withName("HiberFileType"),
        JAVA_BYTE.withName("AoAcConnectivitySupported"),
        MemoryLayout.sequenceLayout(6, JAVA_BYTE).withName("spare3"),
        JAVA_BYTE.withName("SystemBatteriesPresent"),
        JAVA_BYTE.withName("BatteriesAreShortTerm"),
        MemoryLayout.sequenceLayout(3, MemoryLayout.structLayout(
            JAVA_INT.withName("Granularity"),
            JAVA_INT.withName("Capacity")
        ).withName("")).withName("BatteryScale"),
        JAVA_INT.withName("AcOnLineWake"),
        JAVA_INT.withName("SoftLidWake"),
        JAVA_INT.withName("RtcWake"),
        JAVA_INT.withName("MinDeviceWakeState"),
        JAVA_INT.withName("DefaultLowLatencyWake")
    ).withName("");
    static final VarHandle const$2 = constants$343.const$1.varHandle(MemoryLayout.PathElement.groupElement("PowerButtonPresent"));
    static final VarHandle const$3 = constants$343.const$1.varHandle(MemoryLayout.PathElement.groupElement("SleepButtonPresent"));
    static final VarHandle const$4 = constants$343.const$1.varHandle(MemoryLayout.PathElement.groupElement("LidPresent"));
    static final VarHandle const$5 = constants$343.const$1.varHandle(MemoryLayout.PathElement.groupElement("SystemS1"));
}

