// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD MediumProductType;
 * };
 * }
 */
public class _STORAGE_MEDIUM_PRODUCT_TYPE_DESCRIPTOR {

    public static MemoryLayout $LAYOUT() {
        return constants$2392.const$0;
    }
    public static VarHandle Version$VH() {
        return constants$2392.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2392.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2392.const$1.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2392.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2392.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2392.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2392.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2392.const$2.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2392.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2392.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MediumProductType$VH() {
        return constants$2392.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MediumProductType;
     * }
     */
    public static int MediumProductType$get(MemorySegment seg) {
        return (int)constants$2392.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MediumProductType;
     * }
     */
    public static void MediumProductType$set(MemorySegment seg, int x) {
        constants$2392.const$3.set(seg, x);
    }
    public static int MediumProductType$get(MemorySegment seg, long index) {
        return (int)constants$2392.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void MediumProductType$set(MemorySegment seg, long index, int x) {
        constants$2392.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


