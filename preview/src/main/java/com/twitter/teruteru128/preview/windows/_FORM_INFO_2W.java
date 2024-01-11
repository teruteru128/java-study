// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FORM_INFO_2W {
 *     DWORD Flags;
 *     LPCWSTR pName;
 *     SIZEL Size;
 *     RECTL ImageableArea;
 *     LPCSTR pKeyword;
 *     DWORD StringType;
 *     LPCWSTR pMuiDll;
 *     DWORD dwResourceId;
 *     LPCWSTR pDisplayName;
 *     LANGID wLangId;
 * };
 * }
 */
public class _FORM_INFO_2W {

    public static MemoryLayout $LAYOUT() {
        return constants$2889.const$1;
    }
    public static VarHandle Flags$VH() {
        return constants$2889.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$2889.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$2889.const$2.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$2889.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$2889.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pName$VH() {
        return constants$2889.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pName;
     * }
     */
    public static MemorySegment pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2889.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pName;
     * }
     */
    public static void pName$set(MemorySegment seg, MemorySegment x) {
        constants$2889.const$3.set(seg, x);
    }
    public static MemorySegment pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2889.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2889.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Size$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment ImageableArea$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static VarHandle pKeyword$VH() {
        return constants$2889.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR pKeyword;
     * }
     */
    public static MemorySegment pKeyword$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2889.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR pKeyword;
     * }
     */
    public static void pKeyword$set(MemorySegment seg, MemorySegment x) {
        constants$2889.const$4.set(seg, x);
    }
    public static MemorySegment pKeyword$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2889.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pKeyword$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2889.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle StringType$VH() {
        return constants$2889.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD StringType;
     * }
     */
    public static int StringType$get(MemorySegment seg) {
        return (int)constants$2889.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD StringType;
     * }
     */
    public static void StringType$set(MemorySegment seg, int x) {
        constants$2889.const$5.set(seg, x);
    }
    public static int StringType$get(MemorySegment seg, long index) {
        return (int)constants$2889.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void StringType$set(MemorySegment seg, long index, int x) {
        constants$2889.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pMuiDll$VH() {
        return constants$2890.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pMuiDll;
     * }
     */
    public static MemorySegment pMuiDll$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2890.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pMuiDll;
     * }
     */
    public static void pMuiDll$set(MemorySegment seg, MemorySegment x) {
        constants$2890.const$0.set(seg, x);
    }
    public static MemorySegment pMuiDll$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2890.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pMuiDll$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2890.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwResourceId$VH() {
        return constants$2890.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwResourceId;
     * }
     */
    public static int dwResourceId$get(MemorySegment seg) {
        return (int)constants$2890.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwResourceId;
     * }
     */
    public static void dwResourceId$set(MemorySegment seg, int x) {
        constants$2890.const$1.set(seg, x);
    }
    public static int dwResourceId$get(MemorySegment seg, long index) {
        return (int)constants$2890.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwResourceId$set(MemorySegment seg, long index, int x) {
        constants$2890.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDisplayName$VH() {
        return constants$2890.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pDisplayName;
     * }
     */
    public static MemorySegment pDisplayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2890.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pDisplayName;
     * }
     */
    public static void pDisplayName$set(MemorySegment seg, MemorySegment x) {
        constants$2890.const$2.set(seg, x);
    }
    public static MemorySegment pDisplayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2890.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pDisplayName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2890.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wLangId$VH() {
        return constants$2890.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LANGID wLangId;
     * }
     */
    public static short wLangId$get(MemorySegment seg) {
        return (short)constants$2890.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LANGID wLangId;
     * }
     */
    public static void wLangId$set(MemorySegment seg, short x) {
        constants$2890.const$3.set(seg, x);
    }
    public static short wLangId$get(MemorySegment seg, long index) {
        return (short)constants$2890.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wLangId$set(MemorySegment seg, long index, short x) {
        constants$2890.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


