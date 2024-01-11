// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST {
 *     DWORD RequestLevel;
 *     DWORD RequestFlags;
 * };
 * }
 */
public class _STORAGE_QUERY_DEPENDENT_VOLUME_REQUEST {

    public static MemoryLayout $LAYOUT() {
        return constants$2666.const$4;
    }
    public static VarHandle RequestLevel$VH() {
        return constants$2666.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RequestLevel;
     * }
     */
    public static int RequestLevel$get(MemorySegment seg) {
        return (int)constants$2666.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RequestLevel;
     * }
     */
    public static void RequestLevel$set(MemorySegment seg, int x) {
        constants$2666.const$5.set(seg, x);
    }
    public static int RequestLevel$get(MemorySegment seg, long index) {
        return (int)constants$2666.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestLevel$set(MemorySegment seg, long index, int x) {
        constants$2666.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle RequestFlags$VH() {
        return constants$2667.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RequestFlags;
     * }
     */
    public static int RequestFlags$get(MemorySegment seg) {
        return (int)constants$2667.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RequestFlags;
     * }
     */
    public static void RequestFlags$set(MemorySegment seg, int x) {
        constants$2667.const$0.set(seg, x);
    }
    public static int RequestFlags$get(MemorySegment seg, long index) {
        return (int)constants$2667.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestFlags$set(MemorySegment seg, long index, int x) {
        constants$2667.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


