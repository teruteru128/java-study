// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_SEQUENCE_OF_ANY {
 *     DWORD cValue;
 *     PCRYPT_DER_BLOB rgValue;
 * };
 * }
 */
public class _CRYPT_SEQUENCE_OF_ANY {

    public static MemoryLayout $LAYOUT() {
        return constants$2036.const$5;
    }
    public static VarHandle cValue$VH() {
        return constants$2037.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cValue;
     * }
     */
    public static int cValue$get(MemorySegment seg) {
        return (int)constants$2037.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cValue;
     * }
     */
    public static void cValue$set(MemorySegment seg, int x) {
        constants$2037.const$0.set(seg, x);
    }
    public static int cValue$get(MemorySegment seg, long index) {
        return (int)constants$2037.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cValue$set(MemorySegment seg, long index, int x) {
        constants$2037.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgValue$VH() {
        return constants$2037.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRYPT_DER_BLOB rgValue;
     * }
     */
    public static MemorySegment rgValue$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2037.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRYPT_DER_BLOB rgValue;
     * }
     */
    public static void rgValue$set(MemorySegment seg, MemorySegment x) {
        constants$2037.const$1.set(seg, x);
    }
    public static MemorySegment rgValue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2037.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void rgValue$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2037.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

