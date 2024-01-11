// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TAPE_PREPARE {
 *     DWORD Operation;
 *     BOOLEAN Immediate;
 * };
 * }
 */
public class _TAPE_PREPARE {

    public static MemoryLayout $LAYOUT() {
        return constants$513.const$5;
    }
    public static VarHandle Operation$VH() {
        return constants$514.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Operation;
     * }
     */
    public static int Operation$get(MemorySegment seg) {
        return (int)constants$514.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Operation;
     * }
     */
    public static void Operation$set(MemorySegment seg, int x) {
        constants$514.const$0.set(seg, x);
    }
    public static int Operation$get(MemorySegment seg, long index) {
        return (int)constants$514.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Operation$set(MemorySegment seg, long index, int x) {
        constants$514.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Immediate$VH() {
        return constants$514.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOLEAN Immediate;
     * }
     */
    public static byte Immediate$get(MemorySegment seg) {
        return (byte)constants$514.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOLEAN Immediate;
     * }
     */
    public static void Immediate$set(MemorySegment seg, byte x) {
        constants$514.const$1.set(seg, x);
    }
    public static byte Immediate$get(MemorySegment seg, long index) {
        return (byte)constants$514.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Immediate$set(MemorySegment seg, long index, byte x) {
        constants$514.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


