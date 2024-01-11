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
 *     DWORD Granularity;
 *     DWORD Capacity;
 * };
 * }
 */
public class BATTERY_REPORTING_SCALE {

    public static MemoryLayout $LAYOUT() {
        return constants$306.const$5;
    }
    public static VarHandle Granularity$VH() {
        return constants$307.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Granularity;
     * }
     */
    public static int Granularity$get(MemorySegment seg) {
        return (int)constants$307.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Granularity;
     * }
     */
    public static void Granularity$set(MemorySegment seg, int x) {
        constants$307.const$0.set(seg, x);
    }
    public static int Granularity$get(MemorySegment seg, long index) {
        return (int)constants$307.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Granularity$set(MemorySegment seg, long index, int x) {
        constants$307.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Capacity$VH() {
        return constants$307.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Capacity;
     * }
     */
    public static int Capacity$get(MemorySegment seg) {
        return (int)constants$307.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Capacity;
     * }
     */
    public static void Capacity$set(MemorySegment seg, int x) {
        constants$307.const$1.set(seg, x);
    }
    public static int Capacity$get(MemorySegment seg, long index) {
        return (int)constants$307.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Capacity$set(MemorySegment seg, long index, int x) {
        constants$307.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


