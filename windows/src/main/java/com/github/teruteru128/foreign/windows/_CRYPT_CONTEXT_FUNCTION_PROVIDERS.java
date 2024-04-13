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
 * struct _CRYPT_CONTEXT_FUNCTION_PROVIDERS {
 *     ULONG cProviders;
 *     PWSTR *rgpszProviders;
 * }
 * }
 */
public class _CRYPT_CONTEXT_FUNCTION_PROVIDERS {

    _CRYPT_CONTEXT_FUNCTION_PROVIDERS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cProviders"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgpszProviders")
    ).withName("_CRYPT_CONTEXT_FUNCTION_PROVIDERS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cProviders$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cProviders"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cProviders
     * }
     */
    public static final OfInt cProviders$layout() {
        return cProviders$LAYOUT;
    }

    private static final long cProviders$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cProviders
     * }
     */
    public static final long cProviders$offset() {
        return cProviders$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cProviders
     * }
     */
    public static int cProviders(MemorySegment struct) {
        return struct.get(cProviders$LAYOUT, cProviders$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cProviders
     * }
     */
    public static void cProviders(MemorySegment struct, int fieldValue) {
        struct.set(cProviders$LAYOUT, cProviders$OFFSET, fieldValue);
    }

    private static final AddressLayout rgpszProviders$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgpszProviders"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PWSTR *rgpszProviders
     * }
     */
    public static final AddressLayout rgpszProviders$layout() {
        return rgpszProviders$LAYOUT;
    }

    private static final long rgpszProviders$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PWSTR *rgpszProviders
     * }
     */
    public static final long rgpszProviders$offset() {
        return rgpszProviders$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PWSTR *rgpszProviders
     * }
     */
    public static MemorySegment rgpszProviders(MemorySegment struct) {
        return struct.get(rgpszProviders$LAYOUT, rgpszProviders$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PWSTR *rgpszProviders
     * }
     */
    public static void rgpszProviders(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgpszProviders$LAYOUT, rgpszProviders$OFFSET, fieldValue);
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
