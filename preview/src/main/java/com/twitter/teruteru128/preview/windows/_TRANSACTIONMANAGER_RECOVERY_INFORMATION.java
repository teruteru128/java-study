// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _TRANSACTIONMANAGER_RECOVERY_INFORMATION {
 *     ULONGLONG LastRecoveredLsn;
 * };
 * }
 */
public class _TRANSACTIONMANAGER_RECOVERY_INFORMATION {

    public static MemoryLayout $LAYOUT() {
        return constants$527.const$2;
    }
    public static VarHandle LastRecoveredLsn$VH() {
        return constants$527.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * ULONGLONG LastRecoveredLsn;
     * }
     */
    public static long LastRecoveredLsn$get(MemorySegment seg) {
        return (long)constants$527.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * ULONGLONG LastRecoveredLsn;
     * }
     */
    public static void LastRecoveredLsn$set(MemorySegment seg, long x) {
        constants$527.const$3.set(seg, x);
    }
    public static long LastRecoveredLsn$get(MemorySegment seg, long index) {
        return (long)constants$527.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void LastRecoveredLsn$set(MemorySegment seg, long index, long x) {
        constants$527.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


