// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _MOUSE_EVENT_RECORD {
 *     COORD dwMousePosition;
 *     DWORD dwButtonState;
 *     DWORD dwControlKeyState;
 *     DWORD dwEventFlags;
 * };
 * }
 */
public class _MOUSE_EVENT_RECORD {

    public static MemoryLayout $LAYOUT() {
        return constants$1450.const$3;
    }
    public static MemorySegment dwMousePosition$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static VarHandle dwButtonState$VH() {
        return constants$1450.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwButtonState;
     * }
     */
    public static int dwButtonState$get(MemorySegment seg) {
        return (int)constants$1450.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwButtonState;
     * }
     */
    public static void dwButtonState$set(MemorySegment seg, int x) {
        constants$1450.const$4.set(seg, x);
    }
    public static int dwButtonState$get(MemorySegment seg, long index) {
        return (int)constants$1450.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwButtonState$set(MemorySegment seg, long index, int x) {
        constants$1450.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwControlKeyState$VH() {
        return constants$1450.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwControlKeyState;
     * }
     */
    public static int dwControlKeyState$get(MemorySegment seg) {
        return (int)constants$1450.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwControlKeyState;
     * }
     */
    public static void dwControlKeyState$set(MemorySegment seg, int x) {
        constants$1450.const$5.set(seg, x);
    }
    public static int dwControlKeyState$get(MemorySegment seg, long index) {
        return (int)constants$1450.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwControlKeyState$set(MemorySegment seg, long index, int x) {
        constants$1450.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwEventFlags$VH() {
        return constants$1451.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwEventFlags;
     * }
     */
    public static int dwEventFlags$get(MemorySegment seg) {
        return (int)constants$1451.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwEventFlags;
     * }
     */
    public static void dwEventFlags$set(MemorySegment seg, int x) {
        constants$1451.const$0.set(seg, x);
    }
    public static int dwEventFlags$get(MemorySegment seg, long index) {
        return (int)constants$1451.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEventFlags$set(MemorySegment seg, long index, int x) {
        constants$1451.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


