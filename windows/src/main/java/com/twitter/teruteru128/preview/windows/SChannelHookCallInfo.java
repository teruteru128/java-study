// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct SChannelHookCallInfo {
 *     IID iid;
 *     DWORD cbSize;
 *     GUID uCausality;
 *     DWORD dwServerPid;
 *     DWORD iMethod;
 *     void* pObject;
 * };
 * }
 */
public class SChannelHookCallInfo {

    public static MemoryLayout $LAYOUT() {
        return constants$3087.const$4;
    }
    public static MemorySegment iid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle cbSize$VH() {
        return constants$3087.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$3087.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$3087.const$5.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$3087.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$3087.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment uCausality$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    public static VarHandle dwServerPid$VH() {
        return constants$3088.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwServerPid;
     * }
     */
    public static int dwServerPid$get(MemorySegment seg) {
        return (int)constants$3088.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwServerPid;
     * }
     */
    public static void dwServerPid$set(MemorySegment seg, int x) {
        constants$3088.const$0.set(seg, x);
    }
    public static int dwServerPid$get(MemorySegment seg, long index) {
        return (int)constants$3088.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwServerPid$set(MemorySegment seg, long index, int x) {
        constants$3088.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle iMethod$VH() {
        return constants$3088.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD iMethod;
     * }
     */
    public static int iMethod$get(MemorySegment seg) {
        return (int)constants$3088.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD iMethod;
     * }
     */
    public static void iMethod$set(MemorySegment seg, int x) {
        constants$3088.const$1.set(seg, x);
    }
    public static int iMethod$get(MemorySegment seg, long index) {
        return (int)constants$3088.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void iMethod$set(MemorySegment seg, long index, int x) {
        constants$3088.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pObject$VH() {
        return constants$3088.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pObject;
     * }
     */
    public static MemorySegment pObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3088.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pObject;
     * }
     */
    public static void pObject$set(MemorySegment seg, MemorySegment x) {
        constants$3088.const$2.set(seg, x);
    }
    public static MemorySegment pObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3088.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pObject$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3088.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

