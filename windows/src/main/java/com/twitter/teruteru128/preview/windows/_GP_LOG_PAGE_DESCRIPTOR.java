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
 * struct _GP_LOG_PAGE_DESCRIPTOR {
 *     WORD LogAddress;
 *     WORD LogSectors;
 * }
 * }
 */
public class _GP_LOG_PAGE_DESCRIPTOR {

    _GP_LOG_PAGE_DESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.align(Windows_h.C_SHORT, 1).withName("LogAddress"),
        Windows_h.align(Windows_h.C_SHORT, 1).withName("LogSectors")
    ).withName("_GP_LOG_PAGE_DESCRIPTOR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort LogAddress$LAYOUT = (OfShort)$LAYOUT.select(groupElement("LogAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD LogAddress
     * }
     */
    public static final OfShort LogAddress$layout() {
        return LogAddress$LAYOUT;
    }

    private static final long LogAddress$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD LogAddress
     * }
     */
    public static final long LogAddress$offset() {
        return LogAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD LogAddress
     * }
     */
    public static short LogAddress(MemorySegment struct) {
        return struct.get(LogAddress$LAYOUT, LogAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD LogAddress
     * }
     */
    public static void LogAddress(MemorySegment struct, short fieldValue) {
        struct.set(LogAddress$LAYOUT, LogAddress$OFFSET, fieldValue);
    }

    private static final OfShort LogSectors$LAYOUT = (OfShort)$LAYOUT.select(groupElement("LogSectors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD LogSectors
     * }
     */
    public static final OfShort LogSectors$layout() {
        return LogSectors$LAYOUT;
    }

    private static final long LogSectors$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD LogSectors
     * }
     */
    public static final long LogSectors$offset() {
        return LogSectors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD LogSectors
     * }
     */
    public static short LogSectors(MemorySegment struct) {
        return struct.get(LogSectors$LAYOUT, LogSectors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD LogSectors
     * }
     */
    public static void LogSectors(MemorySegment struct, short fieldValue) {
        struct.set(LogSectors$LAYOUT, LogSectors$OFFSET, fieldValue);
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

