// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SID_AND_ATTRIBUTES_HASH {
 *     DWORD SidCount;
 *     PSID_AND_ATTRIBUTES SidAttr;
 *     SID_HASH_ENTRY Hash[32];
 * };
 * }
 */
public class _SID_AND_ATTRIBUTES_HASH {

    public static MemoryLayout $LAYOUT() {
        return constants$141.const$5;
    }
    public static VarHandle SidCount$VH() {
        return constants$142.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SidCount;
     * }
     */
    public static int SidCount$get(MemorySegment seg) {
        return (int)constants$142.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SidCount;
     * }
     */
    public static void SidCount$set(MemorySegment seg, int x) {
        constants$142.const$0.set(seg, x);
    }
    public static int SidCount$get(MemorySegment seg, long index) {
        return (int)constants$142.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void SidCount$set(MemorySegment seg, long index, int x) {
        constants$142.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SidAttr$VH() {
        return constants$142.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES SidAttr;
     * }
     */
    public static MemorySegment SidAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$142.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PSID_AND_ATTRIBUTES SidAttr;
     * }
     */
    public static void SidAttr$set(MemorySegment seg, MemorySegment x) {
        constants$142.const$1.set(seg, x);
    }
    public static MemorySegment SidAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$142.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void SidAttr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$142.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Hash$slice(MemorySegment seg) {
        return seg.asSlice(16, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

