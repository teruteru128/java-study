// Generated by jextract

package com.github.teruteru128.foreign.windows;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _CRYPT_KEY_SIGN_MESSAGE_PARA {
 *     DWORD cbSize;
 *     DWORD dwMsgAndCertEncodingType;
 *     union {
 *         HCRYPTPROV hCryptProv;
 *         NCRYPT_KEY_HANDLE hNCryptKey;
 *     };
 *     DWORD dwKeySpec;
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     void *pvHashAuxInfo;
 *     CRYPT_ALGORITHM_IDENTIFIER PubKeyAlgorithm;
 * }
 * }
 */
public class _CRYPT_KEY_SIGN_MESSAGE_PARA {

    _CRYPT_KEY_SIGN_MESSAGE_PARA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        Windows_h.C_LONG.withName("dwMsgAndCertEncodingType"),
        MemoryLayout.unionLayout(
            Windows_h.C_LONG_LONG.withName("hCryptProv"),
            Windows_h.C_LONG_LONG.withName("hNCryptKey")
        ).withName("$anon$16159:5"),
        Windows_h.C_LONG.withName("dwKeySpec"),
        MemoryLayout.paddingLayout(4),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("HashAlgorithm"),
        Windows_h.C_POINTER.withName("pvHashAuxInfo"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("PubKeyAlgorithm")
    ).withName("_CRYPT_KEY_SIGN_MESSAGE_PARA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwMsgAndCertEncodingType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMsgAndCertEncodingType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMsgAndCertEncodingType
     * }
     */
    public static final OfInt dwMsgAndCertEncodingType$layout() {
        return dwMsgAndCertEncodingType$LAYOUT;
    }

    private static final long dwMsgAndCertEncodingType$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMsgAndCertEncodingType
     * }
     */
    public static final long dwMsgAndCertEncodingType$offset() {
        return dwMsgAndCertEncodingType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMsgAndCertEncodingType
     * }
     */
    public static int dwMsgAndCertEncodingType(MemorySegment struct) {
        return struct.get(dwMsgAndCertEncodingType$LAYOUT, dwMsgAndCertEncodingType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMsgAndCertEncodingType
     * }
     */
    public static void dwMsgAndCertEncodingType(MemorySegment struct, int fieldValue) {
        struct.set(dwMsgAndCertEncodingType$LAYOUT, dwMsgAndCertEncodingType$OFFSET, fieldValue);
    }

    private static final OfLong hCryptProv$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$16159:5"), groupElement("hCryptProv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCRYPTPROV hCryptProv
     * }
     */
    public static final OfLong hCryptProv$layout() {
        return hCryptProv$LAYOUT;
    }

    private static final long hCryptProv$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCRYPTPROV hCryptProv
     * }
     */
    public static final long hCryptProv$offset() {
        return hCryptProv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCRYPTPROV hCryptProv
     * }
     */
    public static long hCryptProv(MemorySegment struct) {
        return struct.get(hCryptProv$LAYOUT, hCryptProv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCRYPTPROV hCryptProv
     * }
     */
    public static void hCryptProv(MemorySegment struct, long fieldValue) {
        struct.set(hCryptProv$LAYOUT, hCryptProv$OFFSET, fieldValue);
    }

    private static final OfLong hNCryptKey$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$16159:5"), groupElement("hNCryptKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NCRYPT_KEY_HANDLE hNCryptKey
     * }
     */
    public static final OfLong hNCryptKey$layout() {
        return hNCryptKey$LAYOUT;
    }

    private static final long hNCryptKey$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NCRYPT_KEY_HANDLE hNCryptKey
     * }
     */
    public static final long hNCryptKey$offset() {
        return hNCryptKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NCRYPT_KEY_HANDLE hNCryptKey
     * }
     */
    public static long hNCryptKey(MemorySegment struct) {
        return struct.get(hNCryptKey$LAYOUT, hNCryptKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NCRYPT_KEY_HANDLE hNCryptKey
     * }
     */
    public static void hNCryptKey(MemorySegment struct, long fieldValue) {
        struct.set(hNCryptKey$LAYOUT, hNCryptKey$OFFSET, fieldValue);
    }

    private static final OfInt dwKeySpec$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwKeySpec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwKeySpec
     * }
     */
    public static final OfInt dwKeySpec$layout() {
        return dwKeySpec$LAYOUT;
    }

    private static final long dwKeySpec$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwKeySpec
     * }
     */
    public static final long dwKeySpec$offset() {
        return dwKeySpec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwKeySpec
     * }
     */
    public static int dwKeySpec(MemorySegment struct) {
        return struct.get(dwKeySpec$LAYOUT, dwKeySpec$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwKeySpec
     * }
     */
    public static void dwKeySpec(MemorySegment struct, int fieldValue) {
        struct.set(dwKeySpec$LAYOUT, dwKeySpec$OFFSET, fieldValue);
    }

    private static final GroupLayout HashAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("HashAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static final GroupLayout HashAlgorithm$layout() {
        return HashAlgorithm$LAYOUT;
    }

    private static final long HashAlgorithm$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static final long HashAlgorithm$offset() {
        return HashAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static MemorySegment HashAlgorithm(MemorySegment struct) {
        return struct.asSlice(HashAlgorithm$OFFSET, HashAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm
     * }
     */
    public static void HashAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, HashAlgorithm$OFFSET, HashAlgorithm$LAYOUT.byteSize());
    }

    private static final AddressLayout pvHashAuxInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvHashAuxInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static final AddressLayout pvHashAuxInfo$layout() {
        return pvHashAuxInfo$LAYOUT;
    }

    private static final long pvHashAuxInfo$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static final long pvHashAuxInfo$offset() {
        return pvHashAuxInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static MemorySegment pvHashAuxInfo(MemorySegment struct) {
        return struct.get(pvHashAuxInfo$LAYOUT, pvHashAuxInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pvHashAuxInfo
     * }
     */
    public static void pvHashAuxInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvHashAuxInfo$LAYOUT, pvHashAuxInfo$OFFSET, fieldValue);
    }

    private static final GroupLayout PubKeyAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("PubKeyAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER PubKeyAlgorithm
     * }
     */
    public static final GroupLayout PubKeyAlgorithm$layout() {
        return PubKeyAlgorithm$LAYOUT;
    }

    private static final long PubKeyAlgorithm$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER PubKeyAlgorithm
     * }
     */
    public static final long PubKeyAlgorithm$offset() {
        return PubKeyAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER PubKeyAlgorithm
     * }
     */
    public static MemorySegment PubKeyAlgorithm(MemorySegment struct) {
        return struct.asSlice(PubKeyAlgorithm$OFFSET, PubKeyAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER PubKeyAlgorithm
     * }
     */
    public static void PubKeyAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PubKeyAlgorithm$OFFSET, PubKeyAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}
