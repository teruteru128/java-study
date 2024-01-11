// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR {
 *     unsigned long BufferSize;
 *     char* Buffer;
 * };
 * }
 */
public class _RPC_C_OPT_COOKIE_AUTH_DESCRIPTOR {

    public static MemoryLayout $LAYOUT() {
        return constants$1801.const$1;
    }
    public static VarHandle BufferSize$VH() {
        return constants$1801.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long BufferSize;
     * }
     */
    public static int BufferSize$get(MemorySegment seg) {
        return (int)constants$1801.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long BufferSize;
     * }
     */
    public static void BufferSize$set(MemorySegment seg, int x) {
        constants$1801.const$2.set(seg, x);
    }
    public static int BufferSize$get(MemorySegment seg, long index) {
        return (int)constants$1801.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSize$set(MemorySegment seg, long index, int x) {
        constants$1801.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Buffer$VH() {
        return constants$1801.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* Buffer;
     * }
     */
    public static MemorySegment Buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1801.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* Buffer;
     * }
     */
    public static void Buffer$set(MemorySegment seg, MemorySegment x) {
        constants$1801.const$3.set(seg, x);
    }
    public static MemorySegment Buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1801.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Buffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1801.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


