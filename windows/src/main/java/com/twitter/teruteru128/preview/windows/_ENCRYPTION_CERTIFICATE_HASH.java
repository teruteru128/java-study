// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ENCRYPTION_CERTIFICATE_HASH {
 *     DWORD cbTotalLength;
 *     SID* pUserSid;
 *     PEFS_HASH_BLOB pHash;
 *     LPWSTR lpDisplayInformation;
 * };
 * }
 */
public class _ENCRYPTION_CERTIFICATE_HASH {

    public static MemoryLayout $LAYOUT() {
        return constants$2252.const$5;
    }
    public static VarHandle cbTotalLength$VH() {
        return constants$2253.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbTotalLength;
     * }
     */
    public static int cbTotalLength$get(MemorySegment seg) {
        return (int)constants$2253.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbTotalLength;
     * }
     */
    public static void cbTotalLength$set(MemorySegment seg, int x) {
        constants$2253.const$0.set(seg, x);
    }
    public static int cbTotalLength$get(MemorySegment seg, long index) {
        return (int)constants$2253.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbTotalLength$set(MemorySegment seg, long index, int x) {
        constants$2253.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pUserSid$VH() {
        return constants$2253.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SID* pUserSid;
     * }
     */
    public static MemorySegment pUserSid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2253.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SID* pUserSid;
     * }
     */
    public static void pUserSid$set(MemorySegment seg, MemorySegment x) {
        constants$2253.const$1.set(seg, x);
    }
    public static MemorySegment pUserSid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2253.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserSid$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2253.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pHash$VH() {
        return constants$2253.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PEFS_HASH_BLOB pHash;
     * }
     */
    public static MemorySegment pHash$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2253.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PEFS_HASH_BLOB pHash;
     * }
     */
    public static void pHash$set(MemorySegment seg, MemorySegment x) {
        constants$2253.const$2.set(seg, x);
    }
    public static MemorySegment pHash$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2253.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pHash$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2253.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpDisplayInformation$VH() {
        return constants$2253.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpDisplayInformation;
     * }
     */
    public static MemorySegment lpDisplayInformation$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2253.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpDisplayInformation;
     * }
     */
    public static void lpDisplayInformation$set(MemorySegment seg, MemorySegment x) {
        constants$2253.const$3.set(seg, x);
    }
    public static MemorySegment lpDisplayInformation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2253.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDisplayInformation$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2253.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

