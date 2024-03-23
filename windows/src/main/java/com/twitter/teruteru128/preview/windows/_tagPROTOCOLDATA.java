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
 * struct _tagPROTOCOLDATA {
 *     DWORD grfFlags;
 *     DWORD dwState;
 *     LPVOID pData;
 *     ULONG cbData;
 * }
 * }
 */
public class _tagPROTOCOLDATA {

    _tagPROTOCOLDATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("grfFlags"),
        Windows_h.C_LONG.withName("dwState"),
        Windows_h.C_POINTER.withName("pData"),
        Windows_h.C_LONG.withName("cbData"),
        MemoryLayout.paddingLayout(4)
    ).withName("_tagPROTOCOLDATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt grfFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("grfFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD grfFlags
     * }
     */
    public static final OfInt grfFlags$layout() {
        return grfFlags$LAYOUT;
    }

    private static final long grfFlags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD grfFlags
     * }
     */
    public static final long grfFlags$offset() {
        return grfFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD grfFlags
     * }
     */
    public static int grfFlags(MemorySegment struct) {
        return struct.get(grfFlags$LAYOUT, grfFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD grfFlags
     * }
     */
    public static void grfFlags(MemorySegment struct, int fieldValue) {
        struct.set(grfFlags$LAYOUT, grfFlags$OFFSET, fieldValue);
    }

    private static final OfInt dwState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwState
     * }
     */
    public static final OfInt dwState$layout() {
        return dwState$LAYOUT;
    }

    private static final long dwState$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwState
     * }
     */
    public static final long dwState$offset() {
        return dwState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwState
     * }
     */
    public static int dwState(MemorySegment struct) {
        return struct.get(dwState$LAYOUT, dwState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwState
     * }
     */
    public static void dwState(MemorySegment struct, int fieldValue) {
        struct.set(dwState$LAYOUT, dwState$OFFSET, fieldValue);
    }

    private static final AddressLayout pData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID pData
     * }
     */
    public static final AddressLayout pData$layout() {
        return pData$LAYOUT;
    }

    private static final long pData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID pData
     * }
     */
    public static final long pData$offset() {
        return pData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID pData
     * }
     */
    public static MemorySegment pData(MemorySegment struct) {
        return struct.get(pData$LAYOUT, pData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID pData
     * }
     */
    public static void pData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pData$LAYOUT, pData$OFFSET, fieldValue);
    }

    private static final OfInt cbData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbData
     * }
     */
    public static final OfInt cbData$layout() {
        return cbData$LAYOUT;
    }

    private static final long cbData$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbData
     * }
     */
    public static final long cbData$offset() {
        return cbData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbData
     * }
     */
    public static int cbData(MemorySegment struct) {
        return struct.get(cbData$LAYOUT, cbData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbData
     * }
     */
    public static void cbData(MemorySegment struct, int fieldValue) {
        struct.set(cbData$LAYOUT, cbData$OFFSET, fieldValue);
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

