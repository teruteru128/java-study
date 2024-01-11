// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_URL_INFO {
 *     DWORD cbSize;
 *     DWORD dwSyncDeltaTime;
 *     DWORD cGroup;
 *     DWORD* rgcGroupEntry;
 * };
 * }
 */
public class _CRYPT_URL_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2199.const$4;
    }
    public static VarHandle cbSize$VH() {
        return constants$2199.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2199.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2199.const$5.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2199.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2199.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwSyncDeltaTime$VH() {
        return constants$2200.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSyncDeltaTime;
     * }
     */
    public static int dwSyncDeltaTime$get(MemorySegment seg) {
        return (int)constants$2200.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSyncDeltaTime;
     * }
     */
    public static void dwSyncDeltaTime$set(MemorySegment seg, int x) {
        constants$2200.const$0.set(seg, x);
    }
    public static int dwSyncDeltaTime$get(MemorySegment seg, long index) {
        return (int)constants$2200.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSyncDeltaTime$set(MemorySegment seg, long index, int x) {
        constants$2200.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cGroup$VH() {
        return constants$2200.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cGroup;
     * }
     */
    public static int cGroup$get(MemorySegment seg) {
        return (int)constants$2200.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cGroup;
     * }
     */
    public static void cGroup$set(MemorySegment seg, int x) {
        constants$2200.const$1.set(seg, x);
    }
    public static int cGroup$get(MemorySegment seg, long index) {
        return (int)constants$2200.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cGroup$set(MemorySegment seg, long index, int x) {
        constants$2200.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgcGroupEntry$VH() {
        return constants$2200.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD* rgcGroupEntry;
     * }
     */
    public static MemorySegment rgcGroupEntry$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2200.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD* rgcGroupEntry;
     * }
     */
    public static void rgcGroupEntry$set(MemorySegment seg, MemorySegment x) {
        constants$2200.const$2.set(seg, x);
    }
    public static MemorySegment rgcGroupEntry$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2200.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void rgcGroupEntry$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2200.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

