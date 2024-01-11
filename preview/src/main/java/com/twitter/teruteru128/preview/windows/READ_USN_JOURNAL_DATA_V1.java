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
 *     USN StartUsn;
 *     DWORD ReasonMask;
 *     DWORD ReturnOnlyOnClose;
 *     DWORDLONG Timeout;
 *     DWORDLONG BytesToWaitFor;
 *     DWORDLONG UsnJournalID;
 *     WORD MinMajorVersion;
 *     WORD MaxMajorVersion;
 * };
 * }
 */
public class READ_USN_JOURNAL_DATA_V1 {

    public static MemoryLayout $LAYOUT() {
        return constants$2585.const$2;
    }
    public static VarHandle StartUsn$VH() {
        return constants$2585.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * USN StartUsn;
     * }
     */
    public static long StartUsn$get(MemorySegment seg) {
        return (long)constants$2585.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * USN StartUsn;
     * }
     */
    public static void StartUsn$set(MemorySegment seg, long x) {
        constants$2585.const$3.set(seg, x);
    }
    public static long StartUsn$get(MemorySegment seg, long index) {
        return (long)constants$2585.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void StartUsn$set(MemorySegment seg, long index, long x) {
        constants$2585.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ReasonMask$VH() {
        return constants$2585.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ReasonMask;
     * }
     */
    public static int ReasonMask$get(MemorySegment seg) {
        return (int)constants$2585.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ReasonMask;
     * }
     */
    public static void ReasonMask$set(MemorySegment seg, int x) {
        constants$2585.const$4.set(seg, x);
    }
    public static int ReasonMask$get(MemorySegment seg, long index) {
        return (int)constants$2585.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ReasonMask$set(MemorySegment seg, long index, int x) {
        constants$2585.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ReturnOnlyOnClose$VH() {
        return constants$2585.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ReturnOnlyOnClose;
     * }
     */
    public static int ReturnOnlyOnClose$get(MemorySegment seg) {
        return (int)constants$2585.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ReturnOnlyOnClose;
     * }
     */
    public static void ReturnOnlyOnClose$set(MemorySegment seg, int x) {
        constants$2585.const$5.set(seg, x);
    }
    public static int ReturnOnlyOnClose$get(MemorySegment seg, long index) {
        return (int)constants$2585.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ReturnOnlyOnClose$set(MemorySegment seg, long index, int x) {
        constants$2585.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Timeout$VH() {
        return constants$2586.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG Timeout;
     * }
     */
    public static long Timeout$get(MemorySegment seg) {
        return (long)constants$2586.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG Timeout;
     * }
     */
    public static void Timeout$set(MemorySegment seg, long x) {
        constants$2586.const$0.set(seg, x);
    }
    public static long Timeout$get(MemorySegment seg, long index) {
        return (long)constants$2586.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Timeout$set(MemorySegment seg, long index, long x) {
        constants$2586.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle BytesToWaitFor$VH() {
        return constants$2586.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG BytesToWaitFor;
     * }
     */
    public static long BytesToWaitFor$get(MemorySegment seg) {
        return (long)constants$2586.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG BytesToWaitFor;
     * }
     */
    public static void BytesToWaitFor$set(MemorySegment seg, long x) {
        constants$2586.const$1.set(seg, x);
    }
    public static long BytesToWaitFor$get(MemorySegment seg, long index) {
        return (long)constants$2586.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void BytesToWaitFor$set(MemorySegment seg, long index, long x) {
        constants$2586.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle UsnJournalID$VH() {
        return constants$2586.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG UsnJournalID;
     * }
     */
    public static long UsnJournalID$get(MemorySegment seg) {
        return (long)constants$2586.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG UsnJournalID;
     * }
     */
    public static void UsnJournalID$set(MemorySegment seg, long x) {
        constants$2586.const$2.set(seg, x);
    }
    public static long UsnJournalID$get(MemorySegment seg, long index) {
        return (long)constants$2586.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void UsnJournalID$set(MemorySegment seg, long index, long x) {
        constants$2586.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MinMajorVersion$VH() {
        return constants$2586.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MinMajorVersion;
     * }
     */
    public static short MinMajorVersion$get(MemorySegment seg) {
        return (short)constants$2586.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MinMajorVersion;
     * }
     */
    public static void MinMajorVersion$set(MemorySegment seg, short x) {
        constants$2586.const$3.set(seg, x);
    }
    public static short MinMajorVersion$get(MemorySegment seg, long index) {
        return (short)constants$2586.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void MinMajorVersion$set(MemorySegment seg, long index, short x) {
        constants$2586.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MaxMajorVersion$VH() {
        return constants$2586.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD MaxMajorVersion;
     * }
     */
    public static short MaxMajorVersion$get(MemorySegment seg) {
        return (short)constants$2586.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD MaxMajorVersion;
     * }
     */
    public static void MaxMajorVersion$set(MemorySegment seg, short x) {
        constants$2586.const$4.set(seg, x);
    }
    public static short MaxMajorVersion$get(MemorySegment seg, long index) {
        return (short)constants$2586.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxMajorVersion$set(MemorySegment seg, long index, short x) {
        constants$2586.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


