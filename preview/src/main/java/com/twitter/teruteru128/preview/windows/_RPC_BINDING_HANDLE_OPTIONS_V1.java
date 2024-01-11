// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_BINDING_HANDLE_OPTIONS_V1 {
 *     unsigned long Version;
 *     unsigned long Flags;
 *     unsigned long ComTimeout;
 *     unsigned long CallTimeout;
 * };
 * }
 */
public class _RPC_BINDING_HANDLE_OPTIONS_V1 {

    public static MemoryLayout $LAYOUT() {
        return constants$1758.const$2;
    }
    public static VarHandle Version$VH() {
        return constants$1758.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$1758.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$1758.const$3.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$1758.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$1758.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Flags$VH() {
        return constants$1758.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$1758.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$1758.const$4.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$1758.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$1758.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ComTimeout$VH() {
        return constants$1758.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long ComTimeout;
     * }
     */
    public static int ComTimeout$get(MemorySegment seg) {
        return (int)constants$1758.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long ComTimeout;
     * }
     */
    public static void ComTimeout$set(MemorySegment seg, int x) {
        constants$1758.const$5.set(seg, x);
    }
    public static int ComTimeout$get(MemorySegment seg, long index) {
        return (int)constants$1758.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ComTimeout$set(MemorySegment seg, long index, int x) {
        constants$1758.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle CallTimeout$VH() {
        return constants$1759.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long CallTimeout;
     * }
     */
    public static int CallTimeout$get(MemorySegment seg) {
        return (int)constants$1759.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long CallTimeout;
     * }
     */
    public static void CallTimeout$set(MemorySegment seg, int x) {
        constants$1759.const$0.set(seg, x);
    }
    public static int CallTimeout$get(MemorySegment seg, long index) {
        return (int)constants$1759.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void CallTimeout$set(MemorySegment seg, long index, int x) {
        constants$1759.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

