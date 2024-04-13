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
 * struct _CMSG_KEY_AGREE_RECIPIENT_INFO {
 *     DWORD dwVersion;
 *     DWORD dwOriginatorChoice;
 *     union {
 *         CERT_ID OriginatorCertId;
 *         CERT_PUBLIC_KEY_INFO OriginatorPublicKeyInfo;
 *     };
 *     CRYPT_DATA_BLOB UserKeyingMaterial;
 *     CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm;
 *     DWORD cRecipientEncryptedKeys;
 *     PCMSG_RECIPIENT_ENCRYPTED_KEY_INFO *rgpRecipientEncryptedKeys;
 * }
 * }
 */
public class _CMSG_KEY_AGREE_RECIPIENT_INFO {

    _CMSG_KEY_AGREE_RECIPIENT_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwVersion"),
        Windows_h.C_LONG.withName("dwOriginatorChoice"),
        MemoryLayout.unionLayout(
            _CERT_ID.layout().withName("OriginatorCertId"),
            _CERT_PUBLIC_KEY_INFO.layout().withName("OriginatorPublicKeyInfo")
        ).withName("$anon$7801:5"),
        _CRYPTOAPI_BLOB.layout().withName("UserKeyingMaterial"),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("KeyEncryptionAlgorithm"),
        Windows_h.C_LONG.withName("cRecipientEncryptedKeys"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgpRecipientEncryptedKeys")
    ).withName("_CMSG_KEY_AGREE_RECIPIENT_INFO");

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

    private static final OfInt dwOriginatorChoice$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOriginatorChoice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwOriginatorChoice
     * }
     */
    public static final OfInt dwOriginatorChoice$layout() {
        return dwOriginatorChoice$LAYOUT;
    }

    private static final long dwOriginatorChoice$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwOriginatorChoice
     * }
     */
    public static final long dwOriginatorChoice$offset() {
        return dwOriginatorChoice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwOriginatorChoice
     * }
     */
    public static int dwOriginatorChoice(MemorySegment struct) {
        return struct.get(dwOriginatorChoice$LAYOUT, dwOriginatorChoice$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwOriginatorChoice
     * }
     */
    public static void dwOriginatorChoice(MemorySegment struct, int fieldValue) {
        struct.set(dwOriginatorChoice$LAYOUT, dwOriginatorChoice$OFFSET, fieldValue);
    }

    private static final GroupLayout OriginatorCertId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$7801:5"), groupElement("OriginatorCertId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_ID OriginatorCertId
     * }
     */
    public static final GroupLayout OriginatorCertId$layout() {
        return OriginatorCertId$LAYOUT;
    }

    private static final long OriginatorCertId$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_ID OriginatorCertId
     * }
     */
    public static final long OriginatorCertId$offset() {
        return OriginatorCertId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_ID OriginatorCertId
     * }
     */
    public static MemorySegment OriginatorCertId(MemorySegment struct) {
        return struct.asSlice(OriginatorCertId$OFFSET, OriginatorCertId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_ID OriginatorCertId
     * }
     */
    public static void OriginatorCertId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, OriginatorCertId$OFFSET, OriginatorCertId$LAYOUT.byteSize());
    }

    private static final GroupLayout OriginatorPublicKeyInfo$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$7801:5"), groupElement("OriginatorPublicKeyInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_PUBLIC_KEY_INFO OriginatorPublicKeyInfo
     * }
     */
    public static final GroupLayout OriginatorPublicKeyInfo$layout() {
        return OriginatorPublicKeyInfo$LAYOUT;
    }

    private static final long OriginatorPublicKeyInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_PUBLIC_KEY_INFO OriginatorPublicKeyInfo
     * }
     */
    public static final long OriginatorPublicKeyInfo$offset() {
        return OriginatorPublicKeyInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_PUBLIC_KEY_INFO OriginatorPublicKeyInfo
     * }
     */
    public static MemorySegment OriginatorPublicKeyInfo(MemorySegment struct) {
        return struct.asSlice(OriginatorPublicKeyInfo$OFFSET, OriginatorPublicKeyInfo$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_PUBLIC_KEY_INFO OriginatorPublicKeyInfo
     * }
     */
    public static void OriginatorPublicKeyInfo(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, OriginatorPublicKeyInfo$OFFSET, OriginatorPublicKeyInfo$LAYOUT.byteSize());
    }

    private static final GroupLayout UserKeyingMaterial$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("UserKeyingMaterial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB UserKeyingMaterial
     * }
     */
    public static final GroupLayout UserKeyingMaterial$layout() {
        return UserKeyingMaterial$LAYOUT;
    }

    private static final long UserKeyingMaterial$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB UserKeyingMaterial
     * }
     */
    public static final long UserKeyingMaterial$offset() {
        return UserKeyingMaterial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB UserKeyingMaterial
     * }
     */
    public static MemorySegment UserKeyingMaterial(MemorySegment struct) {
        return struct.asSlice(UserKeyingMaterial$OFFSET, UserKeyingMaterial$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB UserKeyingMaterial
     * }
     */
    public static void UserKeyingMaterial(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, UserKeyingMaterial$OFFSET, UserKeyingMaterial$LAYOUT.byteSize());
    }

    private static final GroupLayout KeyEncryptionAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("KeyEncryptionAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm
     * }
     */
    public static final GroupLayout KeyEncryptionAlgorithm$layout() {
        return KeyEncryptionAlgorithm$LAYOUT;
    }

    private static final long KeyEncryptionAlgorithm$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm
     * }
     */
    public static final long KeyEncryptionAlgorithm$offset() {
        return KeyEncryptionAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm
     * }
     */
    public static MemorySegment KeyEncryptionAlgorithm(MemorySegment struct) {
        return struct.asSlice(KeyEncryptionAlgorithm$OFFSET, KeyEncryptionAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm
     * }
     */
    public static void KeyEncryptionAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, KeyEncryptionAlgorithm$OFFSET, KeyEncryptionAlgorithm$LAYOUT.byteSize());
    }

    private static final OfInt cRecipientEncryptedKeys$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cRecipientEncryptedKeys"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cRecipientEncryptedKeys
     * }
     */
    public static final OfInt cRecipientEncryptedKeys$layout() {
        return cRecipientEncryptedKeys$LAYOUT;
    }

    private static final long cRecipientEncryptedKeys$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cRecipientEncryptedKeys
     * }
     */
    public static final long cRecipientEncryptedKeys$offset() {
        return cRecipientEncryptedKeys$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cRecipientEncryptedKeys
     * }
     */
    public static int cRecipientEncryptedKeys(MemorySegment struct) {
        return struct.get(cRecipientEncryptedKeys$LAYOUT, cRecipientEncryptedKeys$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cRecipientEncryptedKeys
     * }
     */
    public static void cRecipientEncryptedKeys(MemorySegment struct, int fieldValue) {
        struct.set(cRecipientEncryptedKeys$LAYOUT, cRecipientEncryptedKeys$OFFSET, fieldValue);
    }

    private static final AddressLayout rgpRecipientEncryptedKeys$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgpRecipientEncryptedKeys"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCMSG_RECIPIENT_ENCRYPTED_KEY_INFO *rgpRecipientEncryptedKeys
     * }
     */
    public static final AddressLayout rgpRecipientEncryptedKeys$layout() {
        return rgpRecipientEncryptedKeys$LAYOUT;
    }

    private static final long rgpRecipientEncryptedKeys$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCMSG_RECIPIENT_ENCRYPTED_KEY_INFO *rgpRecipientEncryptedKeys
     * }
     */
    public static final long rgpRecipientEncryptedKeys$offset() {
        return rgpRecipientEncryptedKeys$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCMSG_RECIPIENT_ENCRYPTED_KEY_INFO *rgpRecipientEncryptedKeys
     * }
     */
    public static MemorySegment rgpRecipientEncryptedKeys(MemorySegment struct) {
        return struct.get(rgpRecipientEncryptedKeys$LAYOUT, rgpRecipientEncryptedKeys$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCMSG_RECIPIENT_ENCRYPTED_KEY_INFO *rgpRecipientEncryptedKeys
     * }
     */
    public static void rgpRecipientEncryptedKeys(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgpRecipientEncryptedKeys$LAYOUT, rgpRecipientEncryptedKeys$OFFSET, fieldValue);
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
