// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _FILESYSTEM_STATISTICS_EX {
 *     WORD FileSystemType;
 *     WORD Version;
 *     DWORD SizeOfCompleteStructure;
 *     DWORDLONG UserFileReads;
 *     DWORDLONG UserFileReadBytes;
 *     DWORDLONG UserDiskReads;
 *     DWORDLONG UserFileWrites;
 *     DWORDLONG UserFileWriteBytes;
 *     DWORDLONG UserDiskWrites;
 *     DWORDLONG MetaDataReads;
 *     DWORDLONG MetaDataReadBytes;
 *     DWORDLONG MetaDataDiskReads;
 *     DWORDLONG MetaDataWrites;
 *     DWORDLONG MetaDataWriteBytes;
 *     DWORDLONG MetaDataDiskWrites;
 * };
 * }
 */
public class _FILESYSTEM_STATISTICS_EX {

    public static MemoryLayout $LAYOUT() {
        return constants$2621.const$0;
    }
    public static VarHandle FileSystemType$VH() {
        return constants$2621.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FileSystemType;
     * }
     */
    public static short FileSystemType$get(MemorySegment seg) {
        return (short)constants$2621.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FileSystemType;
     * }
     */
    public static void FileSystemType$set(MemorySegment seg, short x) {
        constants$2621.const$1.set(seg, x);
    }
    public static short FileSystemType$get(MemorySegment seg, long index) {
        return (short)constants$2621.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void FileSystemType$set(MemorySegment seg, long index, short x) {
        constants$2621.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Version$VH() {
        return constants$2621.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static short Version$get(MemorySegment seg) {
        return (short)constants$2621.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, short x) {
        constants$2621.const$2.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)constants$2621.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        constants$2621.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SizeOfCompleteStructure$VH() {
        return constants$2621.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SizeOfCompleteStructure;
     * }
     */
    public static int SizeOfCompleteStructure$get(MemorySegment seg) {
        return (int)constants$2621.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SizeOfCompleteStructure;
     * }
     */
    public static void SizeOfCompleteStructure$set(MemorySegment seg, int x) {
        constants$2621.const$3.set(seg, x);
    }
    public static int SizeOfCompleteStructure$get(MemorySegment seg, long index) {
        return (int)constants$2621.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfCompleteStructure$set(MemorySegment seg, long index, int x) {
        constants$2621.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UserFileReads$VH() {
        return constants$2621.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UserFileReads;
     * }
     */
    public static long UserFileReads$get(MemorySegment seg) {
        return (long)constants$2621.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UserFileReads;
     * }
     */
    public static void UserFileReads$set(MemorySegment seg, long x) {
        constants$2621.const$4.set(seg, x);
    }
    public static long UserFileReads$get(MemorySegment seg, long index) {
        return (long)constants$2621.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void UserFileReads$set(MemorySegment seg, long index, long x) {
        constants$2621.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UserFileReadBytes$VH() {
        return constants$2621.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UserFileReadBytes;
     * }
     */
    public static long UserFileReadBytes$get(MemorySegment seg) {
        return (long)constants$2621.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UserFileReadBytes;
     * }
     */
    public static void UserFileReadBytes$set(MemorySegment seg, long x) {
        constants$2621.const$5.set(seg, x);
    }
    public static long UserFileReadBytes$get(MemorySegment seg, long index) {
        return (long)constants$2621.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void UserFileReadBytes$set(MemorySegment seg, long index, long x) {
        constants$2621.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UserDiskReads$VH() {
        return constants$2622.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UserDiskReads;
     * }
     */
    public static long UserDiskReads$get(MemorySegment seg) {
        return (long)constants$2622.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UserDiskReads;
     * }
     */
    public static void UserDiskReads$set(MemorySegment seg, long x) {
        constants$2622.const$0.set(seg, x);
    }
    public static long UserDiskReads$get(MemorySegment seg, long index) {
        return (long)constants$2622.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void UserDiskReads$set(MemorySegment seg, long index, long x) {
        constants$2622.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UserFileWrites$VH() {
        return constants$2622.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UserFileWrites;
     * }
     */
    public static long UserFileWrites$get(MemorySegment seg) {
        return (long)constants$2622.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UserFileWrites;
     * }
     */
    public static void UserFileWrites$set(MemorySegment seg, long x) {
        constants$2622.const$1.set(seg, x);
    }
    public static long UserFileWrites$get(MemorySegment seg, long index) {
        return (long)constants$2622.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void UserFileWrites$set(MemorySegment seg, long index, long x) {
        constants$2622.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UserFileWriteBytes$VH() {
        return constants$2622.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UserFileWriteBytes;
     * }
     */
    public static long UserFileWriteBytes$get(MemorySegment seg) {
        return (long)constants$2622.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UserFileWriteBytes;
     * }
     */
    public static void UserFileWriteBytes$set(MemorySegment seg, long x) {
        constants$2622.const$2.set(seg, x);
    }
    public static long UserFileWriteBytes$get(MemorySegment seg, long index) {
        return (long)constants$2622.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void UserFileWriteBytes$set(MemorySegment seg, long index, long x) {
        constants$2622.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UserDiskWrites$VH() {
        return constants$2622.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UserDiskWrites;
     * }
     */
    public static long UserDiskWrites$get(MemorySegment seg) {
        return (long)constants$2622.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UserDiskWrites;
     * }
     */
    public static void UserDiskWrites$set(MemorySegment seg, long x) {
        constants$2622.const$3.set(seg, x);
    }
    public static long UserDiskWrites$get(MemorySegment seg, long index) {
        return (long)constants$2622.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void UserDiskWrites$set(MemorySegment seg, long index, long x) {
        constants$2622.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MetaDataReads$VH() {
        return constants$2622.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG MetaDataReads;
     * }
     */
    public static long MetaDataReads$get(MemorySegment seg) {
        return (long)constants$2622.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG MetaDataReads;
     * }
     */
    public static void MetaDataReads$set(MemorySegment seg, long x) {
        constants$2622.const$4.set(seg, x);
    }
    public static long MetaDataReads$get(MemorySegment seg, long index) {
        return (long)constants$2622.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataReads$set(MemorySegment seg, long index, long x) {
        constants$2622.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MetaDataReadBytes$VH() {
        return constants$2622.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG MetaDataReadBytes;
     * }
     */
    public static long MetaDataReadBytes$get(MemorySegment seg) {
        return (long)constants$2622.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG MetaDataReadBytes;
     * }
     */
    public static void MetaDataReadBytes$set(MemorySegment seg, long x) {
        constants$2622.const$5.set(seg, x);
    }
    public static long MetaDataReadBytes$get(MemorySegment seg, long index) {
        return (long)constants$2622.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataReadBytes$set(MemorySegment seg, long index, long x) {
        constants$2622.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MetaDataDiskReads$VH() {
        return constants$2623.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG MetaDataDiskReads;
     * }
     */
    public static long MetaDataDiskReads$get(MemorySegment seg) {
        return (long)constants$2623.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG MetaDataDiskReads;
     * }
     */
    public static void MetaDataDiskReads$set(MemorySegment seg, long x) {
        constants$2623.const$0.set(seg, x);
    }
    public static long MetaDataDiskReads$get(MemorySegment seg, long index) {
        return (long)constants$2623.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataDiskReads$set(MemorySegment seg, long index, long x) {
        constants$2623.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MetaDataWrites$VH() {
        return constants$2623.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG MetaDataWrites;
     * }
     */
    public static long MetaDataWrites$get(MemorySegment seg) {
        return (long)constants$2623.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG MetaDataWrites;
     * }
     */
    public static void MetaDataWrites$set(MemorySegment seg, long x) {
        constants$2623.const$1.set(seg, x);
    }
    public static long MetaDataWrites$get(MemorySegment seg, long index) {
        return (long)constants$2623.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataWrites$set(MemorySegment seg, long index, long x) {
        constants$2623.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MetaDataWriteBytes$VH() {
        return constants$2623.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG MetaDataWriteBytes;
     * }
     */
    public static long MetaDataWriteBytes$get(MemorySegment seg) {
        return (long)constants$2623.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG MetaDataWriteBytes;
     * }
     */
    public static void MetaDataWriteBytes$set(MemorySegment seg, long x) {
        constants$2623.const$2.set(seg, x);
    }
    public static long MetaDataWriteBytes$get(MemorySegment seg, long index) {
        return (long)constants$2623.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataWriteBytes$set(MemorySegment seg, long index, long x) {
        constants$2623.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MetaDataDiskWrites$VH() {
        return constants$2623.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG MetaDataDiskWrites;
     * }
     */
    public static long MetaDataDiskWrites$get(MemorySegment seg) {
        return (long)constants$2623.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG MetaDataDiskWrites;
     * }
     */
    public static void MetaDataDiskWrites$set(MemorySegment seg, long x) {
        constants$2623.const$3.set(seg, x);
    }
    public static long MetaDataDiskWrites$get(MemorySegment seg, long index) {
        return (long)constants$2623.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void MetaDataDiskWrites$set(MemorySegment seg, long index, long x) {
        constants$2623.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

