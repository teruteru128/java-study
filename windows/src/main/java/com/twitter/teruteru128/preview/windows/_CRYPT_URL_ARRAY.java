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
 * struct _CRYPT_URL_ARRAY {
 *     DWORD cUrl;
 *     LPWSTR *rgwszUrl;
 * }
 * }
 */
public class _CRYPT_URL_ARRAY {

    _CRYPT_URL_ARRAY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cUrl"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgwszUrl")
    ).withName("_CRYPT_URL_ARRAY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cUrl$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cUrl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cUrl
     * }
     */
    public static final OfInt cUrl$layout() {
        return cUrl$LAYOUT;
    }

    private static final long cUrl$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cUrl
     * }
     */
    public static final long cUrl$offset() {
        return cUrl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cUrl
     * }
     */
    public static int cUrl(MemorySegment struct) {
        return struct.get(cUrl$LAYOUT, cUrl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cUrl
     * }
     */
    public static void cUrl(MemorySegment struct, int fieldValue) {
        struct.set(cUrl$LAYOUT, cUrl$OFFSET, fieldValue);
    }

    private static final AddressLayout rgwszUrl$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgwszUrl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR *rgwszUrl
     * }
     */
    public static final AddressLayout rgwszUrl$layout() {
        return rgwszUrl$LAYOUT;
    }

    private static final long rgwszUrl$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR *rgwszUrl
     * }
     */
    public static final long rgwszUrl$offset() {
        return rgwszUrl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR *rgwszUrl
     * }
     */
    public static MemorySegment rgwszUrl(MemorySegment struct) {
        return struct.get(rgwszUrl$LAYOUT, rgwszUrl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR *rgwszUrl
     * }
     */
    public static void rgwszUrl(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgwszUrl$LAYOUT, rgwszUrl$OFFSET, fieldValue);
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

