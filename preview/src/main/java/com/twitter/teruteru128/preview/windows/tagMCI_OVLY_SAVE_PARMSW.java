// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMCI_OVLY_SAVE_PARMSW {
 *     DWORD_PTR dwCallback;
 *     LPCWSTR lpfilename;
 *     RECT rc;
 * };
 * }
 */
public class tagMCI_OVLY_SAVE_PARMSW {

    public static MemoryLayout $LAYOUT() {
        return constants$1590.const$1;
    }
    public static VarHandle dwCallback$VH() {
        return constants$1590.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static long dwCallback$get(MemorySegment seg) {
        return (long)constants$1590.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static void dwCallback$set(MemorySegment seg, long x) {
        constants$1590.const$2.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)constants$1590.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        constants$1590.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpfilename$VH() {
        return constants$1590.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpfilename;
     * }
     */
    public static MemorySegment lpfilename$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1590.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpfilename;
     * }
     */
    public static void lpfilename$set(MemorySegment seg, MemorySegment x) {
        constants$1590.const$3.set(seg, x);
    }
    public static MemorySegment lpfilename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1590.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfilename$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1590.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rc$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

