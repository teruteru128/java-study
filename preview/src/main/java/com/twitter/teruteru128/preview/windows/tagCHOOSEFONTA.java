// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagCHOOSEFONTA {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HDC hDC;
 *     LPLOGFONTA lpLogFont;
 *     INT iPointSize;
 *     DWORD Flags;
 *     COLORREF rgbColors;
 *     LPARAM lCustData;
 *     LPCFHOOKPROC lpfnHook;
 *     LPCSTR lpTemplateName;
 *     HINSTANCE hInstance;
 *     LPSTR lpszStyle;
 *     WORD nFontType;
 *     WORD ___MISSING_ALIGNMENT__;
 *     INT nSizeMin;
 *     INT nSizeMax;
 * };
 * }
 */
public class tagCHOOSEFONTA {

    public static MemoryLayout $LAYOUT() {
        return constants$4442.const$0;
    }
    public static VarHandle lStructSize$VH() {
        return constants$4442.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static int lStructSize$get(MemorySegment seg) {
        return (int)constants$4442.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static void lStructSize$set(MemorySegment seg, int x) {
        constants$4442.const$1.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)constants$4442.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        constants$4442.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwndOwner$VH() {
        return constants$4442.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static MemorySegment hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4442.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static void hwndOwner$set(MemorySegment seg, MemorySegment x) {
        constants$4442.const$2.set(seg, x);
    }
    public static MemorySegment hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4442.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4442.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hDC$VH() {
        return constants$4442.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HDC hDC;
     * }
     */
    public static MemorySegment hDC$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4442.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HDC hDC;
     * }
     */
    public static void hDC$set(MemorySegment seg, MemorySegment x) {
        constants$4442.const$3.set(seg, x);
    }
    public static MemorySegment hDC$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4442.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hDC$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4442.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpLogFont$VH() {
        return constants$4442.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPLOGFONTA lpLogFont;
     * }
     */
    public static MemorySegment lpLogFont$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4442.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPLOGFONTA lpLogFont;
     * }
     */
    public static void lpLogFont$set(MemorySegment seg, MemorySegment x) {
        constants$4442.const$4.set(seg, x);
    }
    public static MemorySegment lpLogFont$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4442.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void lpLogFont$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4442.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iPointSize$VH() {
        return constants$4442.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT iPointSize;
     * }
     */
    public static int iPointSize$get(MemorySegment seg) {
        return (int)constants$4442.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT iPointSize;
     * }
     */
    public static void iPointSize$set(MemorySegment seg, int x) {
        constants$4442.const$5.set(seg, x);
    }
    public static int iPointSize$get(MemorySegment seg, long index) {
        return (int)constants$4442.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void iPointSize$set(MemorySegment seg, long index, int x) {
        constants$4442.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$4443.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$4443.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$4443.const$0.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$4443.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$4443.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgbColors$VH() {
        return constants$4443.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * COLORREF rgbColors;
     * }
     */
    public static int rgbColors$get(MemorySegment seg) {
        return (int)constants$4443.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * COLORREF rgbColors;
     * }
     */
    public static void rgbColors$set(MemorySegment seg, int x) {
        constants$4443.const$1.set(seg, x);
    }
    public static int rgbColors$get(MemorySegment seg, long index) {
        return (int)constants$4443.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void rgbColors$set(MemorySegment seg, long index, int x) {
        constants$4443.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lCustData$VH() {
        return constants$4443.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static long lCustData$get(MemorySegment seg) {
        return (long)constants$4443.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static void lCustData$set(MemorySegment seg, long x) {
        constants$4443.const$2.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)constants$4443.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        constants$4443.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpfnHook$VH() {
        return constants$4443.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCFHOOKPROC lpfnHook;
     * }
     */
    public static MemorySegment lpfnHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4443.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCFHOOKPROC lpfnHook;
     * }
     */
    public static void lpfnHook$set(MemorySegment seg, MemorySegment x) {
        constants$4443.const$3.set(seg, x);
    }
    public static MemorySegment lpfnHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4443.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnHook$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4443.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPCFHOOKPROC lpfnHook(MemorySegment segment, Arena scope) {
        return LPCFHOOKPROC.ofAddress(lpfnHook$get(segment), scope);
    }
    public static VarHandle lpTemplateName$VH() {
        return constants$4443.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCSTR lpTemplateName;
     * }
     */
    public static MemorySegment lpTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4443.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCSTR lpTemplateName;
     * }
     */
    public static void lpTemplateName$set(MemorySegment seg, MemorySegment x) {
        constants$4443.const$4.set(seg, x);
    }
    public static MemorySegment lpTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4443.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTemplateName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4443.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hInstance$VH() {
        return constants$4443.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static MemorySegment hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4443.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static void hInstance$set(MemorySegment seg, MemorySegment x) {
        constants$4443.const$5.set(seg, x);
    }
    public static MemorySegment hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4443.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4443.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpszStyle$VH() {
        return constants$4444.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpszStyle;
     * }
     */
    public static MemorySegment lpszStyle$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4444.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpszStyle;
     * }
     */
    public static void lpszStyle$set(MemorySegment seg, MemorySegment x) {
        constants$4444.const$0.set(seg, x);
    }
    public static MemorySegment lpszStyle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4444.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszStyle$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4444.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nFontType$VH() {
        return constants$4444.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD nFontType;
     * }
     */
    public static short nFontType$get(MemorySegment seg) {
        return (short)constants$4444.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD nFontType;
     * }
     */
    public static void nFontType$set(MemorySegment seg, short x) {
        constants$4444.const$1.set(seg, x);
    }
    public static short nFontType$get(MemorySegment seg, long index) {
        return (short)constants$4444.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void nFontType$set(MemorySegment seg, long index, short x) {
        constants$4444.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ___MISSING_ALIGNMENT__$VH() {
        return constants$4444.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ___MISSING_ALIGNMENT__;
     * }
     */
    public static short ___MISSING_ALIGNMENT__$get(MemorySegment seg) {
        return (short)constants$4444.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ___MISSING_ALIGNMENT__;
     * }
     */
    public static void ___MISSING_ALIGNMENT__$set(MemorySegment seg, short x) {
        constants$4444.const$2.set(seg, x);
    }
    public static short ___MISSING_ALIGNMENT__$get(MemorySegment seg, long index) {
        return (short)constants$4444.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ___MISSING_ALIGNMENT__$set(MemorySegment seg, long index, short x) {
        constants$4444.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nSizeMin$VH() {
        return constants$4444.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT nSizeMin;
     * }
     */
    public static int nSizeMin$get(MemorySegment seg) {
        return (int)constants$4444.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT nSizeMin;
     * }
     */
    public static void nSizeMin$set(MemorySegment seg, int x) {
        constants$4444.const$3.set(seg, x);
    }
    public static int nSizeMin$get(MemorySegment seg, long index) {
        return (int)constants$4444.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void nSizeMin$set(MemorySegment seg, long index, int x) {
        constants$4444.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nSizeMax$VH() {
        return constants$4444.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * INT nSizeMax;
     * }
     */
    public static int nSizeMax$get(MemorySegment seg) {
        return (int)constants$4444.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * INT nSizeMax;
     * }
     */
    public static void nSizeMax$set(MemorySegment seg, int x) {
        constants$4444.const$4.set(seg, x);
    }
    public static int nSizeMax$get(MemorySegment seg, long index) {
        return (int)constants$4444.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void nSizeMax$set(MemorySegment seg, long index, int x) {
        constants$4444.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


