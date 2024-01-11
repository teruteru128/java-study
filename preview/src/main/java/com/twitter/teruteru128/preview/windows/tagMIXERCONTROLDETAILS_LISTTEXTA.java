// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMIXERCONTROLDETAILS_LISTTEXTA {
 *     DWORD dwParam1;
 *     DWORD dwParam2;
 *     CHAR szName[64];
 * };
 * }
 */
public class tagMIXERCONTROLDETAILS_LISTTEXTA {

    public static MemoryLayout $LAYOUT() {
        return constants$1677.const$1;
    }
    public static VarHandle dwParam1$VH() {
        return constants$1677.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwParam1;
     * }
     */
    public static int dwParam1$get(MemorySegment seg) {
        return (int)constants$1677.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwParam1;
     * }
     */
    public static void dwParam1$set(MemorySegment seg, int x) {
        constants$1677.const$2.set(seg, x);
    }
    public static int dwParam1$get(MemorySegment seg, long index) {
        return (int)constants$1677.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwParam1$set(MemorySegment seg, long index, int x) {
        constants$1677.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwParam2$VH() {
        return constants$1677.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwParam2;
     * }
     */
    public static int dwParam2$get(MemorySegment seg) {
        return (int)constants$1677.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwParam2;
     * }
     */
    public static void dwParam2$set(MemorySegment seg, int x) {
        constants$1677.const$3.set(seg, x);
    }
    public static int dwParam2$get(MemorySegment seg, long index) {
        return (int)constants$1677.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwParam2$set(MemorySegment seg, long index, int x) {
        constants$1677.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szName$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


