// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICEDUMP_STRUCTURE_VERSION {
 *     DWORD dwSignature;
 *     DWORD dwVersion;
 *     DWORD dwSize;
 * };
 * }
 */
public class _DEVICEDUMP_STRUCTURE_VERSION {

    public static MemoryLayout $LAYOUT() {
        return constants$2482.const$1;
    }
    public static VarHandle dwSignature$VH() {
        return constants$2482.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSignature;
     * }
     */
    public static int dwSignature$get(MemorySegment seg) {
        return (int)constants$2482.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSignature;
     * }
     */
    public static void dwSignature$set(MemorySegment seg, int x) {
        constants$2482.const$2.set(seg, x);
    }
    public static int dwSignature$get(MemorySegment seg, long index) {
        return (int)constants$2482.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSignature$set(MemorySegment seg, long index, int x) {
        constants$2482.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwVersion$VH() {
        return constants$2482.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static int dwVersion$get(MemorySegment seg) {
        return (int)constants$2482.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static void dwVersion$set(MemorySegment seg, int x) {
        constants$2482.const$3.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)constants$2482.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        constants$2482.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSize$VH() {
        return constants$2482.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static int dwSize$get(MemorySegment seg) {
        return (int)constants$2482.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static void dwSize$set(MemorySegment seg, int x) {
        constants$2482.const$4.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)constants$2482.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        constants$2482.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


