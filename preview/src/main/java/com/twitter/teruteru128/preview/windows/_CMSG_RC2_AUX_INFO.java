// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_RC2_AUX_INFO {
 *     DWORD cbSize;
 *     DWORD dwBitLen;
 * };
 * }
 */
public class _CMSG_RC2_AUX_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2089.const$2;
    }
    public static VarHandle cbSize$VH() {
        return constants$2089.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2089.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2089.const$3.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2089.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2089.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwBitLen$VH() {
        return constants$2089.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwBitLen;
     * }
     */
    public static int dwBitLen$get(MemorySegment seg) {
        return (int)constants$2089.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwBitLen;
     * }
     */
    public static void dwBitLen$set(MemorySegment seg, int x) {
        constants$2089.const$4.set(seg, x);
    }
    public static int dwBitLen$get(MemorySegment seg, long index) {
        return (int)constants$2089.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBitLen$set(MemorySegment seg, long index, int x) {
        constants$2089.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


