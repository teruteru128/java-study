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
 * struct _numberfmtW {
 *     UINT NumDigits;
 *     UINT LeadingZero;
 *     UINT Grouping;
 *     LPWSTR lpDecimalSep;
 *     LPWSTR lpThousandSep;
 *     UINT NegativeOrder;
 * }
 * }
 */
public class _numberfmtW {

    _numberfmtW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_INT.withName("NumDigits"),
        Windows_h.C_INT.withName("LeadingZero"),
        Windows_h.C_INT.withName("Grouping"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("lpDecimalSep"),
        Windows_h.C_POINTER.withName("lpThousandSep"),
        Windows_h.C_INT.withName("NegativeOrder"),
        MemoryLayout.paddingLayout(4)
    ).withName("_numberfmtW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NumDigits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumDigits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT NumDigits
     * }
     */
    public static final OfInt NumDigits$layout() {
        return NumDigits$LAYOUT;
    }

    private static final long NumDigits$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT NumDigits
     * }
     */
    public static final long NumDigits$offset() {
        return NumDigits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT NumDigits
     * }
     */
    public static int NumDigits(MemorySegment struct) {
        return struct.get(NumDigits$LAYOUT, NumDigits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT NumDigits
     * }
     */
    public static void NumDigits(MemorySegment struct, int fieldValue) {
        struct.set(NumDigits$LAYOUT, NumDigits$OFFSET, fieldValue);
    }

    private static final OfInt LeadingZero$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LeadingZero"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT LeadingZero
     * }
     */
    public static final OfInt LeadingZero$layout() {
        return LeadingZero$LAYOUT;
    }

    private static final long LeadingZero$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT LeadingZero
     * }
     */
    public static final long LeadingZero$offset() {
        return LeadingZero$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT LeadingZero
     * }
     */
    public static int LeadingZero(MemorySegment struct) {
        return struct.get(LeadingZero$LAYOUT, LeadingZero$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT LeadingZero
     * }
     */
    public static void LeadingZero(MemorySegment struct, int fieldValue) {
        struct.set(LeadingZero$LAYOUT, LeadingZero$OFFSET, fieldValue);
    }

    private static final OfInt Grouping$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Grouping"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT Grouping
     * }
     */
    public static final OfInt Grouping$layout() {
        return Grouping$LAYOUT;
    }

    private static final long Grouping$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT Grouping
     * }
     */
    public static final long Grouping$offset() {
        return Grouping$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT Grouping
     * }
     */
    public static int Grouping(MemorySegment struct) {
        return struct.get(Grouping$LAYOUT, Grouping$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT Grouping
     * }
     */
    public static void Grouping(MemorySegment struct, int fieldValue) {
        struct.set(Grouping$LAYOUT, Grouping$OFFSET, fieldValue);
    }

    private static final AddressLayout lpDecimalSep$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpDecimalSep"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpDecimalSep
     * }
     */
    public static final AddressLayout lpDecimalSep$layout() {
        return lpDecimalSep$LAYOUT;
    }

    private static final long lpDecimalSep$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpDecimalSep
     * }
     */
    public static final long lpDecimalSep$offset() {
        return lpDecimalSep$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpDecimalSep
     * }
     */
    public static MemorySegment lpDecimalSep(MemorySegment struct) {
        return struct.get(lpDecimalSep$LAYOUT, lpDecimalSep$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpDecimalSep
     * }
     */
    public static void lpDecimalSep(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpDecimalSep$LAYOUT, lpDecimalSep$OFFSET, fieldValue);
    }

    private static final AddressLayout lpThousandSep$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpThousandSep"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpThousandSep
     * }
     */
    public static final AddressLayout lpThousandSep$layout() {
        return lpThousandSep$LAYOUT;
    }

    private static final long lpThousandSep$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpThousandSep
     * }
     */
    public static final long lpThousandSep$offset() {
        return lpThousandSep$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpThousandSep
     * }
     */
    public static MemorySegment lpThousandSep(MemorySegment struct) {
        return struct.get(lpThousandSep$LAYOUT, lpThousandSep$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpThousandSep
     * }
     */
    public static void lpThousandSep(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpThousandSep$LAYOUT, lpThousandSep$OFFSET, fieldValue);
    }

    private static final OfInt NegativeOrder$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NegativeOrder"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT NegativeOrder
     * }
     */
    public static final OfInt NegativeOrder$layout() {
        return NegativeOrder$LAYOUT;
    }

    private static final long NegativeOrder$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT NegativeOrder
     * }
     */
    public static final long NegativeOrder$offset() {
        return NegativeOrder$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT NegativeOrder
     * }
     */
    public static int NegativeOrder(MemorySegment struct) {
        return struct.get(NegativeOrder$LAYOUT, NegativeOrder$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT NegativeOrder
     * }
     */
    public static void NegativeOrder(MemorySegment struct, int fieldValue) {
        struct.set(NegativeOrder$LAYOUT, NegativeOrder$OFFSET, fieldValue);
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
