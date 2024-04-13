// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * struct _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO {
 *     ULONG cbSize;
 *     ULONG dwInfoVersion;
 *     PUCHAR pbNonce;
 *     ULONG cbNonce;
 *     PUCHAR pbAuthData;
 *     ULONG cbAuthData;
 *     PUCHAR pbTag;
 *     ULONG cbTag;
 *     PUCHAR pbMacContext;
 *     ULONG cbMacContext;
 *     ULONG cbAAD;
 *     ULONGLONG cbData;
 *     ULONG dwFlags;
 * }
 * }
 */
public class _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO {

    _BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        Windows_h.C_LONG.withName("dwInfoVersion"),
        Windows_h.C_POINTER.withName("pbNonce"),
        Windows_h.C_LONG.withName("cbNonce"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pbAuthData"),
        Windows_h.C_LONG.withName("cbAuthData"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pbTag"),
        Windows_h.C_LONG.withName("cbTag"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pbMacContext"),
        Windows_h.C_LONG.withName("cbMacContext"),
        Windows_h.C_LONG.withName("cbAAD"),
        Windows_h.C_LONG_LONG.withName("cbData"),
        Windows_h.C_LONG.withName("dwFlags"),
        MemoryLayout.paddingLayout(4)
    ).withName("_BCRYPT_AUTHENTICATED_CIPHER_MODE_INFO");

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
     * ULONG cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwInfoVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwInfoVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwInfoVersion
     * }
     */
    public static final OfInt dwInfoVersion$layout() {
        return dwInfoVersion$LAYOUT;
    }

    private static final long dwInfoVersion$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwInfoVersion
     * }
     */
    public static final long dwInfoVersion$offset() {
        return dwInfoVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwInfoVersion
     * }
     */
    public static int dwInfoVersion(MemorySegment struct) {
        return struct.get(dwInfoVersion$LAYOUT, dwInfoVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwInfoVersion
     * }
     */
    public static void dwInfoVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwInfoVersion$LAYOUT, dwInfoVersion$OFFSET, fieldValue);
    }

    private static final AddressLayout pbNonce$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbNonce"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PUCHAR pbNonce
     * }
     */
    public static final AddressLayout pbNonce$layout() {
        return pbNonce$LAYOUT;
    }

    private static final long pbNonce$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PUCHAR pbNonce
     * }
     */
    public static final long pbNonce$offset() {
        return pbNonce$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PUCHAR pbNonce
     * }
     */
    public static MemorySegment pbNonce(MemorySegment struct) {
        return struct.get(pbNonce$LAYOUT, pbNonce$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PUCHAR pbNonce
     * }
     */
    public static void pbNonce(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbNonce$LAYOUT, pbNonce$OFFSET, fieldValue);
    }

    private static final OfInt cbNonce$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbNonce"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbNonce
     * }
     */
    public static final OfInt cbNonce$layout() {
        return cbNonce$LAYOUT;
    }

    private static final long cbNonce$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbNonce
     * }
     */
    public static final long cbNonce$offset() {
        return cbNonce$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbNonce
     * }
     */
    public static int cbNonce(MemorySegment struct) {
        return struct.get(cbNonce$LAYOUT, cbNonce$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbNonce
     * }
     */
    public static void cbNonce(MemorySegment struct, int fieldValue) {
        struct.set(cbNonce$LAYOUT, cbNonce$OFFSET, fieldValue);
    }

    private static final AddressLayout pbAuthData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbAuthData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PUCHAR pbAuthData
     * }
     */
    public static final AddressLayout pbAuthData$layout() {
        return pbAuthData$LAYOUT;
    }

    private static final long pbAuthData$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PUCHAR pbAuthData
     * }
     */
    public static final long pbAuthData$offset() {
        return pbAuthData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PUCHAR pbAuthData
     * }
     */
    public static MemorySegment pbAuthData(MemorySegment struct) {
        return struct.get(pbAuthData$LAYOUT, pbAuthData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PUCHAR pbAuthData
     * }
     */
    public static void pbAuthData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbAuthData$LAYOUT, pbAuthData$OFFSET, fieldValue);
    }

    private static final OfInt cbAuthData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbAuthData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbAuthData
     * }
     */
    public static final OfInt cbAuthData$layout() {
        return cbAuthData$LAYOUT;
    }

    private static final long cbAuthData$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbAuthData
     * }
     */
    public static final long cbAuthData$offset() {
        return cbAuthData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbAuthData
     * }
     */
    public static int cbAuthData(MemorySegment struct) {
        return struct.get(cbAuthData$LAYOUT, cbAuthData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbAuthData
     * }
     */
    public static void cbAuthData(MemorySegment struct, int fieldValue) {
        struct.set(cbAuthData$LAYOUT, cbAuthData$OFFSET, fieldValue);
    }

    private static final AddressLayout pbTag$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbTag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PUCHAR pbTag
     * }
     */
    public static final AddressLayout pbTag$layout() {
        return pbTag$LAYOUT;
    }

    private static final long pbTag$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PUCHAR pbTag
     * }
     */
    public static final long pbTag$offset() {
        return pbTag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PUCHAR pbTag
     * }
     */
    public static MemorySegment pbTag(MemorySegment struct) {
        return struct.get(pbTag$LAYOUT, pbTag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PUCHAR pbTag
     * }
     */
    public static void pbTag(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbTag$LAYOUT, pbTag$OFFSET, fieldValue);
    }

    private static final OfInt cbTag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbTag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbTag
     * }
     */
    public static final OfInt cbTag$layout() {
        return cbTag$LAYOUT;
    }

    private static final long cbTag$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbTag
     * }
     */
    public static final long cbTag$offset() {
        return cbTag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbTag
     * }
     */
    public static int cbTag(MemorySegment struct) {
        return struct.get(cbTag$LAYOUT, cbTag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbTag
     * }
     */
    public static void cbTag(MemorySegment struct, int fieldValue) {
        struct.set(cbTag$LAYOUT, cbTag$OFFSET, fieldValue);
    }

    private static final AddressLayout pbMacContext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbMacContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PUCHAR pbMacContext
     * }
     */
    public static final AddressLayout pbMacContext$layout() {
        return pbMacContext$LAYOUT;
    }

    private static final long pbMacContext$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PUCHAR pbMacContext
     * }
     */
    public static final long pbMacContext$offset() {
        return pbMacContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PUCHAR pbMacContext
     * }
     */
    public static MemorySegment pbMacContext(MemorySegment struct) {
        return struct.get(pbMacContext$LAYOUT, pbMacContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PUCHAR pbMacContext
     * }
     */
    public static void pbMacContext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbMacContext$LAYOUT, pbMacContext$OFFSET, fieldValue);
    }

    private static final OfInt cbMacContext$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbMacContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbMacContext
     * }
     */
    public static final OfInt cbMacContext$layout() {
        return cbMacContext$LAYOUT;
    }

    private static final long cbMacContext$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbMacContext
     * }
     */
    public static final long cbMacContext$offset() {
        return cbMacContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbMacContext
     * }
     */
    public static int cbMacContext(MemorySegment struct) {
        return struct.get(cbMacContext$LAYOUT, cbMacContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbMacContext
     * }
     */
    public static void cbMacContext(MemorySegment struct, int fieldValue) {
        struct.set(cbMacContext$LAYOUT, cbMacContext$OFFSET, fieldValue);
    }

    private static final OfInt cbAAD$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbAAD"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbAAD
     * }
     */
    public static final OfInt cbAAD$layout() {
        return cbAAD$LAYOUT;
    }

    private static final long cbAAD$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbAAD
     * }
     */
    public static final long cbAAD$offset() {
        return cbAAD$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbAAD
     * }
     */
    public static int cbAAD(MemorySegment struct) {
        return struct.get(cbAAD$LAYOUT, cbAAD$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbAAD
     * }
     */
    public static void cbAAD(MemorySegment struct, int fieldValue) {
        struct.set(cbAAD$LAYOUT, cbAAD$OFFSET, fieldValue);
    }

    private static final OfLong cbData$LAYOUT = (OfLong)$LAYOUT.select(groupElement("cbData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG cbData
     * }
     */
    public static final OfLong cbData$layout() {
        return cbData$LAYOUT;
    }

    private static final long cbData$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG cbData
     * }
     */
    public static final long cbData$offset() {
        return cbData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG cbData
     * }
     */
    public static long cbData(MemorySegment struct) {
        return struct.get(cbData$LAYOUT, cbData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG cbData
     * }
     */
    public static void cbData(MemorySegment struct, long fieldValue) {
        struct.set(cbData$LAYOUT, cbData$OFFSET, fieldValue);
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
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
