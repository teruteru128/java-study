// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct COPYFILE2_EXTENDED_PARAMETERS_V2 {
 *     DWORD dwSize;
 *     DWORD dwCopyFlags;
 *     BOOL* pfCancel;
 *     PCOPYFILE2_PROGRESS_ROUTINE pProgressRoutine;
 *     PVOID pvCallbackContext;
 *     DWORD dwCopyFlagsV2;
 *     ULONG ioDesiredSize;
 *     ULONG ioDesiredRate;
 *     PVOID reserved[8];
 * };
 * }
 */
public class COPYFILE2_EXTENDED_PARAMETERS_V2 {

    public static MemoryLayout $LAYOUT() {
        return constants$814.const$3;
    }
    public static VarHandle dwSize$VH() {
        return constants$814.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static int dwSize$get(MemorySegment seg) {
        return (int)constants$814.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static void dwSize$set(MemorySegment seg, int x) {
        constants$814.const$4.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)constants$814.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        constants$814.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCopyFlags$VH() {
        return constants$814.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCopyFlags;
     * }
     */
    public static int dwCopyFlags$get(MemorySegment seg) {
        return (int)constants$814.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCopyFlags;
     * }
     */
    public static void dwCopyFlags$set(MemorySegment seg, int x) {
        constants$814.const$5.set(seg, x);
    }
    public static int dwCopyFlags$get(MemorySegment seg, long index) {
        return (int)constants$814.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCopyFlags$set(MemorySegment seg, long index, int x) {
        constants$814.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pfCancel$VH() {
        return constants$815.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL* pfCancel;
     * }
     */
    public static MemorySegment pfCancel$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$815.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL* pfCancel;
     * }
     */
    public static void pfCancel$set(MemorySegment seg, MemorySegment x) {
        constants$815.const$0.set(seg, x);
    }
    public static MemorySegment pfCancel$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$815.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pfCancel$set(MemorySegment seg, long index, MemorySegment x) {
        constants$815.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pProgressRoutine$VH() {
        return constants$815.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCOPYFILE2_PROGRESS_ROUTINE pProgressRoutine;
     * }
     */
    public static MemorySegment pProgressRoutine$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$815.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCOPYFILE2_PROGRESS_ROUTINE pProgressRoutine;
     * }
     */
    public static void pProgressRoutine$set(MemorySegment seg, MemorySegment x) {
        constants$815.const$1.set(seg, x);
    }
    public static MemorySegment pProgressRoutine$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$815.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pProgressRoutine$set(MemorySegment seg, long index, MemorySegment x) {
        constants$815.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static PCOPYFILE2_PROGRESS_ROUTINE pProgressRoutine(MemorySegment segment, Arena scope) {
        return PCOPYFILE2_PROGRESS_ROUTINE.ofAddress(pProgressRoutine$get(segment), scope);
    }
    public static VarHandle pvCallbackContext$VH() {
        return constants$815.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID pvCallbackContext;
     * }
     */
    public static MemorySegment pvCallbackContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$815.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID pvCallbackContext;
     * }
     */
    public static void pvCallbackContext$set(MemorySegment seg, MemorySegment x) {
        constants$815.const$2.set(seg, x);
    }
    public static MemorySegment pvCallbackContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$815.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pvCallbackContext$set(MemorySegment seg, long index, MemorySegment x) {
        constants$815.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwCopyFlagsV2$VH() {
        return constants$815.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCopyFlagsV2;
     * }
     */
    public static int dwCopyFlagsV2$get(MemorySegment seg) {
        return (int)constants$815.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCopyFlagsV2;
     * }
     */
    public static void dwCopyFlagsV2$set(MemorySegment seg, int x) {
        constants$815.const$3.set(seg, x);
    }
    public static int dwCopyFlagsV2$get(MemorySegment seg, long index) {
        return (int)constants$815.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCopyFlagsV2$set(MemorySegment seg, long index, int x) {
        constants$815.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ioDesiredSize$VH() {
        return constants$815.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ioDesiredSize;
     * }
     */
    public static int ioDesiredSize$get(MemorySegment seg) {
        return (int)constants$815.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ioDesiredSize;
     * }
     */
    public static void ioDesiredSize$set(MemorySegment seg, int x) {
        constants$815.const$4.set(seg, x);
    }
    public static int ioDesiredSize$get(MemorySegment seg, long index) {
        return (int)constants$815.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ioDesiredSize$set(MemorySegment seg, long index, int x) {
        constants$815.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ioDesiredRate$VH() {
        return constants$815.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG ioDesiredRate;
     * }
     */
    public static int ioDesiredRate$get(MemorySegment seg) {
        return (int)constants$815.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG ioDesiredRate;
     * }
     */
    public static void ioDesiredRate$set(MemorySegment seg, int x) {
        constants$815.const$5.set(seg, x);
    }
    public static int ioDesiredRate$get(MemorySegment seg, long index) {
        return (int)constants$815.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ioDesiredRate$set(MemorySegment seg, long index, int x) {
        constants$815.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment reserved$slice(MemorySegment seg) {
        return seg.asSlice(48, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


