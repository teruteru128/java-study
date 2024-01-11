// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NOTIFYICONDATAA {
 *     DWORD cbSize;
 *     HWND hWnd;
 *     UINT uID;
 *     UINT uFlags;
 *     UINT uCallbackMessage;
 *     HICON hIcon;
 *     CHAR szTip[128];
 *     DWORD dwState;
 *     DWORD dwStateMask;
 *     CHAR szInfo[256];
 *     union {
 *         UINT uTimeout;
 *         UINT uVersion;
 *     };
 *     CHAR szInfoTitle[64];
 *     DWORD dwInfoFlags;
 *     GUID guidItem;
 *     HICON hBalloonIcon;
 * };
 * }
 */
public class _NOTIFYICONDATAA {

    public static MemoryLayout $LAYOUT() {
        return constants$1873.const$4;
    }
    public static VarHandle cbSize$VH() {
        return constants$1873.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1873.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1873.const$5.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1873.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1873.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hWnd$VH() {
        return constants$1874.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hWnd;
     * }
     */
    public static MemorySegment hWnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1874.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hWnd;
     * }
     */
    public static void hWnd$set(MemorySegment seg, MemorySegment x) {
        constants$1874.const$0.set(seg, x);
    }
    public static MemorySegment hWnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1874.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hWnd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1874.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle uID$VH() {
        return constants$1874.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uID;
     * }
     */
    public static int uID$get(MemorySegment seg) {
        return (int)constants$1874.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uID;
     * }
     */
    public static void uID$set(MemorySegment seg, int x) {
        constants$1874.const$1.set(seg, x);
    }
    public static int uID$get(MemorySegment seg, long index) {
        return (int)constants$1874.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void uID$set(MemorySegment seg, long index, int x) {
        constants$1874.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle uFlags$VH() {
        return constants$1874.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uFlags;
     * }
     */
    public static int uFlags$get(MemorySegment seg) {
        return (int)constants$1874.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uFlags;
     * }
     */
    public static void uFlags$set(MemorySegment seg, int x) {
        constants$1874.const$2.set(seg, x);
    }
    public static int uFlags$get(MemorySegment seg, long index) {
        return (int)constants$1874.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void uFlags$set(MemorySegment seg, long index, int x) {
        constants$1874.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle uCallbackMessage$VH() {
        return constants$1874.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uCallbackMessage;
     * }
     */
    public static int uCallbackMessage$get(MemorySegment seg) {
        return (int)constants$1874.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uCallbackMessage;
     * }
     */
    public static void uCallbackMessage$set(MemorySegment seg, int x) {
        constants$1874.const$3.set(seg, x);
    }
    public static int uCallbackMessage$get(MemorySegment seg, long index) {
        return (int)constants$1874.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void uCallbackMessage$set(MemorySegment seg, long index, int x) {
        constants$1874.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hIcon$VH() {
        return constants$1874.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HICON hIcon;
     * }
     */
    public static MemorySegment hIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1874.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HICON hIcon;
     * }
     */
    public static void hIcon$set(MemorySegment seg, MemorySegment x) {
        constants$1874.const$4.set(seg, x);
    }
    public static MemorySegment hIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1874.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1874.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szTip$slice(MemorySegment seg) {
        return seg.asSlice(40, 128);
    }
    public static VarHandle dwState$VH() {
        return constants$1874.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwState;
     * }
     */
    public static int dwState$get(MemorySegment seg) {
        return (int)constants$1874.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwState;
     * }
     */
    public static void dwState$set(MemorySegment seg, int x) {
        constants$1874.const$5.set(seg, x);
    }
    public static int dwState$get(MemorySegment seg, long index) {
        return (int)constants$1874.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwState$set(MemorySegment seg, long index, int x) {
        constants$1874.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwStateMask$VH() {
        return constants$1875.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwStateMask;
     * }
     */
    public static int dwStateMask$get(MemorySegment seg) {
        return (int)constants$1875.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwStateMask;
     * }
     */
    public static void dwStateMask$set(MemorySegment seg, int x) {
        constants$1875.const$0.set(seg, x);
    }
    public static int dwStateMask$get(MemorySegment seg, long index) {
        return (int)constants$1875.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStateMask$set(MemorySegment seg, long index, int x) {
        constants$1875.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szInfo$slice(MemorySegment seg) {
        return seg.asSlice(176, 256);
    }
    public static VarHandle uTimeout$VH() {
        return constants$1875.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uTimeout;
     * }
     */
    public static int uTimeout$get(MemorySegment seg) {
        return (int)constants$1875.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uTimeout;
     * }
     */
    public static void uTimeout$set(MemorySegment seg, int x) {
        constants$1875.const$1.set(seg, x);
    }
    public static int uTimeout$get(MemorySegment seg, long index) {
        return (int)constants$1875.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void uTimeout$set(MemorySegment seg, long index, int x) {
        constants$1875.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle uVersion$VH() {
        return constants$1875.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT uVersion;
     * }
     */
    public static int uVersion$get(MemorySegment seg) {
        return (int)constants$1875.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT uVersion;
     * }
     */
    public static void uVersion$set(MemorySegment seg, int x) {
        constants$1875.const$2.set(seg, x);
    }
    public static int uVersion$get(MemorySegment seg, long index) {
        return (int)constants$1875.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void uVersion$set(MemorySegment seg, long index, int x) {
        constants$1875.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szInfoTitle$slice(MemorySegment seg) {
        return seg.asSlice(436, 64);
    }
    public static VarHandle dwInfoFlags$VH() {
        return constants$1875.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwInfoFlags;
     * }
     */
    public static int dwInfoFlags$get(MemorySegment seg) {
        return (int)constants$1875.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwInfoFlags;
     * }
     */
    public static void dwInfoFlags$set(MemorySegment seg, int x) {
        constants$1875.const$3.set(seg, x);
    }
    public static int dwInfoFlags$get(MemorySegment seg, long index) {
        return (int)constants$1875.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInfoFlags$set(MemorySegment seg, long index, int x) {
        constants$1875.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment guidItem$slice(MemorySegment seg) {
        return seg.asSlice(504, 16);
    }
    public static VarHandle hBalloonIcon$VH() {
        return constants$1875.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HICON hBalloonIcon;
     * }
     */
    public static MemorySegment hBalloonIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1875.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HICON hBalloonIcon;
     * }
     */
    public static void hBalloonIcon$set(MemorySegment seg, MemorySegment x) {
        constants$1875.const$4.set(seg, x);
    }
    public static MemorySegment hBalloonIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1875.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hBalloonIcon$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1875.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


