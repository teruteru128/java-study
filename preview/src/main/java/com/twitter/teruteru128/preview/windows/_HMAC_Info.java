// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _HMAC_Info {
 *     ALG_ID HashAlgid;
 *     BYTE* pbInnerString;
 *     DWORD cbInnerString;
 *     BYTE* pbOuterString;
 *     DWORD cbOuterString;
 * };
 * }
 */
public class _HMAC_Info {

    public static MemoryLayout $LAYOUT() {
        return constants$1919.const$1;
    }
    public static VarHandle HashAlgid$VH() {
        return constants$1919.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ALG_ID HashAlgid;
     * }
     */
    public static int HashAlgid$get(MemorySegment seg) {
        return (int)constants$1919.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ALG_ID HashAlgid;
     * }
     */
    public static void HashAlgid$set(MemorySegment seg, int x) {
        constants$1919.const$2.set(seg, x);
    }
    public static int HashAlgid$get(MemorySegment seg, long index) {
        return (int)constants$1919.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void HashAlgid$set(MemorySegment seg, long index, int x) {
        constants$1919.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbInnerString$VH() {
        return constants$1919.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE* pbInnerString;
     * }
     */
    public static MemorySegment pbInnerString$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1919.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE* pbInnerString;
     * }
     */
    public static void pbInnerString$set(MemorySegment seg, MemorySegment x) {
        constants$1919.const$3.set(seg, x);
    }
    public static MemorySegment pbInnerString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1919.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pbInnerString$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1919.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbInnerString$VH() {
        return constants$1919.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbInnerString;
     * }
     */
    public static int cbInnerString$get(MemorySegment seg) {
        return (int)constants$1919.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbInnerString;
     * }
     */
    public static void cbInnerString$set(MemorySegment seg, int x) {
        constants$1919.const$4.set(seg, x);
    }
    public static int cbInnerString$get(MemorySegment seg, long index) {
        return (int)constants$1919.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbInnerString$set(MemorySegment seg, long index, int x) {
        constants$1919.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbOuterString$VH() {
        return constants$1919.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE* pbOuterString;
     * }
     */
    public static MemorySegment pbOuterString$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1919.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE* pbOuterString;
     * }
     */
    public static void pbOuterString$set(MemorySegment seg, MemorySegment x) {
        constants$1919.const$5.set(seg, x);
    }
    public static MemorySegment pbOuterString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1919.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pbOuterString$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1919.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbOuterString$VH() {
        return constants$1920.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbOuterString;
     * }
     */
    public static int cbOuterString$get(MemorySegment seg) {
        return (int)constants$1920.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbOuterString;
     * }
     */
    public static void cbOuterString$set(MemorySegment seg, int x) {
        constants$1920.const$0.set(seg, x);
    }
    public static int cbOuterString$get(MemorySegment seg, long index) {
        return (int)constants$1920.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbOuterString$set(MemorySegment seg, long index, int x) {
        constants$1920.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


