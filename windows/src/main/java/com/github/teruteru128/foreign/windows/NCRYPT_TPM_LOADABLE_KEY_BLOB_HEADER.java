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
 * struct NCRYPT_TPM_LOADABLE_KEY_BLOB_HEADER {
 *     DWORD magic;
 *     DWORD cbHeader;
 *     DWORD cbPublic;
 *     DWORD cbPrivate;
 *     DWORD cbName;
 * }
 * }
 */
public class NCRYPT_TPM_LOADABLE_KEY_BLOB_HEADER {

    NCRYPT_TPM_LOADABLE_KEY_BLOB_HEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("magic"),
        Windows_h.C_LONG.withName("cbHeader"),
        Windows_h.C_LONG.withName("cbPublic"),
        Windows_h.C_LONG.withName("cbPrivate"),
        Windows_h.C_LONG.withName("cbName")
    ).withName("NCRYPT_TPM_LOADABLE_KEY_BLOB_HEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt magic$LAYOUT = (OfInt)$LAYOUT.select(groupElement("magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static final OfInt magic$layout() {
        return magic$LAYOUT;
    }

    private static final long magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static final long magic$offset() {
        return magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static int magic(MemorySegment struct) {
        return struct.get(magic$LAYOUT, magic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static void magic(MemorySegment struct, int fieldValue) {
        struct.set(magic$LAYOUT, magic$OFFSET, fieldValue);
    }

    private static final OfInt cbHeader$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbHeader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbHeader
     * }
     */
    public static final OfInt cbHeader$layout() {
        return cbHeader$LAYOUT;
    }

    private static final long cbHeader$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbHeader
     * }
     */
    public static final long cbHeader$offset() {
        return cbHeader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbHeader
     * }
     */
    public static int cbHeader(MemorySegment struct) {
        return struct.get(cbHeader$LAYOUT, cbHeader$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbHeader
     * }
     */
    public static void cbHeader(MemorySegment struct, int fieldValue) {
        struct.set(cbHeader$LAYOUT, cbHeader$OFFSET, fieldValue);
    }

    private static final OfInt cbPublic$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbPublic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbPublic
     * }
     */
    public static final OfInt cbPublic$layout() {
        return cbPublic$LAYOUT;
    }

    private static final long cbPublic$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbPublic
     * }
     */
    public static final long cbPublic$offset() {
        return cbPublic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbPublic
     * }
     */
    public static int cbPublic(MemorySegment struct) {
        return struct.get(cbPublic$LAYOUT, cbPublic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbPublic
     * }
     */
    public static void cbPublic(MemorySegment struct, int fieldValue) {
        struct.set(cbPublic$LAYOUT, cbPublic$OFFSET, fieldValue);
    }

    private static final OfInt cbPrivate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbPrivate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbPrivate
     * }
     */
    public static final OfInt cbPrivate$layout() {
        return cbPrivate$LAYOUT;
    }

    private static final long cbPrivate$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbPrivate
     * }
     */
    public static final long cbPrivate$offset() {
        return cbPrivate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbPrivate
     * }
     */
    public static int cbPrivate(MemorySegment struct) {
        return struct.get(cbPrivate$LAYOUT, cbPrivate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbPrivate
     * }
     */
    public static void cbPrivate(MemorySegment struct, int fieldValue) {
        struct.set(cbPrivate$LAYOUT, cbPrivate$OFFSET, fieldValue);
    }

    private static final OfInt cbName$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbName
     * }
     */
    public static final OfInt cbName$layout() {
        return cbName$LAYOUT;
    }

    private static final long cbName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbName
     * }
     */
    public static final long cbName$offset() {
        return cbName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbName
     * }
     */
    public static int cbName(MemorySegment struct) {
        return struct.get(cbName$LAYOUT, cbName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbName
     * }
     */
    public static void cbName(MemorySegment struct, int fieldValue) {
        struct.set(cbName$LAYOUT, cbName$OFFSET, fieldValue);
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
