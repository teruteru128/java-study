// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_INTERFACE_REG {
 *     ULONG dwInterface;
 *     ULONG dwFlags;
 *     ULONG cFunctions;
 *     PWSTR* rgpszFunctions;
 * };
 * }
 */
public class _CRYPT_INTERFACE_REG {

    public static MemoryLayout $LAYOUT() {
        return constants$1965.const$2;
    }
    public static VarHandle dwInterface$VH() {
        return constants$1965.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwInterface;
     * }
     */
    public static int dwInterface$get(MemorySegment seg) {
        return (int)constants$1965.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwInterface;
     * }
     */
    public static void dwInterface$set(MemorySegment seg, int x) {
        constants$1965.const$3.set(seg, x);
    }
    public static int dwInterface$get(MemorySegment seg, long index) {
        return (int)constants$1965.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInterface$set(MemorySegment seg, long index, int x) {
        constants$1965.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFlags$VH() {
        return constants$1965.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$1965.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$1965.const$4.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$1965.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$1965.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cFunctions$VH() {
        return constants$1965.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cFunctions;
     * }
     */
    public static int cFunctions$get(MemorySegment seg) {
        return (int)constants$1965.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cFunctions;
     * }
     */
    public static void cFunctions$set(MemorySegment seg, int x) {
        constants$1965.const$5.set(seg, x);
    }
    public static int cFunctions$get(MemorySegment seg, long index) {
        return (int)constants$1965.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cFunctions$set(MemorySegment seg, long index, int x) {
        constants$1965.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgpszFunctions$VH() {
        return constants$1966.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PWSTR* rgpszFunctions;
     * }
     */
    public static MemorySegment rgpszFunctions$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1966.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PWSTR* rgpszFunctions;
     * }
     */
    public static void rgpszFunctions$set(MemorySegment seg, MemorySegment x) {
        constants$1966.const$0.set(seg, x);
    }
    public static MemorySegment rgpszFunctions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1966.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszFunctions$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1966.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


