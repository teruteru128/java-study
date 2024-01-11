// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct NCRYPT_TPM_LOADABLE_KEY_BLOB_HEADER {
 *     DWORD magic;
 *     DWORD cbHeader;
 *     DWORD cbPublic;
 *     DWORD cbPrivate;
 *     DWORD cbName;
 * };
 * }
 */
public class NCRYPT_TPM_LOADABLE_KEY_BLOB_HEADER {

    public static MemoryLayout $LAYOUT() {
        return constants$1998.const$2;
    }
    public static VarHandle magic$VH() {
        return constants$1998.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD magic;
     * }
     */
    public static int magic$get(MemorySegment seg) {
        return (int)constants$1998.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD magic;
     * }
     */
    public static void magic$set(MemorySegment seg, int x) {
        constants$1998.const$3.set(seg, x);
    }
    public static int magic$get(MemorySegment seg, long index) {
        return (int)constants$1998.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void magic$set(MemorySegment seg, long index, int x) {
        constants$1998.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbHeader$VH() {
        return constants$1998.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbHeader;
     * }
     */
    public static int cbHeader$get(MemorySegment seg) {
        return (int)constants$1998.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbHeader;
     * }
     */
    public static void cbHeader$set(MemorySegment seg, int x) {
        constants$1998.const$4.set(seg, x);
    }
    public static int cbHeader$get(MemorySegment seg, long index) {
        return (int)constants$1998.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbHeader$set(MemorySegment seg, long index, int x) {
        constants$1998.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbPublic$VH() {
        return constants$1998.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbPublic;
     * }
     */
    public static int cbPublic$get(MemorySegment seg) {
        return (int)constants$1998.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbPublic;
     * }
     */
    public static void cbPublic$set(MemorySegment seg, int x) {
        constants$1998.const$5.set(seg, x);
    }
    public static int cbPublic$get(MemorySegment seg, long index) {
        return (int)constants$1998.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPublic$set(MemorySegment seg, long index, int x) {
        constants$1998.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbPrivate$VH() {
        return constants$1999.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbPrivate;
     * }
     */
    public static int cbPrivate$get(MemorySegment seg) {
        return (int)constants$1999.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbPrivate;
     * }
     */
    public static void cbPrivate$set(MemorySegment seg, int x) {
        constants$1999.const$0.set(seg, x);
    }
    public static int cbPrivate$get(MemorySegment seg, long index) {
        return (int)constants$1999.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPrivate$set(MemorySegment seg, long index, int x) {
        constants$1999.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbName$VH() {
        return constants$1999.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbName;
     * }
     */
    public static int cbName$get(MemorySegment seg) {
        return (int)constants$1999.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbName;
     * }
     */
    public static void cbName$set(MemorySegment seg, int x) {
        constants$1999.const$1.set(seg, x);
    }
    public static int cbName$get(MemorySegment seg, long index) {
        return (int)constants$1999.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbName$set(MemorySegment seg, long index, int x) {
        constants$1999.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


