// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     HANDLE FileHandle;
 *     LARGE_INTEGER StartingVcn;
 *     LARGE_INTEGER StartingLcn;
 *     DWORD ClusterCount;
 * };
 * }
 */
public class MOVE_FILE_DATA {

    public static MemoryLayout $LAYOUT() {
        return constants$2579.const$1;
    }
    public static VarHandle FileHandle$VH() {
        return constants$2579.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE FileHandle;
     * }
     */
    public static MemorySegment FileHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2579.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE FileHandle;
     * }
     */
    public static void FileHandle$set(MemorySegment seg, MemorySegment x) {
        constants$2579.const$2.set(seg, x);
    }
    public static MemorySegment FileHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2579.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void FileHandle$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2579.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StartingVcn$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment StartingLcn$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static VarHandle ClusterCount$VH() {
        return constants$2579.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ClusterCount;
     * }
     */
    public static int ClusterCount$get(MemorySegment seg) {
        return (int)constants$2579.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ClusterCount;
     * }
     */
    public static void ClusterCount$set(MemorySegment seg, int x) {
        constants$2579.const$3.set(seg, x);
    }
    public static int ClusterCount$get(MemorySegment seg, long index) {
        return (int)constants$2579.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ClusterCount$set(MemorySegment seg, long index, int x) {
        constants$2579.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

