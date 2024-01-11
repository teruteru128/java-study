// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_DEBUG_MISC {
 *     DWORD DataType;
 *     DWORD Length;
 *     BOOLEAN Unicode;
 *     BYTE Reserved[3];
 *     BYTE Data[1];
 * };
 * }
 */
public class _IMAGE_DEBUG_MISC {

    public static MemoryLayout $LAYOUT() {
        return constants$455.const$0;
    }
    public static VarHandle DataType$VH() {
        return constants$455.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DataType;
     * }
     */
    public static int DataType$get(MemorySegment seg) {
        return (int)constants$455.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DataType;
     * }
     */
    public static void DataType$set(MemorySegment seg, int x) {
        constants$455.const$1.set(seg, x);
    }
    public static int DataType$get(MemorySegment seg, long index) {
        return (int)constants$455.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void DataType$set(MemorySegment seg, long index, int x) {
        constants$455.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Length$VH() {
        return constants$455.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static int Length$get(MemorySegment seg) {
        return (int)constants$455.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static void Length$set(MemorySegment seg, int x) {
        constants$455.const$2.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)constants$455.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        constants$455.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Unicode$VH() {
        return constants$455.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN Unicode;
     * }
     */
    public static byte Unicode$get(MemorySegment seg) {
        return (byte)constants$455.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN Unicode;
     * }
     */
    public static void Unicode$set(MemorySegment seg, byte x) {
        constants$455.const$3.set(seg, x);
    }
    public static byte Unicode$get(MemorySegment seg, long index) {
        return (byte)constants$455.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Unicode$set(MemorySegment seg, long index, byte x) {
        constants$455.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(9, 3);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(12, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


