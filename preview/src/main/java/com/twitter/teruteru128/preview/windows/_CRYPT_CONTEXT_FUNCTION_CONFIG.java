// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_CONTEXT_FUNCTION_CONFIG {
 *     ULONG dwFlags;
 *     ULONG dwReserved;
 * };
 * }
 */
public class _CRYPT_CONTEXT_FUNCTION_CONFIG {

    public static MemoryLayout $LAYOUT() {
        return constants$1968.const$4;
    }
    public static VarHandle dwFlags$VH() {
        return constants$1968.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$1968.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$1968.const$5.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$1968.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$1968.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwReserved$VH() {
        return constants$1969.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwReserved;
     * }
     */
    public static int dwReserved$get(MemorySegment seg) {
        return (int)constants$1969.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwReserved;
     * }
     */
    public static void dwReserved$set(MemorySegment seg, int x) {
        constants$1969.const$0.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)constants$1969.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        constants$1969.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


