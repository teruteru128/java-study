// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE {
 *     DWORD ResponseLevel;
 *     DWORD NumberEntries;
 *     union {
 *         STORAGE_QUERY_DEPENDENT_VOLUME_LEV1_ENTRY Lev1Depends[];
 *         STORAGE_QUERY_DEPENDENT_VOLUME_LEV2_ENTRY Lev2Depends[];
 *     };
 * };
 * }
 */
public class _STORAGE_QUERY_DEPENDENT_VOLUME_RESPONSE {

    public static MemoryLayout $LAYOUT() {
        return constants$2670.const$0;
    }
    public static VarHandle ResponseLevel$VH() {
        return constants$2670.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD ResponseLevel;
     * }
     */
    public static int ResponseLevel$get(MemorySegment seg) {
        return (int)constants$2670.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD ResponseLevel;
     * }
     */
    public static void ResponseLevel$set(MemorySegment seg, int x) {
        constants$2670.const$1.set(seg, x);
    }
    public static int ResponseLevel$get(MemorySegment seg, long index) {
        return (int)constants$2670.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ResponseLevel$set(MemorySegment seg, long index, int x) {
        constants$2670.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle NumberEntries$VH() {
        return constants$2670.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD NumberEntries;
     * }
     */
    public static int NumberEntries$get(MemorySegment seg) {
        return (int)constants$2670.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD NumberEntries;
     * }
     */
    public static void NumberEntries$set(MemorySegment seg, int x) {
        constants$2670.const$2.set(seg, x);
    }
    public static int NumberEntries$get(MemorySegment seg, long index) {
        return (int)constants$2670.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberEntries$set(MemorySegment seg, long index, int x) {
        constants$2670.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

