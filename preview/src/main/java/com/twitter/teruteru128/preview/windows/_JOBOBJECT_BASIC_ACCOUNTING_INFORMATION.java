// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION {
 *     LARGE_INTEGER TotalUserTime;
 *     LARGE_INTEGER TotalKernelTime;
 *     LARGE_INTEGER ThisPeriodTotalUserTime;
 *     LARGE_INTEGER ThisPeriodTotalKernelTime;
 *     DWORD TotalPageFaultCount;
 *     DWORD TotalProcesses;
 *     DWORD ActiveProcesses;
 *     DWORD TotalTerminatedProcesses;
 * };
 * }
 */
public class _JOBOBJECT_BASIC_ACCOUNTING_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$202.const$1;
    }
    public static MemorySegment TotalUserTime$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment TotalKernelTime$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment ThisPeriodTotalUserTime$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment ThisPeriodTotalKernelTime$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static VarHandle TotalPageFaultCount$VH() {
        return constants$202.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TotalPageFaultCount;
     * }
     */
    public static int TotalPageFaultCount$get(MemorySegment seg) {
        return (int)constants$202.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TotalPageFaultCount;
     * }
     */
    public static void TotalPageFaultCount$set(MemorySegment seg, int x) {
        constants$202.const$2.set(seg, x);
    }
    public static int TotalPageFaultCount$get(MemorySegment seg, long index) {
        return (int)constants$202.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalPageFaultCount$set(MemorySegment seg, long index, int x) {
        constants$202.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TotalProcesses$VH() {
        return constants$202.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TotalProcesses;
     * }
     */
    public static int TotalProcesses$get(MemorySegment seg) {
        return (int)constants$202.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TotalProcesses;
     * }
     */
    public static void TotalProcesses$set(MemorySegment seg, int x) {
        constants$202.const$3.set(seg, x);
    }
    public static int TotalProcesses$get(MemorySegment seg, long index) {
        return (int)constants$202.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalProcesses$set(MemorySegment seg, long index, int x) {
        constants$202.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ActiveProcesses$VH() {
        return constants$202.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ActiveProcesses;
     * }
     */
    public static int ActiveProcesses$get(MemorySegment seg) {
        return (int)constants$202.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ActiveProcesses;
     * }
     */
    public static void ActiveProcesses$set(MemorySegment seg, int x) {
        constants$202.const$4.set(seg, x);
    }
    public static int ActiveProcesses$get(MemorySegment seg, long index) {
        return (int)constants$202.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ActiveProcesses$set(MemorySegment seg, long index, int x) {
        constants$202.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TotalTerminatedProcesses$VH() {
        return constants$202.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TotalTerminatedProcesses;
     * }
     */
    public static int TotalTerminatedProcesses$get(MemorySegment seg) {
        return (int)constants$202.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TotalTerminatedProcesses;
     * }
     */
    public static void TotalTerminatedProcesses$set(MemorySegment seg, int x) {
        constants$202.const$5.set(seg, x);
    }
    public static int TotalTerminatedProcesses$get(MemorySegment seg, long index) {
        return (int)constants$202.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalTerminatedProcesses$set(MemorySegment seg, long index, int x) {
        constants$202.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


