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
 * struct _CERT_ACCESS_DESCRIPTION {
 *     LPSTR pszAccessMethod;
 *     CERT_ALT_NAME_ENTRY AccessLocation;
 * }
 * }
 */
public class _CERT_ACCESS_DESCRIPTION {

    _CERT_ACCESS_DESCRIPTION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("pszAccessMethod"),
        _CERT_ALT_NAME_ENTRY.layout().withName("AccessLocation")
    ).withName("_CERT_ACCESS_DESCRIPTION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pszAccessMethod$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszAccessMethod"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pszAccessMethod
     * }
     */
    public static final AddressLayout pszAccessMethod$layout() {
        return pszAccessMethod$LAYOUT;
    }

    private static final long pszAccessMethod$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pszAccessMethod
     * }
     */
    public static final long pszAccessMethod$offset() {
        return pszAccessMethod$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pszAccessMethod
     * }
     */
    public static MemorySegment pszAccessMethod(MemorySegment struct) {
        return struct.get(pszAccessMethod$LAYOUT, pszAccessMethod$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pszAccessMethod
     * }
     */
    public static void pszAccessMethod(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszAccessMethod$LAYOUT, pszAccessMethod$OFFSET, fieldValue);
    }

    private static final GroupLayout AccessLocation$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("AccessLocation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_ALT_NAME_ENTRY AccessLocation
     * }
     */
    public static final GroupLayout AccessLocation$layout() {
        return AccessLocation$LAYOUT;
    }

    private static final long AccessLocation$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_ALT_NAME_ENTRY AccessLocation
     * }
     */
    public static final long AccessLocation$offset() {
        return AccessLocation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_ALT_NAME_ENTRY AccessLocation
     * }
     */
    public static MemorySegment AccessLocation(MemorySegment struct) {
        return struct.asSlice(AccessLocation$OFFSET, AccessLocation$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_ALT_NAME_ENTRY AccessLocation
     * }
     */
    public static void AccessLocation(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AccessLocation$OFFSET, AccessLocation$LAYOUT.byteSize());
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

