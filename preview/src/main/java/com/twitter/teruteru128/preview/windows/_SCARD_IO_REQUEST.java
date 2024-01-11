// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCARD_IO_REQUEST {
 *     DWORD dwProtocol;
 *     DWORD cbPciLength;
 * };
 * }
 */
public class _SCARD_IO_REQUEST {

    public static MemoryLayout $LAYOUT() {
        return constants$2744.const$0;
    }
    public static VarHandle dwProtocol$VH() {
        return constants$2744.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProtocol;
     * }
     */
    public static int dwProtocol$get(MemorySegment seg) {
        return (int)constants$2744.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProtocol;
     * }
     */
    public static void dwProtocol$set(MemorySegment seg, int x) {
        constants$2744.const$1.set(seg, x);
    }
    public static int dwProtocol$get(MemorySegment seg, long index) {
        return (int)constants$2744.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProtocol$set(MemorySegment seg, long index, int x) {
        constants$2744.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbPciLength$VH() {
        return constants$2744.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbPciLength;
     * }
     */
    public static int cbPciLength$get(MemorySegment seg) {
        return (int)constants$2744.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbPciLength;
     * }
     */
    public static void cbPciLength$set(MemorySegment seg, int x) {
        constants$2744.const$2.set(seg, x);
    }
    public static int cbPciLength$get(MemorySegment seg, long index) {
        return (int)constants$2744.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPciLength$set(MemorySegment seg, long index, int x) {
        constants$2744.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

