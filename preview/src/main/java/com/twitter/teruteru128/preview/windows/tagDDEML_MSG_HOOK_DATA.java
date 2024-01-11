// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDDEML_MSG_HOOK_DATA {
 *     UINT_PTR uiLo;
 *     UINT_PTR uiHi;
 *     DWORD cbData;
 *     DWORD Data[8];
 * };
 * }
 */
public class tagDDEML_MSG_HOOK_DATA {

    public static MemoryLayout $LAYOUT() {
        return constants$1536.const$4;
    }
    public static VarHandle uiLo$VH() {
        return constants$1536.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT_PTR uiLo;
     * }
     */
    public static long uiLo$get(MemorySegment seg) {
        return (long)constants$1536.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT_PTR uiLo;
     * }
     */
    public static void uiLo$set(MemorySegment seg, long x) {
        constants$1536.const$5.set(seg, x);
    }
    public static long uiLo$get(MemorySegment seg, long index) {
        return (long)constants$1536.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void uiLo$set(MemorySegment seg, long index, long x) {
        constants$1536.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle uiHi$VH() {
        return constants$1537.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT_PTR uiHi;
     * }
     */
    public static long uiHi$get(MemorySegment seg) {
        return (long)constants$1537.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT_PTR uiHi;
     * }
     */
    public static void uiHi$set(MemorySegment seg, long x) {
        constants$1537.const$0.set(seg, x);
    }
    public static long uiHi$get(MemorySegment seg, long index) {
        return (long)constants$1537.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void uiHi$set(MemorySegment seg, long index, long x) {
        constants$1537.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbData$VH() {
        return constants$1537.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static int cbData$get(MemorySegment seg) {
        return (int)constants$1537.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static void cbData$set(MemorySegment seg, int x) {
        constants$1537.const$1.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)constants$1537.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        constants$1537.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(20, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


