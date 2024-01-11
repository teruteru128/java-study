// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TRANSMIT_FILE_BUFFERS {
 *     PVOID Head;
 *     DWORD HeadLength;
 *     PVOID Tail;
 *     DWORD TailLength;
 * };
 * }
 */
public class _TRANSMIT_FILE_BUFFERS {

    public static MemoryLayout $LAYOUT() {
        return constants$1916.const$3;
    }
    public static VarHandle Head$VH() {
        return constants$1916.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID Head;
     * }
     */
    public static MemorySegment Head$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1916.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID Head;
     * }
     */
    public static void Head$set(MemorySegment seg, MemorySegment x) {
        constants$1916.const$4.set(seg, x);
    }
    public static MemorySegment Head$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1916.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Head$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1916.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle HeadLength$VH() {
        return constants$1916.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD HeadLength;
     * }
     */
    public static int HeadLength$get(MemorySegment seg) {
        return (int)constants$1916.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD HeadLength;
     * }
     */
    public static void HeadLength$set(MemorySegment seg, int x) {
        constants$1916.const$5.set(seg, x);
    }
    public static int HeadLength$get(MemorySegment seg, long index) {
        return (int)constants$1916.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void HeadLength$set(MemorySegment seg, long index, int x) {
        constants$1916.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Tail$VH() {
        return constants$1917.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID Tail;
     * }
     */
    public static MemorySegment Tail$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1917.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID Tail;
     * }
     */
    public static void Tail$set(MemorySegment seg, MemorySegment x) {
        constants$1917.const$0.set(seg, x);
    }
    public static MemorySegment Tail$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1917.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Tail$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1917.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TailLength$VH() {
        return constants$1917.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TailLength;
     * }
     */
    public static int TailLength$get(MemorySegment seg) {
        return (int)constants$1917.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TailLength;
     * }
     */
    public static void TailLength$set(MemorySegment seg, int x) {
        constants$1917.const$1.set(seg, x);
    }
    public static int TailLength$get(MemorySegment seg, long index) {
        return (int)constants$1917.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void TailLength$set(MemorySegment seg, long index, int x) {
        constants$1917.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

