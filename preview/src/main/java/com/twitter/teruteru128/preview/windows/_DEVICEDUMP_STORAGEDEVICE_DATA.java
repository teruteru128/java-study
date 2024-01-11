// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _DEVICEDUMP_STORAGEDEVICE_DATA {
 *     DEVICEDUMP_STRUCTURE_VERSION Descriptor;
 *     DEVICEDUMP_SECTION_HEADER SectionHeader;
 *     DWORD dwBufferSize;
 *     DWORD dwReasonForCollection;
 *     DEVICEDUMP_SUBSECTION_POINTER PublicData;
 *     DEVICEDUMP_SUBSECTION_POINTER RestrictedData;
 *     DEVICEDUMP_SUBSECTION_POINTER PrivateData;
 * };
 * }
 */
public class _DEVICEDUMP_STORAGEDEVICE_DATA {

    public static MemoryLayout $LAYOUT() {
        return constants$2485.const$0;
    }
    public static MemorySegment Descriptor$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment SectionHeader$slice(MemorySegment seg) {
        return seg.asSlice(12, 244);
    }
    public static VarHandle dwBufferSize$VH() {
        return constants$2485.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwBufferSize;
     * }
     */
    public static int dwBufferSize$get(MemorySegment seg) {
        return (int)constants$2485.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwBufferSize;
     * }
     */
    public static void dwBufferSize$set(MemorySegment seg, int x) {
        constants$2485.const$1.set(seg, x);
    }
    public static int dwBufferSize$get(MemorySegment seg, long index) {
        return (int)constants$2485.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBufferSize$set(MemorySegment seg, long index, int x) {
        constants$2485.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwReasonForCollection$VH() {
        return constants$2485.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReasonForCollection;
     * }
     */
    public static int dwReasonForCollection$get(MemorySegment seg) {
        return (int)constants$2485.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReasonForCollection;
     * }
     */
    public static void dwReasonForCollection$set(MemorySegment seg, int x) {
        constants$2485.const$2.set(seg, x);
    }
    public static int dwReasonForCollection$get(MemorySegment seg, long index) {
        return (int)constants$2485.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReasonForCollection$set(MemorySegment seg, long index, int x) {
        constants$2485.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PublicData$slice(MemorySegment seg) {
        return seg.asSlice(264, 12);
    }
    public static MemorySegment RestrictedData$slice(MemorySegment seg) {
        return seg.asSlice(276, 12);
    }
    public static MemorySegment PrivateData$slice(MemorySegment seg) {
        return seg.asSlice(288, 12);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

