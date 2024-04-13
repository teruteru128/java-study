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
 * struct _CMSG_CNG_CONTENT_DECRYPT_INFO {
 *     DWORD cbSize;
 *     CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm;
 *     PFN_CMSG_ALLOC pfnAlloc;
 *     PFN_CMSG_FREE pfnFree;
 *     NCRYPT_KEY_HANDLE hNCryptKey;
 *     BYTE *pbContentEncryptKey;
 *     DWORD cbContentEncryptKey;
 *     BCRYPT_KEY_HANDLE hCNGContentEncryptKey;
 *     BYTE *pbCNGContentEncryptKeyObject;
 * }
 * }
 */
public class _CMSG_CNG_CONTENT_DECRYPT_INFO {

    _CMSG_CNG_CONTENT_DECRYPT_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("ContentEncryptionAlgorithm"),
        Windows_h.C_POINTER.withName("pfnAlloc"),
        Windows_h.C_POINTER.withName("pfnFree"),
        Windows_h.C_LONG_LONG.withName("hNCryptKey"),
        Windows_h.C_POINTER.withName("pbContentEncryptKey"),
        Windows_h.C_LONG.withName("cbContentEncryptKey"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hCNGContentEncryptKey"),
        Windows_h.C_POINTER.withName("pbCNGContentEncryptKeyObject")
    ).withName("_CMSG_CNG_CONTENT_DECRYPT_INFO");

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

    private static final GroupLayout ContentEncryptionAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ContentEncryptionAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm
     * }
     */
    public static final GroupLayout ContentEncryptionAlgorithm$layout() {
        return ContentEncryptionAlgorithm$LAYOUT;
    }

    private static final long ContentEncryptionAlgorithm$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm
     * }
     */
    public static final long ContentEncryptionAlgorithm$offset() {
        return ContentEncryptionAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm
     * }
     */
    public static MemorySegment ContentEncryptionAlgorithm(MemorySegment struct) {
        return struct.asSlice(ContentEncryptionAlgorithm$OFFSET, ContentEncryptionAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm
     * }
     */
    public static void ContentEncryptionAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ContentEncryptionAlgorithm$OFFSET, ContentEncryptionAlgorithm$LAYOUT.byteSize());
    }

    private static final AddressLayout pfnAlloc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnAlloc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFN_CMSG_ALLOC pfnAlloc
     * }
     */
    public static final AddressLayout pfnAlloc$layout() {
        return pfnAlloc$LAYOUT;
    }

    private static final long pfnAlloc$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFN_CMSG_ALLOC pfnAlloc
     * }
     */
    public static final long pfnAlloc$offset() {
        return pfnAlloc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFN_CMSG_ALLOC pfnAlloc
     * }
     */
    public static MemorySegment pfnAlloc(MemorySegment struct) {
        return struct.get(pfnAlloc$LAYOUT, pfnAlloc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFN_CMSG_ALLOC pfnAlloc
     * }
     */
    public static void pfnAlloc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnAlloc$LAYOUT, pfnAlloc$OFFSET, fieldValue);
    }

    private static final AddressLayout pfnFree$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnFree"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFN_CMSG_FREE pfnFree
     * }
     */
    public static final AddressLayout pfnFree$layout() {
        return pfnFree$LAYOUT;
    }

    private static final long pfnFree$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFN_CMSG_FREE pfnFree
     * }
     */
    public static final long pfnFree$offset() {
        return pfnFree$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFN_CMSG_FREE pfnFree
     * }
     */
    public static MemorySegment pfnFree(MemorySegment struct) {
        return struct.get(pfnFree$LAYOUT, pfnFree$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFN_CMSG_FREE pfnFree
     * }
     */
    public static void pfnFree(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnFree$LAYOUT, pfnFree$OFFSET, fieldValue);
    }

    private static final OfLong hNCryptKey$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hNCryptKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NCRYPT_KEY_HANDLE hNCryptKey
     * }
     */
    public static final OfLong hNCryptKey$layout() {
        return hNCryptKey$LAYOUT;
    }

    private static final long hNCryptKey$OFFSET = 48;

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

    private static final AddressLayout pbContentEncryptKey$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbContentEncryptKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE *pbContentEncryptKey
     * }
     */
    public static final AddressLayout pbContentEncryptKey$layout() {
        return pbContentEncryptKey$LAYOUT;
    }

    private static final long pbContentEncryptKey$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE *pbContentEncryptKey
     * }
     */
    public static final long pbContentEncryptKey$offset() {
        return pbContentEncryptKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE *pbContentEncryptKey
     * }
     */
    public static MemorySegment pbContentEncryptKey(MemorySegment struct) {
        return struct.get(pbContentEncryptKey$LAYOUT, pbContentEncryptKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE *pbContentEncryptKey
     * }
     */
    public static void pbContentEncryptKey(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbContentEncryptKey$LAYOUT, pbContentEncryptKey$OFFSET, fieldValue);
    }

    private static final OfInt cbContentEncryptKey$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbContentEncryptKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbContentEncryptKey
     * }
     */
    public static final OfInt cbContentEncryptKey$layout() {
        return cbContentEncryptKey$LAYOUT;
    }

    private static final long cbContentEncryptKey$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbContentEncryptKey
     * }
     */
    public static final long cbContentEncryptKey$offset() {
        return cbContentEncryptKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbContentEncryptKey
     * }
     */
    public static int cbContentEncryptKey(MemorySegment struct) {
        return struct.get(cbContentEncryptKey$LAYOUT, cbContentEncryptKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbContentEncryptKey
     * }
     */
    public static void cbContentEncryptKey(MemorySegment struct, int fieldValue) {
        struct.set(cbContentEncryptKey$LAYOUT, cbContentEncryptKey$OFFSET, fieldValue);
    }

    private static final AddressLayout hCNGContentEncryptKey$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hCNGContentEncryptKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BCRYPT_KEY_HANDLE hCNGContentEncryptKey
     * }
     */
    public static final AddressLayout hCNGContentEncryptKey$layout() {
        return hCNGContentEncryptKey$LAYOUT;
    }

    private static final long hCNGContentEncryptKey$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BCRYPT_KEY_HANDLE hCNGContentEncryptKey
     * }
     */
    public static final long hCNGContentEncryptKey$offset() {
        return hCNGContentEncryptKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BCRYPT_KEY_HANDLE hCNGContentEncryptKey
     * }
     */
    public static MemorySegment hCNGContentEncryptKey(MemorySegment struct) {
        return struct.get(hCNGContentEncryptKey$LAYOUT, hCNGContentEncryptKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BCRYPT_KEY_HANDLE hCNGContentEncryptKey
     * }
     */
    public static void hCNGContentEncryptKey(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hCNGContentEncryptKey$LAYOUT, hCNGContentEncryptKey$OFFSET, fieldValue);
    }

    private static final AddressLayout pbCNGContentEncryptKeyObject$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbCNGContentEncryptKeyObject"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE *pbCNGContentEncryptKeyObject
     * }
     */
    public static final AddressLayout pbCNGContentEncryptKeyObject$layout() {
        return pbCNGContentEncryptKeyObject$LAYOUT;
    }

    private static final long pbCNGContentEncryptKeyObject$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE *pbCNGContentEncryptKeyObject
     * }
     */
    public static final long pbCNGContentEncryptKeyObject$offset() {
        return pbCNGContentEncryptKeyObject$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE *pbCNGContentEncryptKeyObject
     * }
     */
    public static MemorySegment pbCNGContentEncryptKeyObject(MemorySegment struct) {
        return struct.get(pbCNGContentEncryptKeyObject$LAYOUT, pbCNGContentEncryptKeyObject$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE *pbCNGContentEncryptKeyObject
     * }
     */
    public static void pbCNGContentEncryptKeyObject(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbCNGContentEncryptKeyObject$LAYOUT, pbCNGContentEncryptKeyObject$OFFSET, fieldValue);
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
