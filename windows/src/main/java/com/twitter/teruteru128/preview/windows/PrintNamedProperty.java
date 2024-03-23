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
 * struct {
 *     WCHAR *propertyName;
 *     PrintPropertyValue propertyValue;
 * }
 * }
 */
public class PrintNamedProperty {

    PrintNamedProperty() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("propertyName"),
        PrintPropertyValue.layout().withName("propertyValue")
    ).withName("$anon$3729:13");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout propertyName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("propertyName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR *propertyName
     * }
     */
    public static final AddressLayout propertyName$layout() {
        return propertyName$LAYOUT;
    }

    private static final long propertyName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR *propertyName
     * }
     */
    public static final long propertyName$offset() {
        return propertyName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR *propertyName
     * }
     */
    public static MemorySegment propertyName(MemorySegment struct) {
        return struct.get(propertyName$LAYOUT, propertyName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR *propertyName
     * }
     */
    public static void propertyName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(propertyName$LAYOUT, propertyName$OFFSET, fieldValue);
    }

    private static final GroupLayout propertyValue$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("propertyValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PrintPropertyValue propertyValue
     * }
     */
    public static final GroupLayout propertyValue$layout() {
        return propertyValue$LAYOUT;
    }

    private static final long propertyValue$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PrintPropertyValue propertyValue
     * }
     */
    public static final long propertyValue$offset() {
        return propertyValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PrintPropertyValue propertyValue
     * }
     */
    public static MemorySegment propertyValue(MemorySegment struct) {
        return struct.asSlice(propertyValue$OFFSET, propertyValue$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PrintPropertyValue propertyValue
     * }
     */
    public static void propertyValue(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, propertyValue$OFFSET, propertyValue$LAYOUT.byteSize());
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

