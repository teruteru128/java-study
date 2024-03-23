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
 * struct _IMAGE_NT_HEADERS64 {
 *     DWORD Signature;
 *     IMAGE_FILE_HEADER FileHeader;
 *     IMAGE_OPTIONAL_HEADER64 OptionalHeader;
 * }
 * }
 */
public class _IMAGE_NT_HEADERS64 {

    _IMAGE_NT_HEADERS64() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Signature"),
        _IMAGE_FILE_HEADER.layout().withName("FileHeader"),
        _IMAGE_OPTIONAL_HEADER64.layout().withName("OptionalHeader")
    ).withName("_IMAGE_NT_HEADERS64");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Signature$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Signature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Signature
     * }
     */
    public static final OfInt Signature$layout() {
        return Signature$LAYOUT;
    }

    private static final long Signature$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Signature
     * }
     */
    public static final long Signature$offset() {
        return Signature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Signature
     * }
     */
    public static int Signature(MemorySegment struct) {
        return struct.get(Signature$LAYOUT, Signature$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Signature
     * }
     */
    public static void Signature(MemorySegment struct, int fieldValue) {
        struct.set(Signature$LAYOUT, Signature$OFFSET, fieldValue);
    }

    private static final GroupLayout FileHeader$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("FileHeader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * IMAGE_FILE_HEADER FileHeader
     * }
     */
    public static final GroupLayout FileHeader$layout() {
        return FileHeader$LAYOUT;
    }

    private static final long FileHeader$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * IMAGE_FILE_HEADER FileHeader
     * }
     */
    public static final long FileHeader$offset() {
        return FileHeader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * IMAGE_FILE_HEADER FileHeader
     * }
     */
    public static MemorySegment FileHeader(MemorySegment struct) {
        return struct.asSlice(FileHeader$OFFSET, FileHeader$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * IMAGE_FILE_HEADER FileHeader
     * }
     */
    public static void FileHeader(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileHeader$OFFSET, FileHeader$LAYOUT.byteSize());
    }

    private static final GroupLayout OptionalHeader$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("OptionalHeader"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * IMAGE_OPTIONAL_HEADER64 OptionalHeader
     * }
     */
    public static final GroupLayout OptionalHeader$layout() {
        return OptionalHeader$LAYOUT;
    }

    private static final long OptionalHeader$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * IMAGE_OPTIONAL_HEADER64 OptionalHeader
     * }
     */
    public static final long OptionalHeader$offset() {
        return OptionalHeader$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * IMAGE_OPTIONAL_HEADER64 OptionalHeader
     * }
     */
    public static MemorySegment OptionalHeader(MemorySegment struct) {
        return struct.asSlice(OptionalHeader$OFFSET, OptionalHeader$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * IMAGE_OPTIONAL_HEADER64 OptionalHeader
     * }
     */
    public static void OptionalHeader(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, OptionalHeader$OFFSET, OptionalHeader$LAYOUT.byteSize());
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

