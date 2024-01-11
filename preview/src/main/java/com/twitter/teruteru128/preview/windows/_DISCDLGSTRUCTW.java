// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DISCDLGSTRUCTW {
 *     DWORD cbStructure;
 *     HWND hwndOwner;
 *     LPWSTR lpLocalName;
 *     LPWSTR lpRemoteName;
 *     DWORD dwFlags;
 * };
 * }
 */
public class _DISCDLGSTRUCTW {

    public static MemoryLayout $LAYOUT() {
        return constants$1512.const$2;
    }
    public static VarHandle cbStructure$VH() {
        return constants$1512.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbStructure;
     * }
     */
    public static int cbStructure$get(MemorySegment seg) {
        return (int)constants$1512.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbStructure;
     * }
     */
    public static void cbStructure$set(MemorySegment seg, int x) {
        constants$1512.const$3.set(seg, x);
    }
    public static int cbStructure$get(MemorySegment seg, long index) {
        return (int)constants$1512.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStructure$set(MemorySegment seg, long index, int x) {
        constants$1512.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hwndOwner$VH() {
        return constants$1512.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static MemorySegment hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1512.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HWND hwndOwner;
     * }
     */
    public static void hwndOwner$set(MemorySegment seg, MemorySegment x) {
        constants$1512.const$4.set(seg, x);
    }
    public static MemorySegment hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1512.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1512.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpLocalName$VH() {
        return constants$1512.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpLocalName;
     * }
     */
    public static MemorySegment lpLocalName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1512.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpLocalName;
     * }
     */
    public static void lpLocalName$set(MemorySegment seg, MemorySegment x) {
        constants$1512.const$5.set(seg, x);
    }
    public static MemorySegment lpLocalName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1512.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void lpLocalName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1512.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpRemoteName$VH() {
        return constants$1513.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpRemoteName;
     * }
     */
    public static MemorySegment lpRemoteName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1513.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpRemoteName;
     * }
     */
    public static void lpRemoteName$set(MemorySegment seg, MemorySegment x) {
        constants$1513.const$0.set(seg, x);
    }
    public static MemorySegment lpRemoteName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1513.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpRemoteName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1513.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFlags$VH() {
        return constants$1513.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$1513.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$1513.const$1.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$1513.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$1513.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


