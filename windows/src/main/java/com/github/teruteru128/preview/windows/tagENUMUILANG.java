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
 * struct tagENUMUILANG {
 *     ULONG NumOfEnumUILang;
 *     ULONG SizeOfEnumUIBuffer;
 *     LANGID *pEnumUIBuffer;
 * }
 * }
 */
public class tagENUMUILANG {

    tagENUMUILANG() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("NumOfEnumUILang"),
        Windows_h.C_LONG.withName("SizeOfEnumUIBuffer"),
        Windows_h.C_POINTER.withName("pEnumUIBuffer")
    ).withName("tagENUMUILANG");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NumOfEnumUILang$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumOfEnumUILang"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG NumOfEnumUILang
     * }
     */
    public static final OfInt NumOfEnumUILang$layout() {
        return NumOfEnumUILang$LAYOUT;
    }

    private static final long NumOfEnumUILang$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG NumOfEnumUILang
     * }
     */
    public static final long NumOfEnumUILang$offset() {
        return NumOfEnumUILang$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG NumOfEnumUILang
     * }
     */
    public static int NumOfEnumUILang(MemorySegment struct) {
        return struct.get(NumOfEnumUILang$LAYOUT, NumOfEnumUILang$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG NumOfEnumUILang
     * }
     */
    public static void NumOfEnumUILang(MemorySegment struct, int fieldValue) {
        struct.set(NumOfEnumUILang$LAYOUT, NumOfEnumUILang$OFFSET, fieldValue);
    }

    private static final OfInt SizeOfEnumUIBuffer$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SizeOfEnumUIBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG SizeOfEnumUIBuffer
     * }
     */
    public static final OfInt SizeOfEnumUIBuffer$layout() {
        return SizeOfEnumUIBuffer$LAYOUT;
    }

    private static final long SizeOfEnumUIBuffer$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG SizeOfEnumUIBuffer
     * }
     */
    public static final long SizeOfEnumUIBuffer$offset() {
        return SizeOfEnumUIBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG SizeOfEnumUIBuffer
     * }
     */
    public static int SizeOfEnumUIBuffer(MemorySegment struct) {
        return struct.get(SizeOfEnumUIBuffer$LAYOUT, SizeOfEnumUIBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG SizeOfEnumUIBuffer
     * }
     */
    public static void SizeOfEnumUIBuffer(MemorySegment struct, int fieldValue) {
        struct.set(SizeOfEnumUIBuffer$LAYOUT, SizeOfEnumUIBuffer$OFFSET, fieldValue);
    }

    private static final AddressLayout pEnumUIBuffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pEnumUIBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LANGID *pEnumUIBuffer
     * }
     */
    public static final AddressLayout pEnumUIBuffer$layout() {
        return pEnumUIBuffer$LAYOUT;
    }

    private static final long pEnumUIBuffer$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LANGID *pEnumUIBuffer
     * }
     */
    public static final long pEnumUIBuffer$offset() {
        return pEnumUIBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LANGID *pEnumUIBuffer
     * }
     */
    public static MemorySegment pEnumUIBuffer(MemorySegment struct) {
        return struct.get(pEnumUIBuffer$LAYOUT, pEnumUIBuffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LANGID *pEnumUIBuffer
     * }
     */
    public static void pEnumUIBuffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pEnumUIBuffer$LAYOUT, pEnumUIBuffer$OFFSET, fieldValue);
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
