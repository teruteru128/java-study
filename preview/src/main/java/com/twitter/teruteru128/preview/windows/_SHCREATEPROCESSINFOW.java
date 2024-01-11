// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SHCREATEPROCESSINFOW {
 *     DWORD cbSize;
 *     ULONG fMask;
 *     HWND hwnd;
 *     LPCWSTR pszFile;
 *     LPCWSTR pszParameters;
 *     LPCWSTR pszCurrentDirectory;
 *     HANDLE hUserToken;
 *     LPSECURITY_ATTRIBUTES lpProcessAttributes;
 *     LPSECURITY_ATTRIBUTES lpThreadAttributes;
 *     BOOL bInheritHandles;
 *     DWORD dwCreationFlags;
 *     LPSTARTUPINFOW lpStartupInfo;
 *     LPPROCESS_INFORMATION lpProcessInformation;
 * };
 * }
 */
public class _SHCREATEPROCESSINFOW {

    public static MemoryLayout $LAYOUT() {
        return constants$1868.const$3;
    }
    public static VarHandle cbSize$VH() {
        return constants$1868.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$1868.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$1868.const$4.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$1868.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$1868.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fMask$VH() {
        return constants$1868.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG fMask;
     * }
     */
    public static int fMask$get(MemorySegment seg) {
        return (int)constants$1868.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG fMask;
     * }
     */
    public static void fMask$set(MemorySegment seg, int x) {
        constants$1868.const$5.set(seg, x);
    }
    public static int fMask$get(MemorySegment seg, long index) {
        return (int)constants$1868.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void fMask$set(MemorySegment seg, long index, int x) {
        constants$1868.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwnd$VH() {
        return constants$1869.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static MemorySegment hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwnd;
     * }
     */
    public static void hwnd$set(MemorySegment seg, MemorySegment x) {
        constants$1869.const$0.set(seg, x);
    }
    public static MemorySegment hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1869.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszFile$VH() {
        return constants$1869.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pszFile;
     * }
     */
    public static MemorySegment pszFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pszFile;
     * }
     */
    public static void pszFile$set(MemorySegment seg, MemorySegment x) {
        constants$1869.const$1.set(seg, x);
    }
    public static MemorySegment pszFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pszFile$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1869.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszParameters$VH() {
        return constants$1869.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pszParameters;
     * }
     */
    public static MemorySegment pszParameters$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pszParameters;
     * }
     */
    public static void pszParameters$set(MemorySegment seg, MemorySegment x) {
        constants$1869.const$2.set(seg, x);
    }
    public static MemorySegment pszParameters$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pszParameters$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1869.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszCurrentDirectory$VH() {
        return constants$1869.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPCWSTR pszCurrentDirectory;
     * }
     */
    public static MemorySegment pszCurrentDirectory$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPCWSTR pszCurrentDirectory;
     * }
     */
    public static void pszCurrentDirectory$set(MemorySegment seg, MemorySegment x) {
        constants$1869.const$3.set(seg, x);
    }
    public static MemorySegment pszCurrentDirectory$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pszCurrentDirectory$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1869.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hUserToken$VH() {
        return constants$1869.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HANDLE hUserToken;
     * }
     */
    public static MemorySegment hUserToken$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HANDLE hUserToken;
     * }
     */
    public static void hUserToken$set(MemorySegment seg, MemorySegment x) {
        constants$1869.const$4.set(seg, x);
    }
    public static MemorySegment hUserToken$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hUserToken$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1869.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpProcessAttributes$VH() {
        return constants$1869.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSECURITY_ATTRIBUTES lpProcessAttributes;
     * }
     */
    public static MemorySegment lpProcessAttributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSECURITY_ATTRIBUTES lpProcessAttributes;
     * }
     */
    public static void lpProcessAttributes$set(MemorySegment seg, MemorySegment x) {
        constants$1869.const$5.set(seg, x);
    }
    public static MemorySegment lpProcessAttributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1869.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lpProcessAttributes$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1869.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpThreadAttributes$VH() {
        return constants$1870.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSECURITY_ATTRIBUTES lpThreadAttributes;
     * }
     */
    public static MemorySegment lpThreadAttributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1870.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSECURITY_ATTRIBUTES lpThreadAttributes;
     * }
     */
    public static void lpThreadAttributes$set(MemorySegment seg, MemorySegment x) {
        constants$1870.const$0.set(seg, x);
    }
    public static MemorySegment lpThreadAttributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1870.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpThreadAttributes$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1870.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bInheritHandles$VH() {
        return constants$1870.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL bInheritHandles;
     * }
     */
    public static int bInheritHandles$get(MemorySegment seg) {
        return (int)constants$1870.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL bInheritHandles;
     * }
     */
    public static void bInheritHandles$set(MemorySegment seg, int x) {
        constants$1870.const$1.set(seg, x);
    }
    public static int bInheritHandles$get(MemorySegment seg, long index) {
        return (int)constants$1870.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bInheritHandles$set(MemorySegment seg, long index, int x) {
        constants$1870.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCreationFlags$VH() {
        return constants$1870.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCreationFlags;
     * }
     */
    public static int dwCreationFlags$get(MemorySegment seg) {
        return (int)constants$1870.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCreationFlags;
     * }
     */
    public static void dwCreationFlags$set(MemorySegment seg, int x) {
        constants$1870.const$2.set(seg, x);
    }
    public static int dwCreationFlags$get(MemorySegment seg, long index) {
        return (int)constants$1870.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCreationFlags$set(MemorySegment seg, long index, int x) {
        constants$1870.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpStartupInfo$VH() {
        return constants$1870.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTARTUPINFOW lpStartupInfo;
     * }
     */
    public static MemorySegment lpStartupInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1870.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTARTUPINFOW lpStartupInfo;
     * }
     */
    public static void lpStartupInfo$set(MemorySegment seg, MemorySegment x) {
        constants$1870.const$3.set(seg, x);
    }
    public static MemorySegment lpStartupInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1870.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void lpStartupInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1870.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpProcessInformation$VH() {
        return constants$1870.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPPROCESS_INFORMATION lpProcessInformation;
     * }
     */
    public static MemorySegment lpProcessInformation$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1870.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPPROCESS_INFORMATION lpProcessInformation;
     * }
     */
    public static void lpProcessInformation$set(MemorySegment seg, MemorySegment x) {
        constants$1870.const$4.set(seg, x);
    }
    public static MemorySegment lpProcessInformation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1870.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void lpProcessInformation$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1870.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


