// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TOKEN_PRIMARY_GROUP {
 *     PSID PrimaryGroup;
 * };
 * }
 */
public class _TOKEN_PRIMARY_GROUP {

    public static MemoryLayout $LAYOUT() {
        return constants$166.const$0;
    }
    public static VarHandle PrimaryGroup$VH() {
        return constants$166.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID PrimaryGroup;
     * }
     */
    public static MemorySegment PrimaryGroup$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$166.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID PrimaryGroup;
     * }
     */
    public static void PrimaryGroup$set(MemorySegment seg, MemorySegment x) {
        constants$166.const$1.set(seg, x);
    }
    public static MemorySegment PrimaryGroup$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$166.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void PrimaryGroup$set(MemorySegment seg, long index, MemorySegment x) {
        constants$166.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


