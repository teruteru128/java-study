// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SD_GLOBAL_CHANGE_INPUT {
 *     DWORD Flags;
 *     DWORD ChangeType;
 *     union {
 *         SD_CHANGE_MACHINE_SID_INPUT SdChange;
 *         SD_QUERY_STATS_INPUT SdQueryStats;
 *         SD_ENUM_SDS_INPUT SdEnumSds;
 *     };
 * };
 * }
 */
public class _SD_GLOBAL_CHANGE_INPUT {

    public static MemoryLayout $LAYOUT() {
        return constants$2676.const$3;
    }
    public static VarHandle Flags$VH() {
        return constants$2676.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$2676.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$2676.const$4.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$2676.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$2676.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ChangeType$VH() {
        return constants$2676.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ChangeType;
     * }
     */
    public static int ChangeType$get(MemorySegment seg) {
        return (int)constants$2676.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ChangeType;
     * }
     */
    public static void ChangeType$set(MemorySegment seg, int x) {
        constants$2676.const$5.set(seg, x);
    }
    public static int ChangeType$get(MemorySegment seg, long index) {
        return (int)constants$2676.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void ChangeType$set(MemorySegment seg, long index, int x) {
        constants$2676.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SdChange$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment SdQueryStats$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    public static MemorySegment SdEnumSds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

