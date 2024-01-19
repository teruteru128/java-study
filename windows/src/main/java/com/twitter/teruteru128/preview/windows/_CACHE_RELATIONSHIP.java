// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CACHE_RELATIONSHIP {
 *     BYTE Level;
 *     BYTE Associativity;
 *     WORD LineSize;
 *     DWORD CacheSize;
 *     PROCESSOR_CACHE_TYPE Type;
 *     BYTE Reserved[18];
 *     WORD GroupCount;
 *     union {
 *         GROUP_AFFINITY GroupMask;
 *         GROUP_AFFINITY GroupMasks[1];
 *     };
 * };
 * }
 */
public class _CACHE_RELATIONSHIP {

    public static MemoryLayout $LAYOUT() {
        return constants$232.const$1;
    }
    public static VarHandle Level$VH() {
        return constants$232.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Level;
     * }
     */
    public static byte Level$get(MemorySegment seg) {
        return (byte)constants$232.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Level;
     * }
     */
    public static void Level$set(MemorySegment seg, byte x) {
        constants$232.const$2.set(seg, x);
    }
    public static byte Level$get(MemorySegment seg, long index) {
        return (byte)constants$232.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Level$set(MemorySegment seg, long index, byte x) {
        constants$232.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Associativity$VH() {
        return constants$232.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Associativity;
     * }
     */
    public static byte Associativity$get(MemorySegment seg) {
        return (byte)constants$232.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Associativity;
     * }
     */
    public static void Associativity$set(MemorySegment seg, byte x) {
        constants$232.const$3.set(seg, x);
    }
    public static byte Associativity$get(MemorySegment seg, long index) {
        return (byte)constants$232.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Associativity$set(MemorySegment seg, long index, byte x) {
        constants$232.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LineSize$VH() {
        return constants$232.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD LineSize;
     * }
     */
    public static short LineSize$get(MemorySegment seg) {
        return (short)constants$232.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD LineSize;
     * }
     */
    public static void LineSize$set(MemorySegment seg, short x) {
        constants$232.const$4.set(seg, x);
    }
    public static short LineSize$get(MemorySegment seg, long index) {
        return (short)constants$232.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void LineSize$set(MemorySegment seg, long index, short x) {
        constants$232.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CacheSize$VH() {
        return constants$232.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CacheSize;
     * }
     */
    public static int CacheSize$get(MemorySegment seg) {
        return (int)constants$232.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CacheSize;
     * }
     */
    public static void CacheSize$set(MemorySegment seg, int x) {
        constants$232.const$5.set(seg, x);
    }
    public static int CacheSize$get(MemorySegment seg, long index) {
        return (int)constants$232.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void CacheSize$set(MemorySegment seg, long index, int x) {
        constants$232.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Type$VH() {
        return constants$233.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PROCESSOR_CACHE_TYPE Type;
     * }
     */
    public static int Type$get(MemorySegment seg) {
        return (int)constants$233.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PROCESSOR_CACHE_TYPE Type;
     * }
     */
    public static void Type$set(MemorySegment seg, int x) {
        constants$233.const$0.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)constants$233.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        constants$233.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(12, 18);
    }
    public static VarHandle GroupCount$VH() {
        return constants$233.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD GroupCount;
     * }
     */
    public static short GroupCount$get(MemorySegment seg) {
        return (short)constants$233.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD GroupCount;
     * }
     */
    public static void GroupCount$set(MemorySegment seg, short x) {
        constants$233.const$1.set(seg, x);
    }
    public static short GroupCount$get(MemorySegment seg, long index) {
        return (short)constants$233.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void GroupCount$set(MemorySegment seg, long index, short x) {
        constants$233.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment GroupMask$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static MemorySegment GroupMasks$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

