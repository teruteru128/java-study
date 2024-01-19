// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _RPC_VERSION {
 *     unsigned short MajorVersion;
 *     unsigned short MinorVersion;
 * };
 * }
 */
public class _RPC_VERSION {

    public static MemoryLayout $LAYOUT() {
        return constants$1779.const$0;
    }
    public static VarHandle MajorVersion$VH() {
        return constants$1779.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short MajorVersion;
     * }
     */
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)constants$1779.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short MajorVersion;
     * }
     */
    public static void MajorVersion$set(MemorySegment seg, short x) {
        constants$1779.const$1.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)constants$1779.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        constants$1779.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle MinorVersion$VH() {
        return constants$1779.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short MinorVersion;
     * }
     */
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)constants$1779.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short MinorVersion;
     * }
     */
    public static void MinorVersion$set(MemorySegment seg, short x) {
        constants$1779.const$2.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)constants$1779.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        constants$1779.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

