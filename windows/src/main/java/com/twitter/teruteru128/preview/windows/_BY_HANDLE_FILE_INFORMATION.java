// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BY_HANDLE_FILE_INFORMATION {
 *     DWORD dwFileAttributes;
 *     FILETIME ftCreationTime;
 *     FILETIME ftLastAccessTime;
 *     FILETIME ftLastWriteTime;
 *     DWORD dwVolumeSerialNumber;
 *     DWORD nFileSizeHigh;
 *     DWORD nFileSizeLow;
 *     DWORD nNumberOfLinks;
 *     DWORD nFileIndexHigh;
 *     DWORD nFileIndexLow;
 * };
 * }
 */
public class _BY_HANDLE_FILE_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$582.const$5;
    }
    public static VarHandle dwFileAttributes$VH() {
        return constants$583.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFileAttributes;
     * }
     */
    public static int dwFileAttributes$get(MemorySegment seg) {
        return (int)constants$583.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFileAttributes;
     * }
     */
    public static void dwFileAttributes$set(MemorySegment seg, int x) {
        constants$583.const$0.set(seg, x);
    }
    public static int dwFileAttributes$get(MemorySegment seg, long index) {
        return (int)constants$583.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileAttributes$set(MemorySegment seg, long index, int x) {
        constants$583.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ftCreationTime$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    public static MemorySegment ftLastAccessTime$slice(MemorySegment seg) {
        return seg.asSlice(12, 8);
    }
    public static MemorySegment ftLastWriteTime$slice(MemorySegment seg) {
        return seg.asSlice(20, 8);
    }
    public static VarHandle dwVolumeSerialNumber$VH() {
        return constants$583.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwVolumeSerialNumber;
     * }
     */
    public static int dwVolumeSerialNumber$get(MemorySegment seg) {
        return (int)constants$583.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwVolumeSerialNumber;
     * }
     */
    public static void dwVolumeSerialNumber$set(MemorySegment seg, int x) {
        constants$583.const$1.set(seg, x);
    }
    public static int dwVolumeSerialNumber$get(MemorySegment seg, long index) {
        return (int)constants$583.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVolumeSerialNumber$set(MemorySegment seg, long index, int x) {
        constants$583.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nFileSizeHigh$VH() {
        return constants$583.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nFileSizeHigh;
     * }
     */
    public static int nFileSizeHigh$get(MemorySegment seg) {
        return (int)constants$583.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nFileSizeHigh;
     * }
     */
    public static void nFileSizeHigh$set(MemorySegment seg, int x) {
        constants$583.const$2.set(seg, x);
    }
    public static int nFileSizeHigh$get(MemorySegment seg, long index) {
        return (int)constants$583.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileSizeHigh$set(MemorySegment seg, long index, int x) {
        constants$583.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nFileSizeLow$VH() {
        return constants$583.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nFileSizeLow;
     * }
     */
    public static int nFileSizeLow$get(MemorySegment seg) {
        return (int)constants$583.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nFileSizeLow;
     * }
     */
    public static void nFileSizeLow$set(MemorySegment seg, int x) {
        constants$583.const$3.set(seg, x);
    }
    public static int nFileSizeLow$get(MemorySegment seg, long index) {
        return (int)constants$583.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileSizeLow$set(MemorySegment seg, long index, int x) {
        constants$583.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nNumberOfLinks$VH() {
        return constants$583.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nNumberOfLinks;
     * }
     */
    public static int nNumberOfLinks$get(MemorySegment seg) {
        return (int)constants$583.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nNumberOfLinks;
     * }
     */
    public static void nNumberOfLinks$set(MemorySegment seg, int x) {
        constants$583.const$4.set(seg, x);
    }
    public static int nNumberOfLinks$get(MemorySegment seg, long index) {
        return (int)constants$583.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void nNumberOfLinks$set(MemorySegment seg, long index, int x) {
        constants$583.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nFileIndexHigh$VH() {
        return constants$583.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nFileIndexHigh;
     * }
     */
    public static int nFileIndexHigh$get(MemorySegment seg) {
        return (int)constants$583.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nFileIndexHigh;
     * }
     */
    public static void nFileIndexHigh$set(MemorySegment seg, int x) {
        constants$583.const$5.set(seg, x);
    }
    public static int nFileIndexHigh$get(MemorySegment seg, long index) {
        return (int)constants$583.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileIndexHigh$set(MemorySegment seg, long index, int x) {
        constants$583.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle nFileIndexLow$VH() {
        return constants$584.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nFileIndexLow;
     * }
     */
    public static int nFileIndexLow$get(MemorySegment seg) {
        return (int)constants$584.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nFileIndexLow;
     * }
     */
    public static void nFileIndexLow$set(MemorySegment seg, int x) {
        constants$584.const$0.set(seg, x);
    }
    public static int nFileIndexLow$get(MemorySegment seg, long index) {
        return (int)constants$584.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileIndexLow$set(MemorySegment seg, long index, int x) {
        constants$584.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

