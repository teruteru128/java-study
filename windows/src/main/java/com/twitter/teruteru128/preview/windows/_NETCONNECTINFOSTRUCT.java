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
 * struct _NETCONNECTINFOSTRUCT {
 *     DWORD cbStructure;
 *     DWORD dwFlags;
 *     DWORD dwSpeed;
 *     DWORD dwDelay;
 *     DWORD dwOptDataSize;
 * }
 * }
 */
public class _NETCONNECTINFOSTRUCT {

    _NETCONNECTINFOSTRUCT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cbStructure"),
        Windows_h.C_LONG.withName("dwFlags"),
        Windows_h.C_LONG.withName("dwSpeed"),
        Windows_h.C_LONG.withName("dwDelay"),
        Windows_h.C_LONG.withName("dwOptDataSize")
    ).withName("_NETCONNECTINFOSTRUCT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbStructure$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbStructure"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbStructure
     * }
     */
    public static final OfInt cbStructure$layout() {
        return cbStructure$LAYOUT;
    }

    private static final long cbStructure$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbStructure
     * }
     */
    public static final long cbStructure$offset() {
        return cbStructure$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbStructure
     * }
     */
    public static int cbStructure(MemorySegment struct) {
        return struct.get(cbStructure$LAYOUT, cbStructure$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbStructure
     * }
     */
    public static void cbStructure(MemorySegment struct, int fieldValue) {
        struct.set(cbStructure$LAYOUT, cbStructure$OFFSET, fieldValue);
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final OfInt dwSpeed$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSpeed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSpeed
     * }
     */
    public static final OfInt dwSpeed$layout() {
        return dwSpeed$LAYOUT;
    }

    private static final long dwSpeed$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSpeed
     * }
     */
    public static final long dwSpeed$offset() {
        return dwSpeed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSpeed
     * }
     */
    public static int dwSpeed(MemorySegment struct) {
        return struct.get(dwSpeed$LAYOUT, dwSpeed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSpeed
     * }
     */
    public static void dwSpeed(MemorySegment struct, int fieldValue) {
        struct.set(dwSpeed$LAYOUT, dwSpeed$OFFSET, fieldValue);
    }

    private static final OfInt dwDelay$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDelay"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDelay
     * }
     */
    public static final OfInt dwDelay$layout() {
        return dwDelay$LAYOUT;
    }

    private static final long dwDelay$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDelay
     * }
     */
    public static final long dwDelay$offset() {
        return dwDelay$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDelay
     * }
     */
    public static int dwDelay(MemorySegment struct) {
        return struct.get(dwDelay$LAYOUT, dwDelay$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDelay
     * }
     */
    public static void dwDelay(MemorySegment struct, int fieldValue) {
        struct.set(dwDelay$LAYOUT, dwDelay$OFFSET, fieldValue);
    }

    private static final OfInt dwOptDataSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOptDataSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwOptDataSize
     * }
     */
    public static final OfInt dwOptDataSize$layout() {
        return dwOptDataSize$LAYOUT;
    }

    private static final long dwOptDataSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwOptDataSize
     * }
     */
    public static final long dwOptDataSize$offset() {
        return dwOptDataSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwOptDataSize
     * }
     */
    public static int dwOptDataSize(MemorySegment struct) {
        return struct.get(dwOptDataSize$LAYOUT, dwOptDataSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwOptDataSize
     * }
     */
    public static void dwOptDataSize(MemorySegment struct, int fieldValue) {
        struct.set(dwOptDataSize$LAYOUT, dwOptDataSize$OFFSET, fieldValue);
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

