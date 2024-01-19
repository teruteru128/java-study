// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _EXCEPTION_RECORD64 {
 *     DWORD ExceptionCode;
 *     DWORD ExceptionFlags;
 *     DWORD64 ExceptionRecord;
 *     DWORD64 ExceptionAddress;
 *     DWORD NumberParameters;
 *     DWORD __unusedAlignment;
 *     DWORD64 ExceptionInformation[15];
 * };
 * }
 */
public class _EXCEPTION_RECORD64 {

    public static MemoryLayout $LAYOUT() {
        return constants$137.const$4;
    }
    public static VarHandle ExceptionCode$VH() {
        return constants$137.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ExceptionCode;
     * }
     */
    public static int ExceptionCode$get(MemorySegment seg) {
        return (int)constants$137.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ExceptionCode;
     * }
     */
    public static void ExceptionCode$set(MemorySegment seg, int x) {
        constants$137.const$5.set(seg, x);
    }
    public static int ExceptionCode$get(MemorySegment seg, long index) {
        return (int)constants$137.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionCode$set(MemorySegment seg, long index, int x) {
        constants$137.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ExceptionFlags$VH() {
        return constants$138.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ExceptionFlags;
     * }
     */
    public static int ExceptionFlags$get(MemorySegment seg) {
        return (int)constants$138.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ExceptionFlags;
     * }
     */
    public static void ExceptionFlags$set(MemorySegment seg, int x) {
        constants$138.const$0.set(seg, x);
    }
    public static int ExceptionFlags$get(MemorySegment seg, long index) {
        return (int)constants$138.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionFlags$set(MemorySegment seg, long index, int x) {
        constants$138.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ExceptionRecord$VH() {
        return constants$138.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 ExceptionRecord;
     * }
     */
    public static long ExceptionRecord$get(MemorySegment seg) {
        return (long)constants$138.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 ExceptionRecord;
     * }
     */
    public static void ExceptionRecord$set(MemorySegment seg, long x) {
        constants$138.const$1.set(seg, x);
    }
    public static long ExceptionRecord$get(MemorySegment seg, long index) {
        return (long)constants$138.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionRecord$set(MemorySegment seg, long index, long x) {
        constants$138.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ExceptionAddress$VH() {
        return constants$138.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD64 ExceptionAddress;
     * }
     */
    public static long ExceptionAddress$get(MemorySegment seg) {
        return (long)constants$138.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD64 ExceptionAddress;
     * }
     */
    public static void ExceptionAddress$set(MemorySegment seg, long x) {
        constants$138.const$2.set(seg, x);
    }
    public static long ExceptionAddress$get(MemorySegment seg, long index) {
        return (long)constants$138.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionAddress$set(MemorySegment seg, long index, long x) {
        constants$138.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumberParameters$VH() {
        return constants$138.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberParameters;
     * }
     */
    public static int NumberParameters$get(MemorySegment seg) {
        return (int)constants$138.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberParameters;
     * }
     */
    public static void NumberParameters$set(MemorySegment seg, int x) {
        constants$138.const$3.set(seg, x);
    }
    public static int NumberParameters$get(MemorySegment seg, long index) {
        return (int)constants$138.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberParameters$set(MemorySegment seg, long index, int x) {
        constants$138.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __unusedAlignment$VH() {
        return constants$138.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD __unusedAlignment;
     * }
     */
    public static int __unusedAlignment$get(MemorySegment seg) {
        return (int)constants$138.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD __unusedAlignment;
     * }
     */
    public static void __unusedAlignment$set(MemorySegment seg, int x) {
        constants$138.const$4.set(seg, x);
    }
    public static int __unusedAlignment$get(MemorySegment seg, long index) {
        return (int)constants$138.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void __unusedAlignment$set(MemorySegment seg, long index, int x) {
        constants$138.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ExceptionInformation$slice(MemorySegment seg) {
        return seg.asSlice(32, 120);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

