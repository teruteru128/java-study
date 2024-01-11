// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SYSTEM_RESOURCE_ATTRIBUTE_ACE {
 *     ACE_HEADER Header;
 *     ACCESS_MASK Mask;
 *     DWORD SidStart;
 * };
 * }
 */
public class _SYSTEM_RESOURCE_ATTRIBUTE_ACE {

    public static MemoryLayout $LAYOUT() {
        return constants$146.const$0;
    }
    public static MemorySegment Header$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static VarHandle Mask$VH() {
        return constants$146.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ACCESS_MASK Mask;
     * }
     */
    public static int Mask$get(MemorySegment seg) {
        return (int)constants$146.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ACCESS_MASK Mask;
     * }
     */
    public static void Mask$set(MemorySegment seg, int x) {
        constants$146.const$1.set(seg, x);
    }
    public static int Mask$get(MemorySegment seg, long index) {
        return (int)constants$146.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Mask$set(MemorySegment seg, long index, int x) {
        constants$146.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SidStart$VH() {
        return constants$146.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SidStart;
     * }
     */
    public static int SidStart$get(MemorySegment seg) {
        return (int)constants$146.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SidStart;
     * }
     */
    public static void SidStart$set(MemorySegment seg, int x) {
        constants$146.const$2.set(seg, x);
    }
    public static int SidStart$get(MemorySegment seg, long index) {
        return (int)constants$146.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SidStart$set(MemorySegment seg, long index, int x) {
        constants$146.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


