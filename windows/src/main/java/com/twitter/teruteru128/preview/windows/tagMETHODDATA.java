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
 * struct tagMETHODDATA {
 *     OLECHAR *szName;
 *     PARAMDATA *ppdata;
 *     DISPID dispid;
 *     UINT iMeth;
 *     CALLCONV cc;
 *     UINT cArgs;
 *     WORD wFlags;
 *     VARTYPE vtReturn;
 * }
 * }
 */
public class tagMETHODDATA {

    tagMETHODDATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_POINTER.withName("szName"),
        Windows_h.C_POINTER.withName("ppdata"),
        Windows_h.C_LONG.withName("dispid"),
        Windows_h.C_INT.withName("iMeth"),
        Windows_h.C_INT.withName("cc"),
        Windows_h.C_INT.withName("cArgs"),
        Windows_h.C_SHORT.withName("wFlags"),
        Windows_h.C_SHORT.withName("vtReturn"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagMETHODDATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout szName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("szName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * OLECHAR *szName
     * }
     */
    public static final AddressLayout szName$layout() {
        return szName$LAYOUT;
    }

    private static final long szName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * OLECHAR *szName
     * }
     */
    public static final long szName$offset() {
        return szName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * OLECHAR *szName
     * }
     */
    public static MemorySegment szName(MemorySegment struct) {
        return struct.get(szName$LAYOUT, szName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * OLECHAR *szName
     * }
     */
    public static void szName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(szName$LAYOUT, szName$OFFSET, fieldValue);
    }

    private static final AddressLayout ppdata$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ppdata"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PARAMDATA *ppdata
     * }
     */
    public static final AddressLayout ppdata$layout() {
        return ppdata$LAYOUT;
    }

    private static final long ppdata$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PARAMDATA *ppdata
     * }
     */
    public static final long ppdata$offset() {
        return ppdata$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PARAMDATA *ppdata
     * }
     */
    public static MemorySegment ppdata(MemorySegment struct) {
        return struct.get(ppdata$LAYOUT, ppdata$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PARAMDATA *ppdata
     * }
     */
    public static void ppdata(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ppdata$LAYOUT, ppdata$OFFSET, fieldValue);
    }

    private static final OfInt dispid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dispid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPID dispid
     * }
     */
    public static final OfInt dispid$layout() {
        return dispid$LAYOUT;
    }

    private static final long dispid$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPID dispid
     * }
     */
    public static final long dispid$offset() {
        return dispid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPID dispid
     * }
     */
    public static int dispid(MemorySegment struct) {
        return struct.get(dispid$LAYOUT, dispid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPID dispid
     * }
     */
    public static void dispid(MemorySegment struct, int fieldValue) {
        struct.set(dispid$LAYOUT, dispid$OFFSET, fieldValue);
    }

    private static final OfInt iMeth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iMeth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT iMeth
     * }
     */
    public static final OfInt iMeth$layout() {
        return iMeth$LAYOUT;
    }

    private static final long iMeth$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT iMeth
     * }
     */
    public static final long iMeth$offset() {
        return iMeth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT iMeth
     * }
     */
    public static int iMeth(MemorySegment struct) {
        return struct.get(iMeth$LAYOUT, iMeth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT iMeth
     * }
     */
    public static void iMeth(MemorySegment struct, int fieldValue) {
        struct.set(iMeth$LAYOUT, iMeth$OFFSET, fieldValue);
    }

    private static final OfInt cc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CALLCONV cc
     * }
     */
    public static final OfInt cc$layout() {
        return cc$LAYOUT;
    }

    private static final long cc$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CALLCONV cc
     * }
     */
    public static final long cc$offset() {
        return cc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CALLCONV cc
     * }
     */
    public static int cc(MemorySegment struct) {
        return struct.get(cc$LAYOUT, cc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CALLCONV cc
     * }
     */
    public static void cc(MemorySegment struct, int fieldValue) {
        struct.set(cc$LAYOUT, cc$OFFSET, fieldValue);
    }

    private static final OfInt cArgs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cArgs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT cArgs
     * }
     */
    public static final OfInt cArgs$layout() {
        return cArgs$LAYOUT;
    }

    private static final long cArgs$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT cArgs
     * }
     */
    public static final long cArgs$offset() {
        return cArgs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT cArgs
     * }
     */
    public static int cArgs(MemorySegment struct) {
        return struct.get(cArgs$LAYOUT, cArgs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT cArgs
     * }
     */
    public static void cArgs(MemorySegment struct, int fieldValue) {
        struct.set(cArgs$LAYOUT, cArgs$OFFSET, fieldValue);
    }

    private static final OfShort wFlags$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wFlags
     * }
     */
    public static final OfShort wFlags$layout() {
        return wFlags$LAYOUT;
    }

    private static final long wFlags$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wFlags
     * }
     */
    public static final long wFlags$offset() {
        return wFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wFlags
     * }
     */
    public static short wFlags(MemorySegment struct) {
        return struct.get(wFlags$LAYOUT, wFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wFlags
     * }
     */
    public static void wFlags(MemorySegment struct, short fieldValue) {
        struct.set(wFlags$LAYOUT, wFlags$OFFSET, fieldValue);
    }

    private static final OfShort vtReturn$LAYOUT = (OfShort)$LAYOUT.select(groupElement("vtReturn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * VARTYPE vtReturn
     * }
     */
    public static final OfShort vtReturn$layout() {
        return vtReturn$LAYOUT;
    }

    private static final long vtReturn$OFFSET = 34;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * VARTYPE vtReturn
     * }
     */
    public static final long vtReturn$offset() {
        return vtReturn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * VARTYPE vtReturn
     * }
     */
    public static short vtReturn(MemorySegment struct) {
        return struct.get(vtReturn$LAYOUT, vtReturn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * VARTYPE vtReturn
     * }
     */
    public static void vtReturn(MemorySegment struct, short fieldValue) {
        struct.set(vtReturn$LAYOUT, vtReturn$OFFSET, fieldValue);
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

