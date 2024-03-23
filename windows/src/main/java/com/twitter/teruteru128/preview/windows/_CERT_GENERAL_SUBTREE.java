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
 * struct _CERT_GENERAL_SUBTREE {
 *     CERT_ALT_NAME_ENTRY Base;
 *     DWORD dwMinimum;
 *     BOOL fMaximum;
 *     DWORD dwMaximum;
 * }
 * }
 */
public class _CERT_GENERAL_SUBTREE {

    _CERT_GENERAL_SUBTREE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CERT_ALT_NAME_ENTRY.layout().withName("Base"),
        Windows_h.C_LONG.withName("dwMinimum"),
        Windows_h.C_INT.withName("fMaximum"),
        Windows_h.C_LONG.withName("dwMaximum"),
        MemoryLayout.paddingLayout(4)
    ).withName("_CERT_GENERAL_SUBTREE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout Base$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Base"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_ALT_NAME_ENTRY Base
     * }
     */
    public static final GroupLayout Base$layout() {
        return Base$LAYOUT;
    }

    private static final long Base$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_ALT_NAME_ENTRY Base
     * }
     */
    public static final long Base$offset() {
        return Base$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_ALT_NAME_ENTRY Base
     * }
     */
    public static MemorySegment Base(MemorySegment struct) {
        return struct.asSlice(Base$OFFSET, Base$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_ALT_NAME_ENTRY Base
     * }
     */
    public static void Base(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Base$OFFSET, Base$LAYOUT.byteSize());
    }

    private static final OfInt dwMinimum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMinimum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMinimum
     * }
     */
    public static final OfInt dwMinimum$layout() {
        return dwMinimum$LAYOUT;
    }

    private static final long dwMinimum$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMinimum
     * }
     */
    public static final long dwMinimum$offset() {
        return dwMinimum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMinimum
     * }
     */
    public static int dwMinimum(MemorySegment struct) {
        return struct.get(dwMinimum$LAYOUT, dwMinimum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMinimum
     * }
     */
    public static void dwMinimum(MemorySegment struct, int fieldValue) {
        struct.set(dwMinimum$LAYOUT, dwMinimum$OFFSET, fieldValue);
    }

    private static final OfInt fMaximum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fMaximum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fMaximum
     * }
     */
    public static final OfInt fMaximum$layout() {
        return fMaximum$LAYOUT;
    }

    private static final long fMaximum$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fMaximum
     * }
     */
    public static final long fMaximum$offset() {
        return fMaximum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fMaximum
     * }
     */
    public static int fMaximum(MemorySegment struct) {
        return struct.get(fMaximum$LAYOUT, fMaximum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fMaximum
     * }
     */
    public static void fMaximum(MemorySegment struct, int fieldValue) {
        struct.set(fMaximum$LAYOUT, fMaximum$OFFSET, fieldValue);
    }

    private static final OfInt dwMaximum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMaximum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMaximum
     * }
     */
    public static final OfInt dwMaximum$layout() {
        return dwMaximum$LAYOUT;
    }

    private static final long dwMaximum$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMaximum
     * }
     */
    public static final long dwMaximum$offset() {
        return dwMaximum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMaximum
     * }
     */
    public static int dwMaximum(MemorySegment struct) {
        return struct.get(dwMaximum$LAYOUT, dwMaximum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMaximum
     * }
     */
    public static void dwMaximum(MemorySegment struct, int fieldValue) {
        struct.set(dwMaximum$LAYOUT, dwMaximum$OFFSET, fieldValue);
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

