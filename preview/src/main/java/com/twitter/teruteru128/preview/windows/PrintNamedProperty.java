// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     WCHAR* propertyName;
 *     PrintPropertyValue propertyValue;
 * };
 * }
 */
public class PrintNamedProperty {

    public static MemoryLayout $LAYOUT() {
        return constants$2947.const$4;
    }
    public static VarHandle propertyName$VH() {
        return constants$2947.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WCHAR* propertyName;
     * }
     */
    public static MemorySegment propertyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2947.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WCHAR* propertyName;
     * }
     */
    public static void propertyName$set(MemorySegment seg, MemorySegment x) {
        constants$2947.const$5.set(seg, x);
    }
    public static MemorySegment propertyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2947.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void propertyName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2947.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment propertyValue$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

