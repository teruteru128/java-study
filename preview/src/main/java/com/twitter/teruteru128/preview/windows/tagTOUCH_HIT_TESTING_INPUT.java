// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagTOUCH_HIT_TESTING_INPUT {
 *     UINT32 pointerId;
 *     POINT point;
 *     RECT boundingBox;
 *     RECT nonOccludedBoundingBox;
 *     UINT32 orientation;
 * };
 * }
 */
public class tagTOUCH_HIT_TESTING_INPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$1247.const$4;
    }
    public static VarHandle pointerId$VH() {
        return constants$1247.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 pointerId;
     * }
     */
    public static int pointerId$get(MemorySegment seg) {
        return (int)constants$1247.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 pointerId;
     * }
     */
    public static void pointerId$set(MemorySegment seg, int x) {
        constants$1247.const$5.set(seg, x);
    }
    public static int pointerId$get(MemorySegment seg, long index) {
        return (int)constants$1247.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pointerId$set(MemorySegment seg, long index, int x) {
        constants$1247.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment point$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static MemorySegment boundingBox$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    public static MemorySegment nonOccludedBoundingBox$slice(MemorySegment seg) {
        return seg.asSlice(28, 16);
    }
    public static VarHandle orientation$VH() {
        return constants$1248.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 orientation;
     * }
     */
    public static int orientation$get(MemorySegment seg) {
        return (int)constants$1248.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 orientation;
     * }
     */
    public static void orientation$set(MemorySegment seg, int x) {
        constants$1248.const$0.set(seg, x);
    }
    public static int orientation$get(MemorySegment seg, long index) {
        return (int)constants$1248.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void orientation$set(MemorySegment seg, long index, int x) {
        constants$1248.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

