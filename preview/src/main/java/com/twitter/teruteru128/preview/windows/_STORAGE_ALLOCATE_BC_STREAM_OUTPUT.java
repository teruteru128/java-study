// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_ALLOCATE_BC_STREAM_OUTPUT {
 *     DWORDLONG RequestSize;
 *     DWORD NumOutStandingRequests;
 * };
 * }
 */
public class _STORAGE_ALLOCATE_BC_STREAM_OUTPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$2467.const$3;
    }
    public static VarHandle RequestSize$VH() {
        return constants$2467.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG RequestSize;
     * }
     */
    public static long RequestSize$get(MemorySegment seg) {
        return (long)constants$2467.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG RequestSize;
     * }
     */
    public static void RequestSize$set(MemorySegment seg, long x) {
        constants$2467.const$4.set(seg, x);
    }
    public static long RequestSize$get(MemorySegment seg, long index) {
        return (long)constants$2467.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestSize$set(MemorySegment seg, long index, long x) {
        constants$2467.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumOutStandingRequests$VH() {
        return constants$2467.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumOutStandingRequests;
     * }
     */
    public static int NumOutStandingRequests$get(MemorySegment seg) {
        return (int)constants$2467.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumOutStandingRequests;
     * }
     */
    public static void NumOutStandingRequests$set(MemorySegment seg, int x) {
        constants$2467.const$5.set(seg, x);
    }
    public static int NumOutStandingRequests$get(MemorySegment seg, long index) {
        return (int)constants$2467.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void NumOutStandingRequests$set(MemorySegment seg, long index, int x) {
        constants$2467.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

