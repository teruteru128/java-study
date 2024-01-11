// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SECURITY_ATTRIBUTES {
 *     DWORD nLength;
 *     LPVOID lpSecurityDescriptor;
 *     BOOL bInheritHandle;
 * };
 * }
 */
public class _SECURITY_ATTRIBUTES {

    public static MemoryLayout $LAYOUT() {
        return constants$550.const$4;
    }
    public static VarHandle nLength$VH() {
        return constants$550.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD nLength;
     * }
     */
    public static int nLength$get(MemorySegment seg) {
        return (int)constants$550.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD nLength;
     * }
     */
    public static void nLength$set(MemorySegment seg, int x) {
        constants$550.const$5.set(seg, x);
    }
    public static int nLength$get(MemorySegment seg, long index) {
        return (int)constants$550.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void nLength$set(MemorySegment seg, long index, int x) {
        constants$550.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle lpSecurityDescriptor$VH() {
        return constants$551.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPVOID lpSecurityDescriptor;
     * }
     */
    public static MemorySegment lpSecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$551.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPVOID lpSecurityDescriptor;
     * }
     */
    public static void lpSecurityDescriptor$set(MemorySegment seg, MemorySegment x) {
        constants$551.const$0.set(seg, x);
    }
    public static MemorySegment lpSecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$551.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void lpSecurityDescriptor$set(MemorySegment seg, long index, MemorySegment x) {
        constants$551.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle bInheritHandle$VH() {
        return constants$551.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL bInheritHandle;
     * }
     */
    public static int bInheritHandle$get(MemorySegment seg) {
        return (int)constants$551.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL bInheritHandle;
     * }
     */
    public static void bInheritHandle$set(MemorySegment seg, int x) {
        constants$551.const$1.set(seg, x);
    }
    public static int bInheritHandle$get(MemorySegment seg, long index) {
        return (int)constants$551.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void bInheritHandle$set(MemorySegment seg, long index, int x) {
        constants$551.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


