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
 * struct tagRPC_ERROR_ENUM_HANDLE {
 *     ULONG Signature;
 *     void *CurrentPos;
 *     void *Head;
 * }
 * }
 */
public class tagRPC_ERROR_ENUM_HANDLE {

    tagRPC_ERROR_ENUM_HANDLE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Signature"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("CurrentPos"),
        Windows_h.C_POINTER.withName("Head")
    ).withName("tagRPC_ERROR_ENUM_HANDLE");

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
     * ULONG Signature
     * }
     */
    public static final OfInt Signature$layout() {
        return Signature$LAYOUT;
    }

    private static final long Signature$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG Signature
     * }
     */
    public static final long Signature$offset() {
        return Signature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG Signature
     * }
     */
    public static int Signature(MemorySegment struct) {
        return struct.get(Signature$LAYOUT, Signature$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG Signature
     * }
     */
    public static void Signature(MemorySegment struct, int fieldValue) {
        struct.set(Signature$LAYOUT, Signature$OFFSET, fieldValue);
    }

    private static final AddressLayout CurrentPos$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("CurrentPos"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *CurrentPos
     * }
     */
    public static final AddressLayout CurrentPos$layout() {
        return CurrentPos$LAYOUT;
    }

    private static final long CurrentPos$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *CurrentPos
     * }
     */
    public static final long CurrentPos$offset() {
        return CurrentPos$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *CurrentPos
     * }
     */
    public static MemorySegment CurrentPos(MemorySegment struct) {
        return struct.get(CurrentPos$LAYOUT, CurrentPos$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *CurrentPos
     * }
     */
    public static void CurrentPos(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(CurrentPos$LAYOUT, CurrentPos$OFFSET, fieldValue);
    }

    private static final AddressLayout Head$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Head"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *Head
     * }
     */
    public static final AddressLayout Head$layout() {
        return Head$LAYOUT;
    }

    private static final long Head$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *Head
     * }
     */
    public static final long Head$offset() {
        return Head$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *Head
     * }
     */
    public static MemorySegment Head(MemorySegment struct) {
        return struct.get(Head$LAYOUT, Head$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *Head
     * }
     */
    public static void Head(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Head$LAYOUT, Head$OFFSET, fieldValue);
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
