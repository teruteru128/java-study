// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _OUTPUT_DEBUG_STRING_INFO {
 *     LPSTR lpDebugStringData;
 *     WORD fUnicode;
 *     WORD nDebugStringLength;
 * };
 * }
 */
public class _OUTPUT_DEBUG_STRING_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$566.const$5;
    }
    public static VarHandle lpDebugStringData$VH() {
        return constants$567.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpDebugStringData;
     * }
     */
    public static MemorySegment lpDebugStringData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$567.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpDebugStringData;
     * }
     */
    public static void lpDebugStringData$set(MemorySegment seg, MemorySegment x) {
        constants$567.const$0.set(seg, x);
    }
    public static MemorySegment lpDebugStringData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$567.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDebugStringData$set(MemorySegment seg, long index, MemorySegment x) {
        constants$567.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fUnicode$VH() {
        return constants$567.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD fUnicode;
     * }
     */
    public static short fUnicode$get(MemorySegment seg) {
        return (short)constants$567.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD fUnicode;
     * }
     */
    public static void fUnicode$set(MemorySegment seg, short x) {
        constants$567.const$1.set(seg, x);
    }
    public static short fUnicode$get(MemorySegment seg, long index) {
        return (short)constants$567.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void fUnicode$set(MemorySegment seg, long index, short x) {
        constants$567.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nDebugStringLength$VH() {
        return constants$567.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nDebugStringLength;
     * }
     */
    public static short nDebugStringLength$get(MemorySegment seg) {
        return (short)constants$567.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nDebugStringLength;
     * }
     */
    public static void nDebugStringLength$set(MemorySegment seg, short x) {
        constants$567.const$2.set(seg, x);
    }
    public static short nDebugStringLength$get(MemorySegment seg, long index) {
        return (short)constants$567.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void nDebugStringLength$set(MemorySegment seg, long index, short x) {
        constants$567.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


