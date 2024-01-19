// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct NCryptProviderName {
 *     LPWSTR pszName;
 *     LPWSTR pszComment;
 * };
 * }
 */
public class NCryptProviderName {

    public static MemoryLayout $LAYOUT() {
        return constants$1990.const$2;
    }
    public static VarHandle pszName$VH() {
        return constants$1990.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszName;
     * }
     */
    public static MemorySegment pszName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1990.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszName;
     * }
     */
    public static void pszName$set(MemorySegment seg, MemorySegment x) {
        constants$1990.const$3.set(seg, x);
    }
    public static MemorySegment pszName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1990.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pszName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1990.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszComment$VH() {
        return constants$1990.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszComment;
     * }
     */
    public static MemorySegment pszComment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1990.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszComment;
     * }
     */
    public static void pszComment$set(MemorySegment seg, MemorySegment x) {
        constants$1990.const$4.set(seg, x);
    }
    public static MemorySegment pszComment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1990.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pszComment$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1990.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

