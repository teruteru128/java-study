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
 * union IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA {
 *     DWORD HeaderData;
 *     struct {
 *         DWORD FunctionLength : 18;
 *         DWORD Version : 2;
 *         DWORD ExceptionDataPresent : 1;
 *         DWORD EpilogInHeader : 1;
 *         DWORD EpilogCount : 5;
 *         DWORD CodeWords : 5;
 *     };
 * }
 * }
 */
public class IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA {

    IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
        Windows_h.C_LONG.withName("HeaderData"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(4)
        ).withName("$anon$19949:5")
    ).withName("IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY_XDATA");

    /**
     * The layout of this union
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt HeaderData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("HeaderData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD HeaderData
     * }
     */
    public static final OfInt HeaderData$layout() {
        return HeaderData$LAYOUT;
    }

    private static final long HeaderData$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD HeaderData
     * }
     */
    public static final long HeaderData$offset() {
        return HeaderData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD HeaderData
     * }
     */
    public static int HeaderData(MemorySegment union) {
        return union.get(HeaderData$LAYOUT, HeaderData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD HeaderData
     * }
     */
    public static void HeaderData(MemorySegment union, int fieldValue) {
        union.set(HeaderData$LAYOUT, HeaderData$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this union
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
