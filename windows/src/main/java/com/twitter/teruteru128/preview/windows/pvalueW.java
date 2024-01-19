// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct pvalueW {
 *     LPWSTR pv_valuename;
 *     int pv_valuelen;
 *     LPVOID pv_value_context;
 *     DWORD pv_type;
 * };
 * }
 */
public class pvalueW {

    public static MemoryLayout $LAYOUT() {
        return constants$1481.const$4;
    }
    public static VarHandle pv_valuename$VH() {
        return constants$1481.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pv_valuename;
     * }
     */
    public static MemorySegment pv_valuename$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1481.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pv_valuename;
     * }
     */
    public static void pv_valuename$set(MemorySegment seg, MemorySegment x) {
        constants$1481.const$5.set(seg, x);
    }
    public static MemorySegment pv_valuename$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1481.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pv_valuename$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1481.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pv_valuelen$VH() {
        return constants$1482.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int pv_valuelen;
     * }
     */
    public static int pv_valuelen$get(MemorySegment seg) {
        return (int)constants$1482.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int pv_valuelen;
     * }
     */
    public static void pv_valuelen$set(MemorySegment seg, int x) {
        constants$1482.const$0.set(seg, x);
    }
    public static int pv_valuelen$get(MemorySegment seg, long index) {
        return (int)constants$1482.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pv_valuelen$set(MemorySegment seg, long index, int x) {
        constants$1482.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pv_value_context$VH() {
        return constants$1482.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID pv_value_context;
     * }
     */
    public static MemorySegment pv_value_context$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1482.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID pv_value_context;
     * }
     */
    public static void pv_value_context$set(MemorySegment seg, MemorySegment x) {
        constants$1482.const$1.set(seg, x);
    }
    public static MemorySegment pv_value_context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1482.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pv_value_context$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1482.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pv_type$VH() {
        return constants$1482.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD pv_type;
     * }
     */
    public static int pv_type$get(MemorySegment seg) {
        return (int)constants$1482.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD pv_type;
     * }
     */
    public static void pv_type$set(MemorySegment seg, int x) {
        constants$1482.const$2.set(seg, x);
    }
    public static int pv_type$get(MemorySegment seg, long index) {
        return (int)constants$1482.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pv_type$set(MemorySegment seg, long index, int x) {
        constants$1482.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

