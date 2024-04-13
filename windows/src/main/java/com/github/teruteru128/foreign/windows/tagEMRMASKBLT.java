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
 * struct tagEMRMASKBLT {
 *     EMR emr;
 *     RECTL rclBounds;
 *     LONG xDest;
 *     LONG yDest;
 *     LONG cxDest;
 *     LONG cyDest;
 *     DWORD dwRop;
 *     LONG xSrc;
 *     LONG ySrc;
 *     XFORM xformSrc;
 *     COLORREF crBkColorSrc;
 *     DWORD iUsageSrc;
 *     DWORD offBmiSrc;
 *     DWORD cbBmiSrc;
 *     DWORD offBitsSrc;
 *     DWORD cbBitsSrc;
 *     LONG xMask;
 *     LONG yMask;
 *     DWORD iUsageMask;
 *     DWORD offBmiMask;
 *     DWORD cbBmiMask;
 *     DWORD offBitsMask;
 *     DWORD cbBitsMask;
 * }
 * }
 */
public class tagEMRMASKBLT {

    tagEMRMASKBLT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        _RECTL.layout().withName("rclBounds"),
        Windows_h.C_LONG.withName("xDest"),
        Windows_h.C_LONG.withName("yDest"),
        Windows_h.C_LONG.withName("cxDest"),
        Windows_h.C_LONG.withName("cyDest"),
        Windows_h.C_LONG.withName("dwRop"),
        Windows_h.C_LONG.withName("xSrc"),
        Windows_h.C_LONG.withName("ySrc"),
        tagXFORM.layout().withName("xformSrc"),
        Windows_h.C_LONG.withName("crBkColorSrc"),
        Windows_h.C_LONG.withName("iUsageSrc"),
        Windows_h.C_LONG.withName("offBmiSrc"),
        Windows_h.C_LONG.withName("cbBmiSrc"),
        Windows_h.C_LONG.withName("offBitsSrc"),
        Windows_h.C_LONG.withName("cbBitsSrc"),
        Windows_h.C_LONG.withName("xMask"),
        Windows_h.C_LONG.withName("yMask"),
        Windows_h.C_LONG.withName("iUsageMask"),
        Windows_h.C_LONG.withName("offBmiMask"),
        Windows_h.C_LONG.withName("cbBmiMask"),
        Windows_h.C_LONG.withName("offBitsMask"),
        Windows_h.C_LONG.withName("cbBitsMask")
    ).withName("tagEMRMASKBLT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout emr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final GroupLayout emr$layout() {
        return emr$LAYOUT;
    }

    private static final long emr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final long emr$offset() {
        return emr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static MemorySegment emr(MemorySegment struct) {
        return struct.asSlice(emr$OFFSET, emr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static void emr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emr$OFFSET, emr$LAYOUT.byteSize());
    }

    private static final GroupLayout rclBounds$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rclBounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static final GroupLayout rclBounds$layout() {
        return rclBounds$LAYOUT;
    }

    private static final long rclBounds$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static final long rclBounds$offset() {
        return rclBounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static MemorySegment rclBounds(MemorySegment struct) {
        return struct.asSlice(rclBounds$OFFSET, rclBounds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static void rclBounds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rclBounds$OFFSET, rclBounds$LAYOUT.byteSize());
    }

    private static final OfInt xDest$LAYOUT = (OfInt)$LAYOUT.select(groupElement("xDest"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG xDest
     * }
     */
    public static final OfInt xDest$layout() {
        return xDest$LAYOUT;
    }

    private static final long xDest$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG xDest
     * }
     */
    public static final long xDest$offset() {
        return xDest$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG xDest
     * }
     */
    public static int xDest(MemorySegment struct) {
        return struct.get(xDest$LAYOUT, xDest$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG xDest
     * }
     */
    public static void xDest(MemorySegment struct, int fieldValue) {
        struct.set(xDest$LAYOUT, xDest$OFFSET, fieldValue);
    }

    private static final OfInt yDest$LAYOUT = (OfInt)$LAYOUT.select(groupElement("yDest"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG yDest
     * }
     */
    public static final OfInt yDest$layout() {
        return yDest$LAYOUT;
    }

    private static final long yDest$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG yDest
     * }
     */
    public static final long yDest$offset() {
        return yDest$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG yDest
     * }
     */
    public static int yDest(MemorySegment struct) {
        return struct.get(yDest$LAYOUT, yDest$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG yDest
     * }
     */
    public static void yDest(MemorySegment struct, int fieldValue) {
        struct.set(yDest$LAYOUT, yDest$OFFSET, fieldValue);
    }

    private static final OfInt cxDest$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cxDest"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG cxDest
     * }
     */
    public static final OfInt cxDest$layout() {
        return cxDest$LAYOUT;
    }

    private static final long cxDest$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG cxDest
     * }
     */
    public static final long cxDest$offset() {
        return cxDest$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG cxDest
     * }
     */
    public static int cxDest(MemorySegment struct) {
        return struct.get(cxDest$LAYOUT, cxDest$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG cxDest
     * }
     */
    public static void cxDest(MemorySegment struct, int fieldValue) {
        struct.set(cxDest$LAYOUT, cxDest$OFFSET, fieldValue);
    }

    private static final OfInt cyDest$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cyDest"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG cyDest
     * }
     */
    public static final OfInt cyDest$layout() {
        return cyDest$LAYOUT;
    }

    private static final long cyDest$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG cyDest
     * }
     */
    public static final long cyDest$offset() {
        return cyDest$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG cyDest
     * }
     */
    public static int cyDest(MemorySegment struct) {
        return struct.get(cyDest$LAYOUT, cyDest$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG cyDest
     * }
     */
    public static void cyDest(MemorySegment struct, int fieldValue) {
        struct.set(cyDest$LAYOUT, cyDest$OFFSET, fieldValue);
    }

    private static final OfInt dwRop$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwRop"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwRop
     * }
     */
    public static final OfInt dwRop$layout() {
        return dwRop$LAYOUT;
    }

    private static final long dwRop$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwRop
     * }
     */
    public static final long dwRop$offset() {
        return dwRop$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwRop
     * }
     */
    public static int dwRop(MemorySegment struct) {
        return struct.get(dwRop$LAYOUT, dwRop$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwRop
     * }
     */
    public static void dwRop(MemorySegment struct, int fieldValue) {
        struct.set(dwRop$LAYOUT, dwRop$OFFSET, fieldValue);
    }

    private static final OfInt xSrc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("xSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG xSrc
     * }
     */
    public static final OfInt xSrc$layout() {
        return xSrc$LAYOUT;
    }

    private static final long xSrc$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG xSrc
     * }
     */
    public static final long xSrc$offset() {
        return xSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG xSrc
     * }
     */
    public static int xSrc(MemorySegment struct) {
        return struct.get(xSrc$LAYOUT, xSrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG xSrc
     * }
     */
    public static void xSrc(MemorySegment struct, int fieldValue) {
        struct.set(xSrc$LAYOUT, xSrc$OFFSET, fieldValue);
    }

    private static final OfInt ySrc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ySrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG ySrc
     * }
     */
    public static final OfInt ySrc$layout() {
        return ySrc$LAYOUT;
    }

    private static final long ySrc$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG ySrc
     * }
     */
    public static final long ySrc$offset() {
        return ySrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG ySrc
     * }
     */
    public static int ySrc(MemorySegment struct) {
        return struct.get(ySrc$LAYOUT, ySrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG ySrc
     * }
     */
    public static void ySrc(MemorySegment struct, int fieldValue) {
        struct.set(ySrc$LAYOUT, ySrc$OFFSET, fieldValue);
    }

    private static final GroupLayout xformSrc$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("xformSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XFORM xformSrc
     * }
     */
    public static final GroupLayout xformSrc$layout() {
        return xformSrc$LAYOUT;
    }

    private static final long xformSrc$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XFORM xformSrc
     * }
     */
    public static final long xformSrc$offset() {
        return xformSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XFORM xformSrc
     * }
     */
    public static MemorySegment xformSrc(MemorySegment struct) {
        return struct.asSlice(xformSrc$OFFSET, xformSrc$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XFORM xformSrc
     * }
     */
    public static void xformSrc(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, xformSrc$OFFSET, xformSrc$LAYOUT.byteSize());
    }

    private static final OfInt crBkColorSrc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("crBkColorSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * COLORREF crBkColorSrc
     * }
     */
    public static final OfInt crBkColorSrc$layout() {
        return crBkColorSrc$LAYOUT;
    }

    private static final long crBkColorSrc$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * COLORREF crBkColorSrc
     * }
     */
    public static final long crBkColorSrc$offset() {
        return crBkColorSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * COLORREF crBkColorSrc
     * }
     */
    public static int crBkColorSrc(MemorySegment struct) {
        return struct.get(crBkColorSrc$LAYOUT, crBkColorSrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * COLORREF crBkColorSrc
     * }
     */
    public static void crBkColorSrc(MemorySegment struct, int fieldValue) {
        struct.set(crBkColorSrc$LAYOUT, crBkColorSrc$OFFSET, fieldValue);
    }

    private static final OfInt iUsageSrc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iUsageSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD iUsageSrc
     * }
     */
    public static final OfInt iUsageSrc$layout() {
        return iUsageSrc$LAYOUT;
    }

    private static final long iUsageSrc$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD iUsageSrc
     * }
     */
    public static final long iUsageSrc$offset() {
        return iUsageSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD iUsageSrc
     * }
     */
    public static int iUsageSrc(MemorySegment struct) {
        return struct.get(iUsageSrc$LAYOUT, iUsageSrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD iUsageSrc
     * }
     */
    public static void iUsageSrc(MemorySegment struct, int fieldValue) {
        struct.set(iUsageSrc$LAYOUT, iUsageSrc$OFFSET, fieldValue);
    }

    private static final OfInt offBmiSrc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("offBmiSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD offBmiSrc
     * }
     */
    public static final OfInt offBmiSrc$layout() {
        return offBmiSrc$LAYOUT;
    }

    private static final long offBmiSrc$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD offBmiSrc
     * }
     */
    public static final long offBmiSrc$offset() {
        return offBmiSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD offBmiSrc
     * }
     */
    public static int offBmiSrc(MemorySegment struct) {
        return struct.get(offBmiSrc$LAYOUT, offBmiSrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD offBmiSrc
     * }
     */
    public static void offBmiSrc(MemorySegment struct, int fieldValue) {
        struct.set(offBmiSrc$LAYOUT, offBmiSrc$OFFSET, fieldValue);
    }

    private static final OfInt cbBmiSrc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbBmiSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbBmiSrc
     * }
     */
    public static final OfInt cbBmiSrc$layout() {
        return cbBmiSrc$LAYOUT;
    }

    private static final long cbBmiSrc$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbBmiSrc
     * }
     */
    public static final long cbBmiSrc$offset() {
        return cbBmiSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbBmiSrc
     * }
     */
    public static int cbBmiSrc(MemorySegment struct) {
        return struct.get(cbBmiSrc$LAYOUT, cbBmiSrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbBmiSrc
     * }
     */
    public static void cbBmiSrc(MemorySegment struct, int fieldValue) {
        struct.set(cbBmiSrc$LAYOUT, cbBmiSrc$OFFSET, fieldValue);
    }

    private static final OfInt offBitsSrc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("offBitsSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD offBitsSrc
     * }
     */
    public static final OfInt offBitsSrc$layout() {
        return offBitsSrc$LAYOUT;
    }

    private static final long offBitsSrc$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD offBitsSrc
     * }
     */
    public static final long offBitsSrc$offset() {
        return offBitsSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD offBitsSrc
     * }
     */
    public static int offBitsSrc(MemorySegment struct) {
        return struct.get(offBitsSrc$LAYOUT, offBitsSrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD offBitsSrc
     * }
     */
    public static void offBitsSrc(MemorySegment struct, int fieldValue) {
        struct.set(offBitsSrc$LAYOUT, offBitsSrc$OFFSET, fieldValue);
    }

    private static final OfInt cbBitsSrc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbBitsSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbBitsSrc
     * }
     */
    public static final OfInt cbBitsSrc$layout() {
        return cbBitsSrc$LAYOUT;
    }

    private static final long cbBitsSrc$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbBitsSrc
     * }
     */
    public static final long cbBitsSrc$offset() {
        return cbBitsSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbBitsSrc
     * }
     */
    public static int cbBitsSrc(MemorySegment struct) {
        return struct.get(cbBitsSrc$LAYOUT, cbBitsSrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbBitsSrc
     * }
     */
    public static void cbBitsSrc(MemorySegment struct, int fieldValue) {
        struct.set(cbBitsSrc$LAYOUT, cbBitsSrc$OFFSET, fieldValue);
    }

    private static final OfInt xMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("xMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG xMask
     * }
     */
    public static final OfInt xMask$layout() {
        return xMask$LAYOUT;
    }

    private static final long xMask$OFFSET = 100;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG xMask
     * }
     */
    public static final long xMask$offset() {
        return xMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG xMask
     * }
     */
    public static int xMask(MemorySegment struct) {
        return struct.get(xMask$LAYOUT, xMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG xMask
     * }
     */
    public static void xMask(MemorySegment struct, int fieldValue) {
        struct.set(xMask$LAYOUT, xMask$OFFSET, fieldValue);
    }

    private static final OfInt yMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("yMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG yMask
     * }
     */
    public static final OfInt yMask$layout() {
        return yMask$LAYOUT;
    }

    private static final long yMask$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG yMask
     * }
     */
    public static final long yMask$offset() {
        return yMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG yMask
     * }
     */
    public static int yMask(MemorySegment struct) {
        return struct.get(yMask$LAYOUT, yMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG yMask
     * }
     */
    public static void yMask(MemorySegment struct, int fieldValue) {
        struct.set(yMask$LAYOUT, yMask$OFFSET, fieldValue);
    }

    private static final OfInt iUsageMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iUsageMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD iUsageMask
     * }
     */
    public static final OfInt iUsageMask$layout() {
        return iUsageMask$LAYOUT;
    }

    private static final long iUsageMask$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD iUsageMask
     * }
     */
    public static final long iUsageMask$offset() {
        return iUsageMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD iUsageMask
     * }
     */
    public static int iUsageMask(MemorySegment struct) {
        return struct.get(iUsageMask$LAYOUT, iUsageMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD iUsageMask
     * }
     */
    public static void iUsageMask(MemorySegment struct, int fieldValue) {
        struct.set(iUsageMask$LAYOUT, iUsageMask$OFFSET, fieldValue);
    }

    private static final OfInt offBmiMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("offBmiMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD offBmiMask
     * }
     */
    public static final OfInt offBmiMask$layout() {
        return offBmiMask$LAYOUT;
    }

    private static final long offBmiMask$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD offBmiMask
     * }
     */
    public static final long offBmiMask$offset() {
        return offBmiMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD offBmiMask
     * }
     */
    public static int offBmiMask(MemorySegment struct) {
        return struct.get(offBmiMask$LAYOUT, offBmiMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD offBmiMask
     * }
     */
    public static void offBmiMask(MemorySegment struct, int fieldValue) {
        struct.set(offBmiMask$LAYOUT, offBmiMask$OFFSET, fieldValue);
    }

    private static final OfInt cbBmiMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbBmiMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbBmiMask
     * }
     */
    public static final OfInt cbBmiMask$layout() {
        return cbBmiMask$LAYOUT;
    }

    private static final long cbBmiMask$OFFSET = 116;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbBmiMask
     * }
     */
    public static final long cbBmiMask$offset() {
        return cbBmiMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbBmiMask
     * }
     */
    public static int cbBmiMask(MemorySegment struct) {
        return struct.get(cbBmiMask$LAYOUT, cbBmiMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbBmiMask
     * }
     */
    public static void cbBmiMask(MemorySegment struct, int fieldValue) {
        struct.set(cbBmiMask$LAYOUT, cbBmiMask$OFFSET, fieldValue);
    }

    private static final OfInt offBitsMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("offBitsMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD offBitsMask
     * }
     */
    public static final OfInt offBitsMask$layout() {
        return offBitsMask$LAYOUT;
    }

    private static final long offBitsMask$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD offBitsMask
     * }
     */
    public static final long offBitsMask$offset() {
        return offBitsMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD offBitsMask
     * }
     */
    public static int offBitsMask(MemorySegment struct) {
        return struct.get(offBitsMask$LAYOUT, offBitsMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD offBitsMask
     * }
     */
    public static void offBitsMask(MemorySegment struct, int fieldValue) {
        struct.set(offBitsMask$LAYOUT, offBitsMask$OFFSET, fieldValue);
    }

    private static final OfInt cbBitsMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbBitsMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbBitsMask
     * }
     */
    public static final OfInt cbBitsMask$layout() {
        return cbBitsMask$LAYOUT;
    }

    private static final long cbBitsMask$OFFSET = 124;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbBitsMask
     * }
     */
    public static final long cbBitsMask$offset() {
        return cbBitsMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbBitsMask
     * }
     */
    public static int cbBitsMask(MemorySegment struct) {
        return struct.get(cbBitsMask$LAYOUT, cbBitsMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbBitsMask
     * }
     */
    public static void cbBitsMask(MemorySegment struct, int fieldValue) {
        struct.set(cbBitsMask$LAYOUT, cbBitsMask$OFFSET, fieldValue);
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
