// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagMCI_OVLY_OPEN_PARMSW {
 *     DWORD_PTR dwCallback;
 *     MCIDEVICEID wDeviceID;
 *     LPCWSTR lpstrDeviceType;
 *     LPCWSTR lpstrElementName;
 *     LPCWSTR lpstrAlias;
 *     DWORD dwStyle;
 *     HWND hWndParent;
 * };
 * }
 */
public class tagMCI_OVLY_OPEN_PARMSW {

    public static MemoryLayout $LAYOUT() {
        return constants$1586.const$2;
    }
    public static VarHandle dwCallback$VH() {
        return constants$1586.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static long dwCallback$get(MemorySegment seg) {
        return (long)constants$1586.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD_PTR dwCallback;
     * }
     */
    public static void dwCallback$set(MemorySegment seg, long x) {
        constants$1586.const$3.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)constants$1586.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        constants$1586.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle wDeviceID$VH() {
        return constants$1586.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * MCIDEVICEID wDeviceID;
     * }
     */
    public static int wDeviceID$get(MemorySegment seg) {
        return (int)constants$1586.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * MCIDEVICEID wDeviceID;
     * }
     */
    public static void wDeviceID$set(MemorySegment seg, int x) {
        constants$1586.const$4.set(seg, x);
    }
    public static int wDeviceID$get(MemorySegment seg, long index) {
        return (int)constants$1586.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void wDeviceID$set(MemorySegment seg, long index, int x) {
        constants$1586.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpstrDeviceType$VH() {
        return constants$1586.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpstrDeviceType;
     * }
     */
    public static MemorySegment lpstrDeviceType$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1586.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpstrDeviceType;
     * }
     */
    public static void lpstrDeviceType$set(MemorySegment seg, MemorySegment x) {
        constants$1586.const$5.set(seg, x);
    }
    public static MemorySegment lpstrDeviceType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1586.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrDeviceType$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1586.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpstrElementName$VH() {
        return constants$1587.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpstrElementName;
     * }
     */
    public static MemorySegment lpstrElementName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpstrElementName;
     * }
     */
    public static void lpstrElementName$set(MemorySegment seg, MemorySegment x) {
        constants$1587.const$0.set(seg, x);
    }
    public static MemorySegment lpstrElementName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrElementName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1587.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpstrAlias$VH() {
        return constants$1587.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR lpstrAlias;
     * }
     */
    public static MemorySegment lpstrAlias$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR lpstrAlias;
     * }
     */
    public static void lpstrAlias$set(MemorySegment seg, MemorySegment x) {
        constants$1587.const$1.set(seg, x);
    }
    public static MemorySegment lpstrAlias$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrAlias$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1587.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwStyle$VH() {
        return constants$1587.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwStyle;
     * }
     */
    public static int dwStyle$get(MemorySegment seg) {
        return (int)constants$1587.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwStyle;
     * }
     */
    public static void dwStyle$set(MemorySegment seg, int x) {
        constants$1587.const$2.set(seg, x);
    }
    public static int dwStyle$get(MemorySegment seg, long index) {
        return (int)constants$1587.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStyle$set(MemorySegment seg, long index, int x) {
        constants$1587.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hWndParent$VH() {
        return constants$1587.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hWndParent;
     * }
     */
    public static MemorySegment hWndParent$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hWndParent;
     * }
     */
    public static void hWndParent$set(MemorySegment seg, MemorySegment x) {
        constants$1587.const$3.set(seg, x);
    }
    public static MemorySegment hWndParent$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1587.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hWndParent$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1587.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


