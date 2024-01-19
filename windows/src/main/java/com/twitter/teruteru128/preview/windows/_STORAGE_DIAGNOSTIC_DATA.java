// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_DIAGNOSTIC_DATA {
 *     DWORD Version;
 *     DWORD Size;
 *     GUID ProviderId;
 *     DWORD BufferSize;
 *     DWORD Reserved;
 *     BYTE DiagnosticDataBuffer[1];
 * };
 * }
 */
public class _STORAGE_DIAGNOSTIC_DATA {

    public static MemoryLayout $LAYOUT() {
        return constants$2469.const$2;
    }
    public static VarHandle Version$VH() {
        return constants$2469.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static int Version$get(MemorySegment seg) {
        return (int)constants$2469.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Version;
     * }
     */
    public static void Version$set(MemorySegment seg, int x) {
        constants$2469.const$3.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)constants$2469.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        constants$2469.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Size$VH() {
        return constants$2469.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static int Size$get(MemorySegment seg) {
        return (int)constants$2469.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Size;
     * }
     */
    public static void Size$set(MemorySegment seg, int x) {
        constants$2469.const$4.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)constants$2469.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        constants$2469.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ProviderId$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static VarHandle BufferSize$VH() {
        return constants$2469.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD BufferSize;
     * }
     */
    public static int BufferSize$get(MemorySegment seg) {
        return (int)constants$2469.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD BufferSize;
     * }
     */
    public static void BufferSize$set(MemorySegment seg, int x) {
        constants$2469.const$5.set(seg, x);
    }
    public static int BufferSize$get(MemorySegment seg, long index) {
        return (int)constants$2469.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSize$set(MemorySegment seg, long index, int x) {
        constants$2469.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Reserved$VH() {
        return constants$2470.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static int Reserved$get(MemorySegment seg) {
        return (int)constants$2470.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Reserved;
     * }
     */
    public static void Reserved$set(MemorySegment seg, int x) {
        constants$2470.const$0.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)constants$2470.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        constants$2470.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DiagnosticDataBuffer$slice(MemorySegment seg) {
        return seg.asSlice(32, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

