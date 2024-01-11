// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CONSOLE_SCREEN_BUFFER_INFO {
 *     COORD dwSize;
 *     COORD dwCursorPosition;
 *     WORD wAttributes;
 *     SMALL_RECT srWindow;
 *     COORD dwMaximumWindowSize;
 * };
 * }
 */
public class _CONSOLE_SCREEN_BUFFER_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$1460.const$5;
    }
    public static MemorySegment dwSize$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment dwCursorPosition$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static VarHandle wAttributes$VH() {
        return constants$1461.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * WORD wAttributes;
     * }
     */
    public static short wAttributes$get(MemorySegment seg) {
        return (short)constants$1461.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * WORD wAttributes;
     * }
     */
    public static void wAttributes$set(MemorySegment seg, short x) {
        constants$1461.const$0.set(seg, x);
    }
    public static short wAttributes$get(MemorySegment seg, long index) {
        return (short)constants$1461.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void wAttributes$set(MemorySegment seg, long index, short x) {
        constants$1461.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment srWindow$slice(MemorySegment seg) {
        return seg.asSlice(10, 8);
    }
    public static MemorySegment dwMaximumWindowSize$slice(MemorySegment seg) {
        return seg.asSlice(18, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

