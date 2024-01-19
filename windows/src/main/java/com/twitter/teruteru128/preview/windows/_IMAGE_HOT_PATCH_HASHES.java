// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _IMAGE_HOT_PATCH_HASHES {
 *     BYTE SHA256[32];
 *     BYTE SHA1[20];
 * };
 * }
 */
public class _IMAGE_HOT_PATCH_HASHES {

    public static MemoryLayout $LAYOUT() {
        return constants$441.const$4;
    }
    public static MemorySegment SHA256$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static MemorySegment SHA1$slice(MemorySegment seg) {
        return seg.asSlice(32, 20);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

