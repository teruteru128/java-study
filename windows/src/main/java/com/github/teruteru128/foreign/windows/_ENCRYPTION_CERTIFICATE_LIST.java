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
 * struct _ENCRYPTION_CERTIFICATE_LIST {
 *     DWORD nUsers;
 *     PENCRYPTION_CERTIFICATE *pUsers;
 * }
 * }
 */
public class _ENCRYPTION_CERTIFICATE_LIST {

    _ENCRYPTION_CERTIFICATE_LIST() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("nUsers"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pUsers")
    ).withName("_ENCRYPTION_CERTIFICATE_LIST");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt nUsers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nUsers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nUsers
     * }
     */
    public static final OfInt nUsers$layout() {
        return nUsers$LAYOUT;
    }

    private static final long nUsers$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nUsers
     * }
     */
    public static final long nUsers$offset() {
        return nUsers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nUsers
     * }
     */
    public static int nUsers(MemorySegment struct) {
        return struct.get(nUsers$LAYOUT, nUsers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nUsers
     * }
     */
    public static void nUsers(MemorySegment struct, int fieldValue) {
        struct.set(nUsers$LAYOUT, nUsers$OFFSET, fieldValue);
    }

    private static final AddressLayout pUsers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pUsers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PENCRYPTION_CERTIFICATE *pUsers
     * }
     */
    public static final AddressLayout pUsers$layout() {
        return pUsers$LAYOUT;
    }

    private static final long pUsers$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PENCRYPTION_CERTIFICATE *pUsers
     * }
     */
    public static final long pUsers$offset() {
        return pUsers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PENCRYPTION_CERTIFICATE *pUsers
     * }
     */
    public static MemorySegment pUsers(MemorySegment struct) {
        return struct.get(pUsers$LAYOUT, pUsers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PENCRYPTION_CERTIFICATE *pUsers
     * }
     */
    public static void pUsers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pUsers$LAYOUT, pUsers$OFFSET, fieldValue);
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
