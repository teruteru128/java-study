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
 * struct _PRINTER_INFO_4W {
 *     LPWSTR pPrinterName;
 *     LPWSTR pServerName;
 *     DWORD Attributes;
 * }
 * }
 */
public class _PRINTER_INFO_4W {

    _PRINTER_INFO_4W() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("pPrinterName"),
        Windows_h.C_POINTER.withName("pServerName"),
        Windows_h.C_LONG.withName("Attributes"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PRINTER_INFO_4W");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pPrinterName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pPrinterName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static final AddressLayout pPrinterName$layout() {
        return pPrinterName$LAYOUT;
    }

    private static final long pPrinterName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static final long pPrinterName$offset() {
        return pPrinterName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static MemorySegment pPrinterName(MemorySegment struct) {
        return struct.get(pPrinterName$LAYOUT, pPrinterName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pPrinterName
     * }
     */
    public static void pPrinterName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pPrinterName$LAYOUT, pPrinterName$OFFSET, fieldValue);
    }

    private static final AddressLayout pServerName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pServerName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pServerName
     * }
     */
    public static final AddressLayout pServerName$layout() {
        return pServerName$LAYOUT;
    }

    private static final long pServerName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pServerName
     * }
     */
    public static final long pServerName$offset() {
        return pServerName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pServerName
     * }
     */
    public static MemorySegment pServerName(MemorySegment struct) {
        return struct.get(pServerName$LAYOUT, pServerName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pServerName
     * }
     */
    public static void pServerName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pServerName$LAYOUT, pServerName$OFFSET, fieldValue);
    }

    private static final OfInt Attributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Attributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static final OfInt Attributes$layout() {
        return Attributes$LAYOUT;
    }

    private static final long Attributes$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static final long Attributes$offset() {
        return Attributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static int Attributes(MemorySegment struct) {
        return struct.get(Attributes$LAYOUT, Attributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Attributes
     * }
     */
    public static void Attributes(MemorySegment struct, int fieldValue) {
        struct.set(Attributes$LAYOUT, Attributes$OFFSET, fieldValue);
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

