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
 * struct DISPLAYCONFIG_ADAPTER_NAME {
 *     DISPLAYCONFIG_DEVICE_INFO_HEADER header;
 *     WCHAR adapterDevicePath[128];
 * }
 * }
 */
public class DISPLAYCONFIG_ADAPTER_NAME {

    DISPLAYCONFIG_ADAPTER_NAME() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        DISPLAYCONFIG_DEVICE_INFO_HEADER.layout().withName("header"),
        MemoryLayout.sequenceLayout(128, Windows_h.C_SHORT).withName("adapterDevicePath")
    ).withName("DISPLAYCONFIG_ADAPTER_NAME");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout header$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static final GroupLayout header$layout() {
        return header$LAYOUT;
    }

    private static final long header$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static final long header$offset() {
        return header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static MemorySegment header(MemorySegment struct) {
        return struct.asSlice(header$OFFSET, header$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static void header(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, header$OFFSET, header$LAYOUT.byteSize());
    }

    private static final SequenceLayout adapterDevicePath$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("adapterDevicePath"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR adapterDevicePath[128]
     * }
     */
    public static final SequenceLayout adapterDevicePath$layout() {
        return adapterDevicePath$LAYOUT;
    }

    private static final long adapterDevicePath$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR adapterDevicePath[128]
     * }
     */
    public static final long adapterDevicePath$offset() {
        return adapterDevicePath$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR adapterDevicePath[128]
     * }
     */
    public static MemorySegment adapterDevicePath(MemorySegment struct) {
        return struct.asSlice(adapterDevicePath$OFFSET, adapterDevicePath$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR adapterDevicePath[128]
     * }
     */
    public static void adapterDevicePath(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, adapterDevicePath$OFFSET, adapterDevicePath$LAYOUT.byteSize());
    }

    private static long[] adapterDevicePath$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR adapterDevicePath[128]
     * }
     */
    public static long[] adapterDevicePath$dimensions() {
        return adapterDevicePath$DIMS;
    }
    private static final VarHandle adapterDevicePath$ELEM_HANDLE = adapterDevicePath$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR adapterDevicePath[128]
     * }
     */
    public static short adapterDevicePath(MemorySegment struct, long index0) {
        return (short)adapterDevicePath$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR adapterDevicePath[128]
     * }
     */
    public static void adapterDevicePath(MemorySegment struct, long index0, short fieldValue) {
        adapterDevicePath$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

