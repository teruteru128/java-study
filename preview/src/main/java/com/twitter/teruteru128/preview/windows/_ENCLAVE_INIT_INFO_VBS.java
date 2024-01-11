// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ENCLAVE_INIT_INFO_VBS {
 *     DWORD Length;
 *     DWORD ThreadCount;
 * };
 * }
 */
public class _ENCLAVE_INIT_INFO_VBS {

    public static MemoryLayout $LAYOUT() {
        return constants$249.const$5;
    }
    public static VarHandle Length$VH() {
        return constants$250.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static int Length$get(MemorySegment seg) {
        return (int)constants$250.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Length;
     * }
     */
    public static void Length$set(MemorySegment seg, int x) {
        constants$250.const$0.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)constants$250.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        constants$250.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ThreadCount$VH() {
        return constants$250.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ThreadCount;
     * }
     */
    public static int ThreadCount$get(MemorySegment seg) {
        return (int)constants$250.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ThreadCount;
     * }
     */
    public static void ThreadCount$set(MemorySegment seg, int x) {
        constants$250.const$1.set(seg, x);
    }
    public static int ThreadCount$get(MemorySegment seg, long index) {
        return (int)constants$250.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ThreadCount$set(MemorySegment seg, long index, int x) {
        constants$250.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


