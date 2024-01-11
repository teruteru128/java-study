// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMC_TAGGED_CERT_REQUEST {
 *     DWORD dwBodyPartID;
 *     CRYPT_DER_BLOB SignedCertRequest;
 * };
 * }
 */
public class _CMC_TAGGED_CERT_REQUEST {

    public static MemoryLayout $LAYOUT() {
        return constants$2047.const$5;
    }
    public static VarHandle dwBodyPartID$VH() {
        return constants$2048.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwBodyPartID;
     * }
     */
    public static int dwBodyPartID$get(MemorySegment seg) {
        return (int)constants$2048.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwBodyPartID;
     * }
     */
    public static void dwBodyPartID$set(MemorySegment seg, int x) {
        constants$2048.const$0.set(seg, x);
    }
    public static int dwBodyPartID$get(MemorySegment seg, long index) {
        return (int)constants$2048.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBodyPartID$set(MemorySegment seg, long index, int x) {
        constants$2048.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment SignedCertRequest$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


