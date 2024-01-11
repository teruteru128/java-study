// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _UNWIND_HISTORY_TABLE {
 *     DWORD Count;
 *     BYTE LocalHint;
 *     BYTE GlobalHint;
 *     BYTE Search;
 *     BYTE Once;
 *     ULONG_PTR LowAddress;
 *     ULONG_PTR HighAddress;
 *     UNWIND_HISTORY_TABLE_ENTRY Entry[12];
 * };
 * }
 */
public class _UNWIND_HISTORY_TABLE {

    public static MemoryLayout $LAYOUT() {
        return constants$465.const$4;
    }
    public static VarHandle Count$VH() {
        return constants$465.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static int Count$get(MemorySegment seg) {
        return (int)constants$465.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Count;
     * }
     */
    public static void Count$set(MemorySegment seg, int x) {
        constants$465.const$5.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)constants$465.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        constants$465.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LocalHint$VH() {
        return constants$466.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE LocalHint;
     * }
     */
    public static byte LocalHint$get(MemorySegment seg) {
        return (byte)constants$466.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE LocalHint;
     * }
     */
    public static void LocalHint$set(MemorySegment seg, byte x) {
        constants$466.const$0.set(seg, x);
    }
    public static byte LocalHint$get(MemorySegment seg, long index) {
        return (byte)constants$466.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void LocalHint$set(MemorySegment seg, long index, byte x) {
        constants$466.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle GlobalHint$VH() {
        return constants$466.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE GlobalHint;
     * }
     */
    public static byte GlobalHint$get(MemorySegment seg) {
        return (byte)constants$466.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE GlobalHint;
     * }
     */
    public static void GlobalHint$set(MemorySegment seg, byte x) {
        constants$466.const$1.set(seg, x);
    }
    public static byte GlobalHint$get(MemorySegment seg, long index) {
        return (byte)constants$466.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void GlobalHint$set(MemorySegment seg, long index, byte x) {
        constants$466.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Search$VH() {
        return constants$466.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Search;
     * }
     */
    public static byte Search$get(MemorySegment seg) {
        return (byte)constants$466.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Search;
     * }
     */
    public static void Search$set(MemorySegment seg, byte x) {
        constants$466.const$2.set(seg, x);
    }
    public static byte Search$get(MemorySegment seg, long index) {
        return (byte)constants$466.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Search$set(MemorySegment seg, long index, byte x) {
        constants$466.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Once$VH() {
        return constants$466.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE Once;
     * }
     */
    public static byte Once$get(MemorySegment seg) {
        return (byte)constants$466.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE Once;
     * }
     */
    public static void Once$set(MemorySegment seg, byte x) {
        constants$466.const$3.set(seg, x);
    }
    public static byte Once$get(MemorySegment seg, long index) {
        return (byte)constants$466.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Once$set(MemorySegment seg, long index, byte x) {
        constants$466.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle LowAddress$VH() {
        return constants$466.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR LowAddress;
     * }
     */
    public static long LowAddress$get(MemorySegment seg) {
        return (long)constants$466.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR LowAddress;
     * }
     */
    public static void LowAddress$set(MemorySegment seg, long x) {
        constants$466.const$4.set(seg, x);
    }
    public static long LowAddress$get(MemorySegment seg, long index) {
        return (long)constants$466.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void LowAddress$set(MemorySegment seg, long index, long x) {
        constants$466.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle HighAddress$VH() {
        return constants$466.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG_PTR HighAddress;
     * }
     */
    public static long HighAddress$get(MemorySegment seg) {
        return (long)constants$466.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG_PTR HighAddress;
     * }
     */
    public static void HighAddress$set(MemorySegment seg, long x) {
        constants$466.const$5.set(seg, x);
    }
    public static long HighAddress$get(MemorySegment seg, long index) {
        return (long)constants$466.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void HighAddress$set(MemorySegment seg, long index, long x) {
        constants$466.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Entry$slice(MemorySegment seg) {
        return seg.asSlice(24, 192);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


