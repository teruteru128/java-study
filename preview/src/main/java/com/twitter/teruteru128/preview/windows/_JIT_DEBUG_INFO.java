// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JIT_DEBUG_INFO {
 *     DWORD dwSize;
 *     DWORD dwProcessorArchitecture;
 *     DWORD dwThreadID;
 *     DWORD dwReserved0;
 *     ULONG64 lpExceptionAddress;
 *     ULONG64 lpExceptionRecord;
 *     ULONG64 lpContextRecord;
 * };
 * }
 */
public class _JIT_DEBUG_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$753.const$0;
    }
    public static VarHandle dwSize$VH() {
        return constants$753.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static int dwSize$get(MemorySegment seg) {
        return (int)constants$753.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static void dwSize$set(MemorySegment seg, int x) {
        constants$753.const$1.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)constants$753.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        constants$753.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwProcessorArchitecture$VH() {
        return constants$753.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwProcessorArchitecture;
     * }
     */
    public static int dwProcessorArchitecture$get(MemorySegment seg) {
        return (int)constants$753.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwProcessorArchitecture;
     * }
     */
    public static void dwProcessorArchitecture$set(MemorySegment seg, int x) {
        constants$753.const$2.set(seg, x);
    }
    public static int dwProcessorArchitecture$get(MemorySegment seg, long index) {
        return (int)constants$753.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProcessorArchitecture$set(MemorySegment seg, long index, int x) {
        constants$753.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwThreadID$VH() {
        return constants$753.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwThreadID;
     * }
     */
    public static int dwThreadID$get(MemorySegment seg) {
        return (int)constants$753.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwThreadID;
     * }
     */
    public static void dwThreadID$set(MemorySegment seg, int x) {
        constants$753.const$3.set(seg, x);
    }
    public static int dwThreadID$get(MemorySegment seg, long index) {
        return (int)constants$753.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwThreadID$set(MemorySegment seg, long index, int x) {
        constants$753.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwReserved0$VH() {
        return constants$753.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReserved0;
     * }
     */
    public static int dwReserved0$get(MemorySegment seg) {
        return (int)constants$753.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReserved0;
     * }
     */
    public static void dwReserved0$set(MemorySegment seg, int x) {
        constants$753.const$4.set(seg, x);
    }
    public static int dwReserved0$get(MemorySegment seg, long index) {
        return (int)constants$753.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved0$set(MemorySegment seg, long index, int x) {
        constants$753.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpExceptionAddress$VH() {
        return constants$753.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 lpExceptionAddress;
     * }
     */
    public static long lpExceptionAddress$get(MemorySegment seg) {
        return (long)constants$753.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 lpExceptionAddress;
     * }
     */
    public static void lpExceptionAddress$set(MemorySegment seg, long x) {
        constants$753.const$5.set(seg, x);
    }
    public static long lpExceptionAddress$get(MemorySegment seg, long index) {
        return (long)constants$753.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lpExceptionAddress$set(MemorySegment seg, long index, long x) {
        constants$753.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpExceptionRecord$VH() {
        return constants$754.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 lpExceptionRecord;
     * }
     */
    public static long lpExceptionRecord$get(MemorySegment seg) {
        return (long)constants$754.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 lpExceptionRecord;
     * }
     */
    public static void lpExceptionRecord$set(MemorySegment seg, long x) {
        constants$754.const$0.set(seg, x);
    }
    public static long lpExceptionRecord$get(MemorySegment seg, long index) {
        return (long)constants$754.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpExceptionRecord$set(MemorySegment seg, long index, long x) {
        constants$754.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpContextRecord$VH() {
        return constants$754.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG64 lpContextRecord;
     * }
     */
    public static long lpContextRecord$get(MemorySegment seg) {
        return (long)constants$754.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG64 lpContextRecord;
     * }
     */
    public static void lpContextRecord$set(MemorySegment seg, long x) {
        constants$754.const$1.set(seg, x);
    }
    public static long lpContextRecord$get(MemorySegment seg, long index) {
        return (long)constants$754.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lpContextRecord$set(MemorySegment seg, long index, long x) {
        constants$754.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

