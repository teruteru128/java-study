// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _cl_name_version_khr {
 *     cl_version_khr version;
 *     char name[64];
 * };
 * }
 */
public class _cl_name_version_khr {

    public static MemoryLayout $LAYOUT() {
        return constants$234.const$1;
    }
    public static VarHandle version$VH() {
        return constants$234.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * cl_version_khr version;
     * }
     */
    public static int version$get(MemorySegment seg) {
        return (int)constants$234.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * cl_version_khr version;
     * }
     */
    public static void version$set(MemorySegment seg, int x) {
        constants$234.const$2.set(seg, x);
    }
    public static int version$get(MemorySegment seg, long index) {
        return (int)constants$234.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void version$set(MemorySegment seg, long index, int x) {
        constants$234.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment name$slice(MemorySegment seg) {
        return seg.asSlice(4, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

