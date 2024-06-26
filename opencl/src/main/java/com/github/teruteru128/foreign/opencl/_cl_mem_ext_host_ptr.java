// Generated by jextract

package com.github.teruteru128.foreign.opencl;

import java.lang.foreign.*;
import java.util.function.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _cl_mem_ext_host_ptr {
 *     cl_uint allocation_type;
 *     cl_uint host_cache_policy;
 * }
 * }
 */
public class _cl_mem_ext_host_ptr {

    _cl_mem_ext_host_ptr() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        opencl_h.C_INT.withName("allocation_type"),
        opencl_h.C_INT.withName("host_cache_policy")
    ).withName("_cl_mem_ext_host_ptr");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt allocation_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("allocation_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint allocation_type
     * }
     */
    public static final OfInt allocation_type$layout() {
        return allocation_type$LAYOUT;
    }

    private static final long allocation_type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint allocation_type
     * }
     */
    public static final long allocation_type$offset() {
        return allocation_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint allocation_type
     * }
     */
    public static int allocation_type(MemorySegment struct) {
        return struct.get(allocation_type$LAYOUT, allocation_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint allocation_type
     * }
     */
    public static void allocation_type(MemorySegment struct, int fieldValue) {
        struct.set(allocation_type$LAYOUT, allocation_type$OFFSET, fieldValue);
    }

    private static final OfInt host_cache_policy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("host_cache_policy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * cl_uint host_cache_policy
     * }
     */
    public static final OfInt host_cache_policy$layout() {
        return host_cache_policy$LAYOUT;
    }

    private static final long host_cache_policy$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * cl_uint host_cache_policy
     * }
     */
    public static final long host_cache_policy$offset() {
        return host_cache_policy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * cl_uint host_cache_policy
     * }
     */
    public static int host_cache_policy(MemorySegment struct) {
        return struct.get(host_cache_policy$LAYOUT, host_cache_policy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * cl_uint host_cache_policy
     * }
     */
    public static void host_cache_policy(MemorySegment struct, int fieldValue) {
        struct.set(host_cache_policy$LAYOUT, host_cache_policy$OFFSET, fieldValue);
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

