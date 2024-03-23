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
 * struct _STORAGE_DEVICE_NUMBERS {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD NumberOfDevices;
 *     STORAGE_DEVICE_NUMBER Devices[1];
 * }
 * }
 */
public class _STORAGE_DEVICE_NUMBERS {

    _STORAGE_DEVICE_NUMBERS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("Version"),
        Windows_h.C_LONG.withName("Size"),
        Windows_h.C_LONG.withName("NumberOfDevices"),
        MemoryLayout.sequenceLayout(1, _STORAGE_DEVICE_NUMBER.layout()).withName("Devices")
    ).withName("_STORAGE_DEVICE_NUMBERS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
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

    private static final long Size$OFFSET = 4;

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

    private static final OfInt NumberOfDevices$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfDevices"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfDevices
     * }
     */
    public static final OfInt NumberOfDevices$layout() {
        return NumberOfDevices$LAYOUT;
    }

    private static final long NumberOfDevices$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfDevices
     * }
     */
    public static final long NumberOfDevices$offset() {
        return NumberOfDevices$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfDevices
     * }
     */
    public static int NumberOfDevices(MemorySegment struct) {
        return struct.get(NumberOfDevices$LAYOUT, NumberOfDevices$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfDevices
     * }
     */
    public static void NumberOfDevices(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfDevices$LAYOUT, NumberOfDevices$OFFSET, fieldValue);
    }

    private static final SequenceLayout Devices$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Devices"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_DEVICE_NUMBER Devices[1]
     * }
     */
    public static final SequenceLayout Devices$layout() {
        return Devices$LAYOUT;
    }

    private static final long Devices$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_DEVICE_NUMBER Devices[1]
     * }
     */
    public static final long Devices$offset() {
        return Devices$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_DEVICE_NUMBER Devices[1]
     * }
     */
    public static MemorySegment Devices(MemorySegment struct) {
        return struct.asSlice(Devices$OFFSET, Devices$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_DEVICE_NUMBER Devices[1]
     * }
     */
    public static void Devices(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Devices$OFFSET, Devices$LAYOUT.byteSize());
    }

    private static long[] Devices$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * STORAGE_DEVICE_NUMBER Devices[1]
     * }
     */
    public static long[] Devices$dimensions() {
        return Devices$DIMS;
    }
    private static final MethodHandle Devices$ELEM_HANDLE = Devices$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * STORAGE_DEVICE_NUMBER Devices[1]
     * }
     */
    public static MemorySegment Devices(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)Devices$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * STORAGE_DEVICE_NUMBER Devices[1]
     * }
     */
    public static void Devices(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, Devices(struct, index0), 0L, _STORAGE_DEVICE_NUMBER.layout().byteSize());
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

