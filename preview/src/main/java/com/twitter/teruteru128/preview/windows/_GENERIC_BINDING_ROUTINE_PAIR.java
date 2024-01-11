// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GENERIC_BINDING_ROUTINE_PAIR {
 *     GENERIC_BINDING_ROUTINE pfnBind;
 *     GENERIC_UNBIND_ROUTINE pfnUnbind;
 * };
 * }
 */
public class _GENERIC_BINDING_ROUTINE_PAIR {

    public static MemoryLayout $LAYOUT() {
        return constants$2277.const$0;
    }
    public static VarHandle pfnBind$VH() {
        return constants$2277.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GENERIC_BINDING_ROUTINE pfnBind;
     * }
     */
    public static MemorySegment pfnBind$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2277.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GENERIC_BINDING_ROUTINE pfnBind;
     * }
     */
    public static void pfnBind$set(MemorySegment seg, MemorySegment x) {
        constants$2277.const$1.set(seg, x);
    }
    public static MemorySegment pfnBind$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2277.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnBind$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2277.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static GENERIC_BINDING_ROUTINE pfnBind(MemorySegment segment, Arena scope) {
        return GENERIC_BINDING_ROUTINE.ofAddress(pfnBind$get(segment), scope);
    }
    public static VarHandle pfnUnbind$VH() {
        return constants$2277.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GENERIC_UNBIND_ROUTINE pfnUnbind;
     * }
     */
    public static MemorySegment pfnUnbind$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2277.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GENERIC_UNBIND_ROUTINE pfnUnbind;
     * }
     */
    public static void pfnUnbind$set(MemorySegment seg, MemorySegment x) {
        constants$2277.const$2.set(seg, x);
    }
    public static MemorySegment pfnUnbind$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2277.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnUnbind$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2277.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static GENERIC_UNBIND_ROUTINE pfnUnbind(MemorySegment segment, Arena scope) {
        return GENERIC_UNBIND_ROUTINE.ofAddress(pfnUnbind$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


