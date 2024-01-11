// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _KCRM_TRANSACTION_BLOB {
 *     UOW UOW;
 *     GUID TmIdentity;
 *     ULONG IsolationLevel;
 *     ULONG IsolationFlags;
 *     ULONG Timeout;
 *     WCHAR Description[64];
 * };
 * }
 */
public class _KCRM_TRANSACTION_BLOB {

    public static MemoryLayout $LAYOUT() {
        return constants$524.const$4;
    }
    public static MemorySegment UOW$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment TmIdentity$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static VarHandle IsolationLevel$VH() {
        return constants$524.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG IsolationLevel;
     * }
     */
    public static int IsolationLevel$get(MemorySegment seg) {
        return (int)constants$524.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG IsolationLevel;
     * }
     */
    public static void IsolationLevel$set(MemorySegment seg, int x) {
        constants$524.const$5.set(seg, x);
    }
    public static int IsolationLevel$get(MemorySegment seg, long index) {
        return (int)constants$524.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void IsolationLevel$set(MemorySegment seg, long index, int x) {
        constants$524.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle IsolationFlags$VH() {
        return constants$525.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG IsolationFlags;
     * }
     */
    public static int IsolationFlags$get(MemorySegment seg) {
        return (int)constants$525.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG IsolationFlags;
     * }
     */
    public static void IsolationFlags$set(MemorySegment seg, int x) {
        constants$525.const$0.set(seg, x);
    }
    public static int IsolationFlags$get(MemorySegment seg, long index) {
        return (int)constants$525.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void IsolationFlags$set(MemorySegment seg, long index, int x) {
        constants$525.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle Timeout$VH() {
        return constants$525.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONG Timeout;
     * }
     */
    public static int Timeout$get(MemorySegment seg) {
        return (int)constants$525.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONG Timeout;
     * }
     */
    public static void Timeout$set(MemorySegment seg, int x) {
        constants$525.const$1.set(seg, x);
    }
    public static int Timeout$get(MemorySegment seg, long index) {
        return (int)constants$525.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void Timeout$set(MemorySegment seg, long index, int x) {
        constants$525.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Description$slice(MemorySegment seg) {
        return seg.asSlice(44, 128);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

