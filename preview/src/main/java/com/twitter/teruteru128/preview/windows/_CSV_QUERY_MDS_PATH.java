// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CSV_QUERY_MDS_PATH {
 *     DWORD MdsNodeId;
 *     DWORD DsNodeId;
 *     DWORD PathLength;
 *     WCHAR Path[1];
 * };
 * }
 */
public class _CSV_QUERY_MDS_PATH {

    public static MemoryLayout $LAYOUT() {
        return constants$2682.const$5;
    }
    public static VarHandle MdsNodeId$VH() {
        return constants$2683.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MdsNodeId;
     * }
     */
    public static int MdsNodeId$get(MemorySegment seg) {
        return (int)constants$2683.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MdsNodeId;
     * }
     */
    public static void MdsNodeId$set(MemorySegment seg, int x) {
        constants$2683.const$0.set(seg, x);
    }
    public static int MdsNodeId$get(MemorySegment seg, long index) {
        return (int)constants$2683.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void MdsNodeId$set(MemorySegment seg, long index, int x) {
        constants$2683.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DsNodeId$VH() {
        return constants$2683.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DsNodeId;
     * }
     */
    public static int DsNodeId$get(MemorySegment seg) {
        return (int)constants$2683.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DsNodeId;
     * }
     */
    public static void DsNodeId$set(MemorySegment seg, int x) {
        constants$2683.const$1.set(seg, x);
    }
    public static int DsNodeId$get(MemorySegment seg, long index) {
        return (int)constants$2683.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void DsNodeId$set(MemorySegment seg, long index, int x) {
        constants$2683.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle PathLength$VH() {
        return constants$2683.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PathLength;
     * }
     */
    public static int PathLength$get(MemorySegment seg) {
        return (int)constants$2683.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PathLength;
     * }
     */
    public static void PathLength$set(MemorySegment seg, int x) {
        constants$2683.const$2.set(seg, x);
    }
    public static int PathLength$get(MemorySegment seg, long index) {
        return (int)constants$2683.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void PathLength$set(MemorySegment seg, long index, int x) {
        constants$2683.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Path$slice(MemorySegment seg) {
        return seg.asSlice(12, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

