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
 * struct _PKCS12_PBES2_EXPORT_PARAMS {
 *     DWORD dwSize;
 *     PVOID hNcryptDescriptor;
 *     LPWSTR pwszPbes2Alg;
 * }
 * }
 */
public class _PKCS12_PBES2_EXPORT_PARAMS {

    _PKCS12_PBES2_EXPORT_PARAMS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwSize"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hNcryptDescriptor"),
        Windows_h.C_POINTER.withName("pwszPbes2Alg")
    ).withName("_PKCS12_PBES2_EXPORT_PARAMS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final OfInt dwSize$layout() {
        return dwSize$LAYOUT;
    }

    private static final long dwSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static final long dwSize$offset() {
        return dwSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static int dwSize(MemorySegment struct) {
        return struct.get(dwSize$LAYOUT, dwSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSize
     * }
     */
    public static void dwSize(MemorySegment struct, int fieldValue) {
        struct.set(dwSize$LAYOUT, dwSize$OFFSET, fieldValue);
    }

    private static final AddressLayout hNcryptDescriptor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hNcryptDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID hNcryptDescriptor
     * }
     */
    public static final AddressLayout hNcryptDescriptor$layout() {
        return hNcryptDescriptor$LAYOUT;
    }

    private static final long hNcryptDescriptor$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID hNcryptDescriptor
     * }
     */
    public static final long hNcryptDescriptor$offset() {
        return hNcryptDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID hNcryptDescriptor
     * }
     */
    public static MemorySegment hNcryptDescriptor(MemorySegment struct) {
        return struct.get(hNcryptDescriptor$LAYOUT, hNcryptDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID hNcryptDescriptor
     * }
     */
    public static void hNcryptDescriptor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hNcryptDescriptor$LAYOUT, hNcryptDescriptor$OFFSET, fieldValue);
    }

    private static final AddressLayout pwszPbes2Alg$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pwszPbes2Alg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pwszPbes2Alg
     * }
     */
    public static final AddressLayout pwszPbes2Alg$layout() {
        return pwszPbes2Alg$LAYOUT;
    }

    private static final long pwszPbes2Alg$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pwszPbes2Alg
     * }
     */
    public static final long pwszPbes2Alg$offset() {
        return pwszPbes2Alg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pwszPbes2Alg
     * }
     */
    public static MemorySegment pwszPbes2Alg(MemorySegment struct) {
        return struct.get(pwszPbes2Alg$LAYOUT, pwszPbes2Alg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pwszPbes2Alg
     * }
     */
    public static void pwszPbes2Alg(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwszPbes2Alg$LAYOUT, pwszPbes2Alg$OFFSET, fieldValue);
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

