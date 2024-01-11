// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MARK_HANDLE_INFO {
 *     union {
 *         DWORD UsnSourceInfo;
 *         DWORD CopyNumber;
 *     };
 *     HANDLE VolumeHandle;
 *     DWORD HandleInfo;
 * };
 * }
 */
public class _MARK_HANDLE_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2600.const$1;
    }
    public static VarHandle UsnSourceInfo$VH() {
        return constants$2600.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UsnSourceInfo;
     * }
     */
    public static int UsnSourceInfo$get(MemorySegment seg) {
        return (int)constants$2600.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UsnSourceInfo;
     * }
     */
    public static void UsnSourceInfo$set(MemorySegment seg, int x) {
        constants$2600.const$2.set(seg, x);
    }
    public static int UsnSourceInfo$get(MemorySegment seg, long index) {
        return (int)constants$2600.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void UsnSourceInfo$set(MemorySegment seg, long index, int x) {
        constants$2600.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CopyNumber$VH() {
        return constants$2600.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CopyNumber;
     * }
     */
    public static int CopyNumber$get(MemorySegment seg) {
        return (int)constants$2600.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CopyNumber;
     * }
     */
    public static void CopyNumber$set(MemorySegment seg, int x) {
        constants$2600.const$3.set(seg, x);
    }
    public static int CopyNumber$get(MemorySegment seg, long index) {
        return (int)constants$2600.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void CopyNumber$set(MemorySegment seg, long index, int x) {
        constants$2600.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle VolumeHandle$VH() {
        return constants$2600.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE VolumeHandle;
     * }
     */
    public static MemorySegment VolumeHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2600.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE VolumeHandle;
     * }
     */
    public static void VolumeHandle$set(MemorySegment seg, MemorySegment x) {
        constants$2600.const$4.set(seg, x);
    }
    public static MemorySegment VolumeHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2600.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void VolumeHandle$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2600.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle HandleInfo$VH() {
        return constants$2600.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD HandleInfo;
     * }
     */
    public static int HandleInfo$get(MemorySegment seg) {
        return (int)constants$2600.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD HandleInfo;
     * }
     */
    public static void HandleInfo$set(MemorySegment seg, int x) {
        constants$2600.const$5.set(seg, x);
    }
    public static int HandleInfo$get(MemorySegment seg, long index) {
        return (int)constants$2600.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void HandleInfo$set(MemorySegment seg, long index, int x) {
        constants$2600.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

