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
 * struct tagPSDA {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HGLOBAL hDevMode;
 *     HGLOBAL hDevNames;
 *     DWORD Flags;
 *     POINT ptPaperSize;
 *     RECT rtMinMargin;
 *     RECT rtMargin;
 *     HINSTANCE hInstance;
 *     LPARAM lCustData;
 *     LPPAGESETUPHOOK lpfnPageSetupHook;
 *     LPPAGEPAINTHOOK lpfnPagePaintHook;
 *     LPCSTR lpPageSetupTemplateName;
 *     HGLOBAL hPageSetupTemplate;
 * }
 * }
 */
public class tagPSDA {

    tagPSDA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_LONG.withName("lStructSize"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hwndOwner"),
        Windows_h.C_POINTER.withName("hDevMode"),
        Windows_h.C_POINTER.withName("hDevNames"),
        Windows_h.C_LONG.withName("Flags"),
        tagPOINT.layout().withName("ptPaperSize"),
        tagRECT.layout().withName("rtMinMargin"),
        tagRECT.layout().withName("rtMargin"),
        MemoryLayout.paddingLayout(4),
        Windows_h.C_POINTER.withName("hInstance"),
        Windows_h.C_LONG_LONG.withName("lCustData"),
        Windows_h.C_POINTER.withName("lpfnPageSetupHook"),
        Windows_h.C_POINTER.withName("lpfnPagePaintHook"),
        Windows_h.C_POINTER.withName("lpPageSetupTemplateName"),
        Windows_h.C_POINTER.withName("hPageSetupTemplate")
    ).withName("tagPSDA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt lStructSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lStructSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static final OfInt lStructSize$layout() {
        return lStructSize$LAYOUT;
    }

    private static final long lStructSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static final long lStructSize$offset() {
        return lStructSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static int lStructSize(MemorySegment struct) {
        return struct.get(lStructSize$LAYOUT, lStructSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static void lStructSize(MemorySegment struct, int fieldValue) {
        struct.set(lStructSize$LAYOUT, lStructSize$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndOwner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndOwner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static final AddressLayout hwndOwner$layout() {
        return hwndOwner$LAYOUT;
    }

    private static final long hwndOwner$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static final long hwndOwner$offset() {
        return hwndOwner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static MemorySegment hwndOwner(MemorySegment struct) {
        return struct.get(hwndOwner$LAYOUT, hwndOwner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static void hwndOwner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndOwner$LAYOUT, hwndOwner$OFFSET, fieldValue);
    }

    private static final AddressLayout hDevMode$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hDevMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HGLOBAL hDevMode
     * }
     */
    public static final AddressLayout hDevMode$layout() {
        return hDevMode$LAYOUT;
    }

    private static final long hDevMode$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HGLOBAL hDevMode
     * }
     */
    public static final long hDevMode$offset() {
        return hDevMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HGLOBAL hDevMode
     * }
     */
    public static MemorySegment hDevMode(MemorySegment struct) {
        return struct.get(hDevMode$LAYOUT, hDevMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HGLOBAL hDevMode
     * }
     */
    public static void hDevMode(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hDevMode$LAYOUT, hDevMode$OFFSET, fieldValue);
    }

    private static final AddressLayout hDevNames$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hDevNames"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HGLOBAL hDevNames
     * }
     */
    public static final AddressLayout hDevNames$layout() {
        return hDevNames$LAYOUT;
    }

    private static final long hDevNames$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HGLOBAL hDevNames
     * }
     */
    public static final long hDevNames$offset() {
        return hDevNames$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HGLOBAL hDevNames
     * }
     */
    public static MemorySegment hDevNames(MemorySegment struct) {
        return struct.get(hDevNames$LAYOUT, hDevNames$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HGLOBAL hDevNames
     * }
     */
    public static void hDevNames(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hDevNames$LAYOUT, hDevNames$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final GroupLayout ptPaperSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptPaperSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINT ptPaperSize
     * }
     */
    public static final GroupLayout ptPaperSize$layout() {
        return ptPaperSize$LAYOUT;
    }

    private static final long ptPaperSize$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINT ptPaperSize
     * }
     */
    public static final long ptPaperSize$offset() {
        return ptPaperSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINT ptPaperSize
     * }
     */
    public static MemorySegment ptPaperSize(MemorySegment struct) {
        return struct.asSlice(ptPaperSize$OFFSET, ptPaperSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINT ptPaperSize
     * }
     */
    public static void ptPaperSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptPaperSize$OFFSET, ptPaperSize$LAYOUT.byteSize());
    }

    private static final GroupLayout rtMinMargin$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rtMinMargin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rtMinMargin
     * }
     */
    public static final GroupLayout rtMinMargin$layout() {
        return rtMinMargin$LAYOUT;
    }

    private static final long rtMinMargin$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rtMinMargin
     * }
     */
    public static final long rtMinMargin$offset() {
        return rtMinMargin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rtMinMargin
     * }
     */
    public static MemorySegment rtMinMargin(MemorySegment struct) {
        return struct.asSlice(rtMinMargin$OFFSET, rtMinMargin$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rtMinMargin
     * }
     */
    public static void rtMinMargin(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rtMinMargin$OFFSET, rtMinMargin$LAYOUT.byteSize());
    }

    private static final GroupLayout rtMargin$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rtMargin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECT rtMargin
     * }
     */
    public static final GroupLayout rtMargin$layout() {
        return rtMargin$LAYOUT;
    }

    private static final long rtMargin$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECT rtMargin
     * }
     */
    public static final long rtMargin$offset() {
        return rtMargin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECT rtMargin
     * }
     */
    public static MemorySegment rtMargin(MemorySegment struct) {
        return struct.asSlice(rtMargin$OFFSET, rtMargin$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECT rtMargin
     * }
     */
    public static void rtMargin(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rtMargin$OFFSET, rtMargin$LAYOUT.byteSize());
    }

    private static final AddressLayout hInstance$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static final AddressLayout hInstance$layout() {
        return hInstance$LAYOUT;
    }

    private static final long hInstance$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static final long hInstance$offset() {
        return hInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static MemorySegment hInstance(MemorySegment struct) {
        return struct.get(hInstance$LAYOUT, hInstance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static void hInstance(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hInstance$LAYOUT, hInstance$OFFSET, fieldValue);
    }

    private static final OfLong lCustData$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lCustData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static final OfLong lCustData$layout() {
        return lCustData$LAYOUT;
    }

    private static final long lCustData$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static final long lCustData$offset() {
        return lCustData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static long lCustData(MemorySegment struct) {
        return struct.get(lCustData$LAYOUT, lCustData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static void lCustData(MemorySegment struct, long fieldValue) {
        struct.set(lCustData$LAYOUT, lCustData$OFFSET, fieldValue);
    }

    private static final AddressLayout lpfnPageSetupHook$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfnPageSetupHook"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPPAGESETUPHOOK lpfnPageSetupHook
     * }
     */
    public static final AddressLayout lpfnPageSetupHook$layout() {
        return lpfnPageSetupHook$LAYOUT;
    }

    private static final long lpfnPageSetupHook$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPPAGESETUPHOOK lpfnPageSetupHook
     * }
     */
    public static final long lpfnPageSetupHook$offset() {
        return lpfnPageSetupHook$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPPAGESETUPHOOK lpfnPageSetupHook
     * }
     */
    public static MemorySegment lpfnPageSetupHook(MemorySegment struct) {
        return struct.get(lpfnPageSetupHook$LAYOUT, lpfnPageSetupHook$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPPAGESETUPHOOK lpfnPageSetupHook
     * }
     */
    public static void lpfnPageSetupHook(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpfnPageSetupHook$LAYOUT, lpfnPageSetupHook$OFFSET, fieldValue);
    }

    private static final AddressLayout lpfnPagePaintHook$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfnPagePaintHook"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPPAGEPAINTHOOK lpfnPagePaintHook
     * }
     */
    public static final AddressLayout lpfnPagePaintHook$layout() {
        return lpfnPagePaintHook$LAYOUT;
    }

    private static final long lpfnPagePaintHook$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPPAGEPAINTHOOK lpfnPagePaintHook
     * }
     */
    public static final long lpfnPagePaintHook$offset() {
        return lpfnPagePaintHook$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPPAGEPAINTHOOK lpfnPagePaintHook
     * }
     */
    public static MemorySegment lpfnPagePaintHook(MemorySegment struct) {
        return struct.get(lpfnPagePaintHook$LAYOUT, lpfnPagePaintHook$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPPAGEPAINTHOOK lpfnPagePaintHook
     * }
     */
    public static void lpfnPagePaintHook(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpfnPagePaintHook$LAYOUT, lpfnPagePaintHook$OFFSET, fieldValue);
    }

    private static final AddressLayout lpPageSetupTemplateName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpPageSetupTemplateName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpPageSetupTemplateName
     * }
     */
    public static final AddressLayout lpPageSetupTemplateName$layout() {
        return lpPageSetupTemplateName$LAYOUT;
    }

    private static final long lpPageSetupTemplateName$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpPageSetupTemplateName
     * }
     */
    public static final long lpPageSetupTemplateName$offset() {
        return lpPageSetupTemplateName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpPageSetupTemplateName
     * }
     */
    public static MemorySegment lpPageSetupTemplateName(MemorySegment struct) {
        return struct.get(lpPageSetupTemplateName$LAYOUT, lpPageSetupTemplateName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpPageSetupTemplateName
     * }
     */
    public static void lpPageSetupTemplateName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpPageSetupTemplateName$LAYOUT, lpPageSetupTemplateName$OFFSET, fieldValue);
    }

    private static final AddressLayout hPageSetupTemplate$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hPageSetupTemplate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HGLOBAL hPageSetupTemplate
     * }
     */
    public static final AddressLayout hPageSetupTemplate$layout() {
        return hPageSetupTemplate$LAYOUT;
    }

    private static final long hPageSetupTemplate$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HGLOBAL hPageSetupTemplate
     * }
     */
    public static final long hPageSetupTemplate$offset() {
        return hPageSetupTemplate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HGLOBAL hPageSetupTemplate
     * }
     */
    public static MemorySegment hPageSetupTemplate(MemorySegment struct) {
        return struct.get(hPageSetupTemplate$LAYOUT, hPageSetupTemplate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HGLOBAL hPageSetupTemplate
     * }
     */
    public static void hPageSetupTemplate(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hPageSetupTemplate$LAYOUT, hPageSetupTemplate$OFFSET, fieldValue);
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

