// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA {
 *     DWORD cOID;
 *     LPSTR* rgpszOID;
 * };
 * }
 */
public class _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA {

    public static MemoryLayout $LAYOUT() {
        return constants$2167.const$5;
    }
    public static VarHandle cOID$VH() {
        return constants$2168.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cOID;
     * }
     */
    public static int cOID$get(MemorySegment seg) {
        return (int)constants$2168.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cOID;
     * }
     */
    public static void cOID$set(MemorySegment seg, int x) {
        constants$2168.const$0.set(seg, x);
    }
    public static int cOID$get(MemorySegment seg, long index) {
        return (int)constants$2168.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cOID$set(MemorySegment seg, long index, int x) {
        constants$2168.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgpszOID$VH() {
        return constants$2168.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR* rgpszOID;
     * }
     */
    public static MemorySegment rgpszOID$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2168.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR* rgpszOID;
     * }
     */
    public static void rgpszOID$set(MemorySegment seg, MemorySegment x) {
        constants$2168.const$1.set(seg, x);
    }
    public static MemorySegment rgpszOID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2168.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszOID$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2168.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

