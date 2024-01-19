// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS {
 *     DWORD cbSize;
 *     DWORD dwErrorLevel;
 *     DWORD dwErrorCategory;
 *     DWORD dwReserved;
 *     WCHAR wszErrorText[256];
 * };
 * }
 */
public class _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS {

    public static MemoryLayout $LAYOUT() {
        return constants$2225.const$1;
    }
    public static VarHandle cbSize$VH() {
        return constants$2225.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2225.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2225.const$2.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2225.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2225.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwErrorLevel$VH() {
        return constants$2225.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwErrorLevel;
     * }
     */
    public static int dwErrorLevel$get(MemorySegment seg) {
        return (int)constants$2225.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwErrorLevel;
     * }
     */
    public static void dwErrorLevel$set(MemorySegment seg, int x) {
        constants$2225.const$3.set(seg, x);
    }
    public static int dwErrorLevel$get(MemorySegment seg, long index) {
        return (int)constants$2225.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwErrorLevel$set(MemorySegment seg, long index, int x) {
        constants$2225.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwErrorCategory$VH() {
        return constants$2225.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwErrorCategory;
     * }
     */
    public static int dwErrorCategory$get(MemorySegment seg) {
        return (int)constants$2225.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwErrorCategory;
     * }
     */
    public static void dwErrorCategory$set(MemorySegment seg, int x) {
        constants$2225.const$4.set(seg, x);
    }
    public static int dwErrorCategory$get(MemorySegment seg, long index) {
        return (int)constants$2225.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwErrorCategory$set(MemorySegment seg, long index, int x) {
        constants$2225.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwReserved$VH() {
        return constants$2225.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static int dwReserved$get(MemorySegment seg) {
        return (int)constants$2225.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReserved;
     * }
     */
    public static void dwReserved$set(MemorySegment seg, int x) {
        constants$2225.const$5.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)constants$2225.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        constants$2225.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment wszErrorText$slice(MemorySegment seg) {
        return seg.asSlice(16, 512);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

