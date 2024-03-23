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
 * struct _STORAGE_DEVICE_IO_CAPABILITY_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD LunMaxIoCount;
 *     DWORD AdapterMaxIoCount;
 * }
 * }
 */
public class _STORAGE_DEVICE_IO_CAPABILITY_DESCRIPTOR {

    _STORAGE_DEVICE_IO_CAPABILITY_DESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Version"),
        Windows_h.C_LONG.withName("Size"),
        Windows_h.C_LONG.withName("LunMaxIoCount"),
        Windows_h.C_LONG.withName("AdapterMaxIoCount")
    ).withName("_STORAGE_DEVICE_IO_CAPABILITY_DESCRIPTOR");

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
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt LunMaxIoCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LunMaxIoCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD LunMaxIoCount
     * }
     */
    public static final OfInt LunMaxIoCount$layout() {
        return LunMaxIoCount$LAYOUT;
    }

    private static final long LunMaxIoCount$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD LunMaxIoCount
     * }
     */
    public static final long LunMaxIoCount$offset() {
        return LunMaxIoCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD LunMaxIoCount
     * }
     */
    public static int LunMaxIoCount(MemorySegment struct) {
        return struct.get(LunMaxIoCount$LAYOUT, LunMaxIoCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD LunMaxIoCount
     * }
     */
    public static void LunMaxIoCount(MemorySegment struct, int fieldValue) {
        struct.set(LunMaxIoCount$LAYOUT, LunMaxIoCount$OFFSET, fieldValue);
    }

    private static final OfInt AdapterMaxIoCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AdapterMaxIoCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AdapterMaxIoCount
     * }
     */
    public static final OfInt AdapterMaxIoCount$layout() {
        return AdapterMaxIoCount$LAYOUT;
    }

    private static final long AdapterMaxIoCount$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AdapterMaxIoCount
     * }
     */
    public static final long AdapterMaxIoCount$offset() {
        return AdapterMaxIoCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AdapterMaxIoCount
     * }
     */
    public static int AdapterMaxIoCount(MemorySegment struct) {
        return struct.get(AdapterMaxIoCount$LAYOUT, AdapterMaxIoCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AdapterMaxIoCount
     * }
     */
    public static void AdapterMaxIoCount(MemorySegment struct, int fieldValue) {
        struct.set(AdapterMaxIoCount$LAYOUT, AdapterMaxIoCount$OFFSET, fieldValue);
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

