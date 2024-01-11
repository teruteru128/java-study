// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _BCRYPT_PROVIDER_NAME {
 *     LPWSTR pszProviderName;
 * };
 * }
 */
public class _BCRYPT_PROVIDER_NAME {

    public static MemoryLayout $LAYOUT() {
        return constants$1957.const$5;
    }
    public static VarHandle pszProviderName$VH() {
        return constants$1958.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pszProviderName;
     * }
     */
    public static MemorySegment pszProviderName$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1958.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pszProviderName;
     * }
     */
    public static void pszProviderName$set(MemorySegment seg, MemorySegment x) {
        constants$1958.const$0.set(seg, x);
    }
    public static MemorySegment pszProviderName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1958.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pszProviderName$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1958.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


