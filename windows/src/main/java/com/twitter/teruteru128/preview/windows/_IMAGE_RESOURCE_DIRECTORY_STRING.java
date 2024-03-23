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
 * struct _IMAGE_RESOURCE_DIRECTORY_STRING {
 *     WORD Length;
 *     CHAR NameString[1];
 * }
 * }
 */
public class _IMAGE_RESOURCE_DIRECTORY_STRING {

    _IMAGE_RESOURCE_DIRECTORY_STRING() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("Length"),
        MemoryLayout.sequenceLayout(1, Windows_h.C_CHAR).withName("NameString"),
        MemoryLayout.paddingLayout(1)
    ).withName("_IMAGE_RESOURCE_DIRECTORY_STRING");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Length$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Length
     * }
     */
    public static final OfShort Length$layout() {
        return Length$LAYOUT;
    }

    private static final long Length$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Length
     * }
     */
    public static final long Length$offset() {
        return Length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Length
     * }
     */
    public static short Length(MemorySegment struct) {
        return struct.get(Length$LAYOUT, Length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Length
     * }
     */
    public static void Length(MemorySegment struct, short fieldValue) {
        struct.set(Length$LAYOUT, Length$OFFSET, fieldValue);
    }

    private static final SequenceLayout NameString$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("NameString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR NameString[1]
     * }
     */
    public static final SequenceLayout NameString$layout() {
        return NameString$LAYOUT;
    }

    private static final long NameString$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR NameString[1]
     * }
     */
    public static final long NameString$offset() {
        return NameString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR NameString[1]
     * }
     */
    public static MemorySegment NameString(MemorySegment struct) {
        return struct.asSlice(NameString$OFFSET, NameString$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR NameString[1]
     * }
     */
    public static void NameString(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, NameString$OFFSET, NameString$LAYOUT.byteSize());
    }

    private static long[] NameString$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR NameString[1]
     * }
     */
    public static long[] NameString$dimensions() {
        return NameString$DIMS;
    }
    private static final VarHandle NameString$ELEM_HANDLE = NameString$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR NameString[1]
     * }
     */
    public static byte NameString(MemorySegment struct, long index0) {
        return (byte)NameString$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR NameString[1]
     * }
     */
    public static void NameString(MemorySegment struct, long index0, byte fieldValue) {
        NameString$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

