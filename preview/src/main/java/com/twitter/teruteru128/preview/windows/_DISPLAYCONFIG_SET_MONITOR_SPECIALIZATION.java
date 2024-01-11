// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION {
 *     DISPLAYCONFIG_DEVICE_INFO_HEADER header;
 *     union {
 *         struct {
 *              *             UINT32 isSpecializationEnabled;
 *             UINT32 reserved;
 *         };
 *         UINT32 value;
 *     };
 *     GUID specializationType;
 *     GUID specializationSubType;
 *     WCHAR specializationApplicationName[128];
 * };
 * }
 */
public class _DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION {

    public static MemoryLayout $LAYOUT() {
        return constants$968.const$3;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    public static VarHandle value$VH() {
        return constants$968.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * UINT32 value;
     * }
     */
    public static int value$get(MemorySegment seg) {
        return (int)constants$968.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * UINT32 value;
     * }
     */
    public static void value$set(MemorySegment seg, int x) {
        constants$968.const$4.set(seg, x);
    }
    public static int value$get(MemorySegment seg, long index) {
        return (int)constants$968.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, int x) {
        constants$968.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment specializationType$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static MemorySegment specializationSubType$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static MemorySegment specializationApplicationName$slice(MemorySegment seg) {
        return seg.asSlice(56, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


