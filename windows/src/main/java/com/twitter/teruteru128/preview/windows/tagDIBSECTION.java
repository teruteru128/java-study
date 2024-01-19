// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDIBSECTION {
 *     BITMAP dsBm;
 *     BITMAPINFOHEADER dsBmih;
 *     DWORD dsBitfields[3];
 *     HANDLE dshSection;
 *     DWORD dsOffset;
 * };
 * }
 */
public class tagDIBSECTION {

    public static MemoryLayout $LAYOUT() {
        return constants$1049.const$3;
    }
    public static MemorySegment dsBm$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static MemorySegment dsBmih$slice(MemorySegment seg) {
        return seg.asSlice(32, 40);
    }
    public static MemorySegment dsBitfields$slice(MemorySegment seg) {
        return seg.asSlice(72, 12);
    }
    public static VarHandle dshSection$VH() {
        return constants$1049.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE dshSection;
     * }
     */
    public static MemorySegment dshSection$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1049.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE dshSection;
     * }
     */
    public static void dshSection$set(MemorySegment seg, MemorySegment x) {
        constants$1049.const$4.set(seg, x);
    }
    public static MemorySegment dshSection$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1049.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dshSection$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1049.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dsOffset$VH() {
        return constants$1049.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dsOffset;
     * }
     */
    public static int dsOffset$get(MemorySegment seg) {
        return (int)constants$1049.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dsOffset;
     * }
     */
    public static void dsOffset$set(MemorySegment seg, int x) {
        constants$1049.const$5.set(seg, x);
    }
    public static int dsOffset$get(MemorySegment seg, long index) {
        return (int)constants$1049.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dsOffset$set(MemorySegment seg, long index, int x) {
        constants$1049.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

