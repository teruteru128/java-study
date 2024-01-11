// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CRYPT_KEY_SIGN_MESSAGE_PARA {
 *     DWORD cbSize;
 *     DWORD dwMsgAndCertEncodingType;
 *     union {
 *         HCRYPTPROV hCryptProv;
 *         NCRYPT_KEY_HANDLE hNCryptKey;
 *     };
 *     DWORD dwKeySpec;
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     void* pvHashAuxInfo;
 *     CRYPT_ALGORITHM_IDENTIFIER PubKeyAlgorithm;
 * };
 * }
 */
public class _CRYPT_KEY_SIGN_MESSAGE_PARA {

    public static MemoryLayout $LAYOUT() {
        return constants$2180.const$5;
    }
    public static VarHandle cbSize$VH() {
        return constants$2181.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2181.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2181.const$0.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2181.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2181.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwMsgAndCertEncodingType$VH() {
        return constants$2181.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwMsgAndCertEncodingType;
     * }
     */
    public static int dwMsgAndCertEncodingType$get(MemorySegment seg) {
        return (int)constants$2181.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwMsgAndCertEncodingType;
     * }
     */
    public static void dwMsgAndCertEncodingType$set(MemorySegment seg, int x) {
        constants$2181.const$1.set(seg, x);
    }
    public static int dwMsgAndCertEncodingType$get(MemorySegment seg, long index) {
        return (int)constants$2181.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMsgAndCertEncodingType$set(MemorySegment seg, long index, int x) {
        constants$2181.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hCryptProv$VH() {
        return constants$2181.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCRYPTPROV hCryptProv;
     * }
     */
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)constants$2181.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCRYPTPROV hCryptProv;
     * }
     */
    public static void hCryptProv$set(MemorySegment seg, long x) {
        constants$2181.const$2.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)constants$2181.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        constants$2181.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hNCryptKey$VH() {
        return constants$2181.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * NCRYPT_KEY_HANDLE hNCryptKey;
     * }
     */
    public static long hNCryptKey$get(MemorySegment seg) {
        return (long)constants$2181.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * NCRYPT_KEY_HANDLE hNCryptKey;
     * }
     */
    public static void hNCryptKey$set(MemorySegment seg, long x) {
        constants$2181.const$3.set(seg, x);
    }
    public static long hNCryptKey$get(MemorySegment seg, long index) {
        return (long)constants$2181.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void hNCryptKey$set(MemorySegment seg, long index, long x) {
        constants$2181.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwKeySpec$VH() {
        return constants$2181.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwKeySpec;
     * }
     */
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)constants$2181.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwKeySpec;
     * }
     */
    public static void dwKeySpec$set(MemorySegment seg, int x) {
        constants$2181.const$4.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)constants$2181.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        constants$2181.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(24, 24);
    }
    public static VarHandle pvHashAuxInfo$VH() {
        return constants$2181.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvHashAuxInfo;
     * }
     */
    public static MemorySegment pvHashAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2181.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvHashAuxInfo;
     * }
     */
    public static void pvHashAuxInfo$set(MemorySegment seg, MemorySegment x) {
        constants$2181.const$5.set(seg, x);
    }
    public static MemorySegment pvHashAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2181.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void pvHashAuxInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2181.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PubKeyAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(56, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


