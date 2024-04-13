// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * struct _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA {
 *     DWORD cOID;
 *     LPSTR *rgpszOID;
 * }
 * }
 */
public class _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA {

    _CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("cOID"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgpszOID")
    ).withName("_CRYPT_DEFAULT_CONTEXT_MULTI_OID_PARA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cOID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cOID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cOID
     * }
     */
    public static final OfInt cOID$layout() {
        return cOID$LAYOUT;
    }

    private static final long cOID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cOID
     * }
     */
    public static final long cOID$offset() {
        return cOID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cOID
     * }
     */
    public static int cOID(MemorySegment struct) {
        return struct.get(cOID$LAYOUT, cOID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cOID
     * }
     */
    public static void cOID(MemorySegment struct, int fieldValue) {
        struct.set(cOID$LAYOUT, cOID$OFFSET, fieldValue);
    }

    private static final AddressLayout rgpszOID$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgpszOID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR *rgpszOID
     * }
     */
    public static final AddressLayout rgpszOID$layout() {
        return rgpszOID$LAYOUT;
    }

    private static final long rgpszOID$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR *rgpszOID
     * }
     */
    public static final long rgpszOID$offset() {
        return rgpszOID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR *rgpszOID
     * }
     */
    public static MemorySegment rgpszOID(MemorySegment struct) {
        return struct.get(rgpszOID$LAYOUT, rgpszOID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR *rgpszOID
     * }
     */
    public static void rgpszOID(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgpszOID$LAYOUT, rgpszOID$OFFSET, fieldValue);
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
