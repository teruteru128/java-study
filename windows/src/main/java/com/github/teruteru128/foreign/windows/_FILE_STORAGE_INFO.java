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
 * struct _FILE_STORAGE_INFO {
 *     ULONG LogicalBytesPerSector;
 *     ULONG PhysicalBytesPerSectorForAtomicity;
 *     ULONG PhysicalBytesPerSectorForPerformance;
 *     ULONG FileSystemEffectivePhysicalBytesPerSectorForAtomicity;
 *     ULONG Flags;
 *     ULONG ByteOffsetForSectorAlignment;
 *     ULONG ByteOffsetForPartitionAlignment;
 * }
 * }
 */
public class _FILE_STORAGE_INFO {

    _FILE_STORAGE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("LogicalBytesPerSector"),
        Windows_h.C_LONG.withName("PhysicalBytesPerSectorForAtomicity"),
        Windows_h.C_LONG.withName("PhysicalBytesPerSectorForPerformance"),
        Windows_h.C_LONG.withName("FileSystemEffectivePhysicalBytesPerSectorForAtomicity"),
        Windows_h.C_LONG.withName("Flags"),
        Windows_h.C_LONG.withName("ByteOffsetForSectorAlignment"),
        Windows_h.C_LONG.withName("ByteOffsetForPartitionAlignment")
    ).withName("_FILE_STORAGE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt LogicalBytesPerSector$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LogicalBytesPerSector"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG LogicalBytesPerSector
     * }
     */
    public static final OfInt LogicalBytesPerSector$layout() {
        return LogicalBytesPerSector$LAYOUT;
    }

    private static final long LogicalBytesPerSector$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG LogicalBytesPerSector
     * }
     */
    public static final long LogicalBytesPerSector$offset() {
        return LogicalBytesPerSector$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG LogicalBytesPerSector
     * }
     */
    public static int LogicalBytesPerSector(MemorySegment struct) {
        return struct.get(LogicalBytesPerSector$LAYOUT, LogicalBytesPerSector$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG LogicalBytesPerSector
     * }
     */
    public static void LogicalBytesPerSector(MemorySegment struct, int fieldValue) {
        struct.set(LogicalBytesPerSector$LAYOUT, LogicalBytesPerSector$OFFSET, fieldValue);
    }

    private static final OfInt PhysicalBytesPerSectorForAtomicity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PhysicalBytesPerSectorForAtomicity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG PhysicalBytesPerSectorForAtomicity
     * }
     */
    public static final OfInt PhysicalBytesPerSectorForAtomicity$layout() {
        return PhysicalBytesPerSectorForAtomicity$LAYOUT;
    }

    private static final long PhysicalBytesPerSectorForAtomicity$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG PhysicalBytesPerSectorForAtomicity
     * }
     */
    public static final long PhysicalBytesPerSectorForAtomicity$offset() {
        return PhysicalBytesPerSectorForAtomicity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG PhysicalBytesPerSectorForAtomicity
     * }
     */
    public static int PhysicalBytesPerSectorForAtomicity(MemorySegment struct) {
        return struct.get(PhysicalBytesPerSectorForAtomicity$LAYOUT, PhysicalBytesPerSectorForAtomicity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG PhysicalBytesPerSectorForAtomicity
     * }
     */
    public static void PhysicalBytesPerSectorForAtomicity(MemorySegment struct, int fieldValue) {
        struct.set(PhysicalBytesPerSectorForAtomicity$LAYOUT, PhysicalBytesPerSectorForAtomicity$OFFSET, fieldValue);
    }

    private static final OfInt PhysicalBytesPerSectorForPerformance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PhysicalBytesPerSectorForPerformance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG PhysicalBytesPerSectorForPerformance
     * }
     */
    public static final OfInt PhysicalBytesPerSectorForPerformance$layout() {
        return PhysicalBytesPerSectorForPerformance$LAYOUT;
    }

    private static final long PhysicalBytesPerSectorForPerformance$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG PhysicalBytesPerSectorForPerformance
     * }
     */
    public static final long PhysicalBytesPerSectorForPerformance$offset() {
        return PhysicalBytesPerSectorForPerformance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG PhysicalBytesPerSectorForPerformance
     * }
     */
    public static int PhysicalBytesPerSectorForPerformance(MemorySegment struct) {
        return struct.get(PhysicalBytesPerSectorForPerformance$LAYOUT, PhysicalBytesPerSectorForPerformance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG PhysicalBytesPerSectorForPerformance
     * }
     */
    public static void PhysicalBytesPerSectorForPerformance(MemorySegment struct, int fieldValue) {
        struct.set(PhysicalBytesPerSectorForPerformance$LAYOUT, PhysicalBytesPerSectorForPerformance$OFFSET, fieldValue);
    }

    private static final OfInt FileSystemEffectivePhysicalBytesPerSectorForAtomicity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FileSystemEffectivePhysicalBytesPerSectorForAtomicity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG FileSystemEffectivePhysicalBytesPerSectorForAtomicity
     * }
     */
    public static final OfInt FileSystemEffectivePhysicalBytesPerSectorForAtomicity$layout() {
        return FileSystemEffectivePhysicalBytesPerSectorForAtomicity$LAYOUT;
    }

    private static final long FileSystemEffectivePhysicalBytesPerSectorForAtomicity$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG FileSystemEffectivePhysicalBytesPerSectorForAtomicity
     * }
     */
    public static final long FileSystemEffectivePhysicalBytesPerSectorForAtomicity$offset() {
        return FileSystemEffectivePhysicalBytesPerSectorForAtomicity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG FileSystemEffectivePhysicalBytesPerSectorForAtomicity
     * }
     */
    public static int FileSystemEffectivePhysicalBytesPerSectorForAtomicity(MemorySegment struct) {
        return struct.get(FileSystemEffectivePhysicalBytesPerSectorForAtomicity$LAYOUT, FileSystemEffectivePhysicalBytesPerSectorForAtomicity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG FileSystemEffectivePhysicalBytesPerSectorForAtomicity
     * }
     */
    public static void FileSystemEffectivePhysicalBytesPerSectorForAtomicity(MemorySegment struct, int fieldValue) {
        struct.set(FileSystemEffectivePhysicalBytesPerSectorForAtomicity$LAYOUT, FileSystemEffectivePhysicalBytesPerSectorForAtomicity$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfInt ByteOffsetForSectorAlignment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ByteOffsetForSectorAlignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ByteOffsetForSectorAlignment
     * }
     */
    public static final OfInt ByteOffsetForSectorAlignment$layout() {
        return ByteOffsetForSectorAlignment$LAYOUT;
    }

    private static final long ByteOffsetForSectorAlignment$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ByteOffsetForSectorAlignment
     * }
     */
    public static final long ByteOffsetForSectorAlignment$offset() {
        return ByteOffsetForSectorAlignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ByteOffsetForSectorAlignment
     * }
     */
    public static int ByteOffsetForSectorAlignment(MemorySegment struct) {
        return struct.get(ByteOffsetForSectorAlignment$LAYOUT, ByteOffsetForSectorAlignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ByteOffsetForSectorAlignment
     * }
     */
    public static void ByteOffsetForSectorAlignment(MemorySegment struct, int fieldValue) {
        struct.set(ByteOffsetForSectorAlignment$LAYOUT, ByteOffsetForSectorAlignment$OFFSET, fieldValue);
    }

    private static final OfInt ByteOffsetForPartitionAlignment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ByteOffsetForPartitionAlignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG ByteOffsetForPartitionAlignment
     * }
     */
    public static final OfInt ByteOffsetForPartitionAlignment$layout() {
        return ByteOffsetForPartitionAlignment$LAYOUT;
    }

    private static final long ByteOffsetForPartitionAlignment$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG ByteOffsetForPartitionAlignment
     * }
     */
    public static final long ByteOffsetForPartitionAlignment$offset() {
        return ByteOffsetForPartitionAlignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG ByteOffsetForPartitionAlignment
     * }
     */
    public static int ByteOffsetForPartitionAlignment(MemorySegment struct) {
        return struct.get(ByteOffsetForPartitionAlignment$LAYOUT, ByteOffsetForPartitionAlignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG ByteOffsetForPartitionAlignment
     * }
     */
    public static void ByteOffsetForPartitionAlignment(MemorySegment struct, int fieldValue) {
        struct.set(ByteOffsetForPartitionAlignment$LAYOUT, ByteOffsetForPartitionAlignment$OFFSET, fieldValue);
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
