// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GET_DEVICE_INTERNAL_STATUS_DATA_REQUEST {
 *     DWORD Version;
 *     DWORD Size;
 *     DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE RequestDataType;
 *     DEVICE_INTERNAL_STATUS_DATA_SET RequestDataSet;
 * };
 * }
 */
public class _GET_DEVICE_INTERNAL_STATUS_DATA_REQUEST {

    public static MemoryLayout $LAYOUT() {
        return constants$2474.const$3;
    }
    public static VarHandle Version$VH() {
        return constants$2474.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2474.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2474.const$4.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2474.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2474.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2474.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2474.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2474.const$5.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2474.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2474.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle RequestDataType$VH() {
        return constants$2475.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE RequestDataType;
     * }
     */
    public static int RequestDataType$get(MemorySegment seg) {
        return (int)constants$2475.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DEVICE_INTERNAL_STATUS_DATA_REQUEST_TYPE RequestDataType;
     * }
     */
    public static void RequestDataType$set(MemorySegment seg, int x) {
        constants$2475.const$0.set(seg, x);
    }
    public static int RequestDataType$get(MemorySegment seg, long index) {
        return (int)constants$2475.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestDataType$set(MemorySegment seg, long index, int x) {
        constants$2475.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle RequestDataSet$VH() {
        return constants$2475.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DEVICE_INTERNAL_STATUS_DATA_SET RequestDataSet;
     * }
     */
    public static int RequestDataSet$get(MemorySegment seg) {
        return (int)constants$2475.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DEVICE_INTERNAL_STATUS_DATA_SET RequestDataSet;
     * }
     */
    public static void RequestDataSet$set(MemorySegment seg, int x) {
        constants$2475.const$1.set(seg, x);
    }
    public static int RequestDataSet$get(MemorySegment seg, long index) {
        return (int)constants$2475.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestDataSet$set(MemorySegment seg, long index, int x) {
        constants$2475.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

