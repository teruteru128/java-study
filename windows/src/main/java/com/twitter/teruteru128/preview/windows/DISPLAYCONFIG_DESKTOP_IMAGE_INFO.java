// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct DISPLAYCONFIG_DESKTOP_IMAGE_INFO {
 *     POINTL PathSourceSize;
 *     RECTL DesktopImageRegion;
 *     RECTL DesktopImageClip;
 * };
 * }
 */
public class DISPLAYCONFIG_DESKTOP_IMAGE_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$960.const$0;
    }
    public static MemorySegment PathSourceSize$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment DesktopImageRegion$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static MemorySegment DesktopImageClip$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

