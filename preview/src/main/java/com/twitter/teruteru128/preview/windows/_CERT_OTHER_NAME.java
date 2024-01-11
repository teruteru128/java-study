// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_OTHER_NAME {
 *     LPSTR pszObjId;
 *     CRYPT_OBJID_BLOB Value;
 * };
 * }
 */
public class _CERT_OTHER_NAME {

    public static MemoryLayout $LAYOUT() {
        return constants$2026.const$1;
    }
    public static VarHandle pszObjId$VH() {
        return constants$2026.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszObjId;
     * }
     */
    public static MemorySegment pszObjId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2026.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszObjId;
     * }
     */
    public static void pszObjId$set(MemorySegment seg, MemorySegment x) {
        constants$2026.const$2.set(seg, x);
    }
    public static MemorySegment pszObjId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2026.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2026.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Value$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


