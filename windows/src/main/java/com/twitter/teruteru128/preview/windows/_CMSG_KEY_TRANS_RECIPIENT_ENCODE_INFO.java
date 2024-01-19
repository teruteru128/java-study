// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO {
 *     DWORD cbSize;
 *     CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm;
 *     void* pvKeyEncryptionAuxInfo;
 *     HCRYPTPROV_LEGACY hCryptProv;
 *     CRYPT_BIT_BLOB RecipientPublicKey;
 *     CERT_ID RecipientId;
 * };
 * }
 */
public class _CMSG_KEY_TRANS_RECIPIENT_ENCODE_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2084.const$1;
    }
    public static VarHandle cbSize$VH() {
        return constants$2084.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2084.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2084.const$2.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2084.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2084.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment KeyEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static VarHandle pvKeyEncryptionAuxInfo$VH() {
        return constants$2084.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* pvKeyEncryptionAuxInfo;
     * }
     */
    public static MemorySegment pvKeyEncryptionAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2084.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* pvKeyEncryptionAuxInfo;
     * }
     */
    public static void pvKeyEncryptionAuxInfo$set(MemorySegment seg, MemorySegment x) {
        constants$2084.const$3.set(seg, x);
    }
    public static MemorySegment pvKeyEncryptionAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2084.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void pvKeyEncryptionAuxInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2084.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle hCryptProv$VH() {
        return constants$2084.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)constants$2084.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * HCRYPTPROV_LEGACY hCryptProv;
     * }
     */
    public static void hCryptProv$set(MemorySegment seg, long x) {
        constants$2084.const$4.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)constants$2084.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        constants$2084.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment RecipientPublicKey$slice(MemorySegment seg) {
        return seg.asSlice(48, 24);
    }
    public static MemorySegment RecipientId$slice(MemorySegment seg) {
        return seg.asSlice(72, 40);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}

