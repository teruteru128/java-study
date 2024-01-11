// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NT_TIB32 {
 *     DWORD ExceptionList;
 *     DWORD StackBase;
 *     DWORD StackLimit;
 *     DWORD SubSystemTib;
 *     union {
 *         DWORD FiberData;
 *         DWORD Version;
 *     };
 *     DWORD ArbitraryUserPointer;
 *     DWORD Self;
 * };
 * }
 */
public class _NT_TIB32 {

    public static MemoryLayout $LAYOUT() {
        return constants$185.const$3;
    }
    public static VarHandle ExceptionList$VH() {
        return constants$185.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ExceptionList;
     * }
     */
    public static int ExceptionList$get(MemorySegment seg) {
        return (int)constants$185.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ExceptionList;
     * }
     */
    public static void ExceptionList$set(MemorySegment seg, int x) {
        constants$185.const$4.set(seg, x);
    }
    public static int ExceptionList$get(MemorySegment seg, long index) {
        return (int)constants$185.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionList$set(MemorySegment seg, long index, int x) {
        constants$185.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle StackBase$VH() {
        return constants$185.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StackBase;
     * }
     */
    public static int StackBase$get(MemorySegment seg) {
        return (int)constants$185.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StackBase;
     * }
     */
    public static void StackBase$set(MemorySegment seg, int x) {
        constants$185.const$5.set(seg, x);
    }
    public static int StackBase$get(MemorySegment seg, long index) {
        return (int)constants$185.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void StackBase$set(MemorySegment seg, long index, int x) {
        constants$185.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle StackLimit$VH() {
        return constants$186.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StackLimit;
     * }
     */
    public static int StackLimit$get(MemorySegment seg) {
        return (int)constants$186.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StackLimit;
     * }
     */
    public static void StackLimit$set(MemorySegment seg, int x) {
        constants$186.const$0.set(seg, x);
    }
    public static int StackLimit$get(MemorySegment seg, long index) {
        return (int)constants$186.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void StackLimit$set(MemorySegment seg, long index, int x) {
        constants$186.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SubSystemTib$VH() {
        return constants$186.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SubSystemTib;
     * }
     */
    public static int SubSystemTib$get(MemorySegment seg) {
        return (int)constants$186.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SubSystemTib;
     * }
     */
    public static void SubSystemTib$set(MemorySegment seg, int x) {
        constants$186.const$1.set(seg, x);
    }
    public static int SubSystemTib$get(MemorySegment seg, long index) {
        return (int)constants$186.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void SubSystemTib$set(MemorySegment seg, long index, int x) {
        constants$186.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FiberData$VH() {
        return constants$186.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FiberData;
     * }
     */
    public static int FiberData$get(MemorySegment seg) {
        return (int)constants$186.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FiberData;
     * }
     */
    public static void FiberData$set(MemorySegment seg, int x) {
        constants$186.const$2.set(seg, x);
    }
    public static int FiberData$get(MemorySegment seg, long index) {
        return (int)constants$186.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void FiberData$set(MemorySegment seg, long index, int x) {
        constants$186.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Version$VH() {
        return constants$186.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$186.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$186.const$3.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$186.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$186.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ArbitraryUserPointer$VH() {
        return constants$186.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ArbitraryUserPointer;
     * }
     */
    public static int ArbitraryUserPointer$get(MemorySegment seg) {
        return (int)constants$186.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ArbitraryUserPointer;
     * }
     */
    public static void ArbitraryUserPointer$set(MemorySegment seg, int x) {
        constants$186.const$4.set(seg, x);
    }
    public static int ArbitraryUserPointer$get(MemorySegment seg, long index) {
        return (int)constants$186.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ArbitraryUserPointer$set(MemorySegment seg, long index, int x) {
        constants$186.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Self$VH() {
        return constants$186.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Self;
     * }
     */
    public static int Self$get(MemorySegment seg) {
        return (int)constants$186.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Self;
     * }
     */
    public static void Self$set(MemorySegment seg, int x) {
        constants$186.const$5.set(seg, x);
    }
    public static int Self$get(MemorySegment seg, long index) {
        return (int)constants$186.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Self$set(MemorySegment seg, long index, int x) {
        constants$186.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

