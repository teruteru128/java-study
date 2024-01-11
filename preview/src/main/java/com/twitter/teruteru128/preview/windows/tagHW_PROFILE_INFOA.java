// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagHW_PROFILE_INFOA {
 *     DWORD dwDockInfo;
 *     CHAR szHwProfileGuid[39];
 *     CHAR szHwProfileName[80];
 * };
 * }
 */
public class tagHW_PROFILE_INFOA {

    public static MemoryLayout $LAYOUT() {
        return constants$839.const$5;
    }
    public static VarHandle dwDockInfo$VH() {
        return constants$840.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwDockInfo;
     * }
     */
    public static int dwDockInfo$get(MemorySegment seg) {
        return (int)constants$840.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwDockInfo;
     * }
     */
    public static void dwDockInfo$set(MemorySegment seg, int x) {
        constants$840.const$0.set(seg, x);
    }
    public static int dwDockInfo$get(MemorySegment seg, long index) {
        return (int)constants$840.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDockInfo$set(MemorySegment seg, long index, int x) {
        constants$840.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szHwProfileGuid$slice(MemorySegment seg) {
        return seg.asSlice(4, 39);
    }
    public static MemorySegment szHwProfileName$slice(MemorySegment seg) {
        return seg.asSlice(43, 80);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


