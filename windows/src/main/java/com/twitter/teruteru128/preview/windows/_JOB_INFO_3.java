// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOB_INFO_3 {
 *     DWORD JobId;
 *     DWORD NextJobId;
 *     DWORD Reserved;
 * };
 * }
 */
public class _JOB_INFO_3 {

    public static MemoryLayout $LAYOUT() {
        return constants$2848.const$0;
    }
    public static VarHandle JobId$VH() {
        return constants$2848.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static int JobId$get(MemorySegment seg) {
        return (int)constants$2848.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD JobId;
     * }
     */
    public static void JobId$set(MemorySegment seg, int x) {
        constants$2848.const$1.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)constants$2848.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        constants$2848.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NextJobId$VH() {
        return constants$2848.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NextJobId;
     * }
     */
    public static int NextJobId$get(MemorySegment seg) {
        return (int)constants$2848.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NextJobId;
     * }
     */
    public static void NextJobId$set(MemorySegment seg, int x) {
        constants$2848.const$2.set(seg, x);
    }
    public static int NextJobId$get(MemorySegment seg, long index) {
        return (int)constants$2848.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void NextJobId$set(MemorySegment seg, long index, int x) {
        constants$2848.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$2848.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)constants$2848.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        constants$2848.const$3.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)constants$2848.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        constants$2848.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

