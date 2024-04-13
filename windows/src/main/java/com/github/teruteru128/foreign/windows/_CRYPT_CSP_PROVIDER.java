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
 * struct _CRYPT_CSP_PROVIDER {
 *     DWORD dwKeySpec;
 *     LPWSTR pwszProviderName;
 *     CRYPT_BIT_BLOB Signature;
 * }
 * }
 */
public class _CRYPT_CSP_PROVIDER {

    _CRYPT_CSP_PROVIDER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwKeySpec"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pwszProviderName"),
        _CRYPT_BIT_BLOB.layout().withName("Signature")
    ).withName("_CRYPT_CSP_PROVIDER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwKeySpec$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwKeySpec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwKeySpec
     * }
     */
    public static final OfInt dwKeySpec$layout() {
        return dwKeySpec$LAYOUT;
    }

    private static final long dwKeySpec$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwKeySpec
     * }
     */
    public static final long dwKeySpec$offset() {
        return dwKeySpec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwKeySpec
     * }
     */
    public static int dwKeySpec(MemorySegment struct) {
        return struct.get(dwKeySpec$LAYOUT, dwKeySpec$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwKeySpec
     * }
     */
    public static void dwKeySpec(MemorySegment struct, int fieldValue) {
        struct.set(dwKeySpec$LAYOUT, dwKeySpec$OFFSET, fieldValue);
    }

    private static final AddressLayout pwszProviderName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pwszProviderName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pwszProviderName
     * }
     */
    public static final AddressLayout pwszProviderName$layout() {
        return pwszProviderName$LAYOUT;
    }

    private static final long pwszProviderName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pwszProviderName
     * }
     */
    public static final long pwszProviderName$offset() {
        return pwszProviderName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pwszProviderName
     * }
     */
    public static MemorySegment pwszProviderName(MemorySegment struct) {
        return struct.get(pwszProviderName$LAYOUT, pwszProviderName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pwszProviderName
     * }
     */
    public static void pwszProviderName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwszProviderName$LAYOUT, pwszProviderName$OFFSET, fieldValue);
    }

    private static final GroupLayout Signature$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Signature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB Signature
     * }
     */
    public static final GroupLayout Signature$layout() {
        return Signature$LAYOUT;
    }

    private static final long Signature$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB Signature
     * }
     */
    public static final long Signature$offset() {
        return Signature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB Signature
     * }
     */
    public static MemorySegment Signature(MemorySegment struct) {
        return struct.asSlice(Signature$OFFSET, Signature$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB Signature
     * }
     */
    public static void Signature(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Signature$OFFSET, Signature$LAYOUT.byteSize());
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
