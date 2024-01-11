// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SHFILEOPSTRUCTA {
 *     HWND hwnd;
 *     UINT wFunc;
 *     PCZZSTR pFrom;
 *     PCZZSTR pTo;
 *     FILEOP_FLAGS fFlags;
 *     BOOL fAnyOperationsAborted;
 *     LPVOID hNameMappings;
 *     PCSTR lpszProgressTitle;
 * };
 * }
 */
public class _SHFILEOPSTRUCTA {

    public static MemoryLayout $LAYOUT() {
        return constants$1857.const$2;
    }
    public static VarHandle hwnd$VH() {
        return constants$1857.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static MemorySegment hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1857.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static void hwnd$set(MemorySegment seg, MemorySegment x) {
        constants$1857.const$3.set(seg, x);
    }
    public static MemorySegment hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1857.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1857.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wFunc$VH() {
        return constants$1857.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wFunc;
     * }
     */
    public static int wFunc$get(MemorySegment seg) {
        return (int)constants$1857.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wFunc;
     * }
     */
    public static void wFunc$set(MemorySegment seg, int x) {
        constants$1857.const$4.set(seg, x);
    }
    public static int wFunc$get(MemorySegment seg, long index) {
        return (int)constants$1857.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void wFunc$set(MemorySegment seg, long index, int x) {
        constants$1857.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pFrom$VH() {
        return constants$1857.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCZZSTR pFrom;
     * }
     */
    public static MemorySegment pFrom$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1857.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCZZSTR pFrom;
     * }
     */
    public static void pFrom$set(MemorySegment seg, MemorySegment x) {
        constants$1857.const$5.set(seg, x);
    }
    public static MemorySegment pFrom$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1857.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pFrom$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1857.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pTo$VH() {
        return constants$1858.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCZZSTR pTo;
     * }
     */
    public static MemorySegment pTo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1858.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCZZSTR pTo;
     * }
     */
    public static void pTo$set(MemorySegment seg, MemorySegment x) {
        constants$1858.const$0.set(seg, x);
    }
    public static MemorySegment pTo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1858.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pTo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1858.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fFlags$VH() {
        return constants$1858.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * FILEOP_FLAGS fFlags;
     * }
     */
    public static short fFlags$get(MemorySegment seg) {
        return (short)constants$1858.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * FILEOP_FLAGS fFlags;
     * }
     */
    public static void fFlags$set(MemorySegment seg, short x) {
        constants$1858.const$1.set(seg, x);
    }
    public static short fFlags$get(MemorySegment seg, long index) {
        return (short)constants$1858.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void fFlags$set(MemorySegment seg, long index, short x) {
        constants$1858.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fAnyOperationsAborted$VH() {
        return constants$1858.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fAnyOperationsAborted;
     * }
     */
    public static int fAnyOperationsAborted$get(MemorySegment seg) {
        return (int)constants$1858.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fAnyOperationsAborted;
     * }
     */
    public static void fAnyOperationsAborted$set(MemorySegment seg, int x) {
        constants$1858.const$2.set(seg, x);
    }
    public static int fAnyOperationsAborted$get(MemorySegment seg, long index) {
        return (int)constants$1858.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void fAnyOperationsAborted$set(MemorySegment seg, long index, int x) {
        constants$1858.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hNameMappings$VH() {
        return constants$1858.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID hNameMappings;
     * }
     */
    public static MemorySegment hNameMappings$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1858.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID hNameMappings;
     * }
     */
    public static void hNameMappings$set(MemorySegment seg, MemorySegment x) {
        constants$1858.const$3.set(seg, x);
    }
    public static MemorySegment hNameMappings$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1858.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hNameMappings$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1858.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpszProgressTitle$VH() {
        return constants$1858.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCSTR lpszProgressTitle;
     * }
     */
    public static MemorySegment lpszProgressTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1858.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCSTR lpszProgressTitle;
     * }
     */
    public static void lpszProgressTitle$set(MemorySegment seg, MemorySegment x) {
        constants$1858.const$4.set(seg, x);
    }
    public static MemorySegment lpszProgressTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1858.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszProgressTitle$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1858.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


