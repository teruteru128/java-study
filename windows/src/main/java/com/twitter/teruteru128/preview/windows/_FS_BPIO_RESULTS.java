// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FS_BPIO_RESULTS {
 *     DWORD OpStatus;
 *     WORD FailingDriverNameLen;
 *     WCHAR FailingDriverName[32];
 *     WORD FailureReasonLen;
 *     WCHAR FailureReason[128];
 * };
 * }
 */
public class _FS_BPIO_RESULTS {

    public static MemoryLayout $LAYOUT() {
        return constants$2739.const$1;
    }
    public static VarHandle OpStatus$VH() {
        return constants$2739.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD OpStatus;
     * }
     */
    public static int OpStatus$get(MemorySegment seg) {
        return (int)constants$2739.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD OpStatus;
     * }
     */
    public static void OpStatus$set(MemorySegment seg, int x) {
        constants$2739.const$2.set(seg, x);
    }
    public static int OpStatus$get(MemorySegment seg, long index) {
        return (int)constants$2739.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void OpStatus$set(MemorySegment seg, long index, int x) {
        constants$2739.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FailingDriverNameLen$VH() {
        return constants$2739.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FailingDriverNameLen;
     * }
     */
    public static short FailingDriverNameLen$get(MemorySegment seg) {
        return (short)constants$2739.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FailingDriverNameLen;
     * }
     */
    public static void FailingDriverNameLen$set(MemorySegment seg, short x) {
        constants$2739.const$3.set(seg, x);
    }
    public static short FailingDriverNameLen$get(MemorySegment seg, long index) {
        return (short)constants$2739.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void FailingDriverNameLen$set(MemorySegment seg, long index, short x) {
        constants$2739.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FailingDriverName$slice(MemorySegment seg) {
        return seg.asSlice(6, 64);
    }
    public static VarHandle FailureReasonLen$VH() {
        return constants$2739.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FailureReasonLen;
     * }
     */
    public static short FailureReasonLen$get(MemorySegment seg) {
        return (short)constants$2739.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FailureReasonLen;
     * }
     */
    public static void FailureReasonLen$set(MemorySegment seg, short x) {
        constants$2739.const$4.set(seg, x);
    }
    public static short FailureReasonLen$get(MemorySegment seg, long index) {
        return (short)constants$2739.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void FailureReasonLen$set(MemorySegment seg, long index, short x) {
        constants$2739.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FailureReason$slice(MemorySegment seg) {
        return seg.asSlice(72, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

