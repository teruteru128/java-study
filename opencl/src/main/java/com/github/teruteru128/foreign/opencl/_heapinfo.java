// Generated by jextract

package com.github.teruteru128.foreign.opencl;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _heapinfo {
 *     int *_pentry;
 *     size_t _size;
 *     int _useflag;
 * }
 * }
 */
public class _heapinfo {

    _heapinfo() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        opencl_h.C_POINTER.withName("_pentry"),
        opencl_h.C_LONG_LONG.withName("_size"),
        opencl_h.C_INT.withName("_useflag"),
        MemoryLayout.paddingLayout(4)
    ).withName("_heapinfo");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout _pentry$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_pentry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int *_pentry
     * }
     */
    public static final AddressLayout _pentry$layout() {
        return _pentry$LAYOUT;
    }

    private static final long _pentry$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int *_pentry
     * }
     */
    public static final long _pentry$offset() {
        return _pentry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int *_pentry
     * }
     */
    public static MemorySegment _pentry(MemorySegment struct) {
        return struct.get(_pentry$LAYOUT, _pentry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int *_pentry
     * }
     */
    public static void _pentry(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_pentry$LAYOUT, _pentry$OFFSET, fieldValue);
    }

    private static final OfLong _size$LAYOUT = (OfLong)$LAYOUT.select(groupElement("_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t _size
     * }
     */
    public static final OfLong _size$layout() {
        return _size$LAYOUT;
    }

    private static final long _size$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t _size
     * }
     */
    public static final long _size$offset() {
        return _size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t _size
     * }
     */
    public static long _size(MemorySegment struct) {
        return struct.get(_size$LAYOUT, _size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t _size
     * }
     */
    public static void _size(MemorySegment struct, long fieldValue) {
        struct.set(_size$LAYOUT, _size$OFFSET, fieldValue);
    }

    private static final OfInt _useflag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("_useflag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int _useflag
     * }
     */
    public static final OfInt _useflag$layout() {
        return _useflag$LAYOUT;
    }

    private static final long _useflag$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int _useflag
     * }
     */
    public static final long _useflag$offset() {
        return _useflag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int _useflag
     * }
     */
    public static int _useflag(MemorySegment struct) {
        return struct.get(_useflag$LAYOUT, _useflag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int _useflag
     * }
     */
    public static void _useflag(MemorySegment struct, int fieldValue) {
        struct.set(_useflag$LAYOUT, _useflag$OFFSET, fieldValue);
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

