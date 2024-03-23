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
 * struct _REPAIR_COPIES_OUTPUT {
 *     DWORD Size;
 *     DWORD Status;
 *     LARGE_INTEGER ResumeFileOffset;
 * }
 * }
 */
public class _REPAIR_COPIES_OUTPUT {

    _REPAIR_COPIES_OUTPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Size"),
        Windows_h.C_LONG.withName("Status"),
        _LARGE_INTEGER.layout().withName("ResumeFileOffset")
    ).withName("_REPAIR_COPIES_OUTPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt Status$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Status"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static final OfInt Status$layout() {
        return Status$LAYOUT;
    }

    private static final long Status$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static final long Status$offset() {
        return Status$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static int Status(MemorySegment struct) {
        return struct.get(Status$LAYOUT, Status$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Status
     * }
     */
    public static void Status(MemorySegment struct, int fieldValue) {
        struct.set(Status$LAYOUT, Status$OFFSET, fieldValue);
    }

    private static final GroupLayout ResumeFileOffset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ResumeFileOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ResumeFileOffset
     * }
     */
    public static final GroupLayout ResumeFileOffset$layout() {
        return ResumeFileOffset$LAYOUT;
    }

    private static final long ResumeFileOffset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ResumeFileOffset
     * }
     */
    public static final long ResumeFileOffset$offset() {
        return ResumeFileOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ResumeFileOffset
     * }
     */
    public static MemorySegment ResumeFileOffset(MemorySegment struct) {
        return struct.asSlice(ResumeFileOffset$OFFSET, ResumeFileOffset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER ResumeFileOffset
     * }
     */
    public static void ResumeFileOffset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ResumeFileOffset$OFFSET, ResumeFileOffset$LAYOUT.byteSize());
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

