// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3 {
 *     LONG64 MaxIops;
 *     LONG64 MaxBandwidth;
 *     LONG64 ReservationIops;
 *     PWSTR VolumeName;
 *     DWORD BaseIoSize;
 *     JOB_OBJECT_IO_RATE_CONTROL_FLAGS ControlFlags;
 *     WORD VolumeNameLength;
 *     LONG64 CriticalReservationIops;
 *     LONG64 ReservationBandwidth;
 *     LONG64 CriticalReservationBandwidth;
 *     LONG64 MaxTimePercent;
 *     LONG64 ReservationTimePercent;
 *     LONG64 CriticalReservationTimePercent;
 *     LONG64 SoftMaxIops;
 *     LONG64 SoftMaxBandwidth;
 *     LONG64 SoftMaxTimePercent;
 *     LONG64 LimitExcessNotifyIops;
 *     LONG64 LimitExcessNotifyBandwidth;
 *     LONG64 LimitExcessNotifyTimePercent;
 * };
 * }
 */
public class JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V3 {

    public static MemoryLayout $LAYOUT() {
        return constants$222.const$2;
    }
    public static VarHandle MaxIops$VH() {
        return constants$222.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 MaxIops;
     * }
     */
    public static long MaxIops$get(MemorySegment seg) {
        return (long)constants$222.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 MaxIops;
     * }
     */
    public static void MaxIops$set(MemorySegment seg, long x) {
        constants$222.const$3.set(seg, x);
    }
    public static long MaxIops$get(MemorySegment seg, long index) {
        return (long)constants$222.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxIops$set(MemorySegment seg, long index, long x) {
        constants$222.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxBandwidth$VH() {
        return constants$222.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 MaxBandwidth;
     * }
     */
    public static long MaxBandwidth$get(MemorySegment seg) {
        return (long)constants$222.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 MaxBandwidth;
     * }
     */
    public static void MaxBandwidth$set(MemorySegment seg, long x) {
        constants$222.const$4.set(seg, x);
    }
    public static long MaxBandwidth$get(MemorySegment seg, long index) {
        return (long)constants$222.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxBandwidth$set(MemorySegment seg, long index, long x) {
        constants$222.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ReservationIops$VH() {
        return constants$222.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 ReservationIops;
     * }
     */
    public static long ReservationIops$get(MemorySegment seg) {
        return (long)constants$222.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 ReservationIops;
     * }
     */
    public static void ReservationIops$set(MemorySegment seg, long x) {
        constants$222.const$5.set(seg, x);
    }
    public static long ReservationIops$get(MemorySegment seg, long index) {
        return (long)constants$222.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservationIops$set(MemorySegment seg, long index, long x) {
        constants$222.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle VolumeName$VH() {
        return constants$223.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PWSTR VolumeName;
     * }
     */
    public static MemorySegment VolumeName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$223.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PWSTR VolumeName;
     * }
     */
    public static void VolumeName$set(MemorySegment seg, MemorySegment x) {
        constants$223.const$0.set(seg, x);
    }
    public static MemorySegment VolumeName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$223.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$223.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle BaseIoSize$VH() {
        return constants$223.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BaseIoSize;
     * }
     */
    public static int BaseIoSize$get(MemorySegment seg) {
        return (int)constants$223.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BaseIoSize;
     * }
     */
    public static void BaseIoSize$set(MemorySegment seg, int x) {
        constants$223.const$1.set(seg, x);
    }
    public static int BaseIoSize$get(MemorySegment seg, long index) {
        return (int)constants$223.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void BaseIoSize$set(MemorySegment seg, long index, int x) {
        constants$223.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ControlFlags$VH() {
        return constants$223.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * JOB_OBJECT_IO_RATE_CONTROL_FLAGS ControlFlags;
     * }
     */
    public static int ControlFlags$get(MemorySegment seg) {
        return (int)constants$223.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * JOB_OBJECT_IO_RATE_CONTROL_FLAGS ControlFlags;
     * }
     */
    public static void ControlFlags$set(MemorySegment seg, int x) {
        constants$223.const$2.set(seg, x);
    }
    public static int ControlFlags$get(MemorySegment seg, long index) {
        return (int)constants$223.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlFlags$set(MemorySegment seg, long index, int x) {
        constants$223.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle VolumeNameLength$VH() {
        return constants$223.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD VolumeNameLength;
     * }
     */
    public static short VolumeNameLength$get(MemorySegment seg) {
        return (short)constants$223.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD VolumeNameLength;
     * }
     */
    public static void VolumeNameLength$set(MemorySegment seg, short x) {
        constants$223.const$3.set(seg, x);
    }
    public static short VolumeNameLength$get(MemorySegment seg, long index) {
        return (short)constants$223.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeNameLength$set(MemorySegment seg, long index, short x) {
        constants$223.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CriticalReservationIops$VH() {
        return constants$223.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 CriticalReservationIops;
     * }
     */
    public static long CriticalReservationIops$get(MemorySegment seg) {
        return (long)constants$223.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 CriticalReservationIops;
     * }
     */
    public static void CriticalReservationIops$set(MemorySegment seg, long x) {
        constants$223.const$4.set(seg, x);
    }
    public static long CriticalReservationIops$get(MemorySegment seg, long index) {
        return (long)constants$223.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void CriticalReservationIops$set(MemorySegment seg, long index, long x) {
        constants$223.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ReservationBandwidth$VH() {
        return constants$223.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 ReservationBandwidth;
     * }
     */
    public static long ReservationBandwidth$get(MemorySegment seg) {
        return (long)constants$223.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 ReservationBandwidth;
     * }
     */
    public static void ReservationBandwidth$set(MemorySegment seg, long x) {
        constants$223.const$5.set(seg, x);
    }
    public static long ReservationBandwidth$get(MemorySegment seg, long index) {
        return (long)constants$223.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservationBandwidth$set(MemorySegment seg, long index, long x) {
        constants$223.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CriticalReservationBandwidth$VH() {
        return constants$224.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 CriticalReservationBandwidth;
     * }
     */
    public static long CriticalReservationBandwidth$get(MemorySegment seg) {
        return (long)constants$224.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 CriticalReservationBandwidth;
     * }
     */
    public static void CriticalReservationBandwidth$set(MemorySegment seg, long x) {
        constants$224.const$0.set(seg, x);
    }
    public static long CriticalReservationBandwidth$get(MemorySegment seg, long index) {
        return (long)constants$224.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void CriticalReservationBandwidth$set(MemorySegment seg, long index, long x) {
        constants$224.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxTimePercent$VH() {
        return constants$224.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 MaxTimePercent;
     * }
     */
    public static long MaxTimePercent$get(MemorySegment seg) {
        return (long)constants$224.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 MaxTimePercent;
     * }
     */
    public static void MaxTimePercent$set(MemorySegment seg, long x) {
        constants$224.const$1.set(seg, x);
    }
    public static long MaxTimePercent$get(MemorySegment seg, long index) {
        return (long)constants$224.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxTimePercent$set(MemorySegment seg, long index, long x) {
        constants$224.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ReservationTimePercent$VH() {
        return constants$224.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 ReservationTimePercent;
     * }
     */
    public static long ReservationTimePercent$get(MemorySegment seg) {
        return (long)constants$224.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 ReservationTimePercent;
     * }
     */
    public static void ReservationTimePercent$set(MemorySegment seg, long x) {
        constants$224.const$2.set(seg, x);
    }
    public static long ReservationTimePercent$get(MemorySegment seg, long index) {
        return (long)constants$224.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservationTimePercent$set(MemorySegment seg, long index, long x) {
        constants$224.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CriticalReservationTimePercent$VH() {
        return constants$224.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 CriticalReservationTimePercent;
     * }
     */
    public static long CriticalReservationTimePercent$get(MemorySegment seg) {
        return (long)constants$224.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 CriticalReservationTimePercent;
     * }
     */
    public static void CriticalReservationTimePercent$set(MemorySegment seg, long x) {
        constants$224.const$3.set(seg, x);
    }
    public static long CriticalReservationTimePercent$get(MemorySegment seg, long index) {
        return (long)constants$224.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void CriticalReservationTimePercent$set(MemorySegment seg, long index, long x) {
        constants$224.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SoftMaxIops$VH() {
        return constants$224.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 SoftMaxIops;
     * }
     */
    public static long SoftMaxIops$get(MemorySegment seg) {
        return (long)constants$224.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 SoftMaxIops;
     * }
     */
    public static void SoftMaxIops$set(MemorySegment seg, long x) {
        constants$224.const$4.set(seg, x);
    }
    public static long SoftMaxIops$get(MemorySegment seg, long index) {
        return (long)constants$224.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void SoftMaxIops$set(MemorySegment seg, long index, long x) {
        constants$224.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SoftMaxBandwidth$VH() {
        return constants$224.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 SoftMaxBandwidth;
     * }
     */
    public static long SoftMaxBandwidth$get(MemorySegment seg) {
        return (long)constants$224.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 SoftMaxBandwidth;
     * }
     */
    public static void SoftMaxBandwidth$set(MemorySegment seg, long x) {
        constants$224.const$5.set(seg, x);
    }
    public static long SoftMaxBandwidth$get(MemorySegment seg, long index) {
        return (long)constants$224.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void SoftMaxBandwidth$set(MemorySegment seg, long index, long x) {
        constants$224.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SoftMaxTimePercent$VH() {
        return constants$225.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 SoftMaxTimePercent;
     * }
     */
    public static long SoftMaxTimePercent$get(MemorySegment seg) {
        return (long)constants$225.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 SoftMaxTimePercent;
     * }
     */
    public static void SoftMaxTimePercent$set(MemorySegment seg, long x) {
        constants$225.const$0.set(seg, x);
    }
    public static long SoftMaxTimePercent$get(MemorySegment seg, long index) {
        return (long)constants$225.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SoftMaxTimePercent$set(MemorySegment seg, long index, long x) {
        constants$225.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LimitExcessNotifyIops$VH() {
        return constants$225.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 LimitExcessNotifyIops;
     * }
     */
    public static long LimitExcessNotifyIops$get(MemorySegment seg) {
        return (long)constants$225.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 LimitExcessNotifyIops;
     * }
     */
    public static void LimitExcessNotifyIops$set(MemorySegment seg, long x) {
        constants$225.const$1.set(seg, x);
    }
    public static long LimitExcessNotifyIops$get(MemorySegment seg, long index) {
        return (long)constants$225.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitExcessNotifyIops$set(MemorySegment seg, long index, long x) {
        constants$225.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LimitExcessNotifyBandwidth$VH() {
        return constants$225.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 LimitExcessNotifyBandwidth;
     * }
     */
    public static long LimitExcessNotifyBandwidth$get(MemorySegment seg) {
        return (long)constants$225.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 LimitExcessNotifyBandwidth;
     * }
     */
    public static void LimitExcessNotifyBandwidth$set(MemorySegment seg, long x) {
        constants$225.const$2.set(seg, x);
    }
    public static long LimitExcessNotifyBandwidth$get(MemorySegment seg, long index) {
        return (long)constants$225.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitExcessNotifyBandwidth$set(MemorySegment seg, long index, long x) {
        constants$225.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LimitExcessNotifyTimePercent$VH() {
        return constants$225.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG64 LimitExcessNotifyTimePercent;
     * }
     */
    public static long LimitExcessNotifyTimePercent$get(MemorySegment seg) {
        return (long)constants$225.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG64 LimitExcessNotifyTimePercent;
     * }
     */
    public static void LimitExcessNotifyTimePercent$set(MemorySegment seg, long x) {
        constants$225.const$3.set(seg, x);
    }
    public static long LimitExcessNotifyTimePercent$get(MemorySegment seg, long index) {
        return (long)constants$225.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void LimitExcessNotifyTimePercent$set(MemorySegment seg, long index, long x) {
        constants$225.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

