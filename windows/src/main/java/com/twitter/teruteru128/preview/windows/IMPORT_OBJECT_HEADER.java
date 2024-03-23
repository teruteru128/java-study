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
 * struct IMPORT_OBJECT_HEADER {
 *     WORD Sig1;
 *     WORD Sig2;
 *     WORD Version;
 *     WORD Machine;
 *     DWORD TimeDateStamp;
 *     DWORD SizeOfData;
 *     union {
 *         WORD Ordinal;
 *         WORD Hint;
 *     };
 *     WORD Type : 2;
 *     WORD NameType : 3;
 *     WORD Reserved : 11;
 * }
 * }
 */
public class IMPORT_OBJECT_HEADER {

    IMPORT_OBJECT_HEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("Sig1"),
        Windows_h.C_SHORT.withName("Sig2"),
        Windows_h.C_SHORT.withName("Version"),
        Windows_h.C_SHORT.withName("Machine"),
        Windows_h.C_LONG.withName("TimeDateStamp"),
        Windows_h.C_LONG.withName("SizeOfData"),
        MemoryLayout.unionLayout(
            Windows_h.C_SHORT.withName("Ordinal"),
            Windows_h.C_SHORT.withName("Hint")
        ).withName("$anon$20299:5"),
        MemoryLayout.paddingLayout(2)
    ).withName("IMPORT_OBJECT_HEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Sig1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Sig1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Sig1
     * }
     */
    public static final OfShort Sig1$layout() {
        return Sig1$LAYOUT;
    }

    private static final long Sig1$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Sig1
     * }
     */
    public static final long Sig1$offset() {
        return Sig1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Sig1
     * }
     */
    public static short Sig1(MemorySegment struct) {
        return struct.get(Sig1$LAYOUT, Sig1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Sig1
     * }
     */
    public static void Sig1(MemorySegment struct, short fieldValue) {
        struct.set(Sig1$LAYOUT, Sig1$OFFSET, fieldValue);
    }

    private static final OfShort Sig2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Sig2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Sig2
     * }
     */
    public static final OfShort Sig2$layout() {
        return Sig2$LAYOUT;
    }

    private static final long Sig2$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Sig2
     * }
     */
    public static final long Sig2$offset() {
        return Sig2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Sig2
     * }
     */
    public static short Sig2(MemorySegment struct) {
        return struct.get(Sig2$LAYOUT, Sig2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Sig2
     * }
     */
    public static void Sig2(MemorySegment struct, short fieldValue) {
        struct.set(Sig2$LAYOUT, Sig2$OFFSET, fieldValue);
    }

    private static final OfShort Version$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static final OfShort Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static short Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Version
     * }
     */
    public static void Version(MemorySegment struct, short fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfShort Machine$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Machine"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Machine
     * }
     */
    public static final OfShort Machine$layout() {
        return Machine$LAYOUT;
    }

    private static final long Machine$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Machine
     * }
     */
    public static final long Machine$offset() {
        return Machine$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Machine
     * }
     */
    public static short Machine(MemorySegment struct) {
        return struct.get(Machine$LAYOUT, Machine$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Machine
     * }
     */
    public static void Machine(MemorySegment struct, short fieldValue) {
        struct.set(Machine$LAYOUT, Machine$OFFSET, fieldValue);
    }

    private static final OfInt TimeDateStamp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TimeDateStamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static final OfInt TimeDateStamp$layout() {
        return TimeDateStamp$LAYOUT;
    }

    private static final long TimeDateStamp$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static final long TimeDateStamp$offset() {
        return TimeDateStamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static int TimeDateStamp(MemorySegment struct) {
        return struct.get(TimeDateStamp$LAYOUT, TimeDateStamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static void TimeDateStamp(MemorySegment struct, int fieldValue) {
        struct.set(TimeDateStamp$LAYOUT, TimeDateStamp$OFFSET, fieldValue);
    }

    private static final OfInt SizeOfData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SizeOfData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SizeOfData
     * }
     */
    public static final OfInt SizeOfData$layout() {
        return SizeOfData$LAYOUT;
    }

    private static final long SizeOfData$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SizeOfData
     * }
     */
    public static final long SizeOfData$offset() {
        return SizeOfData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SizeOfData
     * }
     */
    public static int SizeOfData(MemorySegment struct) {
        return struct.get(SizeOfData$LAYOUT, SizeOfData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SizeOfData
     * }
     */
    public static void SizeOfData(MemorySegment struct, int fieldValue) {
        struct.set(SizeOfData$LAYOUT, SizeOfData$OFFSET, fieldValue);
    }

    private static final OfShort Ordinal$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$20299:5"), groupElement("Ordinal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Ordinal
     * }
     */
    public static final OfShort Ordinal$layout() {
        return Ordinal$LAYOUT;
    }

    private static final long Ordinal$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Ordinal
     * }
     */
    public static final long Ordinal$offset() {
        return Ordinal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Ordinal
     * }
     */
    public static short Ordinal(MemorySegment struct) {
        return struct.get(Ordinal$LAYOUT, Ordinal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Ordinal
     * }
     */
    public static void Ordinal(MemorySegment struct, short fieldValue) {
        struct.set(Ordinal$LAYOUT, Ordinal$OFFSET, fieldValue);
    }

    private static final OfShort Hint$LAYOUT = (OfShort)$LAYOUT.select(groupElement("$anon$20299:5"), groupElement("Hint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Hint
     * }
     */
    public static final OfShort Hint$layout() {
        return Hint$LAYOUT;
    }

    private static final long Hint$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Hint
     * }
     */
    public static final long Hint$offset() {
        return Hint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Hint
     * }
     */
    public static short Hint(MemorySegment struct) {
        return struct.get(Hint$LAYOUT, Hint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Hint
     * }
     */
    public static void Hint(MemorySegment struct, short fieldValue) {
        struct.set(Hint$LAYOUT, Hint$OFFSET, fieldValue);
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

