// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CTL_VERIFY_USAGE_STATUS {
 *     DWORD cbSize;
 *     DWORD dwError;
 *     DWORD dwFlags;
 *     PCCTL_CONTEXT* ppCtl;
 *     DWORD dwCtlEntryIndex;
 *     PCCERT_CONTEXT* ppSigner;
 *     DWORD dwSignerIndex;
 * };
 * }
 */
public class _CTL_VERIFY_USAGE_STATUS {

    public static MemoryLayout $LAYOUT() {
        return constants$2155.const$3;
    }
    public static VarHandle cbSize$VH() {
        return constants$2155.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2155.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2155.const$4.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2155.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2155.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwError$VH() {
        return constants$2155.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwError;
     * }
     */
    public static int dwError$get(MemorySegment seg) {
        return (int)constants$2155.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwError;
     * }
     */
    public static void dwError$set(MemorySegment seg, int x) {
        constants$2155.const$5.set(seg, x);
    }
    public static int dwError$get(MemorySegment seg, long index) {
        return (int)constants$2155.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwError$set(MemorySegment seg, long index, int x) {
        constants$2155.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFlags$VH() {
        return constants$2156.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$2156.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$2156.const$0.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$2156.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$2156.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ppCtl$VH() {
        return constants$2156.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCCTL_CONTEXT* ppCtl;
     * }
     */
    public static MemorySegment ppCtl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2156.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCCTL_CONTEXT* ppCtl;
     * }
     */
    public static void ppCtl$set(MemorySegment seg, MemorySegment x) {
        constants$2156.const$1.set(seg, x);
    }
    public static MemorySegment ppCtl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2156.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ppCtl$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2156.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCtlEntryIndex$VH() {
        return constants$2156.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCtlEntryIndex;
     * }
     */
    public static int dwCtlEntryIndex$get(MemorySegment seg) {
        return (int)constants$2156.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCtlEntryIndex;
     * }
     */
    public static void dwCtlEntryIndex$set(MemorySegment seg, int x) {
        constants$2156.const$2.set(seg, x);
    }
    public static int dwCtlEntryIndex$get(MemorySegment seg, long index) {
        return (int)constants$2156.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCtlEntryIndex$set(MemorySegment seg, long index, int x) {
        constants$2156.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ppSigner$VH() {
        return constants$2156.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCCERT_CONTEXT* ppSigner;
     * }
     */
    public static MemorySegment ppSigner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2156.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCCERT_CONTEXT* ppSigner;
     * }
     */
    public static void ppSigner$set(MemorySegment seg, MemorySegment x) {
        constants$2156.const$3.set(seg, x);
    }
    public static MemorySegment ppSigner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2156.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void ppSigner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2156.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSignerIndex$VH() {
        return constants$2156.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSignerIndex;
     * }
     */
    public static int dwSignerIndex$get(MemorySegment seg) {
        return (int)constants$2156.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSignerIndex;
     * }
     */
    public static void dwSignerIndex$set(MemorySegment seg, int x) {
        constants$2156.const$4.set(seg, x);
    }
    public static int dwSignerIndex$get(MemorySegment seg, long index) {
        return (int)constants$2156.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSignerIndex$set(MemorySegment seg, long index, int x) {
        constants$2156.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

