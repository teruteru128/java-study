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
 * struct _CRYPT_TIMESTAMP_INFO {
 *     DWORD dwVersion;
 *     LPSTR pszTSAPolicyId;
 *     CRYPT_ALGORITHM_IDENTIFIER HashAlgorithm;
 *     CRYPT_DER_BLOB HashedMessage;
 *     CRYPT_INTEGER_BLOB SerialNumber;
 *     FILETIME ftTime;
 *     PCRYPT_TIMESTAMP_ACCURACY pvAccuracy;
 *     BOOL fOrdering;
 *     CRYPT_DER_BLOB Nonce;
 *     CRYPT_DER_BLOB Tsa;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * }
 * }
 */
public class _CRYPT_TIMESTAMP_INFO {

    _CRYPT_TIMESTAMP_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pszTSAPolicyId"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("HashAlgorithm"),
        _CRYPTOAPI_BLOB.layout().withName("HashedMessage"),
        _CRYPTOAPI_BLOB.layout().withName("SerialNumber"),
        _FILETIME.layout().withName("ftTime"),
        Windows_h.C_POINTER.withName("pvAccuracy"),
        Windows_h.C_INT.withName("fOrdering"),
        MemoryLayout.paddingLayout(4),
        _CRYPTOAPI_BLOB.layout().withName("Nonce"),
        _CRYPTOAPI_BLOB.layout().withName("Tsa"),
        Windows_h.C_LONG.withName("cExtension"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgExtension")
    ).withName("_CRYPT_TIMESTAMP_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static final OfInt dwVersion$layout() {
        return dwVersion$LAYOUT;
    }

    private static final long dwVersion$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static final long dwVersion$offset() {
        return dwVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static int dwVersion(MemorySegment struct) {
        return struct.get(dwVersion$LAYOUT, dwVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwVersion
     * }
     */
    public static void dwVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwVersion$LAYOUT, dwVersion$OFFSET, fieldValue);
    }

    private static final AddressLayout pszTSAPolicyId$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszTSAPolicyId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pszTSAPolicyId
     * }
     */
    public static final AddressLayout pszTSAPolicyId$layout() {
        return pszTSAPolicyId$LAYOUT;
    }

    private static final long pszTSAPolicyId$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pszTSAPolicyId
     * }
     */
    public static final long pszTSAPolicyId$offset() {
        return pszTSAPolicyId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pszTSAPolicyId
     * }
     */
    public static MemorySegment pszTSAPolicyId(MemorySegment struct) {
        return struct.get(pszTSAPolicyId$LAYOUT, pszTSAPolicyId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pszTSAPolicyId
     * }
     */
    public static void pszTSAPolicyId(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszTSAPolicyId$LAYOUT, pszTSAPolicyId$OFFSET, fieldValue);
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

    private static final long HashAlgorithm$OFFSET = 16;

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

    private static final GroupLayout HashedMessage$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("HashedMessage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB HashedMessage
     * }
     */
    public static final GroupLayout HashedMessage$layout() {
        return HashedMessage$LAYOUT;
    }

    private static final long HashedMessage$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB HashedMessage
     * }
     */
    public static final long HashedMessage$offset() {
        return HashedMessage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB HashedMessage
     * }
     */
    public static MemorySegment HashedMessage(MemorySegment struct) {
        return struct.asSlice(HashedMessage$OFFSET, HashedMessage$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB HashedMessage
     * }
     */
    public static void HashedMessage(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, HashedMessage$OFFSET, HashedMessage$LAYOUT.byteSize());
    }

    private static final GroupLayout SerialNumber$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SerialNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SerialNumber
     * }
     */
    public static final GroupLayout SerialNumber$layout() {
        return SerialNumber$LAYOUT;
    }

    private static final long SerialNumber$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SerialNumber
     * }
     */
    public static final long SerialNumber$offset() {
        return SerialNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SerialNumber
     * }
     */
    public static MemorySegment SerialNumber(MemorySegment struct) {
        return struct.asSlice(SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB SerialNumber
     * }
     */
    public static void SerialNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SerialNumber$OFFSET, SerialNumber$LAYOUT.byteSize());
    }

    private static final GroupLayout ftTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ftTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME ftTime
     * }
     */
    public static final GroupLayout ftTime$layout() {
        return ftTime$LAYOUT;
    }

    private static final long ftTime$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME ftTime
     * }
     */
    public static final long ftTime$offset() {
        return ftTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME ftTime
     * }
     */
    public static MemorySegment ftTime(MemorySegment struct) {
        return struct.asSlice(ftTime$OFFSET, ftTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME ftTime
     * }
     */
    public static void ftTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ftTime$OFFSET, ftTime$LAYOUT.byteSize());
    }

    private static final AddressLayout pvAccuracy$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvAccuracy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_TIMESTAMP_ACCURACY pvAccuracy
     * }
     */
    public static final AddressLayout pvAccuracy$layout() {
        return pvAccuracy$LAYOUT;
    }

    private static final long pvAccuracy$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_TIMESTAMP_ACCURACY pvAccuracy
     * }
     */
    public static final long pvAccuracy$offset() {
        return pvAccuracy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_TIMESTAMP_ACCURACY pvAccuracy
     * }
     */
    public static MemorySegment pvAccuracy(MemorySegment struct) {
        return struct.get(pvAccuracy$LAYOUT, pvAccuracy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_TIMESTAMP_ACCURACY pvAccuracy
     * }
     */
    public static void pvAccuracy(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvAccuracy$LAYOUT, pvAccuracy$OFFSET, fieldValue);
    }

    private static final OfInt fOrdering$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fOrdering"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fOrdering
     * }
     */
    public static final OfInt fOrdering$layout() {
        return fOrdering$LAYOUT;
    }

    private static final long fOrdering$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fOrdering
     * }
     */
    public static final long fOrdering$offset() {
        return fOrdering$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fOrdering
     * }
     */
    public static int fOrdering(MemorySegment struct) {
        return struct.get(fOrdering$LAYOUT, fOrdering$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fOrdering
     * }
     */
    public static void fOrdering(MemorySegment struct, int fieldValue) {
        struct.set(fOrdering$LAYOUT, fOrdering$OFFSET, fieldValue);
    }

    private static final GroupLayout Nonce$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Nonce"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB Nonce
     * }
     */
    public static final GroupLayout Nonce$layout() {
        return Nonce$LAYOUT;
    }

    private static final long Nonce$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB Nonce
     * }
     */
    public static final long Nonce$offset() {
        return Nonce$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB Nonce
     * }
     */
    public static MemorySegment Nonce(MemorySegment struct) {
        return struct.asSlice(Nonce$OFFSET, Nonce$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB Nonce
     * }
     */
    public static void Nonce(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Nonce$OFFSET, Nonce$LAYOUT.byteSize());
    }

    private static final GroupLayout Tsa$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Tsa"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB Tsa
     * }
     */
    public static final GroupLayout Tsa$layout() {
        return Tsa$LAYOUT;
    }

    private static final long Tsa$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB Tsa
     * }
     */
    public static final long Tsa$offset() {
        return Tsa$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB Tsa
     * }
     */
    public static MemorySegment Tsa(MemorySegment struct) {
        return struct.asSlice(Tsa$OFFSET, Tsa$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DER_BLOB Tsa
     * }
     */
    public static void Tsa(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Tsa$OFFSET, Tsa$LAYOUT.byteSize());
    }

    private static final OfInt cExtension$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cExtension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static final OfInt cExtension$layout() {
        return cExtension$LAYOUT;
    }

    private static final long cExtension$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static final long cExtension$offset() {
        return cExtension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static int cExtension(MemorySegment struct) {
        return struct.get(cExtension$LAYOUT, cExtension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static void cExtension(MemorySegment struct, int fieldValue) {
        struct.set(cExtension$LAYOUT, cExtension$OFFSET, fieldValue);
    }

    private static final AddressLayout rgExtension$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgExtension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static final AddressLayout rgExtension$layout() {
        return rgExtension$LAYOUT;
    }

    private static final long rgExtension$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static final long rgExtension$offset() {
        return rgExtension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static MemorySegment rgExtension(MemorySegment struct) {
        return struct.get(rgExtension$LAYOUT, rgExtension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static void rgExtension(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgExtension$LAYOUT, rgExtension$OFFSET, fieldValue);
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

