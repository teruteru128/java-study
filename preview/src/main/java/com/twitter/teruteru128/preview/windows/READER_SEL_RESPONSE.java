// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     DWORD cbReaderNameOffset;
 *     DWORD cchReaderNameLength;
 *     DWORD cbCardNameOffset;
 *     DWORD cchCardNameLength;
 * };
 * }
 */
public class READER_SEL_RESPONSE {

    public static MemoryLayout $LAYOUT() {
        return constants$2775.const$0;
    }
    public static VarHandle cbReaderNameOffset$VH() {
        return constants$2775.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbReaderNameOffset;
     * }
     */
    public static int cbReaderNameOffset$get(MemorySegment seg) {
        return (int)constants$2775.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbReaderNameOffset;
     * }
     */
    public static void cbReaderNameOffset$set(MemorySegment seg, int x) {
        constants$2775.const$1.set(seg, x);
    }
    public static int cbReaderNameOffset$get(MemorySegment seg, long index) {
        return (int)constants$2775.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbReaderNameOffset$set(MemorySegment seg, long index, int x) {
        constants$2775.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cchReaderNameLength$VH() {
        return constants$2775.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cchReaderNameLength;
     * }
     */
    public static int cchReaderNameLength$get(MemorySegment seg) {
        return (int)constants$2775.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cchReaderNameLength;
     * }
     */
    public static void cchReaderNameLength$set(MemorySegment seg, int x) {
        constants$2775.const$2.set(seg, x);
    }
    public static int cchReaderNameLength$get(MemorySegment seg, long index) {
        return (int)constants$2775.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cchReaderNameLength$set(MemorySegment seg, long index, int x) {
        constants$2775.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbCardNameOffset$VH() {
        return constants$2775.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbCardNameOffset;
     * }
     */
    public static int cbCardNameOffset$get(MemorySegment seg) {
        return (int)constants$2775.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbCardNameOffset;
     * }
     */
    public static void cbCardNameOffset$set(MemorySegment seg, int x) {
        constants$2775.const$3.set(seg, x);
    }
    public static int cbCardNameOffset$get(MemorySegment seg, long index) {
        return (int)constants$2775.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cbCardNameOffset$set(MemorySegment seg, long index, int x) {
        constants$2775.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cchCardNameLength$VH() {
        return constants$2775.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cchCardNameLength;
     * }
     */
    public static int cchCardNameLength$get(MemorySegment seg) {
        return (int)constants$2775.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cchCardNameLength;
     * }
     */
    public static void cchCardNameLength$set(MemorySegment seg, int x) {
        constants$2775.const$4.set(seg, x);
    }
    public static int cchCardNameLength$get(MemorySegment seg, long index) {
        return (int)constants$2775.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cchCardNameLength$set(MemorySegment seg, long index, int x) {
        constants$2775.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


