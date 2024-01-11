// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_ENROLLMENT_NAME_VALUE_PAIR {
 *     LPWSTR pwszName;
 *     LPWSTR pwszValue;
 * };
 * }
 */
public class _CRYPT_ENROLLMENT_NAME_VALUE_PAIR {

    public static MemoryLayout $LAYOUT() {
        return constants$2020.const$0;
    }
    public static VarHandle pwszName$VH() {
        return constants$2020.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszName;
     * }
     */
    public static MemorySegment pwszName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2020.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszName;
     * }
     */
    public static void pwszName$set(MemorySegment seg, MemorySegment x) {
        constants$2020.const$1.set(seg, x);
    }
    public static MemorySegment pwszName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2020.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2020.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pwszValue$VH() {
        return constants$2020.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszValue;
     * }
     */
    public static MemorySegment pwszValue$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2020.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszValue;
     * }
     */
    public static void pwszValue$set(MemorySegment seg, MemorySegment x) {
        constants$2020.const$2.set(seg, x);
    }
    public static MemorySegment pwszValue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2020.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszValue$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2020.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

