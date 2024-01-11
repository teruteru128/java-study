// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROCESS_DYNAMIC_ENFORCED_ADDRESS_RANGES_INFORMATION {
 *     WORD NumberOfRanges;
 *     WORD Reserved;
 *     DWORD Reserved2;
 *     PPROCESS_DYNAMIC_ENFORCED_ADDRESS_RANGE Ranges;
 * };
 * }
 */
public class _PROCESS_DYNAMIC_ENFORCED_ADDRESS_RANGES_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$191.const$3;
    }
    public static VarHandle NumberOfRanges$VH() {
        return constants$191.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD NumberOfRanges;
     * }
     */
    public static short NumberOfRanges$get(MemorySegment seg) {
        return (short)constants$191.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD NumberOfRanges;
     * }
     */
    public static void NumberOfRanges$set(MemorySegment seg, short x) {
        constants$191.const$4.set(seg, x);
    }
    public static short NumberOfRanges$get(MemorySegment seg, long index) {
        return (short)constants$191.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfRanges$set(MemorySegment seg, long index, short x) {
        constants$191.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$191.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static short Reserved$get(MemorySegment seg) {
        return (short)constants$191.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, short x) {
        constants$191.const$5.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)constants$191.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        constants$191.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved2$VH() {
        return constants$192.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved2;
     * }
     */
    public static int Reserved2$get(MemorySegment seg) {
        return (int)constants$192.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved2;
     * }
     */
    public static void Reserved2$set(MemorySegment seg, int x) {
        constants$192.const$0.set(seg, x);
    }
    public static int Reserved2$get(MemorySegment seg, long index) {
        return (int)constants$192.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved2$set(MemorySegment seg, long index, int x) {
        constants$192.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Ranges$VH() {
        return constants$192.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PPROCESS_DYNAMIC_ENFORCED_ADDRESS_RANGE Ranges;
     * }
     */
    public static MemorySegment Ranges$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$192.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PPROCESS_DYNAMIC_ENFORCED_ADDRESS_RANGE Ranges;
     * }
     */
    public static void Ranges$set(MemorySegment seg, MemorySegment x) {
        constants$192.const$1.set(seg, x);
    }
    public static MemorySegment Ranges$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$192.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Ranges$set(MemorySegment seg, long index, MemorySegment x) {
        constants$192.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


