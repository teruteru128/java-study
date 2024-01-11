// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _VIRTUAL_STORAGE_TYPE {
 *     DWORD DeviceId;
 *     GUID VendorId;
 * };
 * }
 */
public class _VIRTUAL_STORAGE_TYPE {

    public static MemoryLayout $LAYOUT() {
        return constants$2666.const$2;
    }
    public static VarHandle DeviceId$VH() {
        return constants$2666.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD DeviceId;
     * }
     */
    public static int DeviceId$get(MemorySegment seg) {
        return (int)constants$2666.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD DeviceId;
     * }
     */
    public static void DeviceId$set(MemorySegment seg, int x) {
        constants$2666.const$3.set(seg, x);
    }
    public static int DeviceId$get(MemorySegment seg, long index) {
        return (int)constants$2666.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void DeviceId$set(MemorySegment seg, long index, int x) {
        constants$2666.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment VendorId$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


