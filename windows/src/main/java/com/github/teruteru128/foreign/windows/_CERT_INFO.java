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
 * struct _CERT_INFO {
 *     DWORD dwVersion;
 *     CRYPT_INTEGER_BLOB SerialNumber;
 *     CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm;
 *     CERT_NAME_BLOB Issuer;
 *     FILETIME NotBefore;
 *     FILETIME NotAfter;
 *     CERT_NAME_BLOB Subject;
 *     CERT_PUBLIC_KEY_INFO SubjectPublicKeyInfo;
 *     CRYPT_BIT_BLOB IssuerUniqueId;
 *     CRYPT_BIT_BLOB SubjectUniqueId;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * }
 * }
 */
public class _CERT_INFO {

    _CERT_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        _CRYPTOAPI_BLOB.layout().withName("SerialNumber"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("SignatureAlgorithm"),
        _CRYPTOAPI_BLOB.layout().withName("Issuer"),
        _FILETIME.layout().withName("NotBefore"),
        _FILETIME.layout().withName("NotAfter"),
        _CRYPTOAPI_BLOB.layout().withName("Subject"),
        _CERT_PUBLIC_KEY_INFO.layout().withName("SubjectPublicKeyInfo"),
        _CRYPT_BIT_BLOB.layout().withName("IssuerUniqueId"),
        _CRYPT_BIT_BLOB.layout().withName("SubjectUniqueId"),
        Windows_h.C_LONG.withName("cExtension"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgExtension")
    ).withName("_CERT_INFO");

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

    private static final long SerialNumber$OFFSET = 8;

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

    private static final GroupLayout SignatureAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SignatureAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm
     * }
     */
    public static final GroupLayout SignatureAlgorithm$layout() {
        return SignatureAlgorithm$LAYOUT;
    }

    private static final long SignatureAlgorithm$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm
     * }
     */
    public static final long SignatureAlgorithm$offset() {
        return SignatureAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm
     * }
     */
    public static MemorySegment SignatureAlgorithm(MemorySegment struct) {
        return struct.asSlice(SignatureAlgorithm$OFFSET, SignatureAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm
     * }
     */
    public static void SignatureAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SignatureAlgorithm$OFFSET, SignatureAlgorithm$LAYOUT.byteSize());
    }

    private static final GroupLayout Issuer$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Issuer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB Issuer
     * }
     */
    public static final GroupLayout Issuer$layout() {
        return Issuer$LAYOUT;
    }

    private static final long Issuer$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB Issuer
     * }
     */
    public static final long Issuer$offset() {
        return Issuer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB Issuer
     * }
     */
    public static MemorySegment Issuer(MemorySegment struct) {
        return struct.asSlice(Issuer$OFFSET, Issuer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB Issuer
     * }
     */
    public static void Issuer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Issuer$OFFSET, Issuer$LAYOUT.byteSize());
    }

    private static final GroupLayout NotBefore$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("NotBefore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME NotBefore
     * }
     */
    public static final GroupLayout NotBefore$layout() {
        return NotBefore$LAYOUT;
    }

    private static final long NotBefore$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME NotBefore
     * }
     */
    public static final long NotBefore$offset() {
        return NotBefore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME NotBefore
     * }
     */
    public static MemorySegment NotBefore(MemorySegment struct) {
        return struct.asSlice(NotBefore$OFFSET, NotBefore$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME NotBefore
     * }
     */
    public static void NotBefore(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, NotBefore$OFFSET, NotBefore$LAYOUT.byteSize());
    }

    private static final GroupLayout NotAfter$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("NotAfter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME NotAfter
     * }
     */
    public static final GroupLayout NotAfter$layout() {
        return NotAfter$LAYOUT;
    }

    private static final long NotAfter$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME NotAfter
     * }
     */
    public static final long NotAfter$offset() {
        return NotAfter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME NotAfter
     * }
     */
    public static MemorySegment NotAfter(MemorySegment struct) {
        return struct.asSlice(NotAfter$OFFSET, NotAfter$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME NotAfter
     * }
     */
    public static void NotAfter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, NotAfter$OFFSET, NotAfter$LAYOUT.byteSize());
    }

    private static final GroupLayout Subject$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Subject"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB Subject
     * }
     */
    public static final GroupLayout Subject$layout() {
        return Subject$LAYOUT;
    }

    private static final long Subject$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB Subject
     * }
     */
    public static final long Subject$offset() {
        return Subject$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB Subject
     * }
     */
    public static MemorySegment Subject(MemorySegment struct) {
        return struct.asSlice(Subject$OFFSET, Subject$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB Subject
     * }
     */
    public static void Subject(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Subject$OFFSET, Subject$LAYOUT.byteSize());
    }

    private static final GroupLayout SubjectPublicKeyInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SubjectPublicKeyInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_PUBLIC_KEY_INFO SubjectPublicKeyInfo
     * }
     */
    public static final GroupLayout SubjectPublicKeyInfo$layout() {
        return SubjectPublicKeyInfo$LAYOUT;
    }

    private static final long SubjectPublicKeyInfo$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_PUBLIC_KEY_INFO SubjectPublicKeyInfo
     * }
     */
    public static final long SubjectPublicKeyInfo$offset() {
        return SubjectPublicKeyInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_PUBLIC_KEY_INFO SubjectPublicKeyInfo
     * }
     */
    public static MemorySegment SubjectPublicKeyInfo(MemorySegment struct) {
        return struct.asSlice(SubjectPublicKeyInfo$OFFSET, SubjectPublicKeyInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_PUBLIC_KEY_INFO SubjectPublicKeyInfo
     * }
     */
    public static void SubjectPublicKeyInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SubjectPublicKeyInfo$OFFSET, SubjectPublicKeyInfo$LAYOUT.byteSize());
    }

    private static final GroupLayout IssuerUniqueId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("IssuerUniqueId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB IssuerUniqueId
     * }
     */
    public static final GroupLayout IssuerUniqueId$layout() {
        return IssuerUniqueId$LAYOUT;
    }

    private static final long IssuerUniqueId$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB IssuerUniqueId
     * }
     */
    public static final long IssuerUniqueId$offset() {
        return IssuerUniqueId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB IssuerUniqueId
     * }
     */
    public static MemorySegment IssuerUniqueId(MemorySegment struct) {
        return struct.asSlice(IssuerUniqueId$OFFSET, IssuerUniqueId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB IssuerUniqueId
     * }
     */
    public static void IssuerUniqueId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, IssuerUniqueId$OFFSET, IssuerUniqueId$LAYOUT.byteSize());
    }

    private static final GroupLayout SubjectUniqueId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SubjectUniqueId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB SubjectUniqueId
     * }
     */
    public static final GroupLayout SubjectUniqueId$layout() {
        return SubjectUniqueId$LAYOUT;
    }

    private static final long SubjectUniqueId$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB SubjectUniqueId
     * }
     */
    public static final long SubjectUniqueId$offset() {
        return SubjectUniqueId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB SubjectUniqueId
     * }
     */
    public static MemorySegment SubjectUniqueId(MemorySegment struct) {
        return struct.asSlice(SubjectUniqueId$OFFSET, SubjectUniqueId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB SubjectUniqueId
     * }
     */
    public static void SubjectUniqueId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SubjectUniqueId$OFFSET, SubjectUniqueId$LAYOUT.byteSize());
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

    private static final long cExtension$OFFSET = 192;

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

    private static final long rgExtension$OFFSET = 200;

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
