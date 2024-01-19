// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCARD_T0_REQUEST {
 *     SCARD_IO_REQUEST ioRequest;
 *     BYTE bSw1;
 *     BYTE bSw2;
 *     union {
 *         SCARD_T0_COMMAND CmdBytes;
 *         BYTE rgbHeader[5];
 *     };
 * };
 * }
 */
public class _SCARD_T0_REQUEST {

    public static MemoryLayout $LAYOUT() {
        return constants$2745.const$3;
    }
    public static MemorySegment ioRequest$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle bSw1$VH() {
        return constants$2745.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bSw1;
     * }
     */
    public static byte bSw1$get(MemorySegment seg) {
        return (byte)constants$2745.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bSw1;
     * }
     */
    public static void bSw1$set(MemorySegment seg, byte x) {
        constants$2745.const$4.set(seg, x);
    }
    public static byte bSw1$get(MemorySegment seg, long index) {
        return (byte)constants$2745.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void bSw1$set(MemorySegment seg, long index, byte x) {
        constants$2745.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bSw2$VH() {
        return constants$2745.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bSw2;
     * }
     */
    public static byte bSw2$get(MemorySegment seg) {
        return (byte)constants$2745.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bSw2;
     * }
     */
    public static void bSw2$set(MemorySegment seg, byte x) {
        constants$2745.const$5.set(seg, x);
    }
    public static byte bSw2$get(MemorySegment seg, long index) {
        return (byte)constants$2745.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bSw2$set(MemorySegment seg, long index, byte x) {
        constants$2745.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment CmdBytes$slice(MemorySegment seg) {
        return seg.asSlice(10, 5);
    }
    public static MemorySegment rgbHeader$slice(MemorySegment seg) {
        return seg.asSlice(10, 5);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

