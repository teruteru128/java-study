// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_PSOURCE_ALGORITHM {
 *     LPSTR pszObjId;
 *     CRYPT_DATA_BLOB EncodingParameters;
 * };
 * }
 */
public class _CRYPT_PSOURCE_ALGORITHM {

    public static MemoryLayout $LAYOUT() {
        return constants$2047.const$0;
    }
    public static VarHandle pszObjId$VH() {
        return constants$2047.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszObjId;
     * }
     */
    public static MemorySegment pszObjId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2047.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszObjId;
     * }
     */
    public static void pszObjId$set(MemorySegment seg, MemorySegment x) {
        constants$2047.const$1.set(seg, x);
    }
    public static MemorySegment pszObjId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2047.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2047.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment EncodingParameters$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

