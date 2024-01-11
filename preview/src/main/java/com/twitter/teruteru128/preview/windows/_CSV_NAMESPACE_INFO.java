// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CSV_NAMESPACE_INFO {
 *     DWORD Version;
 *     DWORD DeviceNumber;
 *     LARGE_INTEGER StartingOffset;
 *     DWORD SectorSize;
 * };
 * }
 */
public class _CSV_NAMESPACE_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2680.const$3;
    }
    public static VarHandle Version$VH() {
        return constants$2680.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2680.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2680.const$4.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2680.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2680.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DeviceNumber$VH() {
        return constants$2680.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DeviceNumber;
     * }
     */
    public static int DeviceNumber$get(MemorySegment seg) {
        return (int)constants$2680.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DeviceNumber;
     * }
     */
    public static void DeviceNumber$set(MemorySegment seg, int x) {
        constants$2680.const$5.set(seg, x);
    }
    public static int DeviceNumber$get(MemorySegment seg, long index) {
        return (int)constants$2680.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceNumber$set(MemorySegment seg, long index, int x) {
        constants$2680.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StartingOffset$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static VarHandle SectorSize$VH() {
        return constants$2681.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SectorSize;
     * }
     */
    public static int SectorSize$get(MemorySegment seg) {
        return (int)constants$2681.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SectorSize;
     * }
     */
    public static void SectorSize$set(MemorySegment seg, int x) {
        constants$2681.const$0.set(seg, x);
    }
    public static int SectorSize$get(MemorySegment seg, long index) {
        return (int)constants$2681.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SectorSize$set(MemorySegment seg, long index, int x) {
        constants$2681.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


