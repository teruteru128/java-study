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
 * struct _CMC_TAGGED_OTHER_MSG {
 *     DWORD dwBodyPartID;
 *     LPSTR pszObjId;
 *     CRYPT_OBJID_BLOB Value;
 * }
 * }
 */
public class _CMC_TAGGED_OTHER_MSG {

    _CMC_TAGGED_OTHER_MSG() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwBodyPartID"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pszObjId"),
        _CRYPTOAPI_BLOB.layout().withName("Value")
    ).withName("_CMC_TAGGED_OTHER_MSG");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwBodyPartID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwBodyPartID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwBodyPartID
     * }
     */
    public static final OfInt dwBodyPartID$layout() {
        return dwBodyPartID$LAYOUT;
    }

    private static final long dwBodyPartID$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwBodyPartID
     * }
     */
    public static final long dwBodyPartID$offset() {
        return dwBodyPartID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwBodyPartID
     * }
     */
    public static int dwBodyPartID(MemorySegment struct) {
        return struct.get(dwBodyPartID$LAYOUT, dwBodyPartID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwBodyPartID
     * }
     */
    public static void dwBodyPartID(MemorySegment struct, int fieldValue) {
        struct.set(dwBodyPartID$LAYOUT, dwBodyPartID$OFFSET, fieldValue);
    }

    private static final AddressLayout pszObjId$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszObjId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pszObjId
     * }
     */
    public static final AddressLayout pszObjId$layout() {
        return pszObjId$LAYOUT;
    }

    private static final long pszObjId$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pszObjId
     * }
     */
    public static final long pszObjId$offset() {
        return pszObjId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pszObjId
     * }
     */
    public static MemorySegment pszObjId(MemorySegment struct) {
        return struct.get(pszObjId$LAYOUT, pszObjId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pszObjId
     * }
     */
    public static void pszObjId(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszObjId$LAYOUT, pszObjId$OFFSET, fieldValue);
    }

    private static final GroupLayout Value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_OBJID_BLOB Value
     * }
     */
    public static final GroupLayout Value$layout() {
        return Value$LAYOUT;
    }

    private static final long Value$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_OBJID_BLOB Value
     * }
     */
    public static final long Value$offset() {
        return Value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_OBJID_BLOB Value
     * }
     */
    public static MemorySegment Value(MemorySegment struct) {
        return struct.asSlice(Value$OFFSET, Value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_OBJID_BLOB Value
     * }
     */
    public static void Value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Value$OFFSET, Value$LAYOUT.byteSize());
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

