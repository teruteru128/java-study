// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _ENCRYPTION_PROTECTOR {
 *     DWORD cbTotalLength;
 *     SID* pUserSid;
 *     LPWSTR lpProtectorDescriptor;
 * };
 * }
 */
public class _ENCRYPTION_PROTECTOR {

    public static MemoryLayout $LAYOUT() {
        return constants$2255.const$3;
    }
    public static VarHandle cbTotalLength$VH() {
        return constants$2255.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbTotalLength;
     * }
     */
    public static int cbTotalLength$get(MemorySegment seg) {
        return (int)constants$2255.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbTotalLength;
     * }
     */
    public static void cbTotalLength$set(MemorySegment seg, int x) {
        constants$2255.const$4.set(seg, x);
    }
    public static int cbTotalLength$get(MemorySegment seg, long index) {
        return (int)constants$2255.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void cbTotalLength$set(MemorySegment seg, long index, int x) {
        constants$2255.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pUserSid$VH() {
        return constants$2255.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * SID* pUserSid;
     * }
     */
    public static MemorySegment pUserSid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2255.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * SID* pUserSid;
     * }
     */
    public static void pUserSid$set(MemorySegment seg, MemorySegment x) {
        constants$2255.const$5.set(seg, x);
    }
    public static MemorySegment pUserSid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2255.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserSid$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2255.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpProtectorDescriptor$VH() {
        return constants$2256.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR lpProtectorDescriptor;
     * }
     */
    public static MemorySegment lpProtectorDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2256.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR lpProtectorDescriptor;
     * }
     */
    public static void lpProtectorDescriptor$set(MemorySegment seg, MemorySegment x) {
        constants$2256.const$0.set(seg, x);
    }
    public static MemorySegment lpProtectorDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2256.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpProtectorDescriptor$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2256.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


