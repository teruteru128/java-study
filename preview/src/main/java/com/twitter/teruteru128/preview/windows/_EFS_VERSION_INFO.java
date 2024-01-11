// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _EFS_VERSION_INFO {
 *     DWORD EfsVersion;
 *     DWORD SubVersion;
 * };
 * }
 */
public class _EFS_VERSION_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2250.const$3;
    }
    public static VarHandle EfsVersion$VH() {
        return constants$2250.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD EfsVersion;
     * }
     */
    public static int EfsVersion$get(MemorySegment seg) {
        return (int)constants$2250.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD EfsVersion;
     * }
     */
    public static void EfsVersion$set(MemorySegment seg, int x) {
        constants$2250.const$4.set(seg, x);
    }
    public static int EfsVersion$get(MemorySegment seg, long index) {
        return (int)constants$2250.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void EfsVersion$set(MemorySegment seg, long index, int x) {
        constants$2250.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SubVersion$VH() {
        return constants$2250.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SubVersion;
     * }
     */
    public static int SubVersion$get(MemorySegment seg) {
        return (int)constants$2250.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SubVersion;
     * }
     */
    public static void SubVersion$set(MemorySegment seg, int x) {
        constants$2250.const$5.set(seg, x);
    }
    public static int SubVersion$get(MemorySegment seg, long index) {
        return (int)constants$2250.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void SubVersion$set(MemorySegment seg, long index, int x) {
        constants$2250.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


