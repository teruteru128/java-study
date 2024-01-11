// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagEMRSELECTCLIPPATH {
 *     EMR emr;
 *     DWORD iMode;
 * };
 * }
 */
public class tagEMRSELECTCLIPPATH {

    public static MemoryLayout $LAYOUT() {
        return constants$1073.const$4;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle iMode$VH() {
        return constants$1073.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iMode;
     * }
     */
    public static int iMode$get(MemorySegment seg) {
        return (int)constants$1073.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iMode;
     * }
     */
    public static void iMode$set(MemorySegment seg, int x) {
        constants$1073.const$5.set(seg, x);
    }
    public static int iMode$get(MemorySegment seg, long index) {
        return (int)constants$1073.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void iMode$set(MemorySegment seg, long index, int x) {
        constants$1073.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


