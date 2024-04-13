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
 * struct _CERT_NAME_INFO {
 *     DWORD cRDN;
 *     PCERT_RDN rgRDN;
 * }
 * }
 */
public class _CERT_NAME_INFO {

    _CERT_NAME_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cRDN"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgRDN")
    ).withName("_CERT_NAME_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cRDN$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cRDN"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cRDN
     * }
     */
    public static final OfInt cRDN$layout() {
        return cRDN$LAYOUT;
    }

    private static final long cRDN$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cRDN
     * }
     */
    public static final long cRDN$offset() {
        return cRDN$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cRDN
     * }
     */
    public static int cRDN(MemorySegment struct) {
        return struct.get(cRDN$LAYOUT, cRDN$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cRDN
     * }
     */
    public static void cRDN(MemorySegment struct, int fieldValue) {
        struct.set(cRDN$LAYOUT, cRDN$OFFSET, fieldValue);
    }

    private static final AddressLayout rgRDN$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgRDN"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_RDN rgRDN
     * }
     */
    public static final AddressLayout rgRDN$layout() {
        return rgRDN$LAYOUT;
    }

    private static final long rgRDN$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_RDN rgRDN
     * }
     */
    public static final long rgRDN$offset() {
        return rgRDN$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_RDN rgRDN
     * }
     */
    public static MemorySegment rgRDN(MemorySegment struct) {
        return struct.get(rgRDN$LAYOUT, rgRDN$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_RDN rgRDN
     * }
     */
    public static void rgRDN(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgRDN$LAYOUT, rgRDN$OFFSET, fieldValue);
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
