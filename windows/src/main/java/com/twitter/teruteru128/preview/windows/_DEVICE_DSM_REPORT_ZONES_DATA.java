// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICE_DSM_REPORT_ZONES_DATA {
 *     DWORD Size;
 *     DWORD ZoneCount;
 *     STORAGE_ZONES_ATTRIBUTES Attributes;
 *     DWORD Reserved0;
 *     STORAGE_ZONE_DESCRIPTOR ZoneDescriptors[1];
 * };
 * }
 */
public class _DEVICE_DSM_REPORT_ZONES_DATA {

    public static MemoryLayout $LAYOUT() {
        return constants$2460.const$3;
    }
    public static VarHandle Size$VH() {
        return constants$2460.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2460.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2460.const$4.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2460.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2460.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ZoneCount$VH() {
        return constants$2460.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ZoneCount;
     * }
     */
    public static int ZoneCount$get(MemorySegment seg) {
        return (int)constants$2460.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ZoneCount;
     * }
     */
    public static void ZoneCount$set(MemorySegment seg, int x) {
        constants$2460.const$5.set(seg, x);
    }
    public static int ZoneCount$get(MemorySegment seg, long index) {
        return (int)constants$2460.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ZoneCount$set(MemorySegment seg, long index, int x) {
        constants$2460.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Attributes$VH() {
        return constants$2461.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * STORAGE_ZONES_ATTRIBUTES Attributes;
     * }
     */
    public static int Attributes$get(MemorySegment seg) {
        return (int)constants$2461.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * STORAGE_ZONES_ATTRIBUTES Attributes;
     * }
     */
    public static void Attributes$set(MemorySegment seg, int x) {
        constants$2461.const$0.set(seg, x);
    }
    public static int Attributes$get(MemorySegment seg, long index) {
        return (int)constants$2461.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, int x) {
        constants$2461.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved0$VH() {
        return constants$2461.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved0;
     * }
     */
    public static int Reserved0$get(MemorySegment seg) {
        return (int)constants$2461.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved0;
     * }
     */
    public static void Reserved0$set(MemorySegment seg, int x) {
        constants$2461.const$1.set(seg, x);
    }
    public static int Reserved0$get(MemorySegment seg, long index) {
        return (int)constants$2461.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved0$set(MemorySegment seg, long index, int x) {
        constants$2461.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ZoneDescriptors$slice(MemorySegment seg) {
        return seg.asSlice(16, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

