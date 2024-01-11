// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     LPCWSTR szReader;
 *     LPVOID pvUserData;
 *     DWORD dwCurrentState;
 *     DWORD dwEventState;
 *     DWORD cbAtr;
 *     BYTE rgbAtr[36];
 * };
 * }
 */
public class SCARD_READERSTATEW {

    public static MemoryLayout $LAYOUT() {
        return constants$2753.const$2;
    }
    public static VarHandle szReader$VH() {
        return constants$2754.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR szReader;
     * }
     */
    public static MemorySegment szReader$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2754.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR szReader;
     * }
     */
    public static void szReader$set(MemorySegment seg, MemorySegment x) {
        constants$2754.const$2.set(seg, x);
    }
    public static MemorySegment szReader$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2754.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void szReader$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2754.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pvUserData$VH() {
        return constants$2754.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID pvUserData;
     * }
     */
    public static MemorySegment pvUserData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2754.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID pvUserData;
     * }
     */
    public static void pvUserData$set(MemorySegment seg, MemorySegment x) {
        constants$2754.const$3.set(seg, x);
    }
    public static MemorySegment pvUserData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2754.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUserData$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2754.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCurrentState$VH() {
        return constants$2754.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCurrentState;
     * }
     */
    public static int dwCurrentState$get(MemorySegment seg) {
        return (int)constants$2754.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCurrentState;
     * }
     */
    public static void dwCurrentState$set(MemorySegment seg, int x) {
        constants$2754.const$4.set(seg, x);
    }
    public static int dwCurrentState$get(MemorySegment seg, long index) {
        return (int)constants$2754.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCurrentState$set(MemorySegment seg, long index, int x) {
        constants$2754.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwEventState$VH() {
        return constants$2754.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwEventState;
     * }
     */
    public static int dwEventState$get(MemorySegment seg) {
        return (int)constants$2754.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwEventState;
     * }
     */
    public static void dwEventState$set(MemorySegment seg, int x) {
        constants$2754.const$5.set(seg, x);
    }
    public static int dwEventState$get(MemorySegment seg, long index) {
        return (int)constants$2754.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEventState$set(MemorySegment seg, long index, int x) {
        constants$2754.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbAtr$VH() {
        return constants$2755.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbAtr;
     * }
     */
    public static int cbAtr$get(MemorySegment seg) {
        return (int)constants$2755.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbAtr;
     * }
     */
    public static void cbAtr$set(MemorySegment seg, int x) {
        constants$2755.const$0.set(seg, x);
    }
    public static int cbAtr$get(MemorySegment seg, long index) {
        return (int)constants$2755.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAtr$set(MemorySegment seg, long index, int x) {
        constants$2755.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgbAtr$slice(MemorySegment seg) {
        return seg.asSlice(28, 36);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


