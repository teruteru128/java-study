// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MEMORYSTATUSEX {
 *     DWORD dwLength;
 *     DWORD dwMemoryLoad;
 *     DWORDLONG ullTotalPhys;
 *     DWORDLONG ullAvailPhys;
 *     DWORDLONG ullTotalPageFile;
 *     DWORDLONG ullAvailPageFile;
 *     DWORDLONG ullTotalVirtual;
 *     DWORDLONG ullAvailVirtual;
 *     DWORDLONG ullAvailExtendedVirtual;
 * };
 * }
 */
public class _MEMORYSTATUSEX {

    public static MemoryLayout $LAYOUT() {
        return constants$662.const$2;
    }
    public static VarHandle dwLength$VH() {
        return constants$662.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwLength;
     * }
     */
    public static int dwLength$get(MemorySegment seg) {
        return (int)constants$662.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwLength;
     * }
     */
    public static void dwLength$set(MemorySegment seg, int x) {
        constants$662.const$3.set(seg, x);
    }
    public static int dwLength$get(MemorySegment seg, long index) {
        return (int)constants$662.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLength$set(MemorySegment seg, long index, int x) {
        constants$662.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwMemoryLoad$VH() {
        return constants$662.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMemoryLoad;
     * }
     */
    public static int dwMemoryLoad$get(MemorySegment seg) {
        return (int)constants$662.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMemoryLoad;
     * }
     */
    public static void dwMemoryLoad$set(MemorySegment seg, int x) {
        constants$662.const$4.set(seg, x);
    }
    public static int dwMemoryLoad$get(MemorySegment seg, long index) {
        return (int)constants$662.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMemoryLoad$set(MemorySegment seg, long index, int x) {
        constants$662.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ullTotalPhys$VH() {
        return constants$662.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG ullTotalPhys;
     * }
     */
    public static long ullTotalPhys$get(MemorySegment seg) {
        return (long)constants$662.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG ullTotalPhys;
     * }
     */
    public static void ullTotalPhys$set(MemorySegment seg, long x) {
        constants$662.const$5.set(seg, x);
    }
    public static long ullTotalPhys$get(MemorySegment seg, long index) {
        return (long)constants$662.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ullTotalPhys$set(MemorySegment seg, long index, long x) {
        constants$662.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ullAvailPhys$VH() {
        return constants$663.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG ullAvailPhys;
     * }
     */
    public static long ullAvailPhys$get(MemorySegment seg) {
        return (long)constants$663.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG ullAvailPhys;
     * }
     */
    public static void ullAvailPhys$set(MemorySegment seg, long x) {
        constants$663.const$0.set(seg, x);
    }
    public static long ullAvailPhys$get(MemorySegment seg, long index) {
        return (long)constants$663.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ullAvailPhys$set(MemorySegment seg, long index, long x) {
        constants$663.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ullTotalPageFile$VH() {
        return constants$663.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG ullTotalPageFile;
     * }
     */
    public static long ullTotalPageFile$get(MemorySegment seg) {
        return (long)constants$663.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG ullTotalPageFile;
     * }
     */
    public static void ullTotalPageFile$set(MemorySegment seg, long x) {
        constants$663.const$1.set(seg, x);
    }
    public static long ullTotalPageFile$get(MemorySegment seg, long index) {
        return (long)constants$663.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ullTotalPageFile$set(MemorySegment seg, long index, long x) {
        constants$663.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ullAvailPageFile$VH() {
        return constants$663.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG ullAvailPageFile;
     * }
     */
    public static long ullAvailPageFile$get(MemorySegment seg) {
        return (long)constants$663.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG ullAvailPageFile;
     * }
     */
    public static void ullAvailPageFile$set(MemorySegment seg, long x) {
        constants$663.const$2.set(seg, x);
    }
    public static long ullAvailPageFile$get(MemorySegment seg, long index) {
        return (long)constants$663.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ullAvailPageFile$set(MemorySegment seg, long index, long x) {
        constants$663.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ullTotalVirtual$VH() {
        return constants$663.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG ullTotalVirtual;
     * }
     */
    public static long ullTotalVirtual$get(MemorySegment seg) {
        return (long)constants$663.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG ullTotalVirtual;
     * }
     */
    public static void ullTotalVirtual$set(MemorySegment seg, long x) {
        constants$663.const$3.set(seg, x);
    }
    public static long ullTotalVirtual$get(MemorySegment seg, long index) {
        return (long)constants$663.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ullTotalVirtual$set(MemorySegment seg, long index, long x) {
        constants$663.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ullAvailVirtual$VH() {
        return constants$663.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG ullAvailVirtual;
     * }
     */
    public static long ullAvailVirtual$get(MemorySegment seg) {
        return (long)constants$663.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG ullAvailVirtual;
     * }
     */
    public static void ullAvailVirtual$set(MemorySegment seg, long x) {
        constants$663.const$4.set(seg, x);
    }
    public static long ullAvailVirtual$get(MemorySegment seg, long index) {
        return (long)constants$663.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ullAvailVirtual$set(MemorySegment seg, long index, long x) {
        constants$663.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ullAvailExtendedVirtual$VH() {
        return constants$663.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG ullAvailExtendedVirtual;
     * }
     */
    public static long ullAvailExtendedVirtual$get(MemorySegment seg) {
        return (long)constants$663.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG ullAvailExtendedVirtual;
     * }
     */
    public static void ullAvailExtendedVirtual$set(MemorySegment seg, long x) {
        constants$663.const$5.set(seg, x);
    }
    public static long ullAvailExtendedVirtual$get(MemorySegment seg, long index) {
        return (long)constants$663.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ullAvailExtendedVirtual$set(MemorySegment seg, long index, long x) {
        constants$663.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


