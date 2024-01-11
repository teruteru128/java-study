// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCONVCONTEXT {
 *     UINT cb;
 *     UINT wFlags;
 *     UINT wCountryID;
 *     int iCodePage;
 *     DWORD dwLangID;
 *     DWORD dwSecurity;
 *     SECURITY_QUALITY_OF_SERVICE qos;
 * };
 * }
 */
public class tagCONVCONTEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$1526.const$2;
    }
    public static VarHandle cb$VH() {
        return constants$1526.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT cb;
     * }
     */
    public static int cb$get(MemorySegment seg) {
        return (int)constants$1526.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT cb;
     * }
     */
    public static void cb$set(MemorySegment seg, int x) {
        constants$1526.const$3.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)constants$1526.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        constants$1526.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wFlags$VH() {
        return constants$1526.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wFlags;
     * }
     */
    public static int wFlags$get(MemorySegment seg) {
        return (int)constants$1526.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wFlags;
     * }
     */
    public static void wFlags$set(MemorySegment seg, int x) {
        constants$1526.const$4.set(seg, x);
    }
    public static int wFlags$get(MemorySegment seg, long index) {
        return (int)constants$1526.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void wFlags$set(MemorySegment seg, long index, int x) {
        constants$1526.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wCountryID$VH() {
        return constants$1526.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT wCountryID;
     * }
     */
    public static int wCountryID$get(MemorySegment seg) {
        return (int)constants$1526.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT wCountryID;
     * }
     */
    public static void wCountryID$set(MemorySegment seg, int x) {
        constants$1526.const$5.set(seg, x);
    }
    public static int wCountryID$get(MemorySegment seg, long index) {
        return (int)constants$1526.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void wCountryID$set(MemorySegment seg, long index, int x) {
        constants$1526.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iCodePage$VH() {
        return constants$1527.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int iCodePage;
     * }
     */
    public static int iCodePage$get(MemorySegment seg) {
        return (int)constants$1527.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int iCodePage;
     * }
     */
    public static void iCodePage$set(MemorySegment seg, int x) {
        constants$1527.const$0.set(seg, x);
    }
    public static int iCodePage$get(MemorySegment seg, long index) {
        return (int)constants$1527.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void iCodePage$set(MemorySegment seg, long index, int x) {
        constants$1527.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwLangID$VH() {
        return constants$1527.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwLangID;
     * }
     */
    public static int dwLangID$get(MemorySegment seg) {
        return (int)constants$1527.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwLangID;
     * }
     */
    public static void dwLangID$set(MemorySegment seg, int x) {
        constants$1527.const$1.set(seg, x);
    }
    public static int dwLangID$get(MemorySegment seg, long index) {
        return (int)constants$1527.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLangID$set(MemorySegment seg, long index, int x) {
        constants$1527.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSecurity$VH() {
        return constants$1527.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSecurity;
     * }
     */
    public static int dwSecurity$get(MemorySegment seg) {
        return (int)constants$1527.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSecurity;
     * }
     */
    public static void dwSecurity$set(MemorySegment seg, int x) {
        constants$1527.const$2.set(seg, x);
    }
    public static int dwSecurity$get(MemorySegment seg, long index) {
        return (int)constants$1527.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSecurity$set(MemorySegment seg, long index, int x) {
        constants$1527.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment qos$slice(MemorySegment seg) {
        return seg.asSlice(24, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


