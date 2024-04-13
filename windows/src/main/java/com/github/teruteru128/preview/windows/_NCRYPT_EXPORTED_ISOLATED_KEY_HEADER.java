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
 * struct _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER {
 *     ULONG Version;
 *     ULONG KeyUsage;
 *     ULONG PerBootKey : 1;
 *     ULONG Reserved : 31;
 *     ULONG cbAlgName;
 *     ULONG cbNonce;
 *     ULONG cbAuthTag;
 *     ULONG cbWrappingKey;
 *     ULONG cbIsolatedKey;
 * }
 * }
 */
public class _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER {

    _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Version"),
        Windows_h.C_LONG.withName("KeyUsage"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG.withName("cbAlgName"),
        Windows_h.C_LONG.withName("cbNonce"),
        Windows_h.C_LONG.withName("cbAuthTag"),
        Windows_h.C_LONG.withName("cbWrappingKey"),
        Windows_h.C_LONG.withName("cbIsolatedKey")
    ).withName("_NCRYPT_EXPORTED_ISOLATED_KEY_HEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt KeyUsage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("KeyUsage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG KeyUsage
     * }
     */
    public static final OfInt KeyUsage$layout() {
        return KeyUsage$LAYOUT;
    }

    private static final long KeyUsage$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG KeyUsage
     * }
     */
    public static final long KeyUsage$offset() {
        return KeyUsage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG KeyUsage
     * }
     */
    public static int KeyUsage(MemorySegment struct) {
        return struct.get(KeyUsage$LAYOUT, KeyUsage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG KeyUsage
     * }
     */
    public static void KeyUsage(MemorySegment struct, int fieldValue) {
        struct.set(KeyUsage$LAYOUT, KeyUsage$OFFSET, fieldValue);
    }

    private static final OfInt cbAlgName$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbAlgName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbAlgName
     * }
     */
    public static final OfInt cbAlgName$layout() {
        return cbAlgName$LAYOUT;
    }

    private static final long cbAlgName$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbAlgName
     * }
     */
    public static final long cbAlgName$offset() {
        return cbAlgName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbAlgName
     * }
     */
    public static int cbAlgName(MemorySegment struct) {
        return struct.get(cbAlgName$LAYOUT, cbAlgName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbAlgName
     * }
     */
    public static void cbAlgName(MemorySegment struct, int fieldValue) {
        struct.set(cbAlgName$LAYOUT, cbAlgName$OFFSET, fieldValue);
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

    private static final OfInt cbAuthTag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbAuthTag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbAuthTag
     * }
     */
    public static final OfInt cbAuthTag$layout() {
        return cbAuthTag$LAYOUT;
    }

    private static final long cbAuthTag$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbAuthTag
     * }
     */
    public static final long cbAuthTag$offset() {
        return cbAuthTag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbAuthTag
     * }
     */
    public static int cbAuthTag(MemorySegment struct) {
        return struct.get(cbAuthTag$LAYOUT, cbAuthTag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbAuthTag
     * }
     */
    public static void cbAuthTag(MemorySegment struct, int fieldValue) {
        struct.set(cbAuthTag$LAYOUT, cbAuthTag$OFFSET, fieldValue);
    }

    private static final OfInt cbWrappingKey$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbWrappingKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbWrappingKey
     * }
     */
    public static final OfInt cbWrappingKey$layout() {
        return cbWrappingKey$LAYOUT;
    }

    private static final long cbWrappingKey$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbWrappingKey
     * }
     */
    public static final long cbWrappingKey$offset() {
        return cbWrappingKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbWrappingKey
     * }
     */
    public static int cbWrappingKey(MemorySegment struct) {
        return struct.get(cbWrappingKey$LAYOUT, cbWrappingKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbWrappingKey
     * }
     */
    public static void cbWrappingKey(MemorySegment struct, int fieldValue) {
        struct.set(cbWrappingKey$LAYOUT, cbWrappingKey$OFFSET, fieldValue);
    }

    private static final OfInt cbIsolatedKey$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbIsolatedKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbIsolatedKey
     * }
     */
    public static final OfInt cbIsolatedKey$layout() {
        return cbIsolatedKey$LAYOUT;
    }

    private static final long cbIsolatedKey$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbIsolatedKey
     * }
     */
    public static final long cbIsolatedKey$offset() {
        return cbIsolatedKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbIsolatedKey
     * }
     */
    public static int cbIsolatedKey(MemorySegment struct) {
        return struct.get(cbIsolatedKey$LAYOUT, cbIsolatedKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbIsolatedKey
     * }
     */
    public static void cbIsolatedKey(MemorySegment struct, int fieldValue) {
        struct.set(cbIsolatedKey$LAYOUT, cbIsolatedKey$OFFSET, fieldValue);
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
