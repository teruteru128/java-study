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
 * struct _TXFS_CREATE_MINIVERSION_INFO {
 *     WORD StructureVersion;
 *     WORD StructureLength;
 *     DWORD BaseVersion;
 *     WORD MiniVersion;
 * }
 * }
 */
public class _TXFS_CREATE_MINIVERSION_INFO {

    _TXFS_CREATE_MINIVERSION_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("StructureVersion"),
        Windows_h.C_SHORT.withName("StructureLength"),
        Windows_h.C_LONG.withName("BaseVersion"),
        Windows_h.C_SHORT.withName("MiniVersion"),
        MemoryLayout.paddingLayout(2)
    ).withName("_TXFS_CREATE_MINIVERSION_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort StructureVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("StructureVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD StructureVersion
     * }
     */
    public static final OfShort StructureVersion$layout() {
        return StructureVersion$LAYOUT;
    }

    private static final long StructureVersion$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD StructureVersion
     * }
     */
    public static final long StructureVersion$offset() {
        return StructureVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD StructureVersion
     * }
     */
    public static short StructureVersion(MemorySegment struct) {
        return struct.get(StructureVersion$LAYOUT, StructureVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD StructureVersion
     * }
     */
    public static void StructureVersion(MemorySegment struct, short fieldValue) {
        struct.set(StructureVersion$LAYOUT, StructureVersion$OFFSET, fieldValue);
    }

    private static final OfShort StructureLength$LAYOUT = (OfShort)$LAYOUT.select(groupElement("StructureLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD StructureLength
     * }
     */
    public static final OfShort StructureLength$layout() {
        return StructureLength$LAYOUT;
    }

    private static final long StructureLength$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD StructureLength
     * }
     */
    public static final long StructureLength$offset() {
        return StructureLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD StructureLength
     * }
     */
    public static short StructureLength(MemorySegment struct) {
        return struct.get(StructureLength$LAYOUT, StructureLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD StructureLength
     * }
     */
    public static void StructureLength(MemorySegment struct, short fieldValue) {
        struct.set(StructureLength$LAYOUT, StructureLength$OFFSET, fieldValue);
    }

    private static final OfInt BaseVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BaseVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BaseVersion
     * }
     */
    public static final OfInt BaseVersion$layout() {
        return BaseVersion$LAYOUT;
    }

    private static final long BaseVersion$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BaseVersion
     * }
     */
    public static final long BaseVersion$offset() {
        return BaseVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BaseVersion
     * }
     */
    public static int BaseVersion(MemorySegment struct) {
        return struct.get(BaseVersion$LAYOUT, BaseVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BaseVersion
     * }
     */
    public static void BaseVersion(MemorySegment struct, int fieldValue) {
        struct.set(BaseVersion$LAYOUT, BaseVersion$OFFSET, fieldValue);
    }

    private static final OfShort MiniVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("MiniVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD MiniVersion
     * }
     */
    public static final OfShort MiniVersion$layout() {
        return MiniVersion$LAYOUT;
    }

    private static final long MiniVersion$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD MiniVersion
     * }
     */
    public static final long MiniVersion$offset() {
        return MiniVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD MiniVersion
     * }
     */
    public static short MiniVersion(MemorySegment struct) {
        return struct.get(MiniVersion$LAYOUT, MiniVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD MiniVersion
     * }
     */
    public static void MiniVersion(MemorySegment struct, short fieldValue) {
        struct.set(MiniVersion$LAYOUT, MiniVersion$OFFSET, fieldValue);
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

