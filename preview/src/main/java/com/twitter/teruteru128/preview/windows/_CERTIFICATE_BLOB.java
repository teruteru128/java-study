// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERTIFICATE_BLOB {
 *     DWORD dwCertEncodingType;
 *     DWORD cbData;
 *     PBYTE pbData;
 * };
 * }
 */
public class _CERTIFICATE_BLOB {

    public static MemoryLayout $LAYOUT() {
        return constants$2247.const$0;
    }
    public static VarHandle dwCertEncodingType$VH() {
        return constants$2247.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCertEncodingType;
     * }
     */
    public static int dwCertEncodingType$get(MemorySegment seg) {
        return (int)constants$2247.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCertEncodingType;
     * }
     */
    public static void dwCertEncodingType$set(MemorySegment seg, int x) {
        constants$2247.const$1.set(seg, x);
    }
    public static int dwCertEncodingType$get(MemorySegment seg, long index) {
        return (int)constants$2247.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCertEncodingType$set(MemorySegment seg, long index, int x) {
        constants$2247.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbData$VH() {
        return constants$2247.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static int cbData$get(MemorySegment seg) {
        return (int)constants$2247.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbData;
     * }
     */
    public static void cbData$set(MemorySegment seg, int x) {
        constants$2247.const$2.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)constants$2247.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        constants$2247.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbData$VH() {
        return constants$2247.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PBYTE pbData;
     * }
     */
    public static MemorySegment pbData$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2247.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PBYTE pbData;
     * }
     */
    public static void pbData$set(MemorySegment seg, MemorySegment x) {
        constants$2247.const$3.set(seg, x);
    }
    public static MemorySegment pbData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2247.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pbData$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2247.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


