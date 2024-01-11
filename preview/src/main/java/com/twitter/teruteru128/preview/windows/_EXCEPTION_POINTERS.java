// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _EXCEPTION_POINTERS {
 *     PEXCEPTION_RECORD ExceptionRecord;
 *     PCONTEXT ContextRecord;
 * };
 * }
 */
public class _EXCEPTION_POINTERS {

    public static MemoryLayout $LAYOUT() {
        return constants$138.const$5;
    }
    public static VarHandle ExceptionRecord$VH() {
        return constants$139.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PEXCEPTION_RECORD ExceptionRecord;
     * }
     */
    public static MemorySegment ExceptionRecord$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$139.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PEXCEPTION_RECORD ExceptionRecord;
     * }
     */
    public static void ExceptionRecord$set(MemorySegment seg, MemorySegment x) {
        constants$139.const$0.set(seg, x);
    }
    public static MemorySegment ExceptionRecord$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$139.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionRecord$set(MemorySegment seg, long index, MemorySegment x) {
        constants$139.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ContextRecord$VH() {
        return constants$139.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCONTEXT ContextRecord;
     * }
     */
    public static MemorySegment ContextRecord$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$139.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCONTEXT ContextRecord;
     * }
     */
    public static void ContextRecord$set(MemorySegment seg, MemorySegment x) {
        constants$139.const$1.set(seg, x);
    }
    public static MemorySegment ContextRecord$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$139.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextRecord$set(MemorySegment seg, long index, MemorySegment x) {
        constants$139.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

