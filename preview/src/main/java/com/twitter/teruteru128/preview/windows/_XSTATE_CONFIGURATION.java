// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _XSTATE_CONFIGURATION {
 *     DWORD64 EnabledFeatures;
 *     DWORD64 EnabledVolatileFeatures;
 *     DWORD Size;
 *     union {
 *         DWORD ControlFlags;
 *         struct {
 *              *             DWORD OptimizedSave;
 *             DWORD CompactionEnabled;
 *             DWORD ExtendedFeatureDisable;
 *         };
 *     };
 *     XSTATE_FEATURE Features[64];
 *     DWORD64 EnabledSupervisorFeatures;
 *     DWORD64 AlignedFeatures;
 *     DWORD AllFeatureSize;
 *     DWORD AllFeatures[64];
 *     DWORD64 EnabledUserVisibleSupervisorFeatures;
 *     DWORD64 ExtendedFeatureDisableFeatures;
 *     DWORD AllNonLargeFeatureSize;
 *     DWORD Spare;
 * };
 * }
 */
public class _XSTATE_CONFIGURATION {

    public static MemoryLayout $LAYOUT() {
        return constants$238.const$5;
    }
    public static VarHandle EnabledFeatures$VH() {
        return constants$239.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 EnabledFeatures;
     * }
     */
    public static long EnabledFeatures$get(MemorySegment seg) {
        return (long)constants$239.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 EnabledFeatures;
     * }
     */
    public static void EnabledFeatures$set(MemorySegment seg, long x) {
        constants$239.const$0.set(seg, x);
    }
    public static long EnabledFeatures$get(MemorySegment seg, long index) {
        return (long)constants$239.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void EnabledFeatures$set(MemorySegment seg, long index, long x) {
        constants$239.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle EnabledVolatileFeatures$VH() {
        return constants$239.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 EnabledVolatileFeatures;
     * }
     */
    public static long EnabledVolatileFeatures$get(MemorySegment seg) {
        return (long)constants$239.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 EnabledVolatileFeatures;
     * }
     */
    public static void EnabledVolatileFeatures$set(MemorySegment seg, long x) {
        constants$239.const$1.set(seg, x);
    }
    public static long EnabledVolatileFeatures$get(MemorySegment seg, long index) {
        return (long)constants$239.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void EnabledVolatileFeatures$set(MemorySegment seg, long index, long x) {
        constants$239.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$239.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$239.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$239.const$2.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$239.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$239.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ControlFlags$VH() {
        return constants$239.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ControlFlags;
     * }
     */
    public static int ControlFlags$get(MemorySegment seg) {
        return (int)constants$239.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ControlFlags;
     * }
     */
    public static void ControlFlags$set(MemorySegment seg, int x) {
        constants$239.const$3.set(seg, x);
    }
    public static int ControlFlags$get(MemorySegment seg, long index) {
        return (int)constants$239.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlFlags$set(MemorySegment seg, long index, int x) {
        constants$239.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Features$slice(MemorySegment seg) {
        return seg.asSlice(24, 512);
    }
    public static VarHandle EnabledSupervisorFeatures$VH() {
        return constants$239.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 EnabledSupervisorFeatures;
     * }
     */
    public static long EnabledSupervisorFeatures$get(MemorySegment seg) {
        return (long)constants$239.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 EnabledSupervisorFeatures;
     * }
     */
    public static void EnabledSupervisorFeatures$set(MemorySegment seg, long x) {
        constants$239.const$4.set(seg, x);
    }
    public static long EnabledSupervisorFeatures$get(MemorySegment seg, long index) {
        return (long)constants$239.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void EnabledSupervisorFeatures$set(MemorySegment seg, long index, long x) {
        constants$239.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AlignedFeatures$VH() {
        return constants$239.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 AlignedFeatures;
     * }
     */
    public static long AlignedFeatures$get(MemorySegment seg) {
        return (long)constants$239.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 AlignedFeatures;
     * }
     */
    public static void AlignedFeatures$set(MemorySegment seg, long x) {
        constants$239.const$5.set(seg, x);
    }
    public static long AlignedFeatures$get(MemorySegment seg, long index) {
        return (long)constants$239.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void AlignedFeatures$set(MemorySegment seg, long index, long x) {
        constants$239.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AllFeatureSize$VH() {
        return constants$240.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AllFeatureSize;
     * }
     */
    public static int AllFeatureSize$get(MemorySegment seg) {
        return (int)constants$240.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AllFeatureSize;
     * }
     */
    public static void AllFeatureSize$set(MemorySegment seg, int x) {
        constants$240.const$0.set(seg, x);
    }
    public static int AllFeatureSize$get(MemorySegment seg, long index) {
        return (int)constants$240.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void AllFeatureSize$set(MemorySegment seg, long index, int x) {
        constants$240.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment AllFeatures$slice(MemorySegment seg) {
        return seg.asSlice(556, 256);
    }
    public static VarHandle EnabledUserVisibleSupervisorFeatures$VH() {
        return constants$240.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 EnabledUserVisibleSupervisorFeatures;
     * }
     */
    public static long EnabledUserVisibleSupervisorFeatures$get(MemorySegment seg) {
        return (long)constants$240.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 EnabledUserVisibleSupervisorFeatures;
     * }
     */
    public static void EnabledUserVisibleSupervisorFeatures$set(MemorySegment seg, long x) {
        constants$240.const$1.set(seg, x);
    }
    public static long EnabledUserVisibleSupervisorFeatures$get(MemorySegment seg, long index) {
        return (long)constants$240.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void EnabledUserVisibleSupervisorFeatures$set(MemorySegment seg, long index, long x) {
        constants$240.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ExtendedFeatureDisableFeatures$VH() {
        return constants$240.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 ExtendedFeatureDisableFeatures;
     * }
     */
    public static long ExtendedFeatureDisableFeatures$get(MemorySegment seg) {
        return (long)constants$240.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 ExtendedFeatureDisableFeatures;
     * }
     */
    public static void ExtendedFeatureDisableFeatures$set(MemorySegment seg, long x) {
        constants$240.const$2.set(seg, x);
    }
    public static long ExtendedFeatureDisableFeatures$get(MemorySegment seg, long index) {
        return (long)constants$240.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ExtendedFeatureDisableFeatures$set(MemorySegment seg, long index, long x) {
        constants$240.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle AllNonLargeFeatureSize$VH() {
        return constants$240.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD AllNonLargeFeatureSize;
     * }
     */
    public static int AllNonLargeFeatureSize$get(MemorySegment seg) {
        return (int)constants$240.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD AllNonLargeFeatureSize;
     * }
     */
    public static void AllNonLargeFeatureSize$set(MemorySegment seg, int x) {
        constants$240.const$3.set(seg, x);
    }
    public static int AllNonLargeFeatureSize$get(MemorySegment seg, long index) {
        return (int)constants$240.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void AllNonLargeFeatureSize$set(MemorySegment seg, long index, int x) {
        constants$240.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Spare$VH() {
        return constants$240.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Spare;
     * }
     */
    public static int Spare$get(MemorySegment seg) {
        return (int)constants$240.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Spare;
     * }
     */
    public static void Spare$set(MemorySegment seg, int x) {
        constants$240.const$4.set(seg, x);
    }
    public static int Spare$get(MemorySegment seg, long index) {
        return (int)constants$240.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Spare$set(MemorySegment seg, long index, int x) {
        constants$240.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

