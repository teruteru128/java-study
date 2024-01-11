// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct DISPLAYCONFIG_ADAPTER_NAME {
 *     DISPLAYCONFIG_DEVICE_INFO_HEADER header;
 *     WCHAR adapterDevicePath[128];
 * };
 * }
 */
public class DISPLAYCONFIG_ADAPTER_NAME {

    public static MemoryLayout $LAYOUT() {
        return constants$965.const$4;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    public static MemorySegment adapterDevicePath$slice(MemorySegment seg) {
        return seg.asSlice(20, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


