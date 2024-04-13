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
 * struct _TOKEN_ACCESS_INFORMATION {
 *     PSID_AND_ATTRIBUTES_HASH SidHash;
 *     PSID_AND_ATTRIBUTES_HASH RestrictedSidHash;
 *     PTOKEN_PRIVILEGES Privileges;
 *     LUID AuthenticationId;
 *     TOKEN_TYPE TokenType;
 *     SECURITY_IMPERSONATION_LEVEL ImpersonationLevel;
 *     TOKEN_MANDATORY_POLICY MandatoryPolicy;
 *     DWORD Flags;
 *     DWORD AppContainerNumber;
 *     PSID PackageSid;
 *     PSID_AND_ATTRIBUTES_HASH CapabilitiesHash;
 *     PSID TrustLevelSid;
 *     PSECURITY_ATTRIBUTES_OPAQUE SecurityAttributes;
 * }
 * }
 */
public class _TOKEN_ACCESS_INFORMATION {

    _TOKEN_ACCESS_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("SidHash"),
        Windows_h.C_POINTER.withName("RestrictedSidHash"),
        Windows_h.C_POINTER.withName("Privileges"),
        _LUID.layout().withName("AuthenticationId"),
        Windows_h.C_INT.withName("TokenType"),
        Windows_h.C_INT.withName("ImpersonationLevel"),
        _TOKEN_MANDATORY_POLICY.layout().withName("MandatoryPolicy"),
        Windows_h.C_LONG.withName("Flags"),
        Windows_h.C_LONG.withName("AppContainerNumber"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("PackageSid"),
        Windows_h.C_POINTER.withName("CapabilitiesHash"),
        Windows_h.C_POINTER.withName("TrustLevelSid"),
        Windows_h.C_POINTER.withName("SecurityAttributes")
    ).withName("_TOKEN_ACCESS_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout SidHash$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SidHash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH SidHash
     * }
     */
    public static final AddressLayout SidHash$layout() {
        return SidHash$LAYOUT;
    }

    private static final long SidHash$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH SidHash
     * }
     */
    public static final long SidHash$offset() {
        return SidHash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH SidHash
     * }
     */
    public static MemorySegment SidHash(MemorySegment struct) {
        return struct.get(SidHash$LAYOUT, SidHash$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH SidHash
     * }
     */
    public static void SidHash(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SidHash$LAYOUT, SidHash$OFFSET, fieldValue);
    }

    private static final AddressLayout RestrictedSidHash$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("RestrictedSidHash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH RestrictedSidHash
     * }
     */
    public static final AddressLayout RestrictedSidHash$layout() {
        return RestrictedSidHash$LAYOUT;
    }

    private static final long RestrictedSidHash$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH RestrictedSidHash
     * }
     */
    public static final long RestrictedSidHash$offset() {
        return RestrictedSidHash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH RestrictedSidHash
     * }
     */
    public static MemorySegment RestrictedSidHash(MemorySegment struct) {
        return struct.get(RestrictedSidHash$LAYOUT, RestrictedSidHash$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH RestrictedSidHash
     * }
     */
    public static void RestrictedSidHash(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(RestrictedSidHash$LAYOUT, RestrictedSidHash$OFFSET, fieldValue);
    }

    private static final AddressLayout Privileges$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Privileges"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PTOKEN_PRIVILEGES Privileges
     * }
     */
    public static final AddressLayout Privileges$layout() {
        return Privileges$LAYOUT;
    }

    private static final long Privileges$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PTOKEN_PRIVILEGES Privileges
     * }
     */
    public static final long Privileges$offset() {
        return Privileges$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PTOKEN_PRIVILEGES Privileges
     * }
     */
    public static MemorySegment Privileges(MemorySegment struct) {
        return struct.get(Privileges$LAYOUT, Privileges$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PTOKEN_PRIVILEGES Privileges
     * }
     */
    public static void Privileges(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Privileges$LAYOUT, Privileges$OFFSET, fieldValue);
    }

    private static final GroupLayout AuthenticationId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("AuthenticationId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LUID AuthenticationId
     * }
     */
    public static final GroupLayout AuthenticationId$layout() {
        return AuthenticationId$LAYOUT;
    }

    private static final long AuthenticationId$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LUID AuthenticationId
     * }
     */
    public static final long AuthenticationId$offset() {
        return AuthenticationId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LUID AuthenticationId
     * }
     */
    public static MemorySegment AuthenticationId(MemorySegment struct) {
        return struct.asSlice(AuthenticationId$OFFSET, AuthenticationId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LUID AuthenticationId
     * }
     */
    public static void AuthenticationId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AuthenticationId$OFFSET, AuthenticationId$LAYOUT.byteSize());
    }

    private static final OfInt TokenType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TokenType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TOKEN_TYPE TokenType
     * }
     */
    public static final OfInt TokenType$layout() {
        return TokenType$LAYOUT;
    }

    private static final long TokenType$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TOKEN_TYPE TokenType
     * }
     */
    public static final long TokenType$offset() {
        return TokenType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TOKEN_TYPE TokenType
     * }
     */
    public static int TokenType(MemorySegment struct) {
        return struct.get(TokenType$LAYOUT, TokenType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TOKEN_TYPE TokenType
     * }
     */
    public static void TokenType(MemorySegment struct, int fieldValue) {
        struct.set(TokenType$LAYOUT, TokenType$OFFSET, fieldValue);
    }

    private static final OfInt ImpersonationLevel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ImpersonationLevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel
     * }
     */
    public static final OfInt ImpersonationLevel$layout() {
        return ImpersonationLevel$LAYOUT;
    }

    private static final long ImpersonationLevel$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel
     * }
     */
    public static final long ImpersonationLevel$offset() {
        return ImpersonationLevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel
     * }
     */
    public static int ImpersonationLevel(MemorySegment struct) {
        return struct.get(ImpersonationLevel$LAYOUT, ImpersonationLevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SECURITY_IMPERSONATION_LEVEL ImpersonationLevel
     * }
     */
    public static void ImpersonationLevel(MemorySegment struct, int fieldValue) {
        struct.set(ImpersonationLevel$LAYOUT, ImpersonationLevel$OFFSET, fieldValue);
    }

    private static final GroupLayout MandatoryPolicy$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("MandatoryPolicy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TOKEN_MANDATORY_POLICY MandatoryPolicy
     * }
     */
    public static final GroupLayout MandatoryPolicy$layout() {
        return MandatoryPolicy$LAYOUT;
    }

    private static final long MandatoryPolicy$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TOKEN_MANDATORY_POLICY MandatoryPolicy
     * }
     */
    public static final long MandatoryPolicy$offset() {
        return MandatoryPolicy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TOKEN_MANDATORY_POLICY MandatoryPolicy
     * }
     */
    public static MemorySegment MandatoryPolicy(MemorySegment struct) {
        return struct.asSlice(MandatoryPolicy$OFFSET, MandatoryPolicy$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TOKEN_MANDATORY_POLICY MandatoryPolicy
     * }
     */
    public static void MandatoryPolicy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, MandatoryPolicy$OFFSET, MandatoryPolicy$LAYOUT.byteSize());
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfInt AppContainerNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AppContainerNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AppContainerNumber
     * }
     */
    public static final OfInt AppContainerNumber$layout() {
        return AppContainerNumber$LAYOUT;
    }

    private static final long AppContainerNumber$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AppContainerNumber
     * }
     */
    public static final long AppContainerNumber$offset() {
        return AppContainerNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AppContainerNumber
     * }
     */
    public static int AppContainerNumber(MemorySegment struct) {
        return struct.get(AppContainerNumber$LAYOUT, AppContainerNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AppContainerNumber
     * }
     */
    public static void AppContainerNumber(MemorySegment struct, int fieldValue) {
        struct.set(AppContainerNumber$LAYOUT, AppContainerNumber$OFFSET, fieldValue);
    }

    private static final AddressLayout PackageSid$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("PackageSid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PSID PackageSid
     * }
     */
    public static final AddressLayout PackageSid$layout() {
        return PackageSid$LAYOUT;
    }

    private static final long PackageSid$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PSID PackageSid
     * }
     */
    public static final long PackageSid$offset() {
        return PackageSid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PSID PackageSid
     * }
     */
    public static MemorySegment PackageSid(MemorySegment struct) {
        return struct.get(PackageSid$LAYOUT, PackageSid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PSID PackageSid
     * }
     */
    public static void PackageSid(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(PackageSid$LAYOUT, PackageSid$OFFSET, fieldValue);
    }

    private static final AddressLayout CapabilitiesHash$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("CapabilitiesHash"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH CapabilitiesHash
     * }
     */
    public static final AddressLayout CapabilitiesHash$layout() {
        return CapabilitiesHash$LAYOUT;
    }

    private static final long CapabilitiesHash$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH CapabilitiesHash
     * }
     */
    public static final long CapabilitiesHash$offset() {
        return CapabilitiesHash$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH CapabilitiesHash
     * }
     */
    public static MemorySegment CapabilitiesHash(MemorySegment struct) {
        return struct.get(CapabilitiesHash$LAYOUT, CapabilitiesHash$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PSID_AND_ATTRIBUTES_HASH CapabilitiesHash
     * }
     */
    public static void CapabilitiesHash(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(CapabilitiesHash$LAYOUT, CapabilitiesHash$OFFSET, fieldValue);
    }

    private static final AddressLayout TrustLevelSid$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("TrustLevelSid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PSID TrustLevelSid
     * }
     */
    public static final AddressLayout TrustLevelSid$layout() {
        return TrustLevelSid$LAYOUT;
    }

    private static final long TrustLevelSid$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PSID TrustLevelSid
     * }
     */
    public static final long TrustLevelSid$offset() {
        return TrustLevelSid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PSID TrustLevelSid
     * }
     */
    public static MemorySegment TrustLevelSid(MemorySegment struct) {
        return struct.get(TrustLevelSid$LAYOUT, TrustLevelSid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PSID TrustLevelSid
     * }
     */
    public static void TrustLevelSid(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(TrustLevelSid$LAYOUT, TrustLevelSid$OFFSET, fieldValue);
    }

    private static final AddressLayout SecurityAttributes$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SecurityAttributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PSECURITY_ATTRIBUTES_OPAQUE SecurityAttributes
     * }
     */
    public static final AddressLayout SecurityAttributes$layout() {
        return SecurityAttributes$LAYOUT;
    }

    private static final long SecurityAttributes$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PSECURITY_ATTRIBUTES_OPAQUE SecurityAttributes
     * }
     */
    public static final long SecurityAttributes$offset() {
        return SecurityAttributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PSECURITY_ATTRIBUTES_OPAQUE SecurityAttributes
     * }
     */
    public static MemorySegment SecurityAttributes(MemorySegment struct) {
        return struct.get(SecurityAttributes$LAYOUT, SecurityAttributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PSECURITY_ATTRIBUTES_OPAQUE SecurityAttributes
     * }
     */
    public static void SecurityAttributes(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SecurityAttributes$LAYOUT, SecurityAttributes$OFFSET, fieldValue);
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
