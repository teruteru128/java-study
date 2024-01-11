// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PRINTER_DEFAULTSW {
 *     LPWSTR pDatatype;
 *     LPDEVMODEW pDevMode;
 *     ACCESS_MASK DesiredAccess;
 * };
 * }
 */
public class _PRINTER_DEFAULTSW {

    public static MemoryLayout $LAYOUT() {
        return constants$2904.const$5;
    }
    public static VarHandle pDatatype$VH() {
        return constants$2905.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static MemorySegment pDatatype$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2905.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pDatatype;
     * }
     */
    public static void pDatatype$set(MemorySegment seg, MemorySegment x) {
        constants$2905.const$0.set(seg, x);
    }
    public static MemorySegment pDatatype$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2905.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2905.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pDevMode$VH() {
        return constants$2905.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPDEVMODEW pDevMode;
     * }
     */
    public static MemorySegment pDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2905.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPDEVMODEW pDevMode;
     * }
     */
    public static void pDevMode$set(MemorySegment seg, MemorySegment x) {
        constants$2905.const$1.set(seg, x);
    }
    public static MemorySegment pDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2905.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pDevMode$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2905.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle DesiredAccess$VH() {
        return constants$2905.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ACCESS_MASK DesiredAccess;
     * }
     */
    public static int DesiredAccess$get(MemorySegment seg) {
        return (int)constants$2905.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ACCESS_MASK DesiredAccess;
     * }
     */
    public static void DesiredAccess$set(MemorySegment seg, int x) {
        constants$2905.const$2.set(seg, x);
    }
    public static int DesiredAccess$get(MemorySegment seg, long index) {
        return (int)constants$2905.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void DesiredAccess$set(MemorySegment seg, long index, int x) {
        constants$2905.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


