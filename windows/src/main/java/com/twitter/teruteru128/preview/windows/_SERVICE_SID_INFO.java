// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SERVICE_SID_INFO {
 *     DWORD dwServiceSidType;
 * };
 * }
 */
public class _SERVICE_SID_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$4482.const$3;
    }
    public static VarHandle dwServiceSidType$VH() {
        return constants$4482.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwServiceSidType;
     * }
     */
    public static int dwServiceSidType$get(MemorySegment seg) {
        return (int)constants$4482.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwServiceSidType;
     * }
     */
    public static void dwServiceSidType$set(MemorySegment seg, int x) {
        constants$4482.const$4.set(seg, x);
    }
    public static int dwServiceSidType$get(MemorySegment seg, long index) {
        return (int)constants$4482.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwServiceSidType$set(MemorySegment seg, long index, int x) {
        constants$4482.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

