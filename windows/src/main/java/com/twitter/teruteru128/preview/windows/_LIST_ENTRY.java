// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _LIST_ENTRY {
 *     struct _LIST_ENTRY* Flink;
 *     struct _LIST_ENTRY* Blink;
 * };
 * }
 */
public class _LIST_ENTRY {

    public static MemoryLayout $LAYOUT() {
        return constants$25.const$1;
    }
    public static VarHandle Flink$VH() {
        return constants$25.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _LIST_ENTRY* Flink;
     * }
     */
    public static MemorySegment Flink$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$25.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _LIST_ENTRY* Flink;
     * }
     */
    public static void Flink$set(MemorySegment seg, MemorySegment x) {
        constants$25.const$2.set(seg, x);
    }
    public static MemorySegment Flink$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$25.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Flink$set(MemorySegment seg, long index, MemorySegment x) {
        constants$25.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Blink$VH() {
        return constants$25.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _LIST_ENTRY* Blink;
     * }
     */
    public static MemorySegment Blink$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$25.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _LIST_ENTRY* Blink;
     * }
     */
    public static void Blink$set(MemorySegment seg, MemorySegment x) {
        constants$25.const$3.set(seg, x);
    }
    public static MemorySegment Blink$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$25.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Blink$set(MemorySegment seg, long index, MemorySegment x) {
        constants$25.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

