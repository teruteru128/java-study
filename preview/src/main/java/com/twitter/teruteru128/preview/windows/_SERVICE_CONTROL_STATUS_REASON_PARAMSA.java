// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SERVICE_CONTROL_STATUS_REASON_PARAMSA {
 *     DWORD dwReason;
 *     LPSTR pszComment;
 *     SERVICE_STATUS_PROCESS ServiceStatus;
 * };
 * }
 */
public class _SERVICE_CONTROL_STATUS_REASON_PARAMSA {

    public static MemoryLayout $LAYOUT() {
        return constants$4503.const$3;
    }
    public static VarHandle dwReason$VH() {
        return constants$4503.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwReason;
     * }
     */
    public static int dwReason$get(MemorySegment seg) {
        return (int)constants$4503.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwReason;
     * }
     */
    public static void dwReason$set(MemorySegment seg, int x) {
        constants$4503.const$4.set(seg, x);
    }
    public static int dwReason$get(MemorySegment seg, long index) {
        return (int)constants$4503.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReason$set(MemorySegment seg, long index, int x) {
        constants$4503.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pszComment$VH() {
        return constants$4503.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszComment;
     * }
     */
    public static MemorySegment pszComment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4503.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszComment;
     * }
     */
    public static void pszComment$set(MemorySegment seg, MemorySegment x) {
        constants$4503.const$5.set(seg, x);
    }
    public static MemorySegment pszComment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4503.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pszComment$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4503.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ServiceStatus$slice(MemorySegment seg) {
        return seg.asSlice(16, 36);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

