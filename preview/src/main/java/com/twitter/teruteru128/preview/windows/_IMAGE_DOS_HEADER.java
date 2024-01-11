// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_DOS_HEADER {
 *     WORD e_magic;
 *     WORD e_cblp;
 *     WORD e_cp;
 *     WORD e_crlc;
 *     WORD e_cparhdr;
 *     WORD e_minalloc;
 *     WORD e_maxalloc;
 *     WORD e_ss;
 *     WORD e_sp;
 *     WORD e_csum;
 *     WORD e_ip;
 *     WORD e_cs;
 *     WORD e_lfarlc;
 *     WORD e_ovno;
 *     WORD e_res[4];
 *     WORD e_oemid;
 *     WORD e_oeminfo;
 *     WORD e_res2[10];
 *     LONG e_lfanew;
 * };
 * }
 */
public class _IMAGE_DOS_HEADER {

    public static MemoryLayout $LAYOUT() {
        return constants$350.const$3;
    }
    public static VarHandle e_magic$VH() {
        return constants$350.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_magic;
     * }
     */
    public static short e_magic$get(MemorySegment seg) {
        return (short)constants$350.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_magic;
     * }
     */
    public static void e_magic$set(MemorySegment seg, short x) {
        constants$350.const$4.set(seg, x);
    }
    public static short e_magic$get(MemorySegment seg, long index) {
        return (short)constants$350.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void e_magic$set(MemorySegment seg, long index, short x) {
        constants$350.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_cblp$VH() {
        return constants$350.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_cblp;
     * }
     */
    public static short e_cblp$get(MemorySegment seg) {
        return (short)constants$350.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_cblp;
     * }
     */
    public static void e_cblp$set(MemorySegment seg, short x) {
        constants$350.const$5.set(seg, x);
    }
    public static short e_cblp$get(MemorySegment seg, long index) {
        return (short)constants$350.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void e_cblp$set(MemorySegment seg, long index, short x) {
        constants$350.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_cp$VH() {
        return constants$351.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_cp;
     * }
     */
    public static short e_cp$get(MemorySegment seg) {
        return (short)constants$351.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_cp;
     * }
     */
    public static void e_cp$set(MemorySegment seg, short x) {
        constants$351.const$0.set(seg, x);
    }
    public static short e_cp$get(MemorySegment seg, long index) {
        return (short)constants$351.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void e_cp$set(MemorySegment seg, long index, short x) {
        constants$351.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_crlc$VH() {
        return constants$351.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_crlc;
     * }
     */
    public static short e_crlc$get(MemorySegment seg) {
        return (short)constants$351.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_crlc;
     * }
     */
    public static void e_crlc$set(MemorySegment seg, short x) {
        constants$351.const$1.set(seg, x);
    }
    public static short e_crlc$get(MemorySegment seg, long index) {
        return (short)constants$351.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void e_crlc$set(MemorySegment seg, long index, short x) {
        constants$351.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_cparhdr$VH() {
        return constants$351.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_cparhdr;
     * }
     */
    public static short e_cparhdr$get(MemorySegment seg) {
        return (short)constants$351.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_cparhdr;
     * }
     */
    public static void e_cparhdr$set(MemorySegment seg, short x) {
        constants$351.const$2.set(seg, x);
    }
    public static short e_cparhdr$get(MemorySegment seg, long index) {
        return (short)constants$351.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void e_cparhdr$set(MemorySegment seg, long index, short x) {
        constants$351.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_minalloc$VH() {
        return constants$351.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_minalloc;
     * }
     */
    public static short e_minalloc$get(MemorySegment seg) {
        return (short)constants$351.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_minalloc;
     * }
     */
    public static void e_minalloc$set(MemorySegment seg, short x) {
        constants$351.const$3.set(seg, x);
    }
    public static short e_minalloc$get(MemorySegment seg, long index) {
        return (short)constants$351.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void e_minalloc$set(MemorySegment seg, long index, short x) {
        constants$351.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_maxalloc$VH() {
        return constants$351.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_maxalloc;
     * }
     */
    public static short e_maxalloc$get(MemorySegment seg) {
        return (short)constants$351.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_maxalloc;
     * }
     */
    public static void e_maxalloc$set(MemorySegment seg, short x) {
        constants$351.const$4.set(seg, x);
    }
    public static short e_maxalloc$get(MemorySegment seg, long index) {
        return (short)constants$351.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void e_maxalloc$set(MemorySegment seg, long index, short x) {
        constants$351.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_ss$VH() {
        return constants$351.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_ss;
     * }
     */
    public static short e_ss$get(MemorySegment seg) {
        return (short)constants$351.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_ss;
     * }
     */
    public static void e_ss$set(MemorySegment seg, short x) {
        constants$351.const$5.set(seg, x);
    }
    public static short e_ss$get(MemorySegment seg, long index) {
        return (short)constants$351.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void e_ss$set(MemorySegment seg, long index, short x) {
        constants$351.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_sp$VH() {
        return constants$352.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_sp;
     * }
     */
    public static short e_sp$get(MemorySegment seg) {
        return (short)constants$352.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_sp;
     * }
     */
    public static void e_sp$set(MemorySegment seg, short x) {
        constants$352.const$0.set(seg, x);
    }
    public static short e_sp$get(MemorySegment seg, long index) {
        return (short)constants$352.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void e_sp$set(MemorySegment seg, long index, short x) {
        constants$352.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_csum$VH() {
        return constants$352.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_csum;
     * }
     */
    public static short e_csum$get(MemorySegment seg) {
        return (short)constants$352.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_csum;
     * }
     */
    public static void e_csum$set(MemorySegment seg, short x) {
        constants$352.const$1.set(seg, x);
    }
    public static short e_csum$get(MemorySegment seg, long index) {
        return (short)constants$352.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void e_csum$set(MemorySegment seg, long index, short x) {
        constants$352.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_ip$VH() {
        return constants$352.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_ip;
     * }
     */
    public static short e_ip$get(MemorySegment seg) {
        return (short)constants$352.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_ip;
     * }
     */
    public static void e_ip$set(MemorySegment seg, short x) {
        constants$352.const$2.set(seg, x);
    }
    public static short e_ip$get(MemorySegment seg, long index) {
        return (short)constants$352.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void e_ip$set(MemorySegment seg, long index, short x) {
        constants$352.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_cs$VH() {
        return constants$352.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_cs;
     * }
     */
    public static short e_cs$get(MemorySegment seg) {
        return (short)constants$352.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_cs;
     * }
     */
    public static void e_cs$set(MemorySegment seg, short x) {
        constants$352.const$3.set(seg, x);
    }
    public static short e_cs$get(MemorySegment seg, long index) {
        return (short)constants$352.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void e_cs$set(MemorySegment seg, long index, short x) {
        constants$352.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_lfarlc$VH() {
        return constants$352.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_lfarlc;
     * }
     */
    public static short e_lfarlc$get(MemorySegment seg) {
        return (short)constants$352.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_lfarlc;
     * }
     */
    public static void e_lfarlc$set(MemorySegment seg, short x) {
        constants$352.const$4.set(seg, x);
    }
    public static short e_lfarlc$get(MemorySegment seg, long index) {
        return (short)constants$352.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void e_lfarlc$set(MemorySegment seg, long index, short x) {
        constants$352.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_ovno$VH() {
        return constants$352.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_ovno;
     * }
     */
    public static short e_ovno$get(MemorySegment seg) {
        return (short)constants$352.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_ovno;
     * }
     */
    public static void e_ovno$set(MemorySegment seg, short x) {
        constants$352.const$5.set(seg, x);
    }
    public static short e_ovno$get(MemorySegment seg, long index) {
        return (short)constants$352.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void e_ovno$set(MemorySegment seg, long index, short x) {
        constants$352.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment e_res$slice(MemorySegment seg) {
        return seg.asSlice(28, 8);
    }
    public static VarHandle e_oemid$VH() {
        return constants$353.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_oemid;
     * }
     */
    public static short e_oemid$get(MemorySegment seg) {
        return (short)constants$353.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_oemid;
     * }
     */
    public static void e_oemid$set(MemorySegment seg, short x) {
        constants$353.const$0.set(seg, x);
    }
    public static short e_oemid$get(MemorySegment seg, long index) {
        return (short)constants$353.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void e_oemid$set(MemorySegment seg, long index, short x) {
        constants$353.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle e_oeminfo$VH() {
        return constants$353.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD e_oeminfo;
     * }
     */
    public static short e_oeminfo$get(MemorySegment seg) {
        return (short)constants$353.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD e_oeminfo;
     * }
     */
    public static void e_oeminfo$set(MemorySegment seg, short x) {
        constants$353.const$1.set(seg, x);
    }
    public static short e_oeminfo$get(MemorySegment seg, long index) {
        return (short)constants$353.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void e_oeminfo$set(MemorySegment seg, long index, short x) {
        constants$353.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment e_res2$slice(MemorySegment seg) {
        return seg.asSlice(40, 20);
    }
    public static VarHandle e_lfanew$VH() {
        return constants$353.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LONG e_lfanew;
     * }
     */
    public static int e_lfanew$get(MemorySegment seg) {
        return (int)constants$353.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LONG e_lfanew;
     * }
     */
    public static void e_lfanew$set(MemorySegment seg, int x) {
        constants$353.const$2.set(seg, x);
    }
    public static int e_lfanew$get(MemorySegment seg, long index) {
        return (int)constants$353.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void e_lfanew$set(MemorySegment seg, long index, int x) {
        constants$353.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


