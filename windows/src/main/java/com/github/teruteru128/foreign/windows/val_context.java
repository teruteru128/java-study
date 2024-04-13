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
 * struct val_context {
 *     int valuelen;
 *     LPVOID value_context;
 *     LPVOID val_buff_ptr;
 * }
 * }
 */
public class val_context {

    val_context() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("valuelen"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("value_context"),
        Windows_h.C_POINTER.withName("val_buff_ptr")
    ).withName("val_context");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt valuelen$LAYOUT = (OfInt)$LAYOUT.select(groupElement("valuelen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int valuelen
     * }
     */
    public static final OfInt valuelen$layout() {
        return valuelen$LAYOUT;
    }

    private static final long valuelen$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int valuelen
     * }
     */
    public static final long valuelen$offset() {
        return valuelen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int valuelen
     * }
     */
    public static int valuelen(MemorySegment struct) {
        return struct.get(valuelen$LAYOUT, valuelen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int valuelen
     * }
     */
    public static void valuelen(MemorySegment struct, int fieldValue) {
        struct.set(valuelen$LAYOUT, valuelen$OFFSET, fieldValue);
    }

    private static final AddressLayout value_context$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("value_context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID value_context
     * }
     */
    public static final AddressLayout value_context$layout() {
        return value_context$LAYOUT;
    }

    private static final long value_context$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID value_context
     * }
     */
    public static final long value_context$offset() {
        return value_context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID value_context
     * }
     */
    public static MemorySegment value_context(MemorySegment struct) {
        return struct.get(value_context$LAYOUT, value_context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID value_context
     * }
     */
    public static void value_context(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(value_context$LAYOUT, value_context$OFFSET, fieldValue);
    }

    private static final AddressLayout val_buff_ptr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("val_buff_ptr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID val_buff_ptr
     * }
     */
    public static final AddressLayout val_buff_ptr$layout() {
        return val_buff_ptr$LAYOUT;
    }

    private static final long val_buff_ptr$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID val_buff_ptr
     * }
     */
    public static final long val_buff_ptr$offset() {
        return val_buff_ptr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID val_buff_ptr
     * }
     */
    public static MemorySegment val_buff_ptr(MemorySegment struct) {
        return struct.get(val_buff_ptr$LAYOUT, val_buff_ptr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID val_buff_ptr
     * }
     */
    public static void val_buff_ptr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(val_buff_ptr$LAYOUT, val_buff_ptr$OFFSET, fieldValue);
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
