// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRL_CONTEXT {
 *     DWORD dwCertEncodingType;
 *     BYTE* pbCrlEncoded;
 *     DWORD cbCrlEncoded;
 *     PCRL_INFO pCrlInfo;
 *     HCERTSTORE hCertStore;
 * };
 * }
 */
public class _CRL_CONTEXT {

    public static MemoryLayout $LAYOUT() {
        return constants$2118.const$4;
    }
    public static VarHandle dwCertEncodingType$VH() {
        return constants$2118.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwCertEncodingType;
     * }
     */
    public static int dwCertEncodingType$get(MemorySegment seg) {
        return (int)constants$2118.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwCertEncodingType;
     * }
     */
    public static void dwCertEncodingType$set(MemorySegment seg, int x) {
        constants$2118.const$5.set(seg, x);
    }
    public static int dwCertEncodingType$get(MemorySegment seg, long index) {
        return (int)constants$2118.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCertEncodingType$set(MemorySegment seg, long index, int x) {
        constants$2118.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pbCrlEncoded$VH() {
        return constants$2119.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BYTE* pbCrlEncoded;
     * }
     */
    public static MemorySegment pbCrlEncoded$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2119.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BYTE* pbCrlEncoded;
     * }
     */
    public static void pbCrlEncoded$set(MemorySegment seg, MemorySegment x) {
        constants$2119.const$0.set(seg, x);
    }
    public static MemorySegment pbCrlEncoded$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2119.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pbCrlEncoded$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2119.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cbCrlEncoded$VH() {
        return constants$2119.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbCrlEncoded;
     * }
     */
    public static int cbCrlEncoded$get(MemorySegment seg) {
        return (int)constants$2119.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbCrlEncoded;
     * }
     */
    public static void cbCrlEncoded$set(MemorySegment seg, int x) {
        constants$2119.const$1.set(seg, x);
    }
    public static int cbCrlEncoded$get(MemorySegment seg, long index) {
        return (int)constants$2119.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbCrlEncoded$set(MemorySegment seg, long index, int x) {
        constants$2119.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pCrlInfo$VH() {
        return constants$2119.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRL_INFO pCrlInfo;
     * }
     */
    public static MemorySegment pCrlInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2119.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRL_INFO pCrlInfo;
     * }
     */
    public static void pCrlInfo$set(MemorySegment seg, MemorySegment x) {
        constants$2119.const$2.set(seg, x);
    }
    public static MemorySegment pCrlInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2119.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pCrlInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2119.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hCertStore$VH() {
        return constants$2119.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCERTSTORE hCertStore;
     * }
     */
    public static MemorySegment hCertStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2119.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCERTSTORE hCertStore;
     * }
     */
    public static void hCertStore$set(MemorySegment seg, MemorySegment x) {
        constants$2119.const$3.set(seg, x);
    }
    public static MemorySegment hCertStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2119.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hCertStore$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2119.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


