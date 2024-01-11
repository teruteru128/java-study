// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _KTMOBJECT_CURSOR {
 *     GUID LastQuery;
 *     DWORD ObjectIdCount;
 *     GUID ObjectIds[1];
 * };
 * }
 */
public class _KTMOBJECT_CURSOR {

    public static MemoryLayout $LAYOUT() {
        return constants$531.const$2;
    }
    public static MemorySegment LastQuery$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle ObjectIdCount$VH() {
        return constants$531.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ObjectIdCount;
     * }
     */
    public static int ObjectIdCount$get(MemorySegment seg) {
        return (int)constants$531.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ObjectIdCount;
     * }
     */
    public static void ObjectIdCount$set(MemorySegment seg, int x) {
        constants$531.const$3.set(seg, x);
    }
    public static int ObjectIdCount$get(MemorySegment seg, long index) {
        return (int)constants$531.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ObjectIdCount$set(MemorySegment seg, long index, int x) {
        constants$531.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ObjectIds$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

