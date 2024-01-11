// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NCRYPT_VSM_KEY_ATTESTATION_STATEMENT {
 *     ULONG Magic;
 *     ULONG Version;
 *     ULONG cbSignature;
 *     ULONG cbReport;
 *     ULONG cbAttributes;
 * };
 * }
 */
public class _NCRYPT_VSM_KEY_ATTESTATION_STATEMENT {

    public static MemoryLayout $LAYOUT() {
        return constants$1982.const$0;
    }
    public static VarHandle Magic$VH() {
        return constants$1982.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Magic;
     * }
     */
    public static int Magic$get(MemorySegment seg) {
        return (int)constants$1982.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Magic;
     * }
     */
    public static void Magic$set(MemorySegment seg, int x) {
        constants$1982.const$1.set(seg, x);
    }
    public static int Magic$get(MemorySegment seg, long index) {
        return (int)constants$1982.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Magic$set(MemorySegment seg, long index, int x) {
        constants$1982.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Version$VH() {
        return constants$1982.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$1982.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$1982.const$2.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$1982.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$1982.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbSignature$VH() {
        return constants$1982.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbSignature;
     * }
     */
    public static int cbSignature$get(MemorySegment seg) {
        return (int)constants$1982.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbSignature;
     * }
     */
    public static void cbSignature$set(MemorySegment seg, int x) {
        constants$1982.const$3.set(seg, x);
    }
    public static int cbSignature$get(MemorySegment seg, long index) {
        return (int)constants$1982.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSignature$set(MemorySegment seg, long index, int x) {
        constants$1982.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbReport$VH() {
        return constants$1982.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbReport;
     * }
     */
    public static int cbReport$get(MemorySegment seg) {
        return (int)constants$1982.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbReport;
     * }
     */
    public static void cbReport$set(MemorySegment seg, int x) {
        constants$1982.const$4.set(seg, x);
    }
    public static int cbReport$get(MemorySegment seg, long index) {
        return (int)constants$1982.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbReport$set(MemorySegment seg, long index, int x) {
        constants$1982.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbAttributes$VH() {
        return constants$1982.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cbAttributes;
     * }
     */
    public static int cbAttributes$get(MemorySegment seg) {
        return (int)constants$1982.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cbAttributes;
     * }
     */
    public static void cbAttributes$set(MemorySegment seg, int x) {
        constants$1982.const$5.set(seg, x);
    }
    public static int cbAttributes$get(MemorySegment seg, long index) {
        return (int)constants$1982.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbAttributes$set(MemorySegment seg, long index, int x) {
        constants$1982.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


