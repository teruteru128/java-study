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
 * struct _TOKEN_CONTROL {
 *     LUID TokenId;
 *     LUID AuthenticationId;
 *     LUID ModifiedId;
 *     TOKEN_SOURCE TokenSource;
 * }
 * }
 */
public class _TOKEN_CONTROL {

    _TOKEN_CONTROL() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LUID.layout().withName("TokenId"),
        _LUID.layout().withName("AuthenticationId"),
        _LUID.layout().withName("ModifiedId"),
        _TOKEN_SOURCE.layout().withName("TokenSource")
    ).withName("_TOKEN_CONTROL");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout TokenId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TokenId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LUID TokenId
     * }
     */
    public static final GroupLayout TokenId$layout() {
        return TokenId$LAYOUT;
    }

    private static final long TokenId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LUID TokenId
     * }
     */
    public static final long TokenId$offset() {
        return TokenId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LUID TokenId
     * }
     */
    public static MemorySegment TokenId(MemorySegment struct) {
        return struct.asSlice(TokenId$OFFSET, TokenId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LUID TokenId
     * }
     */
    public static void TokenId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TokenId$OFFSET, TokenId$LAYOUT.byteSize());
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

    private static final long AuthenticationId$OFFSET = 8;

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

    private static final GroupLayout ModifiedId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ModifiedId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LUID ModifiedId
     * }
     */
    public static final GroupLayout ModifiedId$layout() {
        return ModifiedId$LAYOUT;
    }

    private static final long ModifiedId$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LUID ModifiedId
     * }
     */
    public static final long ModifiedId$offset() {
        return ModifiedId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LUID ModifiedId
     * }
     */
    public static MemorySegment ModifiedId(MemorySegment struct) {
        return struct.asSlice(ModifiedId$OFFSET, ModifiedId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LUID ModifiedId
     * }
     */
    public static void ModifiedId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ModifiedId$OFFSET, ModifiedId$LAYOUT.byteSize());
    }

    private static final GroupLayout TokenSource$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TokenSource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TOKEN_SOURCE TokenSource
     * }
     */
    public static final GroupLayout TokenSource$layout() {
        return TokenSource$LAYOUT;
    }

    private static final long TokenSource$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TOKEN_SOURCE TokenSource
     * }
     */
    public static final long TokenSource$offset() {
        return TokenSource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TOKEN_SOURCE TokenSource
     * }
     */
    public static MemorySegment TokenSource(MemorySegment struct) {
        return struct.asSlice(TokenSource$OFFSET, TokenSource$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TOKEN_SOURCE TokenSource
     * }
     */
    public static void TokenSource(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TokenSource$OFFSET, TokenSource$LAYOUT.byteSize());
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
