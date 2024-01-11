// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PATHNAME_BUFFER {
 *     DWORD PathNameLength;
 *     WCHAR Name[1];
 * };
 * }
 */
public class _PATHNAME_BUFFER {

    public static MemoryLayout $LAYOUT() {
        return constants$2572.const$0;
    }
    public static VarHandle PathNameLength$VH() {
        return constants$2572.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD PathNameLength;
     * }
     */
    public static int PathNameLength$get(MemorySegment seg) {
        return (int)constants$2572.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD PathNameLength;
     * }
     */
    public static void PathNameLength$set(MemorySegment seg, int x) {
        constants$2572.const$1.set(seg, x);
    }
    public static int PathNameLength$get(MemorySegment seg, long index) {
        return (int)constants$2572.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void PathNameLength$set(MemorySegment seg, long index, int x) {
        constants$2572.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Name$slice(MemorySegment seg) {
        return seg.asSlice(4, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


