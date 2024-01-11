// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_X942_DH_VALIDATION_PARAMS {
 *     CRYPT_BIT_BLOB seed;
 *     DWORD pgenCounter;
 * };
 * }
 */
public class _CERT_X942_DH_VALIDATION_PARAMS {

    public static MemoryLayout $LAYOUT() {
        return constants$2042.const$5;
    }
    public static MemorySegment seed$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static VarHandle pgenCounter$VH() {
        return constants$2043.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD pgenCounter;
     * }
     */
    public static int pgenCounter$get(MemorySegment seg) {
        return (int)constants$2043.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD pgenCounter;
     * }
     */
    public static void pgenCounter$set(MemorySegment seg, int x) {
        constants$2043.const$0.set(seg, x);
    }
    public static int pgenCounter$get(MemorySegment seg, long index) {
        return (int)constants$2043.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pgenCounter$set(MemorySegment seg, long index, int x) {
        constants$2043.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


