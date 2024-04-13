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
 * struct _ImageArchitectureEntry {
 *     DWORD FixupInstRVA;
 *     DWORD NewInst;
 * }
 * }
 */
public class _ImageArchitectureEntry {

    _ImageArchitectureEntry() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("FixupInstRVA"),
        Windows_h.C_LONG.withName("NewInst")
    ).withName("_ImageArchitectureEntry");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt FixupInstRVA$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FixupInstRVA"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FixupInstRVA
     * }
     */
    public static final OfInt FixupInstRVA$layout() {
        return FixupInstRVA$LAYOUT;
    }

    private static final long FixupInstRVA$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FixupInstRVA
     * }
     */
    public static final long FixupInstRVA$offset() {
        return FixupInstRVA$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FixupInstRVA
     * }
     */
    public static int FixupInstRVA(MemorySegment struct) {
        return struct.get(FixupInstRVA$LAYOUT, FixupInstRVA$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FixupInstRVA
     * }
     */
    public static void FixupInstRVA(MemorySegment struct, int fieldValue) {
        struct.set(FixupInstRVA$LAYOUT, FixupInstRVA$OFFSET, fieldValue);
    }

    private static final OfInt NewInst$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NewInst"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NewInst
     * }
     */
    public static final OfInt NewInst$layout() {
        return NewInst$LAYOUT;
    }

    private static final long NewInst$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NewInst
     * }
     */
    public static final long NewInst$offset() {
        return NewInst$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NewInst
     * }
     */
    public static int NewInst(MemorySegment struct) {
        return struct.get(NewInst$LAYOUT, NewInst$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NewInst
     * }
     */
    public static void NewInst(MemorySegment struct, int fieldValue) {
        struct.set(NewInst$LAYOUT, NewInst$OFFSET, fieldValue);
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
