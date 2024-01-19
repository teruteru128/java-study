// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ENUM_SERVICE_STATUSA {
 *     LPSTR lpServiceName;
 *     LPSTR lpDisplayName;
 *     SERVICE_STATUS ServiceStatus;
 * };
 * }
 */
public class _ENUM_SERVICE_STATUSA {

    public static MemoryLayout $LAYOUT() {
        return constants$4490.const$5;
    }
    public static VarHandle lpServiceName$VH() {
        return constants$4491.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpServiceName;
     * }
     */
    public static MemorySegment lpServiceName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4491.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpServiceName;
     * }
     */
    public static void lpServiceName$set(MemorySegment seg, MemorySegment x) {
        constants$4491.const$0.set(seg, x);
    }
    public static MemorySegment lpServiceName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4491.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpServiceName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4491.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpDisplayName$VH() {
        return constants$4491.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR lpDisplayName;
     * }
     */
    public static MemorySegment lpDisplayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$4491.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR lpDisplayName;
     * }
     */
    public static void lpDisplayName$set(MemorySegment seg, MemorySegment x) {
        constants$4491.const$1.set(seg, x);
    }
    public static MemorySegment lpDisplayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$4491.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDisplayName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$4491.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ServiceStatus$slice(MemorySegment seg) {
        return seg.asSlice(16, 28);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

