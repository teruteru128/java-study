// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _EFS_ENCRYPTION_STATUS_INFO {
 *     BOOL bHasCurrentKey;
 *     DWORD dwEncryptionError;
 * };
 * }
 */
public class _EFS_ENCRYPTION_STATUS_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2251.const$4;
    }
    public static VarHandle bHasCurrentKey$VH() {
        return constants$2251.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL bHasCurrentKey;
     * }
     */
    public static int bHasCurrentKey$get(MemorySegment seg) {
        return (int)constants$2251.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL bHasCurrentKey;
     * }
     */
    public static void bHasCurrentKey$set(MemorySegment seg, int x) {
        constants$2251.const$5.set(seg, x);
    }
    public static int bHasCurrentKey$get(MemorySegment seg, long index) {
        return (int)constants$2251.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void bHasCurrentKey$set(MemorySegment seg, long index, int x) {
        constants$2251.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwEncryptionError$VH() {
        return constants$2252.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwEncryptionError;
     * }
     */
    public static int dwEncryptionError$get(MemorySegment seg) {
        return (int)constants$2252.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwEncryptionError;
     * }
     */
    public static void dwEncryptionError$set(MemorySegment seg, int x) {
        constants$2252.const$0.set(seg, x);
    }
    public static int dwEncryptionError$get(MemorySegment seg, long index) {
        return (int)constants$2252.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwEncryptionError$set(MemorySegment seg, long index, int x) {
        constants$2252.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


