// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct ip_mreq {
 *     struct in_addr imr_multiaddr;
 *     struct in_addr imr_interface;
 * };
 * }
 */
public class ip_mreq {

    public static MemoryLayout $LAYOUT() {
        return constants$1904.const$5;
    }
    public static MemorySegment imr_multiaddr$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }
    public static MemorySegment imr_interface$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

