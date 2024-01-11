// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_IMAGE_REG {
 *     PWSTR pszImage;
 *     ULONG cInterfaces;
 *     PCRYPT_INTERFACE_REG* rgpInterfaces;
 * };
 * }
 */
public class _CRYPT_IMAGE_REG {

    public static MemoryLayout $LAYOUT() {
        return constants$1966.const$1;
    }
    public static VarHandle pszImage$VH() {
        return constants$1966.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PWSTR pszImage;
     * }
     */
    public static MemorySegment pszImage$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1966.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PWSTR pszImage;
     * }
     */
    public static void pszImage$set(MemorySegment seg, MemorySegment x) {
        constants$1966.const$2.set(seg, x);
    }
    public static MemorySegment pszImage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1966.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pszImage$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1966.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cInterfaces$VH() {
        return constants$1966.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG cInterfaces;
     * }
     */
    public static int cInterfaces$get(MemorySegment seg) {
        return (int)constants$1966.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG cInterfaces;
     * }
     */
    public static void cInterfaces$set(MemorySegment seg, int x) {
        constants$1966.const$3.set(seg, x);
    }
    public static int cInterfaces$get(MemorySegment seg, long index) {
        return (int)constants$1966.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cInterfaces$set(MemorySegment seg, long index, int x) {
        constants$1966.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgpInterfaces$VH() {
        return constants$1966.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRYPT_INTERFACE_REG* rgpInterfaces;
     * }
     */
    public static MemorySegment rgpInterfaces$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1966.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRYPT_INTERFACE_REG* rgpInterfaces;
     * }
     */
    public static void rgpInterfaces$set(MemorySegment seg, MemorySegment x) {
        constants$1966.const$4.set(seg, x);
    }
    public static MemorySegment rgpInterfaces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1966.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpInterfaces$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1966.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


