// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_EXTENSIONS {
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * };
 * }
 */
public class _CERT_EXTENSIONS {

    public static MemoryLayout $LAYOUT() {
        return constants$2024.const$0;
    }
    public static VarHandle cExtension$VH() {
        return constants$2024.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cExtension;
     * }
     */
    public static int cExtension$get(MemorySegment seg) {
        return (int)constants$2024.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cExtension;
     * }
     */
    public static void cExtension$set(MemorySegment seg, int x) {
        constants$2024.const$1.set(seg, x);
    }
    public static int cExtension$get(MemorySegment seg, long index) {
        return (int)constants$2024.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cExtension$set(MemorySegment seg, long index, int x) {
        constants$2024.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgExtension$VH() {
        return constants$2024.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_EXTENSION rgExtension;
     * }
     */
    public static MemorySegment rgExtension$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2024.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_EXTENSION rgExtension;
     * }
     */
    public static void rgExtension$set(MemorySegment seg, MemorySegment x) {
        constants$2024.const$2.set(seg, x);
    }
    public static MemorySegment rgExtension$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2024.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void rgExtension$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2024.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


