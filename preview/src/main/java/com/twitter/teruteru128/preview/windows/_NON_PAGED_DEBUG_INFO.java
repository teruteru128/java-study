// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _NON_PAGED_DEBUG_INFO {
 *     WORD Signature;
 *     WORD Flags;
 *     DWORD Size;
 *     WORD Machine;
 *     WORD Characteristics;
 *     DWORD TimeDateStamp;
 *     DWORD CheckSum;
 *     DWORD SizeOfImage;
 *     ULONGLONG ImageBase;
 * };
 * }
 */
public class _NON_PAGED_DEBUG_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$459.const$2;
    }
    public static VarHandle Signature$VH() {
        return constants$459.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Signature;
     * }
     */
    public static short Signature$get(MemorySegment seg) {
        return (short)constants$459.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Signature;
     * }
     */
    public static void Signature$set(MemorySegment seg, short x) {
        constants$459.const$3.set(seg, x);
    }
    public static short Signature$get(MemorySegment seg, long index) {
        return (short)constants$459.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, short x) {
        constants$459.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$459.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Flags;
     * }
     */
    public static short Flags$get(MemorySegment seg) {
        return (short)constants$459.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, short x) {
        constants$459.const$4.set(seg, x);
    }
    public static short Flags$get(MemorySegment seg, long index) {
        return (short)constants$459.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, short x) {
        constants$459.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$459.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$459.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$459.const$5.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$459.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$459.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Machine$VH() {
        return constants$460.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static short Machine$get(MemorySegment seg) {
        return (short)constants$460.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static void Machine$set(MemorySegment seg, short x) {
        constants$460.const$0.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)constants$460.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        constants$460.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Characteristics$VH() {
        return constants$460.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Characteristics;
     * }
     */
    public static short Characteristics$get(MemorySegment seg) {
        return (short)constants$460.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Characteristics;
     * }
     */
    public static void Characteristics$set(MemorySegment seg, short x) {
        constants$460.const$1.set(seg, x);
    }
    public static short Characteristics$get(MemorySegment seg, long index) {
        return (short)constants$460.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, short x) {
        constants$460.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TimeDateStamp$VH() {
        return constants$460.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)constants$460.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static void TimeDateStamp$set(MemorySegment seg, int x) {
        constants$460.const$2.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)constants$460.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        constants$460.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CheckSum$VH() {
        return constants$460.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CheckSum;
     * }
     */
    public static int CheckSum$get(MemorySegment seg) {
        return (int)constants$460.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CheckSum;
     * }
     */
    public static void CheckSum$set(MemorySegment seg, int x) {
        constants$460.const$3.set(seg, x);
    }
    public static int CheckSum$get(MemorySegment seg, long index) {
        return (int)constants$460.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void CheckSum$set(MemorySegment seg, long index, int x) {
        constants$460.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SizeOfImage$VH() {
        return constants$460.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfImage;
     * }
     */
    public static int SizeOfImage$get(MemorySegment seg) {
        return (int)constants$460.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfImage;
     * }
     */
    public static void SizeOfImage$set(MemorySegment seg, int x) {
        constants$460.const$4.set(seg, x);
    }
    public static int SizeOfImage$get(MemorySegment seg, long index) {
        return (int)constants$460.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfImage$set(MemorySegment seg, long index, int x) {
        constants$460.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ImageBase$VH() {
        return constants$460.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG ImageBase;
     * }
     */
    public static long ImageBase$get(MemorySegment seg) {
        return (long)constants$460.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG ImageBase;
     * }
     */
    public static void ImageBase$set(MemorySegment seg, long x) {
        constants$460.const$5.set(seg, x);
    }
    public static long ImageBase$get(MemorySegment seg, long index) {
        return (long)constants$460.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageBase$set(MemorySegment seg, long index, long x) {
        constants$460.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

