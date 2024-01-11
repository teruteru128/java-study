// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_JOBSET_INFORMATION {
 *     DWORD MemberLevel;
 * };
 * }
 */
public class _JOBOBJECT_JOBSET_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$208.const$0;
    }
    public static VarHandle MemberLevel$VH() {
        return constants$208.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD MemberLevel;
     * }
     */
    public static int MemberLevel$get(MemorySegment seg) {
        return (int)constants$208.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD MemberLevel;
     * }
     */
    public static void MemberLevel$set(MemorySegment seg, int x) {
        constants$208.const$1.set(seg, x);
    }
    public static int MemberLevel$get(MemorySegment seg, long index) {
        return (int)constants$208.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void MemberLevel$set(MemorySegment seg, long index, int x) {
        constants$208.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

