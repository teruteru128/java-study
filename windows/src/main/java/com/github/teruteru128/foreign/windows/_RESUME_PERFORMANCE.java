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
 * struct _RESUME_PERFORMANCE {
 *     DWORD PostTimeMs;
 *     ULONGLONG TotalResumeTimeMs;
 *     ULONGLONG ResumeCompleteTimestamp;
 * }
 * }
 */
public class _RESUME_PERFORMANCE {

    _RESUME_PERFORMANCE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("PostTimeMs"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_LONG_LONG.withName("TotalResumeTimeMs"),
        Windows_h.C_LONG_LONG.withName("ResumeCompleteTimestamp")
    ).withName("_RESUME_PERFORMANCE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt PostTimeMs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PostTimeMs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PostTimeMs
     * }
     */
    public static final OfInt PostTimeMs$layout() {
        return PostTimeMs$LAYOUT;
    }

    private static final long PostTimeMs$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PostTimeMs
     * }
     */
    public static final long PostTimeMs$offset() {
        return PostTimeMs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PostTimeMs
     * }
     */
    public static int PostTimeMs(MemorySegment struct) {
        return struct.get(PostTimeMs$LAYOUT, PostTimeMs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PostTimeMs
     * }
     */
    public static void PostTimeMs(MemorySegment struct, int fieldValue) {
        struct.set(PostTimeMs$LAYOUT, PostTimeMs$OFFSET, fieldValue);
    }

    private static final OfLong TotalResumeTimeMs$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TotalResumeTimeMs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG TotalResumeTimeMs
     * }
     */
    public static final OfLong TotalResumeTimeMs$layout() {
        return TotalResumeTimeMs$LAYOUT;
    }

    private static final long TotalResumeTimeMs$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG TotalResumeTimeMs
     * }
     */
    public static final long TotalResumeTimeMs$offset() {
        return TotalResumeTimeMs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalResumeTimeMs
     * }
     */
    public static long TotalResumeTimeMs(MemorySegment struct) {
        return struct.get(TotalResumeTimeMs$LAYOUT, TotalResumeTimeMs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalResumeTimeMs
     * }
     */
    public static void TotalResumeTimeMs(MemorySegment struct, long fieldValue) {
        struct.set(TotalResumeTimeMs$LAYOUT, TotalResumeTimeMs$OFFSET, fieldValue);
    }

    private static final OfLong ResumeCompleteTimestamp$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ResumeCompleteTimestamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG ResumeCompleteTimestamp
     * }
     */
    public static final OfLong ResumeCompleteTimestamp$layout() {
        return ResumeCompleteTimestamp$LAYOUT;
    }

    private static final long ResumeCompleteTimestamp$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG ResumeCompleteTimestamp
     * }
     */
    public static final long ResumeCompleteTimestamp$offset() {
        return ResumeCompleteTimestamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG ResumeCompleteTimestamp
     * }
     */
    public static long ResumeCompleteTimestamp(MemorySegment struct) {
        return struct.get(ResumeCompleteTimestamp$LAYOUT, ResumeCompleteTimestamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG ResumeCompleteTimestamp
     * }
     */
    public static void ResumeCompleteTimestamp(MemorySegment struct, long fieldValue) {
        struct.set(ResumeCompleteTimestamp$LAYOUT, ResumeCompleteTimestamp$OFFSET, fieldValue);
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
