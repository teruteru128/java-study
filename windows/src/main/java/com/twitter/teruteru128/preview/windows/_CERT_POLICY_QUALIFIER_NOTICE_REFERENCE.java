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
 * struct _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE {
 *     LPSTR pszOrganization;
 *     DWORD cNoticeNumbers;
 *     int *rgNoticeNumbers;
 * }
 * }
 */
public class _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE {

    _CERT_POLICY_QUALIFIER_NOTICE_REFERENCE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("pszOrganization"),
        Windows_h.C_LONG.withName("cNoticeNumbers"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgNoticeNumbers")
    ).withName("_CERT_POLICY_QUALIFIER_NOTICE_REFERENCE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pszOrganization$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszOrganization"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pszOrganization
     * }
     */
    public static final AddressLayout pszOrganization$layout() {
        return pszOrganization$LAYOUT;
    }

    private static final long pszOrganization$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pszOrganization
     * }
     */
    public static final long pszOrganization$offset() {
        return pszOrganization$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pszOrganization
     * }
     */
    public static MemorySegment pszOrganization(MemorySegment struct) {
        return struct.get(pszOrganization$LAYOUT, pszOrganization$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pszOrganization
     * }
     */
    public static void pszOrganization(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszOrganization$LAYOUT, pszOrganization$OFFSET, fieldValue);
    }

    private static final OfInt cNoticeNumbers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cNoticeNumbers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cNoticeNumbers
     * }
     */
    public static final OfInt cNoticeNumbers$layout() {
        return cNoticeNumbers$LAYOUT;
    }

    private static final long cNoticeNumbers$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cNoticeNumbers
     * }
     */
    public static final long cNoticeNumbers$offset() {
        return cNoticeNumbers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cNoticeNumbers
     * }
     */
    public static int cNoticeNumbers(MemorySegment struct) {
        return struct.get(cNoticeNumbers$LAYOUT, cNoticeNumbers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cNoticeNumbers
     * }
     */
    public static void cNoticeNumbers(MemorySegment struct, int fieldValue) {
        struct.set(cNoticeNumbers$LAYOUT, cNoticeNumbers$OFFSET, fieldValue);
    }

    private static final AddressLayout rgNoticeNumbers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgNoticeNumbers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int *rgNoticeNumbers
     * }
     */
    public static final AddressLayout rgNoticeNumbers$layout() {
        return rgNoticeNumbers$LAYOUT;
    }

    private static final long rgNoticeNumbers$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int *rgNoticeNumbers
     * }
     */
    public static final long rgNoticeNumbers$offset() {
        return rgNoticeNumbers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int *rgNoticeNumbers
     * }
     */
    public static MemorySegment rgNoticeNumbers(MemorySegment struct) {
        return struct.get(rgNoticeNumbers$LAYOUT, rgNoticeNumbers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int *rgNoticeNumbers
     * }
     */
    public static void rgNoticeNumbers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgNoticeNumbers$LAYOUT, rgNoticeNumbers$OFFSET, fieldValue);
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

