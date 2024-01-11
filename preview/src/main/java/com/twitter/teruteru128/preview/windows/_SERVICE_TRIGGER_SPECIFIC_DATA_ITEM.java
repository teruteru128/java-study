// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM {
 *     DWORD dwDataType;
 *     DWORD cbData;
 *     PBYTE pData;
 * };
 * }
 */
public class _SERVICE_TRIGGER_SPECIFIC_DATA_ITEM {

    public static MemoryLayout $LAYOUT() {
        return constants$4483.const$5;
    }
    public static VarHandle dwDataType$VH() {
        return constants$4484.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwDataType;
     * }
     */
    public static int dwDataType$get(MemorySegment seg) {
        return (int)constants$4484.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwDataType;
     * }
     */
    public static void dwDataType$set(MemorySegment seg, int x) {
        constants$4484.const$0.set(seg, x);
    }
    public static int dwDataType$get(MemorySegment seg, long index) {
        return (int)constants$4484.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDataType$set(MemorySegment seg, long index, int x) {
        constants$4484.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbData$VH() {
        return constants$4484.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static int cbData$get(MemorySegment seg) {
        return (int)constants$4484.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static void cbData$set(MemorySegment seg, int x) {
        constants$4484.const$1.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)constants$4484.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        constants$4484.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pData$VH() {
        return constants$4484.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PBYTE pData;
     * }
     */
    public static MemorySegment pData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4484.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PBYTE pData;
     * }
     */
    public static void pData$set(MemorySegment seg, MemorySegment x) {
        constants$4484.const$2.set(seg, x);
    }
    public static MemorySegment pData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4484.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pData$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4484.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


