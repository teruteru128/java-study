// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_TIMESTAMP_REQUEST {
 *     DWORD dwVersion;
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     CRYPT_DER_BLOB HashedMessage;
 *     LPSTR pszTSAPolicyId;
 *     CRYPT_INTEGER_BLOB Nonce;
 *     BOOL fCertReq;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * };
 * }
 */
public class _CRYPT_TIMESTAMP_REQUEST {

    public static MemoryLayout $LAYOUT() {
        return constants$2236.const$1;
    }
    public static VarHandle dwVersion$VH() {
        return constants$2236.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static int dwVersion$get(MemorySegment seg) {
        return (int)constants$2236.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwVersion;
     * }
     */
    public static void dwVersion$set(MemorySegment seg, int x) {
        constants$2236.const$2.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)constants$2236.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        constants$2236.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static MemorySegment HashedMessage$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static VarHandle pszTSAPolicyId$VH() {
        return constants$2236.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * LPSTR pszTSAPolicyId;
     * }
     */
    public static MemorySegment pszTSAPolicyId$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2236.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * LPSTR pszTSAPolicyId;
     * }
     */
    public static void pszTSAPolicyId$set(MemorySegment seg, MemorySegment x) {
        constants$2236.const$3.set(seg, x);
    }
    public static MemorySegment pszTSAPolicyId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2236.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pszTSAPolicyId$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2236.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Nonce$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static VarHandle fCertReq$VH() {
        return constants$2236.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * BOOL fCertReq;
     * }
     */
    public static int fCertReq$get(MemorySegment seg) {
        return (int)constants$2236.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * BOOL fCertReq;
     * }
     */
    public static void fCertReq$set(MemorySegment seg, int x) {
        constants$2236.const$4.set(seg, x);
    }
    public static int fCertReq$get(MemorySegment seg, long index) {
        return (int)constants$2236.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void fCertReq$set(MemorySegment seg, long index, int x) {
        constants$2236.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle cExtension$VH() {
        return constants$2236.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cExtension;
     * }
     */
    public static int cExtension$get(MemorySegment seg) {
        return (int)constants$2236.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cExtension;
     * }
     */
    public static void cExtension$set(MemorySegment seg, int x) {
        constants$2236.const$5.set(seg, x);
    }
    public static int cExtension$get(MemorySegment seg, long index) {
        return (int)constants$2236.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void cExtension$set(MemorySegment seg, long index, int x) {
        constants$2236.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgExtension$VH() {
        return constants$2237.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCERT_EXTENSION rgExtension;
     * }
     */
    public static MemorySegment rgExtension$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2237.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCERT_EXTENSION rgExtension;
     * }
     */
    public static void rgExtension$set(MemorySegment seg, MemorySegment x) {
        constants$2237.const$0.set(seg, x);
    }
    public static MemorySegment rgExtension$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2237.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void rgExtension$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2237.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


