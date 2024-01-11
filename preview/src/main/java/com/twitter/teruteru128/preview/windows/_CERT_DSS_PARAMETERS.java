// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_DSS_PARAMETERS {
 *     CRYPT_UINT_BLOB p;
 *     CRYPT_UINT_BLOB q;
 *     CRYPT_UINT_BLOB g;
 * };
 * }
 */
public class _CERT_DSS_PARAMETERS {

    public static MemoryLayout $LAYOUT() {
        return constants$2042.const$2;
    }
    public static MemorySegment p$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment q$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment g$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


