// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_LOGOTYPE_REFERENCE {
 *     DWORD cHashedUrl;
 *     PCERT_HASHED_URL rgHashedUrl;
 * };
 * }
 */
public class _CERT_LOGOTYPE_REFERENCE {

    public static MemoryLayout $LAYOUT() {
        return constants$2057.const$3;
    }
    public static VarHandle cHashedUrl$VH() {
        return constants$2057.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cHashedUrl;
     * }
     */
    public static int cHashedUrl$get(MemorySegment seg) {
        return (int)constants$2057.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cHashedUrl;
     * }
     */
    public static void cHashedUrl$set(MemorySegment seg, int x) {
        constants$2057.const$4.set(seg, x);
    }
    public static int cHashedUrl$get(MemorySegment seg, long index) {
        return (int)constants$2057.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cHashedUrl$set(MemorySegment seg, long index, int x) {
        constants$2057.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgHashedUrl$VH() {
        return constants$2057.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_HASHED_URL rgHashedUrl;
     * }
     */
    public static MemorySegment rgHashedUrl$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2057.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_HASHED_URL rgHashedUrl;
     * }
     */
    public static void rgHashedUrl$set(MemorySegment seg, MemorySegment x) {
        constants$2057.const$5.set(seg, x);
    }
    public static MemorySegment rgHashedUrl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2057.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void rgHashedUrl$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2057.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


