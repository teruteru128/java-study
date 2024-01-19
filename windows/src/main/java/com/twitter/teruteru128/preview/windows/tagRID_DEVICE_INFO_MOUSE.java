// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct tagRID_DEVICE_INFO_MOUSE {
 *     DWORD dwId;
 *     DWORD dwNumberOfButtons;
 *     DWORD dwSampleRate;
 *     BOOL fHasHorizontalWheel;
 * };
 * }
 */
public class tagRID_DEVICE_INFO_MOUSE {

    public static MemoryLayout $LAYOUT() {
        return constants$1389.const$4;
    }
    public static VarHandle dwId$VH() {
        return constants$1389.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwId;
     * }
     */
    public static int dwId$get(MemorySegment seg) {
        return (int)constants$1389.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwId;
     * }
     */
    public static void dwId$set(MemorySegment seg, int x) {
        constants$1389.const$5.set(seg, x);
    }
    public static int dwId$get(MemorySegment seg, long index) {
        return (int)constants$1389.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwId$set(MemorySegment seg, long index, int x) {
        constants$1389.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwNumberOfButtons$VH() {
        return constants$1390.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwNumberOfButtons;
     * }
     */
    public static int dwNumberOfButtons$get(MemorySegment seg) {
        return (int)constants$1390.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwNumberOfButtons;
     * }
     */
    public static void dwNumberOfButtons$set(MemorySegment seg, int x) {
        constants$1390.const$0.set(seg, x);
    }
    public static int dwNumberOfButtons$get(MemorySegment seg, long index) {
        return (int)constants$1390.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfButtons$set(MemorySegment seg, long index, int x) {
        constants$1390.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSampleRate$VH() {
        return constants$1390.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSampleRate;
     * }
     */
    public static int dwSampleRate$get(MemorySegment seg) {
        return (int)constants$1390.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSampleRate;
     * }
     */
    public static void dwSampleRate$set(MemorySegment seg, int x) {
        constants$1390.const$1.set(seg, x);
    }
    public static int dwSampleRate$get(MemorySegment seg, long index) {
        return (int)constants$1390.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSampleRate$set(MemorySegment seg, long index, int x) {
        constants$1390.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle fHasHorizontalWheel$VH() {
        return constants$1390.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fHasHorizontalWheel;
     * }
     */
    public static int fHasHorizontalWheel$get(MemorySegment seg) {
        return (int)constants$1390.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fHasHorizontalWheel;
     * }
     */
    public static void fHasHorizontalWheel$set(MemorySegment seg, int x) {
        constants$1390.const$2.set(seg, x);
    }
    public static int fHasHorizontalWheel$get(MemorySegment seg, long index) {
        return (int)constants$1390.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void fHasHorizontalWheel$set(MemorySegment seg, long index, int x) {
        constants$1390.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

