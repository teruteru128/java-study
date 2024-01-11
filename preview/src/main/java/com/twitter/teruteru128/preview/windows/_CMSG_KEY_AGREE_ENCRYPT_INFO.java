// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _CMSG_KEY_AGREE_ENCRYPT_INFO {
 *     DWORD cbSize;
 *     DWORD dwRecipientIndex;
 *     CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm;
 *     CRYPT_DATA_BLOB UserKeyingMaterial;
 *     DWORD dwOriginatorChoice;
 *     union {
 *         CERT_ID OriginatorCertId;
 *         CERT_PUBLIC_KEY_INFO OriginatorPublicKeyInfo;
 *     };
 *     DWORD cKeyAgreeKeyEncryptInfo;
 *     PCMSG_KEY_AGREE_KEY_ENCRYPT_INFO* rgpKeyAgreeKeyEncryptInfo;
 *     DWORD dwFlags;
 * };
 * }
 */
public class _CMSG_KEY_AGREE_ENCRYPT_INFO {

    public static MemoryLayout $LAYOUT() {
        return constants$2112.const$5;
    }
    public static VarHandle cbSize$VH() {
        return constants$2113.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static int cbSize$get(MemorySegment seg) {
        return (int)constants$2113.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cbSize;
     * }
     */
    public static void cbSize$set(MemorySegment seg, int x) {
        constants$2113.const$0.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)constants$2113.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        constants$2113.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwRecipientIndex$VH() {
        return constants$2113.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwRecipientIndex;
     * }
     */
    public static int dwRecipientIndex$get(MemorySegment seg) {
        return (int)constants$2113.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwRecipientIndex;
     * }
     */
    public static void dwRecipientIndex$set(MemorySegment seg, int x) {
        constants$2113.const$1.set(seg, x);
    }
    public static int dwRecipientIndex$get(MemorySegment seg, long index) {
        return (int)constants$2113.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRecipientIndex$set(MemorySegment seg, long index, int x) {
        constants$2113.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment KeyEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static MemorySegment UserKeyingMaterial$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static VarHandle dwOriginatorChoice$VH() {
        return constants$2113.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwOriginatorChoice;
     * }
     */
    public static int dwOriginatorChoice$get(MemorySegment seg) {
        return (int)constants$2113.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwOriginatorChoice;
     * }
     */
    public static void dwOriginatorChoice$set(MemorySegment seg, int x) {
        constants$2113.const$2.set(seg, x);
    }
    public static int dwOriginatorChoice$get(MemorySegment seg, long index) {
        return (int)constants$2113.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOriginatorChoice$set(MemorySegment seg, long index, int x) {
        constants$2113.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OriginatorCertId$slice(MemorySegment seg) {
        return seg.asSlice(56, 40);
    }
    public static MemorySegment OriginatorPublicKeyInfo$slice(MemorySegment seg) {
        return seg.asSlice(56, 48);
    }
    public static VarHandle cKeyAgreeKeyEncryptInfo$VH() {
        return constants$2113.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD cKeyAgreeKeyEncryptInfo;
     * }
     */
    public static int cKeyAgreeKeyEncryptInfo$get(MemorySegment seg) {
        return (int)constants$2113.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD cKeyAgreeKeyEncryptInfo;
     * }
     */
    public static void cKeyAgreeKeyEncryptInfo$set(MemorySegment seg, int x) {
        constants$2113.const$3.set(seg, x);
    }
    public static int cKeyAgreeKeyEncryptInfo$get(MemorySegment seg, long index) {
        return (int)constants$2113.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void cKeyAgreeKeyEncryptInfo$set(MemorySegment seg, long index, int x) {
        constants$2113.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle rgpKeyAgreeKeyEncryptInfo$VH() {
        return constants$2113.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PCMSG_KEY_AGREE_KEY_ENCRYPT_INFO* rgpKeyAgreeKeyEncryptInfo;
     * }
     */
    public static MemorySegment rgpKeyAgreeKeyEncryptInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2113.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PCMSG_KEY_AGREE_KEY_ENCRYPT_INFO* rgpKeyAgreeKeyEncryptInfo;
     * }
     */
    public static void rgpKeyAgreeKeyEncryptInfo$set(MemorySegment seg, MemorySegment x) {
        constants$2113.const$4.set(seg, x);
    }
    public static MemorySegment rgpKeyAgreeKeyEncryptInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2113.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpKeyAgreeKeyEncryptInfo$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2113.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dwFlags$VH() {
        return constants$2113.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static int dwFlags$get(MemorySegment seg) {
        return (int)constants$2113.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * DWORD dwFlags;
     * }
     */
    public static void dwFlags$set(MemorySegment seg, int x) {
        constants$2113.const$5.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)constants$2113.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        constants$2113.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


