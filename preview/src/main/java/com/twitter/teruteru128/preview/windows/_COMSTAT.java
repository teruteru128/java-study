// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _COMSTAT {
 *      *     DWORD fCtsHold;
 *     DWORD fDsrHold;
 *     DWORD fRlsdHold;
 *     DWORD fXoffHold;
 *     DWORD fXoffSent;
 *     DWORD fEof;
 *     DWORD fTxim;
 *     DWORD fReserved;
 *     DWORD cbInQue;
 *     DWORD cbOutQue;
 * };
 * }
 */
public class _COMSTAT {

    public static MemoryLayout $LAYOUT() {
        return constants$746.const$2;
    }
    public static VarHandle cbInQue$VH() {
        return constants$746.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbInQue;
     * }
     */
    public static int cbInQue$get(MemorySegment seg) {
        return (int)constants$746.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbInQue;
     * }
     */
    public static void cbInQue$set(MemorySegment seg, int x) {
        constants$746.const$3.set(seg, x);
    }
    public static int cbInQue$get(MemorySegment seg, long index) {
        return (int)constants$746.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbInQue$set(MemorySegment seg, long index, int x) {
        constants$746.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbOutQue$VH() {
        return constants$746.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbOutQue;
     * }
     */
    public static int cbOutQue$get(MemorySegment seg) {
        return (int)constants$746.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbOutQue;
     * }
     */
    public static void cbOutQue$set(MemorySegment seg, int x) {
        constants$746.const$4.set(seg, x);
    }
    public static int cbOutQue$get(MemorySegment seg, long index) {
        return (int)constants$746.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbOutQue$set(MemorySegment seg, long index, int x) {
        constants$746.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

