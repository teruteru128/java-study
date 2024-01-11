// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagDRVCONFIGINFO {
 *     DWORD dwDCISize;
 *     LPCWSTR lpszDCISectionName;
 *     LPCWSTR lpszDCIAliasName;
 * };
 * }
 */
public class tagDRVCONFIGINFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1593.const$3;
    }
    public static VarHandle dwDCISize$VH() {
        return constants$1593.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwDCISize;
     * }
     */
    public static int dwDCISize$get(MemorySegment seg) {
        return (int)constants$1593.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwDCISize;
     * }
     */
    public static void dwDCISize$set(MemorySegment seg, int x) {
        constants$1593.const$4.set(seg, x);
    }
    public static int dwDCISize$get(MemorySegment seg, long index) {
        return (int)constants$1593.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDCISize$set(MemorySegment seg, long index, int x) {
        constants$1593.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpszDCISectionName$VH() {
        return constants$1593.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpszDCISectionName;
     * }
     */
    public static MemorySegment lpszDCISectionName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1593.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpszDCISectionName;
     * }
     */
    public static void lpszDCISectionName$set(MemorySegment seg, MemorySegment x) {
        constants$1593.const$5.set(seg, x);
    }
    public static MemorySegment lpszDCISectionName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1593.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszDCISectionName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1593.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpszDCIAliasName$VH() {
        return constants$1594.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpszDCIAliasName;
     * }
     */
    public static MemorySegment lpszDCIAliasName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1594.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpszDCIAliasName;
     * }
     */
    public static void lpszDCIAliasName$set(MemorySegment seg, MemorySegment x) {
        constants$1594.const$0.set(seg, x);
    }
    public static MemorySegment lpszDCIAliasName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1594.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszDCIAliasName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1594.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


