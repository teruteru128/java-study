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
 * struct _SILOOBJECT_BASIC_INFORMATION {
 *     DWORD SiloId;
 *     DWORD SiloParentId;
 *     DWORD NumberOfProcesses;
 *     BOOLEAN IsInServerSilo;
 *     BYTE Reserved[3];
 * }
 * }
 */
public class _SILOOBJECT_BASIC_INFORMATION {

    _SILOOBJECT_BASIC_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("SiloId"),
        Windows_h.C_LONG.withName("SiloParentId"),
        Windows_h.C_LONG.withName("NumberOfProcesses"),
        Windows_h.C_CHAR.withName("IsInServerSilo"),
        MemoryLayout.sequenceLayout(3, Windows_h.C_CHAR).withName("Reserved")
    ).withName("_SILOOBJECT_BASIC_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt SiloId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SiloId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SiloId
     * }
     */
    public static final OfInt SiloId$layout() {
        return SiloId$LAYOUT;
    }

    private static final long SiloId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SiloId
     * }
     */
    public static final long SiloId$offset() {
        return SiloId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SiloId
     * }
     */
    public static int SiloId(MemorySegment struct) {
        return struct.get(SiloId$LAYOUT, SiloId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SiloId
     * }
     */
    public static void SiloId(MemorySegment struct, int fieldValue) {
        struct.set(SiloId$LAYOUT, SiloId$OFFSET, fieldValue);
    }

    private static final OfInt SiloParentId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SiloParentId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SiloParentId
     * }
     */
    public static final OfInt SiloParentId$layout() {
        return SiloParentId$LAYOUT;
    }

    private static final long SiloParentId$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SiloParentId
     * }
     */
    public static final long SiloParentId$offset() {
        return SiloParentId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SiloParentId
     * }
     */
    public static int SiloParentId(MemorySegment struct) {
        return struct.get(SiloParentId$LAYOUT, SiloParentId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SiloParentId
     * }
     */
    public static void SiloParentId(MemorySegment struct, int fieldValue) {
        struct.set(SiloParentId$LAYOUT, SiloParentId$OFFSET, fieldValue);
    }

    private static final OfInt NumberOfProcesses$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfProcesses"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfProcesses
     * }
     */
    public static final OfInt NumberOfProcesses$layout() {
        return NumberOfProcesses$LAYOUT;
    }

    private static final long NumberOfProcesses$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfProcesses
     * }
     */
    public static final long NumberOfProcesses$offset() {
        return NumberOfProcesses$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfProcesses
     * }
     */
    public static int NumberOfProcesses(MemorySegment struct) {
        return struct.get(NumberOfProcesses$LAYOUT, NumberOfProcesses$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfProcesses
     * }
     */
    public static void NumberOfProcesses(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfProcesses$LAYOUT, NumberOfProcesses$OFFSET, fieldValue);
    }

    private static final OfByte IsInServerSilo$LAYOUT = (OfByte)$LAYOUT.select(groupElement("IsInServerSilo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN IsInServerSilo
     * }
     */
    public static final OfByte IsInServerSilo$layout() {
        return IsInServerSilo$LAYOUT;
    }

    private static final long IsInServerSilo$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN IsInServerSilo
     * }
     */
    public static final long IsInServerSilo$offset() {
        return IsInServerSilo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN IsInServerSilo
     * }
     */
    public static byte IsInServerSilo(MemorySegment struct) {
        return struct.get(IsInServerSilo$LAYOUT, IsInServerSilo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN IsInServerSilo
     * }
     */
    public static void IsInServerSilo(MemorySegment struct, byte fieldValue) {
        struct.set(IsInServerSilo$LAYOUT, IsInServerSilo$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 13;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static byte Reserved(MemorySegment struct, long index0) {
        return (byte)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[3]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, byte fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
