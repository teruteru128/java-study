// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CERT_REVOCATION_PARA {
 *     DWORD cbSize;
 *     PCCERT_CONTEXT pIssuerCert;
 *     DWORD cCertStore;
 *     HCERTSTORE* rgCertStore;
 *     HCERTSTORE hCrlStore;
 *     LPFILETIME pftTimeToUse;
 * };
 * }
 */
public class _CERT_REVOCATION_PARA {

    public static MemoryLayout $LAYOUT() {
        return constants$2158.const$0;
    }
    public static VarHandle cbSize$VH() {
        return constants$2158.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2158.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2158.const$1.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2158.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2158.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pIssuerCert$VH() {
        return constants$2158.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCCERT_CONTEXT pIssuerCert;
     * }
     */
    public static MemorySegment pIssuerCert$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2158.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCCERT_CONTEXT pIssuerCert;
     * }
     */
    public static void pIssuerCert$set(MemorySegment seg, MemorySegment x) {
        constants$2158.const$2.set(seg, x);
    }
    public static MemorySegment pIssuerCert$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2158.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pIssuerCert$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2158.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cCertStore$VH() {
        return constants$2158.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cCertStore;
     * }
     */
    public static int cCertStore$get(MemorySegment seg) {
        return (int)constants$2158.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cCertStore;
     * }
     */
    public static void cCertStore$set(MemorySegment seg, int x) {
        constants$2158.const$3.set(seg, x);
    }
    public static int cCertStore$get(MemorySegment seg, long index) {
        return (int)constants$2158.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cCertStore$set(MemorySegment seg, long index, int x) {
        constants$2158.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgCertStore$VH() {
        return constants$2158.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCERTSTORE* rgCertStore;
     * }
     */
    public static MemorySegment rgCertStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2158.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCERTSTORE* rgCertStore;
     * }
     */
    public static void rgCertStore$set(MemorySegment seg, MemorySegment x) {
        constants$2158.const$4.set(seg, x);
    }
    public static MemorySegment rgCertStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2158.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void rgCertStore$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2158.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hCrlStore$VH() {
        return constants$2158.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCERTSTORE hCrlStore;
     * }
     */
    public static MemorySegment hCrlStore$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2158.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCERTSTORE hCrlStore;
     * }
     */
    public static void hCrlStore$set(MemorySegment seg, MemorySegment x) {
        constants$2158.const$5.set(seg, x);
    }
    public static MemorySegment hCrlStore$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2158.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void hCrlStore$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2158.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pftTimeToUse$VH() {
        return constants$2159.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPFILETIME pftTimeToUse;
     * }
     */
    public static MemorySegment pftTimeToUse$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2159.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPFILETIME pftTimeToUse;
     * }
     */
    public static void pftTimeToUse$set(MemorySegment seg, MemorySegment x) {
        constants$2159.const$0.set(seg, x);
    }
    public static MemorySegment pftTimeToUse$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2159.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void pftTimeToUse$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2159.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


