// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_SEPARATE_DEBUG_HEADER {
 *     WORD Signature;
 *     WORD Flags;
 *     WORD Machine;
 *     WORD Characteristics;
 *     DWORD TimeDateStamp;
 *     DWORD CheckSum;
 *     DWORD ImageBase;
 *     DWORD SizeOfImage;
 *     DWORD NumberOfSections;
 *     DWORD ExportedNamesSize;
 *     DWORD DebugDirectorySize;
 *     DWORD SectionAlignment;
 *     DWORD Reserved[2];
 * };
 * }
 */
public class _IMAGE_SEPARATE_DEBUG_HEADER {

    public static MemoryLayout $LAYOUT() {
        return constants$457.const$1;
    }
    public static VarHandle Signature$VH() {
        return constants$457.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Signature;
     * }
     */
    public static short Signature$get(MemorySegment seg) {
        return (short)constants$457.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Signature;
     * }
     */
    public static void Signature$set(MemorySegment seg, short x) {
        constants$457.const$2.set(seg, x);
    }
    public static short Signature$get(MemorySegment seg, long index) {
        return (short)constants$457.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, short x) {
        constants$457.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$457.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Flags;
     * }
     */
    public static short Flags$get(MemorySegment seg) {
        return (short)constants$457.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, short x) {
        constants$457.const$3.set(seg, x);
    }
    public static short Flags$get(MemorySegment seg, long index) {
        return (short)constants$457.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, short x) {
        constants$457.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Machine$VH() {
        return constants$457.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static short Machine$get(MemorySegment seg) {
        return (short)constants$457.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Machine;
     * }
     */
    public static void Machine$set(MemorySegment seg, short x) {
        constants$457.const$4.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)constants$457.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        constants$457.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Characteristics$VH() {
        return constants$457.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Characteristics;
     * }
     */
    public static short Characteristics$get(MemorySegment seg) {
        return (short)constants$457.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Characteristics;
     * }
     */
    public static void Characteristics$set(MemorySegment seg, short x) {
        constants$457.const$5.set(seg, x);
    }
    public static short Characteristics$get(MemorySegment seg, long index) {
        return (short)constants$457.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Characteristics$set(MemorySegment seg, long index, short x) {
        constants$457.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TimeDateStamp$VH() {
        return constants$458.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)constants$458.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD TimeDateStamp;
     * }
     */
    public static void TimeDateStamp$set(MemorySegment seg, int x) {
        constants$458.const$0.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)constants$458.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        constants$458.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CheckSum$VH() {
        return constants$458.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD CheckSum;
     * }
     */
    public static int CheckSum$get(MemorySegment seg) {
        return (int)constants$458.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD CheckSum;
     * }
     */
    public static void CheckSum$set(MemorySegment seg, int x) {
        constants$458.const$1.set(seg, x);
    }
    public static int CheckSum$get(MemorySegment seg, long index) {
        return (int)constants$458.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void CheckSum$set(MemorySegment seg, long index, int x) {
        constants$458.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ImageBase$VH() {
        return constants$458.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ImageBase;
     * }
     */
    public static int ImageBase$get(MemorySegment seg) {
        return (int)constants$458.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ImageBase;
     * }
     */
    public static void ImageBase$set(MemorySegment seg, int x) {
        constants$458.const$2.set(seg, x);
    }
    public static int ImageBase$get(MemorySegment seg, long index) {
        return (int)constants$458.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageBase$set(MemorySegment seg, long index, int x) {
        constants$458.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SizeOfImage$VH() {
        return constants$458.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfImage;
     * }
     */
    public static int SizeOfImage$get(MemorySegment seg) {
        return (int)constants$458.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfImage;
     * }
     */
    public static void SizeOfImage$set(MemorySegment seg, int x) {
        constants$458.const$3.set(seg, x);
    }
    public static int SizeOfImage$get(MemorySegment seg, long index) {
        return (int)constants$458.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfImage$set(MemorySegment seg, long index, int x) {
        constants$458.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumberOfSections$VH() {
        return constants$458.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberOfSections;
     * }
     */
    public static int NumberOfSections$get(MemorySegment seg) {
        return (int)constants$458.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberOfSections;
     * }
     */
    public static void NumberOfSections$set(MemorySegment seg, int x) {
        constants$458.const$4.set(seg, x);
    }
    public static int NumberOfSections$get(MemorySegment seg, long index) {
        return (int)constants$458.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfSections$set(MemorySegment seg, long index, int x) {
        constants$458.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ExportedNamesSize$VH() {
        return constants$458.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ExportedNamesSize;
     * }
     */
    public static int ExportedNamesSize$get(MemorySegment seg) {
        return (int)constants$458.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ExportedNamesSize;
     * }
     */
    public static void ExportedNamesSize$set(MemorySegment seg, int x) {
        constants$458.const$5.set(seg, x);
    }
    public static int ExportedNamesSize$get(MemorySegment seg, long index) {
        return (int)constants$458.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ExportedNamesSize$set(MemorySegment seg, long index, int x) {
        constants$458.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DebugDirectorySize$VH() {
        return constants$459.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DebugDirectorySize;
     * }
     */
    public static int DebugDirectorySize$get(MemorySegment seg) {
        return (int)constants$459.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DebugDirectorySize;
     * }
     */
    public static void DebugDirectorySize$set(MemorySegment seg, int x) {
        constants$459.const$0.set(seg, x);
    }
    public static int DebugDirectorySize$get(MemorySegment seg, long index) {
        return (int)constants$459.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void DebugDirectorySize$set(MemorySegment seg, long index, int x) {
        constants$459.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SectionAlignment$VH() {
        return constants$459.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SectionAlignment;
     * }
     */
    public static int SectionAlignment$get(MemorySegment seg) {
        return (int)constants$459.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SectionAlignment;
     * }
     */
    public static void SectionAlignment$set(MemorySegment seg, int x) {
        constants$459.const$1.set(seg, x);
    }
    public static int SectionAlignment$get(MemorySegment seg, long index) {
        return (int)constants$459.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void SectionAlignment$set(MemorySegment seg, long index, int x) {
        constants$459.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

