// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PHYSICAL_ELEMENT_STATUS {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD DescriptorCount;
 *     DWORD ReturnedDescriptorCount;
 *     DWORD ElementIdentifierBeingDepoped;
 *     DWORD Reserved;
 *     PHYSICAL_ELEMENT_STATUS_DESCRIPTOR Descriptors[1];
 * };
 * }
 */
public class _PHYSICAL_ELEMENT_STATUS {

    public static MemoryLayout $LAYOUT() {
        return constants$2472.const$2;
    }
    public static VarHandle Version$VH() {
        return constants$2472.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2472.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2472.const$3.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2472.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2472.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2472.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2472.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2472.const$4.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2472.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2472.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DescriptorCount$VH() {
        return constants$2472.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DescriptorCount;
     * }
     */
    public static int DescriptorCount$get(MemorySegment seg) {
        return (int)constants$2472.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DescriptorCount;
     * }
     */
    public static void DescriptorCount$set(MemorySegment seg, int x) {
        constants$2472.const$5.set(seg, x);
    }
    public static int DescriptorCount$get(MemorySegment seg, long index) {
        return (int)constants$2472.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void DescriptorCount$set(MemorySegment seg, long index, int x) {
        constants$2472.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ReturnedDescriptorCount$VH() {
        return constants$2473.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ReturnedDescriptorCount;
     * }
     */
    public static int ReturnedDescriptorCount$get(MemorySegment seg) {
        return (int)constants$2473.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ReturnedDescriptorCount;
     * }
     */
    public static void ReturnedDescriptorCount$set(MemorySegment seg, int x) {
        constants$2473.const$0.set(seg, x);
    }
    public static int ReturnedDescriptorCount$get(MemorySegment seg, long index) {
        return (int)constants$2473.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ReturnedDescriptorCount$set(MemorySegment seg, long index, int x) {
        constants$2473.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ElementIdentifierBeingDepoped$VH() {
        return constants$2473.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ElementIdentifierBeingDepoped;
     * }
     */
    public static int ElementIdentifierBeingDepoped$get(MemorySegment seg) {
        return (int)constants$2473.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ElementIdentifierBeingDepoped;
     * }
     */
    public static void ElementIdentifierBeingDepoped$set(MemorySegment seg, int x) {
        constants$2473.const$1.set(seg, x);
    }
    public static int ElementIdentifierBeingDepoped$get(MemorySegment seg, long index) {
        return (int)constants$2473.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ElementIdentifierBeingDepoped$set(MemorySegment seg, long index, int x) {
        constants$2473.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$2473.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)constants$2473.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        constants$2473.const$2.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)constants$2473.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        constants$2473.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Descriptors$slice(MemorySegment seg) {
        return seg.asSlice(24, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


