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
 * struct _CRYPT_TIME_STAMP_REQUEST_INFO {
 *     LPSTR pszTimeStampAlgorithm;
 *     LPSTR pszContentType;
 *     CRYPT_OBJID_BLOB Content;
 *     DWORD cAttribute;
 *     PCRYPT_ATTRIBUTE rgAttribute;
 * }
 * }
 */
public class _CRYPT_TIME_STAMP_REQUEST_INFO {

    _CRYPT_TIME_STAMP_REQUEST_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("pszTimeStampAlgorithm"),
        Windows_h.C_POINTER.withName("pszContentType"),
        _CRYPTOAPI_BLOB.layout().withName("Content"),
        Windows_h.C_LONG.withName("cAttribute"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("rgAttribute")
    ).withName("_CRYPT_TIME_STAMP_REQUEST_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pszTimeStampAlgorithm$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszTimeStampAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pszTimeStampAlgorithm
     * }
     */
    public static final AddressLayout pszTimeStampAlgorithm$layout() {
        return pszTimeStampAlgorithm$LAYOUT;
    }

    private static final long pszTimeStampAlgorithm$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pszTimeStampAlgorithm
     * }
     */
    public static final long pszTimeStampAlgorithm$offset() {
        return pszTimeStampAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pszTimeStampAlgorithm
     * }
     */
    public static MemorySegment pszTimeStampAlgorithm(MemorySegment struct) {
        return struct.get(pszTimeStampAlgorithm$LAYOUT, pszTimeStampAlgorithm$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pszTimeStampAlgorithm
     * }
     */
    public static void pszTimeStampAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszTimeStampAlgorithm$LAYOUT, pszTimeStampAlgorithm$OFFSET, fieldValue);
    }

    private static final AddressLayout pszContentType$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszContentType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pszContentType
     * }
     */
    public static final AddressLayout pszContentType$layout() {
        return pszContentType$LAYOUT;
    }

    private static final long pszContentType$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pszContentType
     * }
     */
    public static final long pszContentType$offset() {
        return pszContentType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pszContentType
     * }
     */
    public static MemorySegment pszContentType(MemorySegment struct) {
        return struct.get(pszContentType$LAYOUT, pszContentType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pszContentType
     * }
     */
    public static void pszContentType(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszContentType$LAYOUT, pszContentType$OFFSET, fieldValue);
    }

    private static final GroupLayout Content$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Content"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_OBJID_BLOB Content
     * }
     */
    public static final GroupLayout Content$layout() {
        return Content$LAYOUT;
    }

    private static final long Content$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_OBJID_BLOB Content
     * }
     */
    public static final long Content$offset() {
        return Content$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_OBJID_BLOB Content
     * }
     */
    public static MemorySegment Content(MemorySegment struct) {
        return struct.asSlice(Content$OFFSET, Content$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_OBJID_BLOB Content
     * }
     */
    public static void Content(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Content$OFFSET, Content$LAYOUT.byteSize());
    }

    private static final OfInt cAttribute$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cAttribute"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cAttribute
     * }
     */
    public static final OfInt cAttribute$layout() {
        return cAttribute$LAYOUT;
    }

    private static final long cAttribute$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cAttribute
     * }
     */
    public static final long cAttribute$offset() {
        return cAttribute$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cAttribute
     * }
     */
    public static int cAttribute(MemorySegment struct) {
        return struct.get(cAttribute$LAYOUT, cAttribute$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cAttribute
     * }
     */
    public static void cAttribute(MemorySegment struct, int fieldValue) {
        struct.set(cAttribute$LAYOUT, cAttribute$OFFSET, fieldValue);
    }

    private static final AddressLayout rgAttribute$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgAttribute"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAttribute
     * }
     */
    public static final AddressLayout rgAttribute$layout() {
        return rgAttribute$LAYOUT;
    }

    private static final long rgAttribute$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAttribute
     * }
     */
    public static final long rgAttribute$offset() {
        return rgAttribute$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAttribute
     * }
     */
    public static MemorySegment rgAttribute(MemorySegment struct) {
        return struct.get(rgAttribute$LAYOUT, rgAttribute$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE rgAttribute
     * }
     */
    public static void rgAttribute(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgAttribute$LAYOUT, rgAttribute$OFFSET, fieldValue);
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

