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
 * struct _SUPPORTED_OS_INFO {
 *     WORD MajorVersion;
 *     WORD MinorVersion;
 * }
 * }
 */
public class _SUPPORTED_OS_INFO {

    _SUPPORTED_OS_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("MajorVersion"),
        Windows_h.C_SHORT.withName("MinorVersion")
    ).withName("_SUPPORTED_OS_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort MajorVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("MajorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD MajorVersion
     * }
     */
    public static final OfShort MajorVersion$layout() {
        return MajorVersion$LAYOUT;
    }

    private static final long MajorVersion$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD MajorVersion
     * }
     */
    public static final long MajorVersion$offset() {
        return MajorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD MajorVersion
     * }
     */
    public static short MajorVersion(MemorySegment struct) {
        return struct.get(MajorVersion$LAYOUT, MajorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD MajorVersion
     * }
     */
    public static void MajorVersion(MemorySegment struct, short fieldValue) {
        struct.set(MajorVersion$LAYOUT, MajorVersion$OFFSET, fieldValue);
    }

    private static final OfShort MinorVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("MinorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD MinorVersion
     * }
     */
    public static final OfShort MinorVersion$layout() {
        return MinorVersion$LAYOUT;
    }

    private static final long MinorVersion$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD MinorVersion
     * }
     */
    public static final long MinorVersion$offset() {
        return MinorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD MinorVersion
     * }
     */
    public static short MinorVersion(MemorySegment struct) {
        return struct.get(MinorVersion$LAYOUT, MinorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD MinorVersion
     * }
     */
    public static void MinorVersion(MemorySegment struct, short fieldValue) {
        struct.set(MinorVersion$LAYOUT, MinorVersion$OFFSET, fieldValue);
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

