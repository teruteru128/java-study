// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct __crt_locale_pointers {
 *     struct __crt_locale_data* locinfo;
 *     struct __crt_multibyte_data* mbcinfo;
 * };
 * }
 */
public class __crt_locale_pointers {

    public static MemoryLayout $LAYOUT() {
        return constants$2.const$4;
    }
    public static VarHandle locinfo$VH() {
        return constants$2.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct __crt_locale_data* locinfo;
     * }
     */
    public static MemorySegment locinfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct __crt_locale_data* locinfo;
     * }
     */
    public static void locinfo$set(MemorySegment seg, MemorySegment x) {
        constants$2.const$5.set(seg, x);
    }
    public static MemorySegment locinfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void locinfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle mbcinfo$VH() {
        return constants$3.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct __crt_multibyte_data* mbcinfo;
     * }
     */
    public static MemorySegment mbcinfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct __crt_multibyte_data* mbcinfo;
     * }
     */
    public static void mbcinfo$set(MemorySegment seg, MemorySegment x) {
        constants$3.const$0.set(seg, x);
    }
    public static MemorySegment mbcinfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void mbcinfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

