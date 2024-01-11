// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCHOOSECOLORW {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HWND hInstance;
 *     COLORREF rgbResult;
 *     COLORREF* lpCustColors;
 *     DWORD Flags;
 *     LPARAM lCustData;
 *     LPCCHOOKPROC lpfnHook;
 *     LPCWSTR lpTemplateName;
 * };
 * }
 */
public class tagCHOOSECOLORW {

    public static MemoryLayout $LAYOUT() {
        return constants$4435.const$0;
    }
    public static VarHandle lStructSize$VH() {
        return constants$4435.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static int lStructSize$get(MemorySegment seg) {
        return (int)constants$4435.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static void lStructSize$set(MemorySegment seg, int x) {
        constants$4435.const$1.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)constants$4435.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        constants$4435.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwndOwner$VH() {
        return constants$4435.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static MemorySegment hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4435.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static void hwndOwner$set(MemorySegment seg, MemorySegment x) {
        constants$4435.const$2.set(seg, x);
    }
    public static MemorySegment hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4435.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4435.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hInstance$VH() {
        return constants$4435.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hInstance;
     * }
     */
    public static MemorySegment hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4435.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hInstance;
     * }
     */
    public static void hInstance$set(MemorySegment seg, MemorySegment x) {
        constants$4435.const$3.set(seg, x);
    }
    public static MemorySegment hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4435.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4435.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgbResult$VH() {
        return constants$4435.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COLORREF rgbResult;
     * }
     */
    public static int rgbResult$get(MemorySegment seg) {
        return (int)constants$4435.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COLORREF rgbResult;
     * }
     */
    public static void rgbResult$set(MemorySegment seg, int x) {
        constants$4435.const$4.set(seg, x);
    }
    public static int rgbResult$get(MemorySegment seg, long index) {
        return (int)constants$4435.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void rgbResult$set(MemorySegment seg, long index, int x) {
        constants$4435.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpCustColors$VH() {
        return constants$4435.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COLORREF* lpCustColors;
     * }
     */
    public static MemorySegment lpCustColors$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4435.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COLORREF* lpCustColors;
     * }
     */
    public static void lpCustColors$set(MemorySegment seg, MemorySegment x) {
        constants$4435.const$5.set(seg, x);
    }
    public static MemorySegment lpCustColors$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4435.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCustColors$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4435.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$4436.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$4436.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$4436.const$0.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$4436.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$4436.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lCustData$VH() {
        return constants$4436.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static long lCustData$get(MemorySegment seg) {
        return (long)constants$4436.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static void lCustData$set(MemorySegment seg, long x) {
        constants$4436.const$1.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)constants$4436.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        constants$4436.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpfnHook$VH() {
        return constants$4436.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCCHOOKPROC lpfnHook;
     * }
     */
    public static MemorySegment lpfnHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4436.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCCHOOKPROC lpfnHook;
     * }
     */
    public static void lpfnHook$set(MemorySegment seg, MemorySegment x) {
        constants$4436.const$2.set(seg, x);
    }
    public static MemorySegment lpfnHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4436.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnHook$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4436.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPCCHOOKPROC lpfnHook(MemorySegment segment, Arena scope) {
        return LPCCHOOKPROC.ofAddress(lpfnHook$get(segment), scope);
    }
    public static VarHandle lpTemplateName$VH() {
        return constants$4436.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpTemplateName;
     * }
     */
    public static MemorySegment lpTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4436.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpTemplateName;
     * }
     */
    public static void lpTemplateName$set(MemorySegment seg, MemorySegment x) {
        constants$4436.const$3.set(seg, x);
    }
    public static MemorySegment lpTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4436.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTemplateName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4436.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


