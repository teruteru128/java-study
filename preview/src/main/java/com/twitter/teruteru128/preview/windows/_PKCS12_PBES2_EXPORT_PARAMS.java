// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PKCS12_PBES2_EXPORT_PARAMS {
 *     DWORD dwSize;
 *     PVOID hNcryptDescriptor;
 *     LPWSTR pwszPbes2Alg;
 * };
 * }
 */
public class _PKCS12_PBES2_EXPORT_PARAMS {

    public static MemoryLayout $LAYOUT() {
        return constants$2229.const$4;
    }
    public static VarHandle dwSize$VH() {
        return constants$2229.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static int dwSize$get(MemorySegment seg) {
        return (int)constants$2229.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwSize;
     * }
     */
    public static void dwSize$set(MemorySegment seg, int x) {
        constants$2229.const$5.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)constants$2229.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        constants$2229.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hNcryptDescriptor$VH() {
        return constants$2230.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PVOID hNcryptDescriptor;
     * }
     */
    public static MemorySegment hNcryptDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2230.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PVOID hNcryptDescriptor;
     * }
     */
    public static void hNcryptDescriptor$set(MemorySegment seg, MemorySegment x) {
        constants$2230.const$0.set(seg, x);
    }
    public static MemorySegment hNcryptDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2230.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hNcryptDescriptor$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2230.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pwszPbes2Alg$VH() {
        return constants$2230.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPWSTR pwszPbes2Alg;
     * }
     */
    public static MemorySegment pwszPbes2Alg$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2230.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPWSTR pwszPbes2Alg;
     * }
     */
    public static void pwszPbes2Alg$set(MemorySegment seg, MemorySegment x) {
        constants$2230.const$1.set(seg, x);
    }
    public static MemorySegment pwszPbes2Alg$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2230.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszPbes2Alg$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2230.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


