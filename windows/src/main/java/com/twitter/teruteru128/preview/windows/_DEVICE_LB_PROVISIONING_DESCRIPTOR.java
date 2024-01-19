// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_LB_PROVISIONING_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *      *     BYTE ThinProvisioningEnabled;
 *     BYTE ThinProvisioningReadZeros;
 *     BYTE AnchorSupported;
 *     BYTE UnmapGranularityAlignmentValid;
 *     BYTE GetFreeSpaceSupported;
 *     BYTE MapSupported;
 *     BYTE Reserved1[7];
 *     DWORDLONG OptimalUnmapGranularity;
 *     DWORDLONG UnmapGranularityAlignment;
 *     DWORD MaxUnmapLbaCount;
 *     DWORD MaxUnmapBlockDescriptorCount;
 * };
 * }
 */
public class _DEVICE_LB_PROVISIONING_DESCRIPTOR {

    public static MemoryLayout $LAYOUT() {
        return constants$2398.const$1;
    }
    public static VarHandle Version$VH() {
        return constants$2398.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2398.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2398.const$2.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2398.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2398.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2398.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2398.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2398.const$3.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2398.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2398.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved1$slice(MemorySegment seg) {
        return seg.asSlice(9, 7);
    }
    public static VarHandle OptimalUnmapGranularity$VH() {
        return constants$2398.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG OptimalUnmapGranularity;
     * }
     */
    public static long OptimalUnmapGranularity$get(MemorySegment seg) {
        return (long)constants$2398.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG OptimalUnmapGranularity;
     * }
     */
    public static void OptimalUnmapGranularity$set(MemorySegment seg, long x) {
        constants$2398.const$4.set(seg, x);
    }
    public static long OptimalUnmapGranularity$get(MemorySegment seg, long index) {
        return (long)constants$2398.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void OptimalUnmapGranularity$set(MemorySegment seg, long index, long x) {
        constants$2398.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UnmapGranularityAlignment$VH() {
        return constants$2398.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UnmapGranularityAlignment;
     * }
     */
    public static long UnmapGranularityAlignment$get(MemorySegment seg) {
        return (long)constants$2398.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UnmapGranularityAlignment;
     * }
     */
    public static void UnmapGranularityAlignment$set(MemorySegment seg, long x) {
        constants$2398.const$5.set(seg, x);
    }
    public static long UnmapGranularityAlignment$get(MemorySegment seg, long index) {
        return (long)constants$2398.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void UnmapGranularityAlignment$set(MemorySegment seg, long index, long x) {
        constants$2398.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxUnmapLbaCount$VH() {
        return constants$2399.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxUnmapLbaCount;
     * }
     */
    public static int MaxUnmapLbaCount$get(MemorySegment seg) {
        return (int)constants$2399.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxUnmapLbaCount;
     * }
     */
    public static void MaxUnmapLbaCount$set(MemorySegment seg, int x) {
        constants$2399.const$0.set(seg, x);
    }
    public static int MaxUnmapLbaCount$get(MemorySegment seg, long index) {
        return (int)constants$2399.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxUnmapLbaCount$set(MemorySegment seg, long index, int x) {
        constants$2399.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxUnmapBlockDescriptorCount$VH() {
        return constants$2399.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MaxUnmapBlockDescriptorCount;
     * }
     */
    public static int MaxUnmapBlockDescriptorCount$get(MemorySegment seg) {
        return (int)constants$2399.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MaxUnmapBlockDescriptorCount;
     * }
     */
    public static void MaxUnmapBlockDescriptorCount$set(MemorySegment seg, int x) {
        constants$2399.const$1.set(seg, x);
    }
    public static int MaxUnmapBlockDescriptorCount$get(MemorySegment seg, long index) {
        return (int)constants$2399.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxUnmapBlockDescriptorCount$set(MemorySegment seg, long index, int x) {
        constants$2399.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

