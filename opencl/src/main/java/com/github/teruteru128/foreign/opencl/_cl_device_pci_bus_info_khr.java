// Generated by jextract

package com.github.teruteru128.foreign.opencl;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _cl_device_pci_bus_info_khr {
 *     cl_uint pci_domain;
 *     cl_uint pci_bus;
 *     cl_uint pci_device;
 *     cl_uint pci_function;
 * }
 * }
 */
public class _cl_device_pci_bus_info_khr {

    _cl_device_pci_bus_info_khr() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        opencl_h.C_INT.withName("pci_domain"),
        opencl_h.C_INT.withName("pci_bus"),
        opencl_h.C_INT.withName("pci_device"),
        opencl_h.C_INT.withName("pci_function")
    ).withName("_cl_device_pci_bus_info_khr");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt pci_domain$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pci_domain"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint pci_domain
     * }
     */
    public static final OfInt pci_domain$layout() {
        return pci_domain$LAYOUT;
    }

    private static final long pci_domain$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint pci_domain
     * }
     */
    public static final long pci_domain$offset() {
        return pci_domain$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint pci_domain
     * }
     */
    public static int pci_domain(MemorySegment struct) {
        return struct.get(pci_domain$LAYOUT, pci_domain$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint pci_domain
     * }
     */
    public static void pci_domain(MemorySegment struct, int fieldValue) {
        struct.set(pci_domain$LAYOUT, pci_domain$OFFSET, fieldValue);
    }

    private static final OfInt pci_bus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pci_bus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint pci_bus
     * }
     */
    public static final OfInt pci_bus$layout() {
        return pci_bus$LAYOUT;
    }

    private static final long pci_bus$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint pci_bus
     * }
     */
    public static final long pci_bus$offset() {
        return pci_bus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint pci_bus
     * }
     */
    public static int pci_bus(MemorySegment struct) {
        return struct.get(pci_bus$LAYOUT, pci_bus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint pci_bus
     * }
     */
    public static void pci_bus(MemorySegment struct, int fieldValue) {
        struct.set(pci_bus$LAYOUT, pci_bus$OFFSET, fieldValue);
    }

    private static final OfInt pci_device$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pci_device"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint pci_device
     * }
     */
    public static final OfInt pci_device$layout() {
        return pci_device$LAYOUT;
    }

    private static final long pci_device$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint pci_device
     * }
     */
    public static final long pci_device$offset() {
        return pci_device$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint pci_device
     * }
     */
    public static int pci_device(MemorySegment struct) {
        return struct.get(pci_device$LAYOUT, pci_device$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint pci_device
     * }
     */
    public static void pci_device(MemorySegment struct, int fieldValue) {
        struct.set(pci_device$LAYOUT, pci_device$OFFSET, fieldValue);
    }

    private static final OfInt pci_function$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pci_function"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint pci_function
     * }
     */
    public static final OfInt pci_function$layout() {
        return pci_function$LAYOUT;
    }

    private static final long pci_function$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint pci_function
     * }
     */
    public static final long pci_function$offset() {
        return pci_function$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint pci_function
     * }
     */
    public static int pci_function(MemorySegment struct) {
        return struct.get(pci_function$LAYOUT, pci_function$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint pci_function
     * }
     */
    public static void pci_function(MemorySegment struct, int fieldValue) {
        struct.set(pci_function$LAYOUT, pci_function$OFFSET, fieldValue);
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

