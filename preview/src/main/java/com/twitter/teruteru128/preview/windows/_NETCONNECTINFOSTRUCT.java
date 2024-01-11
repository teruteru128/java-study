// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NETCONNECTINFOSTRUCT {
 *     DWORD cbStructure;
 *     DWORD dwFlags;
 *     DWORD dwSpeed;
 *     DWORD dwDelay;
 *     DWORD dwOptDataSize;
 * };
 * }
 */
public class _NETCONNECTINFOSTRUCT {

    public static MemoryLayout $LAYOUT() {
        return constants$1520.const$2;
    }
    public static VarHandle cbStructure$VH() {
        return constants$1520.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbStructure;
     * }
     */
    public static int cbStructure$get(MemorySegment seg) {
        return (int)constants$1520.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbStructure;
     * }
     */
    public static void cbStructure$set(MemorySegment seg, int x) {
        constants$1520.const$3.set(seg, x);
    }
    public static int cbStructure$get(MemorySegment seg, long index) {
        return (int)constants$1520.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStructure$set(MemorySegment seg, long index, int x) {
        constants$1520.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFlags$VH() {
        return constants$1520.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$1520.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$1520.const$4.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$1520.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$1520.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSpeed$VH() {
        return constants$1520.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSpeed;
     * }
     */
    public static int dwSpeed$get(MemorySegment seg) {
        return (int)constants$1520.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSpeed;
     * }
     */
    public static void dwSpeed$set(MemorySegment seg, int x) {
        constants$1520.const$5.set(seg, x);
    }
    public static int dwSpeed$get(MemorySegment seg, long index) {
        return (int)constants$1520.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSpeed$set(MemorySegment seg, long index, int x) {
        constants$1520.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwDelay$VH() {
        return constants$1521.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwDelay;
     * }
     */
    public static int dwDelay$get(MemorySegment seg) {
        return (int)constants$1521.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwDelay;
     * }
     */
    public static void dwDelay$set(MemorySegment seg, int x) {
        constants$1521.const$0.set(seg, x);
    }
    public static int dwDelay$get(MemorySegment seg, long index) {
        return (int)constants$1521.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDelay$set(MemorySegment seg, long index, int x) {
        constants$1521.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwOptDataSize$VH() {
        return constants$1521.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOptDataSize;
     * }
     */
    public static int dwOptDataSize$get(MemorySegment seg) {
        return (int)constants$1521.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOptDataSize;
     * }
     */
    public static void dwOptDataSize$set(MemorySegment seg, int x) {
        constants$1521.const$1.set(seg, x);
    }
    public static int dwOptDataSize$get(MemorySegment seg, long index) {
        return (int)constants$1521.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOptDataSize$set(MemorySegment seg, long index, int x) {
        constants$1521.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


