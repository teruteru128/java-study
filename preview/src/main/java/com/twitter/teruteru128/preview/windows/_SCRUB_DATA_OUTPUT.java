// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SCRUB_DATA_OUTPUT {
 *     DWORD Size;
 *     DWORD Flags;
 *     DWORD Status;
 *     ULONGLONG ErrorFileOffset;
 *     ULONGLONG ErrorLength;
 *     ULONGLONG NumberOfBytesRepaired;
 *     ULONGLONG NumberOfBytesFailed;
 *     ULONGLONG InternalFileReference;
 *     WORD ResumeContextLength;
 *     WORD ParityExtentDataOffset;
 *     DWORD Reserved[9];
 *     ULONGLONG NumberOfMetadataBytesProcessed;
 *     ULONGLONG NumberOfDataBytesProcessed;
 *     ULONGLONG TotalNumberOfMetadataBytesInUse;
 *     ULONGLONG TotalNumberOfDataBytesInUse;
 *     ULONGLONG DataBytesSkippedDueToNoAllocation;
 *     ULONGLONG DataBytesSkippedDueToInvalidRun;
 *     ULONGLONG DataBytesSkippedDueToIntegrityStream;
 *     ULONGLONG DataBytesSkippedDueToRegionBeingClean;
 *     ULONGLONG DataBytesSkippedDueToLockConflict;
 *     ULONGLONG DataBytesSkippedDueToNoScrubDataFlag;
 *     ULONGLONG DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag;
 *     ULONGLONG DataBytesScrubbed;
 *     BYTE ResumeContext[1040];
 * };
 * }
 */
public class _SCRUB_DATA_OUTPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$258.const$1;
    }
    public static VarHandle Size$VH() {
        return constants$258.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$258.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$258.const$2.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$258.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$258.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$258.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$258.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$258.const$3.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$258.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$258.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Status$VH() {
        return constants$258.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static int Status$get(MemorySegment seg) {
        return (int)constants$258.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Status;
     * }
     */
    public static void Status$set(MemorySegment seg, int x) {
        constants$258.const$4.set(seg, x);
    }
    public static int Status$get(MemorySegment seg, long index) {
        return (int)constants$258.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Status$set(MemorySegment seg, long index, int x) {
        constants$258.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ErrorFileOffset$VH() {
        return constants$258.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG ErrorFileOffset;
     * }
     */
    public static long ErrorFileOffset$get(MemorySegment seg) {
        return (long)constants$258.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG ErrorFileOffset;
     * }
     */
    public static void ErrorFileOffset$set(MemorySegment seg, long x) {
        constants$258.const$5.set(seg, x);
    }
    public static long ErrorFileOffset$get(MemorySegment seg, long index) {
        return (long)constants$258.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorFileOffset$set(MemorySegment seg, long index, long x) {
        constants$258.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ErrorLength$VH() {
        return constants$259.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG ErrorLength;
     * }
     */
    public static long ErrorLength$get(MemorySegment seg) {
        return (long)constants$259.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG ErrorLength;
     * }
     */
    public static void ErrorLength$set(MemorySegment seg, long x) {
        constants$259.const$0.set(seg, x);
    }
    public static long ErrorLength$get(MemorySegment seg, long index) {
        return (long)constants$259.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorLength$set(MemorySegment seg, long index, long x) {
        constants$259.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumberOfBytesRepaired$VH() {
        return constants$259.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG NumberOfBytesRepaired;
     * }
     */
    public static long NumberOfBytesRepaired$get(MemorySegment seg) {
        return (long)constants$259.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG NumberOfBytesRepaired;
     * }
     */
    public static void NumberOfBytesRepaired$set(MemorySegment seg, long x) {
        constants$259.const$1.set(seg, x);
    }
    public static long NumberOfBytesRepaired$get(MemorySegment seg, long index) {
        return (long)constants$259.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBytesRepaired$set(MemorySegment seg, long index, long x) {
        constants$259.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumberOfBytesFailed$VH() {
        return constants$259.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG NumberOfBytesFailed;
     * }
     */
    public static long NumberOfBytesFailed$get(MemorySegment seg) {
        return (long)constants$259.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG NumberOfBytesFailed;
     * }
     */
    public static void NumberOfBytesFailed$set(MemorySegment seg, long x) {
        constants$259.const$2.set(seg, x);
    }
    public static long NumberOfBytesFailed$get(MemorySegment seg, long index) {
        return (long)constants$259.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfBytesFailed$set(MemorySegment seg, long index, long x) {
        constants$259.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle InternalFileReference$VH() {
        return constants$259.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG InternalFileReference;
     * }
     */
    public static long InternalFileReference$get(MemorySegment seg) {
        return (long)constants$259.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG InternalFileReference;
     * }
     */
    public static void InternalFileReference$set(MemorySegment seg, long x) {
        constants$259.const$3.set(seg, x);
    }
    public static long InternalFileReference$get(MemorySegment seg, long index) {
        return (long)constants$259.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void InternalFileReference$set(MemorySegment seg, long index, long x) {
        constants$259.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ResumeContextLength$VH() {
        return constants$259.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ResumeContextLength;
     * }
     */
    public static short ResumeContextLength$get(MemorySegment seg) {
        return (short)constants$259.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ResumeContextLength;
     * }
     */
    public static void ResumeContextLength$set(MemorySegment seg, short x) {
        constants$259.const$4.set(seg, x);
    }
    public static short ResumeContextLength$get(MemorySegment seg, long index) {
        return (short)constants$259.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ResumeContextLength$set(MemorySegment seg, long index, short x) {
        constants$259.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ParityExtentDataOffset$VH() {
        return constants$259.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD ParityExtentDataOffset;
     * }
     */
    public static short ParityExtentDataOffset$get(MemorySegment seg) {
        return (short)constants$259.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD ParityExtentDataOffset;
     * }
     */
    public static void ParityExtentDataOffset$set(MemorySegment seg, short x) {
        constants$259.const$5.set(seg, x);
    }
    public static short ParityExtentDataOffset$get(MemorySegment seg, long index) {
        return (short)constants$259.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ParityExtentDataOffset$set(MemorySegment seg, long index, short x) {
        constants$259.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved$slice(MemorySegment seg) {
        return seg.asSlice(60, 36);
    }
    public static VarHandle NumberOfMetadataBytesProcessed$VH() {
        return constants$260.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG NumberOfMetadataBytesProcessed;
     * }
     */
    public static long NumberOfMetadataBytesProcessed$get(MemorySegment seg) {
        return (long)constants$260.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG NumberOfMetadataBytesProcessed;
     * }
     */
    public static void NumberOfMetadataBytesProcessed$set(MemorySegment seg, long x) {
        constants$260.const$0.set(seg, x);
    }
    public static long NumberOfMetadataBytesProcessed$get(MemorySegment seg, long index) {
        return (long)constants$260.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfMetadataBytesProcessed$set(MemorySegment seg, long index, long x) {
        constants$260.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumberOfDataBytesProcessed$VH() {
        return constants$260.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG NumberOfDataBytesProcessed;
     * }
     */
    public static long NumberOfDataBytesProcessed$get(MemorySegment seg) {
        return (long)constants$260.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG NumberOfDataBytesProcessed;
     * }
     */
    public static void NumberOfDataBytesProcessed$set(MemorySegment seg, long x) {
        constants$260.const$1.set(seg, x);
    }
    public static long NumberOfDataBytesProcessed$get(MemorySegment seg, long index) {
        return (long)constants$260.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfDataBytesProcessed$set(MemorySegment seg, long index, long x) {
        constants$260.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TotalNumberOfMetadataBytesInUse$VH() {
        return constants$260.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalNumberOfMetadataBytesInUse;
     * }
     */
    public static long TotalNumberOfMetadataBytesInUse$get(MemorySegment seg) {
        return (long)constants$260.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalNumberOfMetadataBytesInUse;
     * }
     */
    public static void TotalNumberOfMetadataBytesInUse$set(MemorySegment seg, long x) {
        constants$260.const$2.set(seg, x);
    }
    public static long TotalNumberOfMetadataBytesInUse$get(MemorySegment seg, long index) {
        return (long)constants$260.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNumberOfMetadataBytesInUse$set(MemorySegment seg, long index, long x) {
        constants$260.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle TotalNumberOfDataBytesInUse$VH() {
        return constants$260.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG TotalNumberOfDataBytesInUse;
     * }
     */
    public static long TotalNumberOfDataBytesInUse$get(MemorySegment seg) {
        return (long)constants$260.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG TotalNumberOfDataBytesInUse;
     * }
     */
    public static void TotalNumberOfDataBytesInUse$set(MemorySegment seg, long x) {
        constants$260.const$3.set(seg, x);
    }
    public static long TotalNumberOfDataBytesInUse$get(MemorySegment seg, long index) {
        return (long)constants$260.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalNumberOfDataBytesInUse$set(MemorySegment seg, long index, long x) {
        constants$260.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DataBytesSkippedDueToNoAllocation$VH() {
        return constants$260.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoAllocation;
     * }
     */
    public static long DataBytesSkippedDueToNoAllocation$get(MemorySegment seg) {
        return (long)constants$260.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoAllocation;
     * }
     */
    public static void DataBytesSkippedDueToNoAllocation$set(MemorySegment seg, long x) {
        constants$260.const$4.set(seg, x);
    }
    public static long DataBytesSkippedDueToNoAllocation$get(MemorySegment seg, long index) {
        return (long)constants$260.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToNoAllocation$set(MemorySegment seg, long index, long x) {
        constants$260.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DataBytesSkippedDueToInvalidRun$VH() {
        return constants$260.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToInvalidRun;
     * }
     */
    public static long DataBytesSkippedDueToInvalidRun$get(MemorySegment seg) {
        return (long)constants$260.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToInvalidRun;
     * }
     */
    public static void DataBytesSkippedDueToInvalidRun$set(MemorySegment seg, long x) {
        constants$260.const$5.set(seg, x);
    }
    public static long DataBytesSkippedDueToInvalidRun$get(MemorySegment seg, long index) {
        return (long)constants$260.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToInvalidRun$set(MemorySegment seg, long index, long x) {
        constants$260.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DataBytesSkippedDueToIntegrityStream$VH() {
        return constants$261.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToIntegrityStream;
     * }
     */
    public static long DataBytesSkippedDueToIntegrityStream$get(MemorySegment seg) {
        return (long)constants$261.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToIntegrityStream;
     * }
     */
    public static void DataBytesSkippedDueToIntegrityStream$set(MemorySegment seg, long x) {
        constants$261.const$0.set(seg, x);
    }
    public static long DataBytesSkippedDueToIntegrityStream$get(MemorySegment seg, long index) {
        return (long)constants$261.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToIntegrityStream$set(MemorySegment seg, long index, long x) {
        constants$261.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DataBytesSkippedDueToRegionBeingClean$VH() {
        return constants$261.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToRegionBeingClean;
     * }
     */
    public static long DataBytesSkippedDueToRegionBeingClean$get(MemorySegment seg) {
        return (long)constants$261.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToRegionBeingClean;
     * }
     */
    public static void DataBytesSkippedDueToRegionBeingClean$set(MemorySegment seg, long x) {
        constants$261.const$1.set(seg, x);
    }
    public static long DataBytesSkippedDueToRegionBeingClean$get(MemorySegment seg, long index) {
        return (long)constants$261.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToRegionBeingClean$set(MemorySegment seg, long index, long x) {
        constants$261.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DataBytesSkippedDueToLockConflict$VH() {
        return constants$261.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToLockConflict;
     * }
     */
    public static long DataBytesSkippedDueToLockConflict$get(MemorySegment seg) {
        return (long)constants$261.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToLockConflict;
     * }
     */
    public static void DataBytesSkippedDueToLockConflict$set(MemorySegment seg, long x) {
        constants$261.const$2.set(seg, x);
    }
    public static long DataBytesSkippedDueToLockConflict$get(MemorySegment seg, long index) {
        return (long)constants$261.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToLockConflict$set(MemorySegment seg, long index, long x) {
        constants$261.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DataBytesSkippedDueToNoScrubDataFlag$VH() {
        return constants$261.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoScrubDataFlag;
     * }
     */
    public static long DataBytesSkippedDueToNoScrubDataFlag$get(MemorySegment seg) {
        return (long)constants$261.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoScrubDataFlag;
     * }
     */
    public static void DataBytesSkippedDueToNoScrubDataFlag$set(MemorySegment seg, long x) {
        constants$261.const$3.set(seg, x);
    }
    public static long DataBytesSkippedDueToNoScrubDataFlag$get(MemorySegment seg, long index) {
        return (long)constants$261.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToNoScrubDataFlag$set(MemorySegment seg, long index, long x) {
        constants$261.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$VH() {
        return constants$261.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag;
     * }
     */
    public static long DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$get(MemorySegment seg) {
        return (long)constants$261.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag;
     * }
     */
    public static void DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$set(MemorySegment seg, long x) {
        constants$261.const$4.set(seg, x);
    }
    public static long DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$get(MemorySegment seg, long index) {
        return (long)constants$261.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesSkippedDueToNoScrubNonIntegrityStreamFlag$set(MemorySegment seg, long index, long x) {
        constants$261.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DataBytesScrubbed$VH() {
        return constants$261.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG DataBytesScrubbed;
     * }
     */
    public static long DataBytesScrubbed$get(MemorySegment seg) {
        return (long)constants$261.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG DataBytesScrubbed;
     * }
     */
    public static void DataBytesScrubbed$set(MemorySegment seg, long x) {
        constants$261.const$5.set(seg, x);
    }
    public static long DataBytesScrubbed$get(MemorySegment seg, long index) {
        return (long)constants$261.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytesScrubbed$set(MemorySegment seg, long index, long x) {
        constants$261.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ResumeContext$slice(MemorySegment seg) {
        return seg.asSlice(192, 1040);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


