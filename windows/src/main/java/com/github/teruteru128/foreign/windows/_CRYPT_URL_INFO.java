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
 * struct _CRYPT_URL_INFO {
 *     DWORD cbSize;
 *     DWORD dwSyncDeltaTime;
 *     DWORD cGroup;
 *     DWORD *rgcGroupEntry;
 * }
 * }
 */
public class _CRYPT_URL_INFO {

    _CRYPT_URL_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbSize"),
        Windows_h.C_LONG.withName("dwSyncDeltaTime"),
        Windows_h.C_LONG.withName("cGroup"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgcGroupEntry")
    ).withName("_CRYPT_URL_INFO");

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
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwSyncDeltaTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSyncDeltaTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSyncDeltaTime
     * }
     */
    public static final OfInt dwSyncDeltaTime$layout() {
        return dwSyncDeltaTime$LAYOUT;
    }

    private static final long dwSyncDeltaTime$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSyncDeltaTime
     * }
     */
    public static final long dwSyncDeltaTime$offset() {
        return dwSyncDeltaTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSyncDeltaTime
     * }
     */
    public static int dwSyncDeltaTime(MemorySegment struct) {
        return struct.get(dwSyncDeltaTime$LAYOUT, dwSyncDeltaTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSyncDeltaTime
     * }
     */
    public static void dwSyncDeltaTime(MemorySegment struct, int fieldValue) {
        struct.set(dwSyncDeltaTime$LAYOUT, dwSyncDeltaTime$OFFSET, fieldValue);
    }

    private static final OfInt cGroup$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cGroup"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cGroup
     * }
     */
    public static final OfInt cGroup$layout() {
        return cGroup$LAYOUT;
    }

    private static final long cGroup$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cGroup
     * }
     */
    public static final long cGroup$offset() {
        return cGroup$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cGroup
     * }
     */
    public static int cGroup(MemorySegment struct) {
        return struct.get(cGroup$LAYOUT, cGroup$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cGroup
     * }
     */
    public static void cGroup(MemorySegment struct, int fieldValue) {
        struct.set(cGroup$LAYOUT, cGroup$OFFSET, fieldValue);
    }

    private static final AddressLayout rgcGroupEntry$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgcGroupEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD *rgcGroupEntry
     * }
     */
    public static final AddressLayout rgcGroupEntry$layout() {
        return rgcGroupEntry$LAYOUT;
    }

    private static final long rgcGroupEntry$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD *rgcGroupEntry
     * }
     */
    public static final long rgcGroupEntry$offset() {
        return rgcGroupEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD *rgcGroupEntry
     * }
     */
    public static MemorySegment rgcGroupEntry(MemorySegment struct) {
        return struct.get(rgcGroupEntry$LAYOUT, rgcGroupEntry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD *rgcGroupEntry
     * }
     */
    public static void rgcGroupEntry(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgcGroupEntry$LAYOUT, rgcGroupEntry$OFFSET, fieldValue);
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
