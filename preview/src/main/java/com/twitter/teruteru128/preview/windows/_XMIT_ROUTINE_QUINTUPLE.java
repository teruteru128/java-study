// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _XMIT_ROUTINE_QUINTUPLE {
 *     XMIT_HELPER_ROUTINE pfnTranslateToXmit;
 *     XMIT_HELPER_ROUTINE pfnTranslateFromXmit;
 *     XMIT_HELPER_ROUTINE pfnFreeXmit;
 *     XMIT_HELPER_ROUTINE pfnFreeInst;
 * };
 * }
 */
public class _XMIT_ROUTINE_QUINTUPLE {

    public static MemoryLayout $LAYOUT() {
        return constants$2278.const$3;
    }
    public static VarHandle pfnTranslateToXmit$VH() {
        return constants$2278.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XMIT_HELPER_ROUTINE pfnTranslateToXmit;
     * }
     */
    public static MemorySegment pfnTranslateToXmit$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2278.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XMIT_HELPER_ROUTINE pfnTranslateToXmit;
     * }
     */
    public static void pfnTranslateToXmit$set(MemorySegment seg, MemorySegment x) {
        constants$2278.const$4.set(seg, x);
    }
    public static MemorySegment pfnTranslateToXmit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2278.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnTranslateToXmit$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2278.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static XMIT_HELPER_ROUTINE pfnTranslateToXmit(MemorySegment segment, Arena scope) {
        return XMIT_HELPER_ROUTINE.ofAddress(pfnTranslateToXmit$get(segment), scope);
    }
    public static VarHandle pfnTranslateFromXmit$VH() {
        return constants$2278.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XMIT_HELPER_ROUTINE pfnTranslateFromXmit;
     * }
     */
    public static MemorySegment pfnTranslateFromXmit$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2278.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XMIT_HELPER_ROUTINE pfnTranslateFromXmit;
     * }
     */
    public static void pfnTranslateFromXmit$set(MemorySegment seg, MemorySegment x) {
        constants$2278.const$5.set(seg, x);
    }
    public static MemorySegment pfnTranslateFromXmit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2278.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnTranslateFromXmit$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2278.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static XMIT_HELPER_ROUTINE pfnTranslateFromXmit(MemorySegment segment, Arena scope) {
        return XMIT_HELPER_ROUTINE.ofAddress(pfnTranslateFromXmit$get(segment), scope);
    }
    public static VarHandle pfnFreeXmit$VH() {
        return constants$2279.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XMIT_HELPER_ROUTINE pfnFreeXmit;
     * }
     */
    public static MemorySegment pfnFreeXmit$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2279.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XMIT_HELPER_ROUTINE pfnFreeXmit;
     * }
     */
    public static void pfnFreeXmit$set(MemorySegment seg, MemorySegment x) {
        constants$2279.const$0.set(seg, x);
    }
    public static MemorySegment pfnFreeXmit$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2279.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFreeXmit$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2279.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static XMIT_HELPER_ROUTINE pfnFreeXmit(MemorySegment segment, Arena scope) {
        return XMIT_HELPER_ROUTINE.ofAddress(pfnFreeXmit$get(segment), scope);
    }
    public static VarHandle pfnFreeInst$VH() {
        return constants$2279.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * XMIT_HELPER_ROUTINE pfnFreeInst;
     * }
     */
    public static MemorySegment pfnFreeInst$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2279.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * XMIT_HELPER_ROUTINE pfnFreeInst;
     * }
     */
    public static void pfnFreeInst$set(MemorySegment seg, MemorySegment x) {
        constants$2279.const$1.set(seg, x);
    }
    public static MemorySegment pfnFreeInst$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2279.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFreeInst$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2279.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static XMIT_HELPER_ROUTINE pfnFreeInst(MemorySegment segment, Arena scope) {
        return XMIT_HELPER_ROUTINE.ofAddress(pfnFreeInst$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


