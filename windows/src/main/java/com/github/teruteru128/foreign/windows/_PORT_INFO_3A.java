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
 * struct _PORT_INFO_3A {
 *     DWORD dwStatus;
 *     LPSTR pszStatus;
 *     DWORD dwSeverity;
 * }
 * }
 */
public class _PORT_INFO_3A {

    _PORT_INFO_3A() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("dwStatus"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("pszStatus"),
        Windows_h.C_LONG.withName("dwSeverity"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PORT_INFO_3A");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwStatus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStatus
     * }
     */
    public static final OfInt dwStatus$layout() {
        return dwStatus$LAYOUT;
    }

    private static final long dwStatus$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStatus
     * }
     */
    public static final long dwStatus$offset() {
        return dwStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStatus
     * }
     */
    public static int dwStatus(MemorySegment struct) {
        return struct.get(dwStatus$LAYOUT, dwStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStatus
     * }
     */
    public static void dwStatus(MemorySegment struct, int fieldValue) {
        struct.set(dwStatus$LAYOUT, dwStatus$OFFSET, fieldValue);
    }

    private static final AddressLayout pszStatus$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pszStatus
     * }
     */
    public static final AddressLayout pszStatus$layout() {
        return pszStatus$LAYOUT;
    }

    private static final long pszStatus$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pszStatus
     * }
     */
    public static final long pszStatus$offset() {
        return pszStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pszStatus
     * }
     */
    public static MemorySegment pszStatus(MemorySegment struct) {
        return struct.get(pszStatus$LAYOUT, pszStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pszStatus
     * }
     */
    public static void pszStatus(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszStatus$LAYOUT, pszStatus$OFFSET, fieldValue);
    }

    private static final OfInt dwSeverity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSeverity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSeverity
     * }
     */
    public static final OfInt dwSeverity$layout() {
        return dwSeverity$LAYOUT;
    }

    private static final long dwSeverity$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSeverity
     * }
     */
    public static final long dwSeverity$offset() {
        return dwSeverity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSeverity
     * }
     */
    public static int dwSeverity(MemorySegment struct) {
        return struct.get(dwSeverity$LAYOUT, dwSeverity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSeverity
     * }
     */
    public static void dwSeverity(MemorySegment struct, int fieldValue) {
        struct.set(dwSeverity$LAYOUT, dwSeverity$OFFSET, fieldValue);
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
