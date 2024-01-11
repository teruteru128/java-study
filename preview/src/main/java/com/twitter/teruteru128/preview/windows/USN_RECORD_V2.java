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
 *     DWORD RecordLength;
 *     WORD MajorVersion;
 *     WORD MinorVersion;
 *     DWORDLONG FileReferenceNumber;
 *     DWORDLONG ParentFileReferenceNumber;
 *     USN Usn;
 *     LARGE_INTEGER TimeStamp;
 *     DWORD Reason;
 *     DWORD SourceInfo;
 *     DWORD SecurityId;
 *     DWORD FileAttributes;
 *     WORD FileNameLength;
 *     WORD FileNameOffset;
 *     WCHAR FileName[1];
 * };
 * }
 */
public class USN_RECORD_V2 {

    public static MemoryLayout $LAYOUT() {
        return constants$2588.const$0;
    }
    public static VarHandle RecordLength$VH() {
        return constants$2588.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD RecordLength;
     * }
     */
    public static int RecordLength$get(MemorySegment seg) {
        return (int)constants$2588.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD RecordLength;
     * }
     */
    public static void RecordLength$set(MemorySegment seg, int x) {
        constants$2588.const$1.set(seg, x);
    }
    public static int RecordLength$get(MemorySegment seg, long index) {
        return (int)constants$2588.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void RecordLength$set(MemorySegment seg, long index, int x) {
        constants$2588.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MajorVersion$VH() {
        return constants$2588.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MajorVersion;
     * }
     */
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)constants$2588.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MajorVersion;
     * }
     */
    public static void MajorVersion$set(MemorySegment seg, short x) {
        constants$2588.const$2.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)constants$2588.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        constants$2588.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MinorVersion$VH() {
        return constants$2588.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinorVersion;
     * }
     */
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)constants$2588.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinorVersion;
     * }
     */
    public static void MinorVersion$set(MemorySegment seg, short x) {
        constants$2588.const$3.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)constants$2588.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        constants$2588.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FileReferenceNumber$VH() {
        return constants$2588.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG FileReferenceNumber;
     * }
     */
    public static long FileReferenceNumber$get(MemorySegment seg) {
        return (long)constants$2588.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG FileReferenceNumber;
     * }
     */
    public static void FileReferenceNumber$set(MemorySegment seg, long x) {
        constants$2588.const$4.set(seg, x);
    }
    public static long FileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)constants$2588.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void FileReferenceNumber$set(MemorySegment seg, long index, long x) {
        constants$2588.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ParentFileReferenceNumber$VH() {
        return constants$2588.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG ParentFileReferenceNumber;
     * }
     */
    public static long ParentFileReferenceNumber$get(MemorySegment seg) {
        return (long)constants$2588.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG ParentFileReferenceNumber;
     * }
     */
    public static void ParentFileReferenceNumber$set(MemorySegment seg, long x) {
        constants$2588.const$5.set(seg, x);
    }
    public static long ParentFileReferenceNumber$get(MemorySegment seg, long index) {
        return (long)constants$2588.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ParentFileReferenceNumber$set(MemorySegment seg, long index, long x) {
        constants$2588.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Usn$VH() {
        return constants$2589.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USN Usn;
     * }
     */
    public static long Usn$get(MemorySegment seg) {
        return (long)constants$2589.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USN Usn;
     * }
     */
    public static void Usn$set(MemorySegment seg, long x) {
        constants$2589.const$0.set(seg, x);
    }
    public static long Usn$get(MemorySegment seg, long index) {
        return (long)constants$2589.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Usn$set(MemorySegment seg, long index, long x) {
        constants$2589.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment TimeStamp$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static VarHandle Reason$VH() {
        return constants$2589.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reason;
     * }
     */
    public static int Reason$get(MemorySegment seg) {
        return (int)constants$2589.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reason;
     * }
     */
    public static void Reason$set(MemorySegment seg, int x) {
        constants$2589.const$1.set(seg, x);
    }
    public static int Reason$get(MemorySegment seg, long index) {
        return (int)constants$2589.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Reason$set(MemorySegment seg, long index, int x) {
        constants$2589.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SourceInfo$VH() {
        return constants$2589.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SourceInfo;
     * }
     */
    public static int SourceInfo$get(MemorySegment seg) {
        return (int)constants$2589.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SourceInfo;
     * }
     */
    public static void SourceInfo$set(MemorySegment seg, int x) {
        constants$2589.const$2.set(seg, x);
    }
    public static int SourceInfo$get(MemorySegment seg, long index) {
        return (int)constants$2589.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void SourceInfo$set(MemorySegment seg, long index, int x) {
        constants$2589.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle SecurityId$VH() {
        return constants$2589.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD SecurityId;
     * }
     */
    public static int SecurityId$get(MemorySegment seg) {
        return (int)constants$2589.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD SecurityId;
     * }
     */
    public static void SecurityId$set(MemorySegment seg, int x) {
        constants$2589.const$3.set(seg, x);
    }
    public static int SecurityId$get(MemorySegment seg, long index) {
        return (int)constants$2589.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityId$set(MemorySegment seg, long index, int x) {
        constants$2589.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FileAttributes$VH() {
        return constants$2589.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD FileAttributes;
     * }
     */
    public static int FileAttributes$get(MemorySegment seg) {
        return (int)constants$2589.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD FileAttributes;
     * }
     */
    public static void FileAttributes$set(MemorySegment seg, int x) {
        constants$2589.const$4.set(seg, x);
    }
    public static int FileAttributes$get(MemorySegment seg, long index) {
        return (int)constants$2589.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void FileAttributes$set(MemorySegment seg, long index, int x) {
        constants$2589.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FileNameLength$VH() {
        return constants$2589.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FileNameLength;
     * }
     */
    public static short FileNameLength$get(MemorySegment seg) {
        return (short)constants$2589.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FileNameLength;
     * }
     */
    public static void FileNameLength$set(MemorySegment seg, short x) {
        constants$2589.const$5.set(seg, x);
    }
    public static short FileNameLength$get(MemorySegment seg, long index) {
        return (short)constants$2589.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameLength$set(MemorySegment seg, long index, short x) {
        constants$2589.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle FileNameOffset$VH() {
        return constants$2590.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD FileNameOffset;
     * }
     */
    public static short FileNameOffset$get(MemorySegment seg) {
        return (short)constants$2590.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD FileNameOffset;
     * }
     */
    public static void FileNameOffset$set(MemorySegment seg, short x) {
        constants$2590.const$0.set(seg, x);
    }
    public static short FileNameOffset$get(MemorySegment seg, long index) {
        return (short)constants$2590.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameOffset$set(MemorySegment seg, long index, short x) {
        constants$2590.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(60, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


