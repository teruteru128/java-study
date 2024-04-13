// Generated by jextract

package com.github.teruteru128.preview.windows;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2 {
 *     DWORD64 IoReadBytesLimit;
 *     DWORD64 IoWriteBytesLimit;
 *     LARGE_INTEGER PerJobUserTimeLimit;
 *     union {
 *         DWORD64 JobHighMemoryLimit;
 *         DWORD64 JobMemoryLimit;
 *     };
 *     union {
 *         JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance;
 *         JOBOBJECT_RATE_CONTROL_TOLERANCE CpuRateControlTolerance;
 *     };
 *     union {
 *         JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval;
 *         JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL CpuRateControlToleranceInterval;
 *     };
 *     DWORD LimitFlags;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE IoRateControlTolerance;
 *     DWORD64 JobLowMemoryLimit;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL IoRateControlToleranceInterval;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE NetRateControlTolerance;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL NetRateControlToleranceInterval;
 * }
 * }
 */
public class JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2 {

    JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG_LONG.withName("IoReadBytesLimit"),
        Windows_h.C_LONG_LONG.withName("IoWriteBytesLimit"),
        _LARGE_INTEGER.layout().withName("PerJobUserTimeLimit"),
        MemoryLayout.unionLayout(
            Windows_h.C_LONG_LONG.withName("JobHighMemoryLimit"),
            Windows_h.C_LONG_LONG.withName("JobMemoryLimit")
        ).withName("$anon$12846:5"),
        MemoryLayout.unionLayout(
            Windows_h.C_INT.withName("RateControlTolerance"),
            Windows_h.C_INT.withName("CpuRateControlTolerance")
        ).withName("$anon$12851:5"),
        MemoryLayout.unionLayout(
            Windows_h.C_INT.withName("RateControlToleranceInterval"),
            Windows_h.C_INT.withName("CpuRateControlToleranceInterval")
        ).withName("$anon$12856:5"),
        Windows_h.C_LONG.withName("LimitFlags"),
        Windows_h.C_INT.withName("IoRateControlTolerance"),
        Windows_h.C_LONG_LONG.withName("JobLowMemoryLimit"),
        Windows_h.C_INT.withName("IoRateControlToleranceInterval"),
        Windows_h.C_INT.withName("NetRateControlTolerance"),
        Windows_h.C_INT.withName("NetRateControlToleranceInterval"),
        MemoryLayout.paddingLayout(4)
    ).withName("JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION_2");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong IoReadBytesLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("IoReadBytesLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytesLimit
     * }
     */
    public static final OfLong IoReadBytesLimit$layout() {
        return IoReadBytesLimit$LAYOUT;
    }

    private static final long IoReadBytesLimit$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytesLimit
     * }
     */
    public static final long IoReadBytesLimit$offset() {
        return IoReadBytesLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytesLimit
     * }
     */
    public static long IoReadBytesLimit(MemorySegment struct) {
        return struct.get(IoReadBytesLimit$LAYOUT, IoReadBytesLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytesLimit
     * }
     */
    public static void IoReadBytesLimit(MemorySegment struct, long fieldValue) {
        struct.set(IoReadBytesLimit$LAYOUT, IoReadBytesLimit$OFFSET, fieldValue);
    }

    private static final OfLong IoWriteBytesLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("IoWriteBytesLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytesLimit
     * }
     */
    public static final OfLong IoWriteBytesLimit$layout() {
        return IoWriteBytesLimit$LAYOUT;
    }

    private static final long IoWriteBytesLimit$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytesLimit
     * }
     */
    public static final long IoWriteBytesLimit$offset() {
        return IoWriteBytesLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytesLimit
     * }
     */
    public static long IoWriteBytesLimit(MemorySegment struct) {
        return struct.get(IoWriteBytesLimit$LAYOUT, IoWriteBytesLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytesLimit
     * }
     */
    public static void IoWriteBytesLimit(MemorySegment struct, long fieldValue) {
        struct.set(IoWriteBytesLimit$LAYOUT, IoWriteBytesLimit$OFFSET, fieldValue);
    }

    private static final GroupLayout PerJobUserTimeLimit$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("PerJobUserTimeLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTimeLimit
     * }
     */
    public static final GroupLayout PerJobUserTimeLimit$layout() {
        return PerJobUserTimeLimit$LAYOUT;
    }

    private static final long PerJobUserTimeLimit$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTimeLimit
     * }
     */
    public static final long PerJobUserTimeLimit$offset() {
        return PerJobUserTimeLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTimeLimit
     * }
     */
    public static MemorySegment PerJobUserTimeLimit(MemorySegment struct) {
        return struct.asSlice(PerJobUserTimeLimit$OFFSET, PerJobUserTimeLimit$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTimeLimit
     * }
     */
    public static void PerJobUserTimeLimit(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PerJobUserTimeLimit$OFFSET, PerJobUserTimeLimit$LAYOUT.byteSize());
    }

    private static final OfLong JobHighMemoryLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$12846:5"), groupElement("JobHighMemoryLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 JobHighMemoryLimit
     * }
     */
    public static final OfLong JobHighMemoryLimit$layout() {
        return JobHighMemoryLimit$LAYOUT;
    }

    private static final long JobHighMemoryLimit$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 JobHighMemoryLimit
     * }
     */
    public static final long JobHighMemoryLimit$offset() {
        return JobHighMemoryLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 JobHighMemoryLimit
     * }
     */
    public static long JobHighMemoryLimit(MemorySegment struct) {
        return struct.get(JobHighMemoryLimit$LAYOUT, JobHighMemoryLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 JobHighMemoryLimit
     * }
     */
    public static void JobHighMemoryLimit(MemorySegment struct, long fieldValue) {
        struct.set(JobHighMemoryLimit$LAYOUT, JobHighMemoryLimit$OFFSET, fieldValue);
    }

    private static final OfLong JobMemoryLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$12846:5"), groupElement("JobMemoryLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 JobMemoryLimit
     * }
     */
    public static final OfLong JobMemoryLimit$layout() {
        return JobMemoryLimit$LAYOUT;
    }

    private static final long JobMemoryLimit$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 JobMemoryLimit
     * }
     */
    public static final long JobMemoryLimit$offset() {
        return JobMemoryLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 JobMemoryLimit
     * }
     */
    public static long JobMemoryLimit(MemorySegment struct) {
        return struct.get(JobMemoryLimit$LAYOUT, JobMemoryLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 JobMemoryLimit
     * }
     */
    public static void JobMemoryLimit(MemorySegment struct, long fieldValue) {
        struct.set(JobMemoryLimit$LAYOUT, JobMemoryLimit$OFFSET, fieldValue);
    }

    private static final OfInt RateControlTolerance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$12851:5"), groupElement("RateControlTolerance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance
     * }
     */
    public static final OfInt RateControlTolerance$layout() {
        return RateControlTolerance$LAYOUT;
    }

    private static final long RateControlTolerance$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance
     * }
     */
    public static final long RateControlTolerance$offset() {
        return RateControlTolerance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance
     * }
     */
    public static int RateControlTolerance(MemorySegment struct) {
        return struct.get(RateControlTolerance$LAYOUT, RateControlTolerance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance
     * }
     */
    public static void RateControlTolerance(MemorySegment struct, int fieldValue) {
        struct.set(RateControlTolerance$LAYOUT, RateControlTolerance$OFFSET, fieldValue);
    }

    private static final OfInt CpuRateControlTolerance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$12851:5"), groupElement("CpuRateControlTolerance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE CpuRateControlTolerance
     * }
     */
    public static final OfInt CpuRateControlTolerance$layout() {
        return CpuRateControlTolerance$LAYOUT;
    }

    private static final long CpuRateControlTolerance$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE CpuRateControlTolerance
     * }
     */
    public static final long CpuRateControlTolerance$offset() {
        return CpuRateControlTolerance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE CpuRateControlTolerance
     * }
     */
    public static int CpuRateControlTolerance(MemorySegment struct) {
        return struct.get(CpuRateControlTolerance$LAYOUT, CpuRateControlTolerance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE CpuRateControlTolerance
     * }
     */
    public static void CpuRateControlTolerance(MemorySegment struct, int fieldValue) {
        struct.set(CpuRateControlTolerance$LAYOUT, CpuRateControlTolerance$OFFSET, fieldValue);
    }

    private static final OfInt RateControlToleranceInterval$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$12856:5"), groupElement("RateControlToleranceInterval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval
     * }
     */
    public static final OfInt RateControlToleranceInterval$layout() {
        return RateControlToleranceInterval$LAYOUT;
    }

    private static final long RateControlToleranceInterval$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval
     * }
     */
    public static final long RateControlToleranceInterval$offset() {
        return RateControlToleranceInterval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval
     * }
     */
    public static int RateControlToleranceInterval(MemorySegment struct) {
        return struct.get(RateControlToleranceInterval$LAYOUT, RateControlToleranceInterval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval
     * }
     */
    public static void RateControlToleranceInterval(MemorySegment struct, int fieldValue) {
        struct.set(RateControlToleranceInterval$LAYOUT, RateControlToleranceInterval$OFFSET, fieldValue);
    }

    private static final OfInt CpuRateControlToleranceInterval$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$12856:5"), groupElement("CpuRateControlToleranceInterval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL CpuRateControlToleranceInterval
     * }
     */
    public static final OfInt CpuRateControlToleranceInterval$layout() {
        return CpuRateControlToleranceInterval$LAYOUT;
    }

    private static final long CpuRateControlToleranceInterval$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL CpuRateControlToleranceInterval
     * }
     */
    public static final long CpuRateControlToleranceInterval$offset() {
        return CpuRateControlToleranceInterval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL CpuRateControlToleranceInterval
     * }
     */
    public static int CpuRateControlToleranceInterval(MemorySegment struct) {
        return struct.get(CpuRateControlToleranceInterval$LAYOUT, CpuRateControlToleranceInterval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL CpuRateControlToleranceInterval
     * }
     */
    public static void CpuRateControlToleranceInterval(MemorySegment struct, int fieldValue) {
        struct.set(CpuRateControlToleranceInterval$LAYOUT, CpuRateControlToleranceInterval$OFFSET, fieldValue);
    }

    private static final OfInt LimitFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LimitFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD LimitFlags
     * }
     */
    public static final OfInt LimitFlags$layout() {
        return LimitFlags$LAYOUT;
    }

    private static final long LimitFlags$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD LimitFlags
     * }
     */
    public static final long LimitFlags$offset() {
        return LimitFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD LimitFlags
     * }
     */
    public static int LimitFlags(MemorySegment struct) {
        return struct.get(LimitFlags$LAYOUT, LimitFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD LimitFlags
     * }
     */
    public static void LimitFlags(MemorySegment struct, int fieldValue) {
        struct.set(LimitFlags$LAYOUT, LimitFlags$OFFSET, fieldValue);
    }

    private static final OfInt IoRateControlTolerance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("IoRateControlTolerance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE IoRateControlTolerance
     * }
     */
    public static final OfInt IoRateControlTolerance$layout() {
        return IoRateControlTolerance$LAYOUT;
    }

    private static final long IoRateControlTolerance$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE IoRateControlTolerance
     * }
     */
    public static final long IoRateControlTolerance$offset() {
        return IoRateControlTolerance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE IoRateControlTolerance
     * }
     */
    public static int IoRateControlTolerance(MemorySegment struct) {
        return struct.get(IoRateControlTolerance$LAYOUT, IoRateControlTolerance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE IoRateControlTolerance
     * }
     */
    public static void IoRateControlTolerance(MemorySegment struct, int fieldValue) {
        struct.set(IoRateControlTolerance$LAYOUT, IoRateControlTolerance$OFFSET, fieldValue);
    }

    private static final OfLong JobLowMemoryLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("JobLowMemoryLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 JobLowMemoryLimit
     * }
     */
    public static final OfLong JobLowMemoryLimit$layout() {
        return JobLowMemoryLimit$LAYOUT;
    }

    private static final long JobLowMemoryLimit$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 JobLowMemoryLimit
     * }
     */
    public static final long JobLowMemoryLimit$offset() {
        return JobLowMemoryLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 JobLowMemoryLimit
     * }
     */
    public static long JobLowMemoryLimit(MemorySegment struct) {
        return struct.get(JobLowMemoryLimit$LAYOUT, JobLowMemoryLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 JobLowMemoryLimit
     * }
     */
    public static void JobLowMemoryLimit(MemorySegment struct, long fieldValue) {
        struct.set(JobLowMemoryLimit$LAYOUT, JobLowMemoryLimit$OFFSET, fieldValue);
    }

    private static final OfInt IoRateControlToleranceInterval$LAYOUT = (OfInt)$LAYOUT.select(groupElement("IoRateControlToleranceInterval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL IoRateControlToleranceInterval
     * }
     */
    public static final OfInt IoRateControlToleranceInterval$layout() {
        return IoRateControlToleranceInterval$LAYOUT;
    }

    private static final long IoRateControlToleranceInterval$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL IoRateControlToleranceInterval
     * }
     */
    public static final long IoRateControlToleranceInterval$offset() {
        return IoRateControlToleranceInterval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL IoRateControlToleranceInterval
     * }
     */
    public static int IoRateControlToleranceInterval(MemorySegment struct) {
        return struct.get(IoRateControlToleranceInterval$LAYOUT, IoRateControlToleranceInterval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL IoRateControlToleranceInterval
     * }
     */
    public static void IoRateControlToleranceInterval(MemorySegment struct, int fieldValue) {
        struct.set(IoRateControlToleranceInterval$LAYOUT, IoRateControlToleranceInterval$OFFSET, fieldValue);
    }

    private static final OfInt NetRateControlTolerance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NetRateControlTolerance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE NetRateControlTolerance
     * }
     */
    public static final OfInt NetRateControlTolerance$layout() {
        return NetRateControlTolerance$LAYOUT;
    }

    private static final long NetRateControlTolerance$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE NetRateControlTolerance
     * }
     */
    public static final long NetRateControlTolerance$offset() {
        return NetRateControlTolerance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE NetRateControlTolerance
     * }
     */
    public static int NetRateControlTolerance(MemorySegment struct) {
        return struct.get(NetRateControlTolerance$LAYOUT, NetRateControlTolerance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE NetRateControlTolerance
     * }
     */
    public static void NetRateControlTolerance(MemorySegment struct, int fieldValue) {
        struct.set(NetRateControlTolerance$LAYOUT, NetRateControlTolerance$OFFSET, fieldValue);
    }

    private static final OfInt NetRateControlToleranceInterval$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NetRateControlToleranceInterval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL NetRateControlToleranceInterval
     * }
     */
    public static final OfInt NetRateControlToleranceInterval$layout() {
        return NetRateControlToleranceInterval$LAYOUT;
    }

    private static final long NetRateControlToleranceInterval$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL NetRateControlToleranceInterval
     * }
     */
    public static final long NetRateControlToleranceInterval$offset() {
        return NetRateControlToleranceInterval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL NetRateControlToleranceInterval
     * }
     */
    public static int NetRateControlToleranceInterval(MemorySegment struct) {
        return struct.get(NetRateControlToleranceInterval$LAYOUT, NetRateControlToleranceInterval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL NetRateControlToleranceInterval
     * }
     */
    public static void NetRateControlToleranceInterval(MemorySegment struct, int fieldValue) {
        struct.set(NetRateControlToleranceInterval$LAYOUT, NetRateControlToleranceInterval$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
