// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO {
 *     DWORD cbSize;
 *     CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm;
 *     void* pvKeyEncryptionAuxInfo;
 *     HCRYPTPROV hCryptProv;
 *     DWORD dwKeyChoice;
 *     union {
 *         HCRYPTKEY hKeyEncryptionKey;
 *         void* pvKeyEncryptionKey;
 *     };
 *     CRYPT_DATA_BLOB KeyId;
 *     FILETIME Date;
 *     PCRYPT_ATTRIBUTE_TYPE_VALUE pOtherAttr;
 * };
 * }
 */
public class _CMSG_MAIL_LIST_RECIPIENT_ENCODE_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2087.const$1;
    }
    public static VarHandle cbSize$VH() {
        return constants$2087.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2087.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2087.const$2.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2087.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2087.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment KeyEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static VarHandle pvKeyEncryptionAuxInfo$VH() {
        return constants$2087.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvKeyEncryptionAuxInfo;
     * }
     */
    public static MemorySegment pvKeyEncryptionAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2087.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvKeyEncryptionAuxInfo;
     * }
     */
    public static void pvKeyEncryptionAuxInfo$set(MemorySegment seg, MemorySegment x) {
        constants$2087.const$3.set(seg, x);
    }
    public static MemorySegment pvKeyEncryptionAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2087.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pvKeyEncryptionAuxInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2087.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hCryptProv$VH() {
        return constants$2087.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCRYPTPROV hCryptProv;
     * }
     */
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)constants$2087.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCRYPTPROV hCryptProv;
     * }
     */
    public static void hCryptProv$set(MemorySegment seg, long x) {
        constants$2087.const$4.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)constants$2087.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        constants$2087.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwKeyChoice$VH() {
        return constants$2087.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwKeyChoice;
     * }
     */
    public static int dwKeyChoice$get(MemorySegment seg) {
        return (int)constants$2087.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwKeyChoice;
     * }
     */
    public static void dwKeyChoice$set(MemorySegment seg, int x) {
        constants$2087.const$5.set(seg, x);
    }
    public static int dwKeyChoice$get(MemorySegment seg, long index) {
        return (int)constants$2087.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeyChoice$set(MemorySegment seg, long index, int x) {
        constants$2087.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hKeyEncryptionKey$VH() {
        return constants$2088.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCRYPTKEY hKeyEncryptionKey;
     * }
     */
    public static long hKeyEncryptionKey$get(MemorySegment seg) {
        return (long)constants$2088.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCRYPTKEY hKeyEncryptionKey;
     * }
     */
    public static void hKeyEncryptionKey$set(MemorySegment seg, long x) {
        constants$2088.const$0.set(seg, x);
    }
    public static long hKeyEncryptionKey$get(MemorySegment seg, long index) {
        return (long)constants$2088.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void hKeyEncryptionKey$set(MemorySegment seg, long index, long x) {
        constants$2088.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle pvKeyEncryptionKey$VH() {
        return constants$2088.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvKeyEncryptionKey;
     * }
     */
    public static MemorySegment pvKeyEncryptionKey$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2088.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvKeyEncryptionKey;
     * }
     */
    public static void pvKeyEncryptionKey$set(MemorySegment seg, MemorySegment x) {
        constants$2088.const$1.set(seg, x);
    }
    public static MemorySegment pvKeyEncryptionKey$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2088.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void pvKeyEncryptionKey$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2088.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment KeyId$slice(MemorySegment seg) {
        return seg.asSlice(64, 16);
    }
    public static MemorySegment Date$slice(MemorySegment seg) {
        return seg.asSlice(80, 8);
    }
    public static VarHandle pOtherAttr$VH() {
        return constants$2088.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCRYPT_ATTRIBUTE_TYPE_VALUE pOtherAttr;
     * }
     */
    public static MemorySegment pOtherAttr$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2088.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCRYPT_ATTRIBUTE_TYPE_VALUE pOtherAttr;
     * }
     */
    public static void pOtherAttr$set(MemorySegment seg, MemorySegment x) {
        constants$2088.const$2.set(seg, x);
    }
    public static MemorySegment pOtherAttr$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2088.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void pOtherAttr$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2088.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


