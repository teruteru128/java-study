// Generated by jextract

package com.twitter.teruteru128.preview.windows;

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
 * struct _CMSG_ENVELOPED_ENCODE_INFO {
 *     DWORD cbSize;
 *     HCRYPTPROV_LEGACY hCryptProv;
 *     CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm;
 *     void *pvEncryptionAuxInfo;
 *     DWORD cRecipients;
 *     PCERT_INFO *rgpRecipients;
 * }
 * }
 */
public class _CMSG_ENVELOPED_ENCODE_INFO {

    _CMSG_ENVELOPED_ENCODE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("hCryptProv"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("ContentEncryptionAlgorithm"),
        Windows_h.C_POINTER.withName("pvEncryptionAuxInfo"),
        Windows_h.C_LONG.withName("cRecipients"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgpRecipients")
    ).withName("_CMSG_ENVELOPED_ENCODE_INFO");

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

    private static final OfLong hCryptProv$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hCryptProv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static final OfLong hCryptProv$layout() {
        return hCryptProv$LAYOUT;
    }

    private static final long hCryptProv$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static final long hCryptProv$offset() {
        return hCryptProv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static long hCryptProv(MemorySegment struct) {
        return struct.get(hCryptProv$LAYOUT, hCryptProv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static void hCryptProv(MemorySegment struct, long fieldValue) {
        struct.set(hCryptProv$LAYOUT, hCryptProv$OFFSET, fieldValue);
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

    private static final long ContentEncryptionAlgorithm$OFFSET = 16;

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

    private static final AddressLayout pvEncryptionAuxInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvEncryptionAuxInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pvEncryptionAuxInfo
     * }
     */
    public static final AddressLayout pvEncryptionAuxInfo$layout() {
        return pvEncryptionAuxInfo$LAYOUT;
    }

    private static final long pvEncryptionAuxInfo$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pvEncryptionAuxInfo
     * }
     */
    public static final long pvEncryptionAuxInfo$offset() {
        return pvEncryptionAuxInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pvEncryptionAuxInfo
     * }
     */
    public static MemorySegment pvEncryptionAuxInfo(MemorySegment struct) {
        return struct.get(pvEncryptionAuxInfo$LAYOUT, pvEncryptionAuxInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pvEncryptionAuxInfo
     * }
     */
    public static void pvEncryptionAuxInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvEncryptionAuxInfo$LAYOUT, pvEncryptionAuxInfo$OFFSET, fieldValue);
    }

    private static final OfInt cRecipients$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cRecipients"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cRecipients
     * }
     */
    public static final OfInt cRecipients$layout() {
        return cRecipients$LAYOUT;
    }

    private static final long cRecipients$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cRecipients
     * }
     */
    public static final long cRecipients$offset() {
        return cRecipients$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cRecipients
     * }
     */
    public static int cRecipients(MemorySegment struct) {
        return struct.get(cRecipients$LAYOUT, cRecipients$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cRecipients
     * }
     */
    public static void cRecipients(MemorySegment struct, int fieldValue) {
        struct.set(cRecipients$LAYOUT, cRecipients$OFFSET, fieldValue);
    }

    private static final AddressLayout rgpRecipients$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgpRecipients"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_INFO *rgpRecipients
     * }
     */
    public static final AddressLayout rgpRecipients$layout() {
        return rgpRecipients$LAYOUT;
    }

    private static final long rgpRecipients$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_INFO *rgpRecipients
     * }
     */
    public static final long rgpRecipients$offset() {
        return rgpRecipients$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_INFO *rgpRecipients
     * }
     */
    public static MemorySegment rgpRecipients(MemorySegment struct) {
        return struct.get(rgpRecipients$LAYOUT, rgpRecipients$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_INFO *rgpRecipients
     * }
     */
    public static void rgpRecipients(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgpRecipients$LAYOUT, rgpRecipients$OFFSET, fieldValue);
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

