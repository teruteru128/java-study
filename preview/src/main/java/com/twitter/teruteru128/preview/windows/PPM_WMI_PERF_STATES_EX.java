// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORD Count;
 *     DWORD MaxFrequency;
 *     DWORD CurrentState;
 *     DWORD MaxPerfState;
 *     DWORD MinPerfState;
 *     DWORD LowestPerfState;
 *     DWORD ThermalConstraint;
 *     BYTE BusyAdjThreshold;
 *     BYTE PolicyType;
 *     BYTE Type;
 *     BYTE Reserved;
 *     DWORD TimerInterval;
 *     PVOID TargetProcessors;
 *     DWORD PStateHandler;
 *     DWORD PStateContext;
 *     DWORD TStateHandler;
 *     DWORD TStateContext;
 *     DWORD FeedbackHandler;
 *     DWORD Reserved1;
 *     DWORD64 Reserved2;
 *     PPM_WMI_PERF_STATE State[1];
 * };
 * }
 */
public class PPM_WMI_PERF_STATES_EX {

    public static MemoryLayout $LAYOUT() {
        return constants$318.const$0;
    }
    public static VarHandle Count$VH() {
        return constants$318.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)constants$318.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        constants$318.const$1.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)constants$318.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        constants$318.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxFrequency$VH() {
        return constants$318.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxFrequency;
     * }
     */
    public static int MaxFrequency$get(MemorySegment seg) {
        return (int)constants$318.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxFrequency;
     * }
     */
    public static void MaxFrequency$set(MemorySegment seg, int x) {
        constants$318.const$2.set(seg, x);
    }
    public static int MaxFrequency$get(MemorySegment seg, long index) {
        return (int)constants$318.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxFrequency$set(MemorySegment seg, long index, int x) {
        constants$318.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CurrentState$VH() {
        return constants$318.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CurrentState;
     * }
     */
    public static int CurrentState$get(MemorySegment seg) {
        return (int)constants$318.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CurrentState;
     * }
     */
    public static void CurrentState$set(MemorySegment seg, int x) {
        constants$318.const$3.set(seg, x);
    }
    public static int CurrentState$get(MemorySegment seg, long index) {
        return (int)constants$318.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void CurrentState$set(MemorySegment seg, long index, int x) {
        constants$318.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxPerfState$VH() {
        return constants$318.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxPerfState;
     * }
     */
    public static int MaxPerfState$get(MemorySegment seg) {
        return (int)constants$318.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxPerfState;
     * }
     */
    public static void MaxPerfState$set(MemorySegment seg, int x) {
        constants$318.const$4.set(seg, x);
    }
    public static int MaxPerfState$get(MemorySegment seg, long index) {
        return (int)constants$318.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxPerfState$set(MemorySegment seg, long index, int x) {
        constants$318.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MinPerfState$VH() {
        return constants$318.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MinPerfState;
     * }
     */
    public static int MinPerfState$get(MemorySegment seg) {
        return (int)constants$318.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MinPerfState;
     * }
     */
    public static void MinPerfState$set(MemorySegment seg, int x) {
        constants$318.const$5.set(seg, x);
    }
    public static int MinPerfState$get(MemorySegment seg, long index) {
        return (int)constants$318.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void MinPerfState$set(MemorySegment seg, long index, int x) {
        constants$318.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LowestPerfState$VH() {
        return constants$319.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LowestPerfState;
     * }
     */
    public static int LowestPerfState$get(MemorySegment seg) {
        return (int)constants$319.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LowestPerfState;
     * }
     */
    public static void LowestPerfState$set(MemorySegment seg, int x) {
        constants$319.const$0.set(seg, x);
    }
    public static int LowestPerfState$get(MemorySegment seg, long index) {
        return (int)constants$319.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void LowestPerfState$set(MemorySegment seg, long index, int x) {
        constants$319.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ThermalConstraint$VH() {
        return constants$319.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ThermalConstraint;
     * }
     */
    public static int ThermalConstraint$get(MemorySegment seg) {
        return (int)constants$319.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ThermalConstraint;
     * }
     */
    public static void ThermalConstraint$set(MemorySegment seg, int x) {
        constants$319.const$1.set(seg, x);
    }
    public static int ThermalConstraint$get(MemorySegment seg, long index) {
        return (int)constants$319.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ThermalConstraint$set(MemorySegment seg, long index, int x) {
        constants$319.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle BusyAdjThreshold$VH() {
        return constants$319.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE BusyAdjThreshold;
     * }
     */
    public static byte BusyAdjThreshold$get(MemorySegment seg) {
        return (byte)constants$319.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE BusyAdjThreshold;
     * }
     */
    public static void BusyAdjThreshold$set(MemorySegment seg, byte x) {
        constants$319.const$2.set(seg, x);
    }
    public static byte BusyAdjThreshold$get(MemorySegment seg, long index) {
        return (byte)constants$319.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void BusyAdjThreshold$set(MemorySegment seg, long index, byte x) {
        constants$319.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PolicyType$VH() {
        return constants$319.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE PolicyType;
     * }
     */
    public static byte PolicyType$get(MemorySegment seg) {
        return (byte)constants$319.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE PolicyType;
     * }
     */
    public static void PolicyType$set(MemorySegment seg, byte x) {
        constants$319.const$3.set(seg, x);
    }
    public static byte PolicyType$get(MemorySegment seg, long index) {
        return (byte)constants$319.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void PolicyType$set(MemorySegment seg, long index, byte x) {
        constants$319.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Type$VH() {
        return constants$319.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Type;
     * }
     */
    public static byte Type$get(MemorySegment seg) {
        return (byte)constants$319.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Type;
     * }
     */
    public static void Type$set(MemorySegment seg, byte x) {
        constants$319.const$4.set(seg, x);
    }
    public static byte Type$get(MemorySegment seg, long index) {
        return (byte)constants$319.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, byte x) {
        constants$319.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$319.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Reserved;
     * }
     */
    public static byte Reserved$get(MemorySegment seg) {
        return (byte)constants$319.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, byte x) {
        constants$319.const$5.set(seg, x);
    }
    public static byte Reserved$get(MemorySegment seg, long index) {
        return (byte)constants$319.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, byte x) {
        constants$319.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TimerInterval$VH() {
        return constants$320.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimerInterval;
     * }
     */
    public static int TimerInterval$get(MemorySegment seg) {
        return (int)constants$320.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimerInterval;
     * }
     */
    public static void TimerInterval$set(MemorySegment seg, int x) {
        constants$320.const$0.set(seg, x);
    }
    public static int TimerInterval$get(MemorySegment seg, long index) {
        return (int)constants$320.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void TimerInterval$set(MemorySegment seg, long index, int x) {
        constants$320.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TargetProcessors$VH() {
        return constants$320.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID TargetProcessors;
     * }
     */
    public static MemorySegment TargetProcessors$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$320.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID TargetProcessors;
     * }
     */
    public static void TargetProcessors$set(MemorySegment seg, MemorySegment x) {
        constants$320.const$1.set(seg, x);
    }
    public static MemorySegment TargetProcessors$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$320.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetProcessors$set(MemorySegment seg, long index, MemorySegment x) {
        constants$320.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PStateHandler$VH() {
        return constants$320.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PStateHandler;
     * }
     */
    public static int PStateHandler$get(MemorySegment seg) {
        return (int)constants$320.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PStateHandler;
     * }
     */
    public static void PStateHandler$set(MemorySegment seg, int x) {
        constants$320.const$2.set(seg, x);
    }
    public static int PStateHandler$get(MemorySegment seg, long index) {
        return (int)constants$320.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void PStateHandler$set(MemorySegment seg, long index, int x) {
        constants$320.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PStateContext$VH() {
        return constants$320.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PStateContext;
     * }
     */
    public static int PStateContext$get(MemorySegment seg) {
        return (int)constants$320.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PStateContext;
     * }
     */
    public static void PStateContext$set(MemorySegment seg, int x) {
        constants$320.const$3.set(seg, x);
    }
    public static int PStateContext$get(MemorySegment seg, long index) {
        return (int)constants$320.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void PStateContext$set(MemorySegment seg, long index, int x) {
        constants$320.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TStateHandler$VH() {
        return constants$320.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TStateHandler;
     * }
     */
    public static int TStateHandler$get(MemorySegment seg) {
        return (int)constants$320.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TStateHandler;
     * }
     */
    public static void TStateHandler$set(MemorySegment seg, int x) {
        constants$320.const$4.set(seg, x);
    }
    public static int TStateHandler$get(MemorySegment seg, long index) {
        return (int)constants$320.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void TStateHandler$set(MemorySegment seg, long index, int x) {
        constants$320.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TStateContext$VH() {
        return constants$320.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TStateContext;
     * }
     */
    public static int TStateContext$get(MemorySegment seg) {
        return (int)constants$320.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TStateContext;
     * }
     */
    public static void TStateContext$set(MemorySegment seg, int x) {
        constants$320.const$5.set(seg, x);
    }
    public static int TStateContext$get(MemorySegment seg, long index) {
        return (int)constants$320.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void TStateContext$set(MemorySegment seg, long index, int x) {
        constants$320.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FeedbackHandler$VH() {
        return constants$321.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FeedbackHandler;
     * }
     */
    public static int FeedbackHandler$get(MemorySegment seg) {
        return (int)constants$321.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FeedbackHandler;
     * }
     */
    public static void FeedbackHandler$set(MemorySegment seg, int x) {
        constants$321.const$0.set(seg, x);
    }
    public static int FeedbackHandler$get(MemorySegment seg, long index) {
        return (int)constants$321.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void FeedbackHandler$set(MemorySegment seg, long index, int x) {
        constants$321.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved1$VH() {
        return constants$321.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved1;
     * }
     */
    public static int Reserved1$get(MemorySegment seg) {
        return (int)constants$321.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved1;
     * }
     */
    public static void Reserved1$set(MemorySegment seg, int x) {
        constants$321.const$1.set(seg, x);
    }
    public static int Reserved1$get(MemorySegment seg, long index) {
        return (int)constants$321.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved1$set(MemorySegment seg, long index, int x) {
        constants$321.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved2$VH() {
        return constants$321.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 Reserved2;
     * }
     */
    public static long Reserved2$get(MemorySegment seg) {
        return (long)constants$321.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 Reserved2;
     * }
     */
    public static void Reserved2$set(MemorySegment seg, long x) {
        constants$321.const$2.set(seg, x);
    }
    public static long Reserved2$get(MemorySegment seg, long index) {
        return (long)constants$321.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved2$set(MemorySegment seg, long index, long x) {
        constants$321.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment State$slice(MemorySegment seg) {
        return seg.asSlice(80, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


