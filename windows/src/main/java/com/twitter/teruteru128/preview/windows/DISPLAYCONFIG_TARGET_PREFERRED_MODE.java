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
 * struct DISPLAYCONFIG_TARGET_PREFERRED_MODE {
 *     DISPLAYCONFIG_DEVICE_INFO_HEADER header;
 *     UINT32 width;
 *     UINT32 height;
 *     DISPLAYCONFIG_TARGET_MODE targetMode;
 * }
 * }
 */
public class DISPLAYCONFIG_TARGET_PREFERRED_MODE {

    DISPLAYCONFIG_TARGET_PREFERRED_MODE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        DISPLAYCONFIG_DEVICE_INFO_HEADER.layout().withName("header"),
        Windows_h.C_INT.withName("width"),
        Windows_h.C_INT.withName("height"),
        MemoryLayout.paddingLayout(4),
        DISPLAYCONFIG_TARGET_MODE.layout().withName("targetMode")
    ).withName("DISPLAYCONFIG_TARGET_PREFERRED_MODE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout header$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static final GroupLayout header$layout() {
        return header$LAYOUT;
    }

    private static final long header$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static final long header$offset() {
        return header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static MemorySegment header(MemorySegment struct) {
        return struct.asSlice(header$OFFSET, header$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static void header(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, header$OFFSET, header$LAYOUT.byteSize());
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final GroupLayout targetMode$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("targetMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_MODE targetMode
     * }
     */
    public static final GroupLayout targetMode$layout() {
        return targetMode$LAYOUT;
    }

    private static final long targetMode$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_MODE targetMode
     * }
     */
    public static final long targetMode$offset() {
        return targetMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_MODE targetMode
     * }
     */
    public static MemorySegment targetMode(MemorySegment struct) {
        return struct.asSlice(targetMode$OFFSET, targetMode$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_MODE targetMode
     * }
     */
    public static void targetMode(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, targetMode$OFFSET, targetMode$LAYOUT.byteSize());
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

