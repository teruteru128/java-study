// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagFINDREPLACEW {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HINSTANCE hInstance;
 *     DWORD Flags;
 *     LPWSTR lpstrFindWhat;
 *     LPWSTR lpstrReplaceWith;
 *     WORD wFindWhatLen;
 *     WORD wReplaceWithLen;
 *     LPARAM lCustData;
 *     LPFRHOOKPROC lpfnHook;
 *     LPCWSTR lpTemplateName;
 * };
 * }
 */
public class tagFINDREPLACEW {

    public static MemoryLayout $LAYOUT() {
        return constants$4439.const$1;
    }
    public static VarHandle lStructSize$VH() {
        return constants$4439.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static int lStructSize$get(MemorySegment seg) {
        return (int)constants$4439.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD lStructSize;
     * }
     */
    public static void lStructSize$set(MemorySegment seg, int x) {
        constants$4439.const$2.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)constants$4439.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        constants$4439.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwndOwner$VH() {
        return constants$4439.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static MemorySegment hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4439.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static void hwndOwner$set(MemorySegment seg, MemorySegment x) {
        constants$4439.const$3.set(seg, x);
    }
    public static MemorySegment hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4439.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4439.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hInstance$VH() {
        return constants$4439.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static MemorySegment hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4439.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HINSTANCE hInstance;
     * }
     */
    public static void hInstance$set(MemorySegment seg, MemorySegment x) {
        constants$4439.const$4.set(seg, x);
    }
    public static MemorySegment hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4439.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4439.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$4439.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$4439.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$4439.const$5.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$4439.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$4439.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpstrFindWhat$VH() {
        return constants$4440.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpstrFindWhat;
     * }
     */
    public static MemorySegment lpstrFindWhat$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4440.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpstrFindWhat;
     * }
     */
    public static void lpstrFindWhat$set(MemorySegment seg, MemorySegment x) {
        constants$4440.const$0.set(seg, x);
    }
    public static MemorySegment lpstrFindWhat$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4440.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrFindWhat$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4440.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpstrReplaceWith$VH() {
        return constants$4440.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpstrReplaceWith;
     * }
     */
    public static MemorySegment lpstrReplaceWith$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4440.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpstrReplaceWith;
     * }
     */
    public static void lpstrReplaceWith$set(MemorySegment seg, MemorySegment x) {
        constants$4440.const$1.set(seg, x);
    }
    public static MemorySegment lpstrReplaceWith$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4440.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrReplaceWith$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4440.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wFindWhatLen$VH() {
        return constants$4440.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wFindWhatLen;
     * }
     */
    public static short wFindWhatLen$get(MemorySegment seg) {
        return (short)constants$4440.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wFindWhatLen;
     * }
     */
    public static void wFindWhatLen$set(MemorySegment seg, short x) {
        constants$4440.const$2.set(seg, x);
    }
    public static short wFindWhatLen$get(MemorySegment seg, long index) {
        return (short)constants$4440.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void wFindWhatLen$set(MemorySegment seg, long index, short x) {
        constants$4440.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wReplaceWithLen$VH() {
        return constants$4440.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wReplaceWithLen;
     * }
     */
    public static short wReplaceWithLen$get(MemorySegment seg) {
        return (short)constants$4440.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wReplaceWithLen;
     * }
     */
    public static void wReplaceWithLen$set(MemorySegment seg, short x) {
        constants$4440.const$3.set(seg, x);
    }
    public static short wReplaceWithLen$get(MemorySegment seg, long index) {
        return (short)constants$4440.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void wReplaceWithLen$set(MemorySegment seg, long index, short x) {
        constants$4440.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lCustData$VH() {
        return constants$4440.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static long lCustData$get(MemorySegment seg) {
        return (long)constants$4440.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPARAM lCustData;
     * }
     */
    public static void lCustData$set(MemorySegment seg, long x) {
        constants$4440.const$4.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)constants$4440.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        constants$4440.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpfnHook$VH() {
        return constants$4440.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPFRHOOKPROC lpfnHook;
     * }
     */
    public static MemorySegment lpfnHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4440.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPFRHOOKPROC lpfnHook;
     * }
     */
    public static void lpfnHook$set(MemorySegment seg, MemorySegment x) {
        constants$4440.const$5.set(seg, x);
    }
    public static MemorySegment lpfnHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4440.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnHook$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4440.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPFRHOOKPROC lpfnHook(MemorySegment segment, Arena scope) {
        return LPFRHOOKPROC.ofAddress(lpfnHook$get(segment), scope);
    }
    public static VarHandle lpTemplateName$VH() {
        return constants$4441.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpTemplateName;
     * }
     */
    public static MemorySegment lpTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4441.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpTemplateName;
     * }
     */
    public static void lpTemplateName$set(MemorySegment seg, MemorySegment x) {
        constants$4441.const$0.set(seg, x);
    }
    public static MemorySegment lpTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4441.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTemplateName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4441.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


