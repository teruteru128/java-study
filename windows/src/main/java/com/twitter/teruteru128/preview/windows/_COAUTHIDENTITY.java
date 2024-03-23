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
 * struct _COAUTHIDENTITY {
 *     USHORT *User;
 *     ULONG UserLength;
 *     USHORT *Domain;
 *     ULONG DomainLength;
 *     USHORT *Password;
 *     ULONG PasswordLength;
 *     ULONG Flags;
 * }
 * }
 */
public class _COAUTHIDENTITY {

    _COAUTHIDENTITY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("User"),
        Windows_h.C_LONG.withName("UserLength"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("Domain"),
        Windows_h.C_LONG.withName("DomainLength"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("Password"),
        Windows_h.C_LONG.withName("PasswordLength"),
        Windows_h.C_LONG.withName("Flags")
    ).withName("_COAUTHIDENTITY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout User$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("User"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT *User
     * }
     */
    public static final AddressLayout User$layout() {
        return User$LAYOUT;
    }

    private static final long User$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT *User
     * }
     */
    public static final long User$offset() {
        return User$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT *User
     * }
     */
    public static MemorySegment User(MemorySegment struct) {
        return struct.get(User$LAYOUT, User$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT *User
     * }
     */
    public static void User(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(User$LAYOUT, User$OFFSET, fieldValue);
    }

    private static final OfInt UserLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("UserLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG UserLength
     * }
     */
    public static final OfInt UserLength$layout() {
        return UserLength$LAYOUT;
    }

    private static final long UserLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG UserLength
     * }
     */
    public static final long UserLength$offset() {
        return UserLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG UserLength
     * }
     */
    public static int UserLength(MemorySegment struct) {
        return struct.get(UserLength$LAYOUT, UserLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG UserLength
     * }
     */
    public static void UserLength(MemorySegment struct, int fieldValue) {
        struct.set(UserLength$LAYOUT, UserLength$OFFSET, fieldValue);
    }

    private static final AddressLayout Domain$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Domain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT *Domain
     * }
     */
    public static final AddressLayout Domain$layout() {
        return Domain$LAYOUT;
    }

    private static final long Domain$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT *Domain
     * }
     */
    public static final long Domain$offset() {
        return Domain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT *Domain
     * }
     */
    public static MemorySegment Domain(MemorySegment struct) {
        return struct.get(Domain$LAYOUT, Domain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT *Domain
     * }
     */
    public static void Domain(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Domain$LAYOUT, Domain$OFFSET, fieldValue);
    }

    private static final OfInt DomainLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DomainLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG DomainLength
     * }
     */
    public static final OfInt DomainLength$layout() {
        return DomainLength$LAYOUT;
    }

    private static final long DomainLength$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG DomainLength
     * }
     */
    public static final long DomainLength$offset() {
        return DomainLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG DomainLength
     * }
     */
    public static int DomainLength(MemorySegment struct) {
        return struct.get(DomainLength$LAYOUT, DomainLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG DomainLength
     * }
     */
    public static void DomainLength(MemorySegment struct, int fieldValue) {
        struct.set(DomainLength$LAYOUT, DomainLength$OFFSET, fieldValue);
    }

    private static final AddressLayout Password$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Password"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT *Password
     * }
     */
    public static final AddressLayout Password$layout() {
        return Password$LAYOUT;
    }

    private static final long Password$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT *Password
     * }
     */
    public static final long Password$offset() {
        return Password$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT *Password
     * }
     */
    public static MemorySegment Password(MemorySegment struct) {
        return struct.get(Password$LAYOUT, Password$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT *Password
     * }
     */
    public static void Password(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Password$LAYOUT, Password$OFFSET, fieldValue);
    }

    private static final OfInt PasswordLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PasswordLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG PasswordLength
     * }
     */
    public static final OfInt PasswordLength$layout() {
        return PasswordLength$LAYOUT;
    }

    private static final long PasswordLength$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG PasswordLength
     * }
     */
    public static final long PasswordLength$offset() {
        return PasswordLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG PasswordLength
     * }
     */
    public static int PasswordLength(MemorySegment struct) {
        return struct.get(PasswordLength$LAYOUT, PasswordLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG PasswordLength
     * }
     */
    public static void PasswordLength(MemorySegment struct, int fieldValue) {
        struct.set(PasswordLength$LAYOUT, PasswordLength$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
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

