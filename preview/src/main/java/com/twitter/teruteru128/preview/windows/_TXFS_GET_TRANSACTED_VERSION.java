// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TXFS_GET_TRANSACTED_VERSION {
 *     DWORD ThisBaseVersion;
 *     DWORD LatestVersion;
 *     WORD ThisMiniVersion;
 *     WORD FirstMiniVersion;
 *     WORD LatestMiniVersion;
 * };
 * }
 */
public class _TXFS_GET_TRANSACTED_VERSION {

    public static MemoryLayout $LAYOUT() {
        return constants$2659.const$5;
    }
    public static VarHandle ThisBaseVersion$VH() {
        return constants$2660.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ThisBaseVersion;
     * }
     */
    public static int ThisBaseVersion$get(MemorySegment seg) {
        return (int)constants$2660.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ThisBaseVersion;
     * }
     */
    public static void ThisBaseVersion$set(MemorySegment seg, int x) {
        constants$2660.const$0.set(seg, x);
    }
    public static int ThisBaseVersion$get(MemorySegment seg, long index) {
        return (int)constants$2660.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ThisBaseVersion$set(MemorySegment seg, long index, int x) {
        constants$2660.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LatestVersion$VH() {
        return constants$2660.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD LatestVersion;
     * }
     */
    public static int LatestVersion$get(MemorySegment seg) {
        return (int)constants$2660.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD LatestVersion;
     * }
     */
    public static void LatestVersion$set(MemorySegment seg, int x) {
        constants$2660.const$1.set(seg, x);
    }
    public static int LatestVersion$get(MemorySegment seg, long index) {
        return (int)constants$2660.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void LatestVersion$set(MemorySegment seg, long index, int x) {
        constants$2660.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ThisMiniVersion$VH() {
        return constants$2660.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ThisMiniVersion;
     * }
     */
    public static short ThisMiniVersion$get(MemorySegment seg) {
        return (short)constants$2660.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ThisMiniVersion;
     * }
     */
    public static void ThisMiniVersion$set(MemorySegment seg, short x) {
        constants$2660.const$2.set(seg, x);
    }
    public static short ThisMiniVersion$get(MemorySegment seg, long index) {
        return (short)constants$2660.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ThisMiniVersion$set(MemorySegment seg, long index, short x) {
        constants$2660.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FirstMiniVersion$VH() {
        return constants$2660.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FirstMiniVersion;
     * }
     */
    public static short FirstMiniVersion$get(MemorySegment seg) {
        return (short)constants$2660.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FirstMiniVersion;
     * }
     */
    public static void FirstMiniVersion$set(MemorySegment seg, short x) {
        constants$2660.const$3.set(seg, x);
    }
    public static short FirstMiniVersion$get(MemorySegment seg, long index) {
        return (short)constants$2660.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void FirstMiniVersion$set(MemorySegment seg, long index, short x) {
        constants$2660.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LatestMiniVersion$VH() {
        return constants$2660.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD LatestMiniVersion;
     * }
     */
    public static short LatestMiniVersion$get(MemorySegment seg) {
        return (short)constants$2660.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD LatestMiniVersion;
     * }
     */
    public static void LatestMiniVersion$set(MemorySegment seg, short x) {
        constants$2660.const$4.set(seg, x);
    }
    public static short LatestMiniVersion$get(MemorySegment seg, long index) {
        return (short)constants$2660.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void LatestMiniVersion$set(MemorySegment seg, long index, short x) {
        constants$2660.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

