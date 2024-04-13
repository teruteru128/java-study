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
 * struct _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO {
 *     DISPLAYCONFIG_DEVICE_INFO_HEADER header;
 *     union {
 *         struct {
 *             UINT32 advancedColorSupported : 1;
 *             UINT32 advancedColorEnabled : 1;
 *             UINT32 wideColorEnforced : 1;
 *             UINT32 advancedColorForceDisabled : 1;
 *             UINT32 reserved : 28;
 *         };
 *         UINT32 value;
 *     };
 *     DISPLAYCONFIG_COLOR_ENCODING colorEncoding;
 *     UINT32 bitsPerColorChannel;
 * }
 * }
 */
public class _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO {

    _DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        DISPLAYCONFIG_DEVICE_INFO_HEADER.layout().withName("header"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$3167:9"),
            Windows_h.C_INT.withName("value")
        ).withName("$anon$3165:5"),
        Windows_h.C_INT.withName("colorEncoding"),
        Windows_h.C_INT.withName("bitsPerColorChannel")
    ).withName("_DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO");

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

    private static final OfInt value$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$3165:5"), groupElement("value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 value
     * }
     */
    public static final OfInt value$layout() {
        return value$LAYOUT;
    }

    private static final long value$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 value
     * }
     */
    public static final long value$offset() {
        return value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 value
     * }
     */
    public static int value(MemorySegment struct) {
        return struct.get(value$LAYOUT, value$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 value
     * }
     */
    public static void value(MemorySegment struct, int fieldValue) {
        struct.set(value$LAYOUT, value$OFFSET, fieldValue);
    }

    private static final OfInt colorEncoding$LAYOUT = (OfInt)$LAYOUT.select(groupElement("colorEncoding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_COLOR_ENCODING colorEncoding
     * }
     */
    public static final OfInt colorEncoding$layout() {
        return colorEncoding$LAYOUT;
    }

    private static final long colorEncoding$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_COLOR_ENCODING colorEncoding
     * }
     */
    public static final long colorEncoding$offset() {
        return colorEncoding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_COLOR_ENCODING colorEncoding
     * }
     */
    public static int colorEncoding(MemorySegment struct) {
        return struct.get(colorEncoding$LAYOUT, colorEncoding$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_COLOR_ENCODING colorEncoding
     * }
     */
    public static void colorEncoding(MemorySegment struct, int fieldValue) {
        struct.set(colorEncoding$LAYOUT, colorEncoding$OFFSET, fieldValue);
    }

    private static final OfInt bitsPerColorChannel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bitsPerColorChannel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 bitsPerColorChannel
     * }
     */
    public static final OfInt bitsPerColorChannel$layout() {
        return bitsPerColorChannel$LAYOUT;
    }

    private static final long bitsPerColorChannel$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 bitsPerColorChannel
     * }
     */
    public static final long bitsPerColorChannel$offset() {
        return bitsPerColorChannel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 bitsPerColorChannel
     * }
     */
    public static int bitsPerColorChannel(MemorySegment struct) {
        return struct.get(bitsPerColorChannel$LAYOUT, bitsPerColorChannel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 bitsPerColorChannel
     * }
     */
    public static void bitsPerColorChannel(MemorySegment struct, int fieldValue) {
        struct.set(bitsPerColorChannel$LAYOUT, bitsPerColorChannel$OFFSET, fieldValue);
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
