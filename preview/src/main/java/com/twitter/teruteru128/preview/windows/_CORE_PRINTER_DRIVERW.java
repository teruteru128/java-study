// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CORE_PRINTER_DRIVERW {
 *     GUID CoreDriverGUID;
 *     FILETIME ftDriverDate;
 *     DWORDLONG dwlDriverVersion;
 *     WCHAR szPackageID[260];
 * };
 * }
 */
public class _CORE_PRINTER_DRIVERW {

    public static MemoryLayout $LAYOUT() {
        return constants$2944.const$2;
    }
    public static MemorySegment CoreDriverGUID$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment ftDriverDate$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static VarHandle dwlDriverVersion$VH() {
        return constants$2944.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORDLONG dwlDriverVersion;
     * }
     */
    public static long dwlDriverVersion$get(MemorySegment seg) {
        return (long)constants$2944.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORDLONG dwlDriverVersion;
     * }
     */
    public static void dwlDriverVersion$set(MemorySegment seg, long x) {
        constants$2944.const$3.set(seg, x);
    }
    public static long dwlDriverVersion$get(MemorySegment seg, long index) {
        return (long)constants$2944.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dwlDriverVersion$set(MemorySegment seg, long index, long x) {
        constants$2944.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPackageID$slice(MemorySegment seg) {
        return seg.asSlice(32, 520);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


