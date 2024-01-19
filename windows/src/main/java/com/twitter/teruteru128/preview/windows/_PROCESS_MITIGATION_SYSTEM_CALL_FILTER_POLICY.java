// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY {
 *     union {
 *         DWORD Flags;
 *         struct {
 *              *             DWORD FilterId;
 *             DWORD ReservedFlags;
 *         };
 *     };
 * };
 * }
 */
public class _PROCESS_MITIGATION_SYSTEM_CALL_FILTER_POLICY {

    public static MemoryLayout $LAYOUT() {
        return constants$200.const$1;
    }
    public static VarHandle Flags$VH() {
        return constants$200.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static int Flags$get(MemorySegment seg) {
        return (int)constants$200.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD Flags;
     * }
     */
    public static void Flags$set(MemorySegment seg, int x) {
        constants$200.const$2.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)constants$200.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        constants$200.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

