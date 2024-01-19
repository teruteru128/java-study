// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _WRITE_USN_REASON_INPUT {
 *     DWORD Flags;
 *     DWORD UsnReasonToWrite;
 * };
 * }
 */
public class _WRITE_USN_REASON_INPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$2708.const$2;
    }
    public static VarHandle Flags$VH() {
        return constants$2708.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$2708.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$2708.const$3.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$2708.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$2708.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UsnReasonToWrite$VH() {
        return constants$2708.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD UsnReasonToWrite;
     * }
     */
    public static int UsnReasonToWrite$get(MemorySegment seg) {
        return (int)constants$2708.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD UsnReasonToWrite;
     * }
     */
    public static void UsnReasonToWrite$set(MemorySegment seg, int x) {
        constants$2708.const$4.set(seg, x);
    }
    public static int UsnReasonToWrite$get(MemorySegment seg, long index) {
        return (int)constants$2708.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void UsnReasonToWrite$set(MemorySegment seg, long index, int x) {
        constants$2708.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

