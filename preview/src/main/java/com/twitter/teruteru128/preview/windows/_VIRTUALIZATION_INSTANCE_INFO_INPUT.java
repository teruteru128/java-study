// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _VIRTUALIZATION_INSTANCE_INFO_INPUT {
 *     DWORD NumberOfWorkerThreads;
 *     DWORD Flags;
 * };
 * }
 */
public class _VIRTUALIZATION_INSTANCE_INFO_INPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$2736.const$0;
    }
    public static VarHandle NumberOfWorkerThreads$VH() {
        return constants$2736.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfWorkerThreads;
     * }
     */
    public static int NumberOfWorkerThreads$get(MemorySegment seg) {
        return (int)constants$2736.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfWorkerThreads;
     * }
     */
    public static void NumberOfWorkerThreads$set(MemorySegment seg, int x) {
        constants$2736.const$1.set(seg, x);
    }
    public static int NumberOfWorkerThreads$get(MemorySegment seg, long index) {
        return (int)constants$2736.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfWorkerThreads$set(MemorySegment seg, long index, int x) {
        constants$2736.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$2736.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$2736.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$2736.const$2.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$2736.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$2736.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

