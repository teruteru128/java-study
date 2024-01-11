// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagACCEL {
 *     BYTE fVirt;
 *     WORD key;
 *     WORD cmd;
 * };
 * }
 */
public class tagACCEL {

    public static MemoryLayout $LAYOUT() {
        return constants$1171.const$4;
    }
    public static VarHandle fVirt$VH() {
        return constants$1171.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE fVirt;
     * }
     */
    public static byte fVirt$get(MemorySegment seg) {
        return (byte)constants$1171.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE fVirt;
     * }
     */
    public static void fVirt$set(MemorySegment seg, byte x) {
        constants$1171.const$5.set(seg, x);
    }
    public static byte fVirt$get(MemorySegment seg, long index) {
        return (byte)constants$1171.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void fVirt$set(MemorySegment seg, long index, byte x) {
        constants$1171.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle key$VH() {
        return constants$1172.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD key;
     * }
     */
    public static short key$get(MemorySegment seg) {
        return (short)constants$1172.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD key;
     * }
     */
    public static void key$set(MemorySegment seg, short x) {
        constants$1172.const$0.set(seg, x);
    }
    public static short key$get(MemorySegment seg, long index) {
        return (short)constants$1172.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void key$set(MemorySegment seg, long index, short x) {
        constants$1172.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cmd$VH() {
        return constants$1172.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD cmd;
     * }
     */
    public static short cmd$get(MemorySegment seg) {
        return (short)constants$1172.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD cmd;
     * }
     */
    public static void cmd$set(MemorySegment seg, short x) {
        constants$1172.const$1.set(seg, x);
    }
    public static short cmd$get(MemorySegment seg, long index) {
        return (short)constants$1172.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cmd$set(MemorySegment seg, long index, short x) {
        constants$1172.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


