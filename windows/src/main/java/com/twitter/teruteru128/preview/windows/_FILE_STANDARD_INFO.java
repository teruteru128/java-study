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
 * struct _FILE_STANDARD_INFO {
 *     LARGE_INTEGER AllocationSize;
 *     LARGE_INTEGER EndOfFile;
 *     DWORD NumberOfLinks;
 *     BOOLEAN DeletePending;
 *     BOOLEAN Directory;
 * }
 * }
 */
public class _FILE_STANDARD_INFO {

    _FILE_STANDARD_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("AllocationSize"),
        _LARGE_INTEGER.layout().withName("EndOfFile"),
        Windows_h.C_LONG.withName("NumberOfLinks"),
        Windows_h.C_CHAR.withName("DeletePending"),
        Windows_h.C_CHAR.withName("Directory"),
        MemoryLayout.paddingLayout(2)
    ).withName("_FILE_STANDARD_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout AllocationSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("AllocationSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocationSize
     * }
     */
    public static final GroupLayout AllocationSize$layout() {
        return AllocationSize$LAYOUT;
    }

    private static final long AllocationSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocationSize
     * }
     */
    public static final long AllocationSize$offset() {
        return AllocationSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocationSize
     * }
     */
    public static MemorySegment AllocationSize(MemorySegment struct) {
        return struct.asSlice(AllocationSize$OFFSET, AllocationSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AllocationSize
     * }
     */
    public static void AllocationSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AllocationSize$OFFSET, AllocationSize$LAYOUT.byteSize());
    }

    private static final GroupLayout EndOfFile$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("EndOfFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER EndOfFile
     * }
     */
    public static final GroupLayout EndOfFile$layout() {
        return EndOfFile$LAYOUT;
    }

    private static final long EndOfFile$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER EndOfFile
     * }
     */
    public static final long EndOfFile$offset() {
        return EndOfFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER EndOfFile
     * }
     */
    public static MemorySegment EndOfFile(MemorySegment struct) {
        return struct.asSlice(EndOfFile$OFFSET, EndOfFile$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER EndOfFile
     * }
     */
    public static void EndOfFile(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, EndOfFile$OFFSET, EndOfFile$LAYOUT.byteSize());
    }

    private static final OfInt NumberOfLinks$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfLinks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfLinks
     * }
     */
    public static final OfInt NumberOfLinks$layout() {
        return NumberOfLinks$LAYOUT;
    }

    private static final long NumberOfLinks$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfLinks
     * }
     */
    public static final long NumberOfLinks$offset() {
        return NumberOfLinks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfLinks
     * }
     */
    public static int NumberOfLinks(MemorySegment struct) {
        return struct.get(NumberOfLinks$LAYOUT, NumberOfLinks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfLinks
     * }
     */
    public static void NumberOfLinks(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfLinks$LAYOUT, NumberOfLinks$OFFSET, fieldValue);
    }

    private static final OfByte DeletePending$LAYOUT = (OfByte)$LAYOUT.select(groupElement("DeletePending"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN DeletePending
     * }
     */
    public static final OfByte DeletePending$layout() {
        return DeletePending$LAYOUT;
    }

    private static final long DeletePending$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN DeletePending
     * }
     */
    public static final long DeletePending$offset() {
        return DeletePending$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN DeletePending
     * }
     */
    public static byte DeletePending(MemorySegment struct) {
        return struct.get(DeletePending$LAYOUT, DeletePending$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN DeletePending
     * }
     */
    public static void DeletePending(MemorySegment struct, byte fieldValue) {
        struct.set(DeletePending$LAYOUT, DeletePending$OFFSET, fieldValue);
    }

    private static final OfByte Directory$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Directory"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Directory
     * }
     */
    public static final OfByte Directory$layout() {
        return Directory$LAYOUT;
    }

    private static final long Directory$OFFSET = 21;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Directory
     * }
     */
    public static final long Directory$offset() {
        return Directory$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Directory
     * }
     */
    public static byte Directory(MemorySegment struct) {
        return struct.get(Directory$LAYOUT, Directory$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Directory
     * }
     */
    public static void Directory(MemorySegment struct, byte fieldValue) {
        struct.set(Directory$LAYOUT, Directory$OFFSET, fieldValue);
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

