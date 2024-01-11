// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_ACCESS_DESCRIPTION {
 *     LPSTR pszAccessMethod;
 *     CERT_ALT_NAME_ENTRY AccessLocation;
 * };
 * }
 */
public class _CERT_ACCESS_DESCRIPTION {

    public static MemoryLayout $LAYOUT() {
        return constants$2037.const$3;
    }
    public static VarHandle pszAccessMethod$VH() {
        return constants$2037.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszAccessMethod;
     * }
     */
    public static MemorySegment pszAccessMethod$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2037.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszAccessMethod;
     * }
     */
    public static void pszAccessMethod$set(MemorySegment seg, MemorySegment x) {
        constants$2037.const$4.set(seg, x);
    }
    public static MemorySegment pszAccessMethod$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2037.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void pszAccessMethod$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2037.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment AccessLocation$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

