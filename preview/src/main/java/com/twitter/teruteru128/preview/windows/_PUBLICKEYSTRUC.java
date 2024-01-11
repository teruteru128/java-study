// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PUBLICKEYSTRUC {
 *     BYTE bType;
 *     BYTE bVersion;
 *     WORD reserved;
 *     ALG_ID aiKeyAlg;
 * };
 * }
 */
public class _PUBLICKEYSTRUC {

    public static MemoryLayout $LAYOUT() {
        return constants$1923.const$1;
    }
    public static VarHandle bType$VH() {
        return constants$1923.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bType;
     * }
     */
    public static byte bType$get(MemorySegment seg) {
        return (byte)constants$1923.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bType;
     * }
     */
    public static void bType$set(MemorySegment seg, byte x) {
        constants$1923.const$2.set(seg, x);
    }
    public static byte bType$get(MemorySegment seg, long index) {
        return (byte)constants$1923.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void bType$set(MemorySegment seg, long index, byte x) {
        constants$1923.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bVersion$VH() {
        return constants$1923.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE bVersion;
     * }
     */
    public static byte bVersion$get(MemorySegment seg) {
        return (byte)constants$1923.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE bVersion;
     * }
     */
    public static void bVersion$set(MemorySegment seg, byte x) {
        constants$1923.const$3.set(seg, x);
    }
    public static byte bVersion$get(MemorySegment seg, long index) {
        return (byte)constants$1923.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void bVersion$set(MemorySegment seg, long index, byte x) {
        constants$1923.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reserved$VH() {
        return constants$1923.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD reserved;
     * }
     */
    public static short reserved$get(MemorySegment seg) {
        return (short)constants$1923.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD reserved;
     * }
     */
    public static void reserved$set(MemorySegment seg, short x) {
        constants$1923.const$4.set(seg, x);
    }
    public static short reserved$get(MemorySegment seg, long index) {
        return (short)constants$1923.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, short x) {
        constants$1923.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle aiKeyAlg$VH() {
        return constants$1923.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ALG_ID aiKeyAlg;
     * }
     */
    public static int aiKeyAlg$get(MemorySegment seg) {
        return (int)constants$1923.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ALG_ID aiKeyAlg;
     * }
     */
    public static void aiKeyAlg$set(MemorySegment seg, int x) {
        constants$1923.const$5.set(seg, x);
    }
    public static int aiKeyAlg$get(MemorySegment seg, long index) {
        return (int)constants$1923.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void aiKeyAlg$set(MemorySegment seg, long index, int x) {
        constants$1923.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


