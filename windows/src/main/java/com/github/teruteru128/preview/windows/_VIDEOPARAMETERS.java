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
 * struct _VIDEOPARAMETERS {
 *     GUID Guid;
 *     ULONG dwOffset;
 *     ULONG dwCommand;
 *     ULONG dwFlags;
 *     ULONG dwMode;
 *     ULONG dwTVStandard;
 *     ULONG dwAvailableModes;
 *     ULONG dwAvailableTVStandard;
 *     ULONG dwFlickerFilter;
 *     ULONG dwOverScanX;
 *     ULONG dwOverScanY;
 *     ULONG dwMaxUnscaledX;
 *     ULONG dwMaxUnscaledY;
 *     ULONG dwPositionX;
 *     ULONG dwPositionY;
 *     ULONG dwBrightness;
 *     ULONG dwContrast;
 *     ULONG dwCPType;
 *     ULONG dwCPCommand;
 *     ULONG dwCPStandard;
 *     ULONG dwCPKey;
 *     ULONG bCP_APSTriggerBits;
 *     UCHAR bOEMCopyProtection[256];
 * }
 * }
 */
public class _VIDEOPARAMETERS {

    _VIDEOPARAMETERS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GUID.layout().withName("Guid"),
        Windows_h.C_LONG.withName("dwOffset"),
        Windows_h.C_LONG.withName("dwCommand"),
        Windows_h.C_LONG.withName("dwFlags"),
        Windows_h.C_LONG.withName("dwMode"),
        Windows_h.C_LONG.withName("dwTVStandard"),
        Windows_h.C_LONG.withName("dwAvailableModes"),
        Windows_h.C_LONG.withName("dwAvailableTVStandard"),
        Windows_h.C_LONG.withName("dwFlickerFilter"),
        Windows_h.C_LONG.withName("dwOverScanX"),
        Windows_h.C_LONG.withName("dwOverScanY"),
        Windows_h.C_LONG.withName("dwMaxUnscaledX"),
        Windows_h.C_LONG.withName("dwMaxUnscaledY"),
        Windows_h.C_LONG.withName("dwPositionX"),
        Windows_h.C_LONG.withName("dwPositionY"),
        Windows_h.C_LONG.withName("dwBrightness"),
        Windows_h.C_LONG.withName("dwContrast"),
        Windows_h.C_LONG.withName("dwCPType"),
        Windows_h.C_LONG.withName("dwCPCommand"),
        Windows_h.C_LONG.withName("dwCPStandard"),
        Windows_h.C_LONG.withName("dwCPKey"),
        Windows_h.C_LONG.withName("bCP_APSTriggerBits"),
        MemoryLayout.sequenceLayout(256, Windows_h.C_CHAR).withName("bOEMCopyProtection")
    ).withName("_VIDEOPARAMETERS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout Guid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Guid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID Guid
     * }
     */
    public static final GroupLayout Guid$layout() {
        return Guid$LAYOUT;
    }

    private static final long Guid$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID Guid
     * }
     */
    public static final long Guid$offset() {
        return Guid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID Guid
     * }
     */
    public static MemorySegment Guid(MemorySegment struct) {
        return struct.asSlice(Guid$OFFSET, Guid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID Guid
     * }
     */
    public static void Guid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Guid$OFFSET, Guid$LAYOUT.byteSize());
    }

    private static final OfInt dwOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwOffset
     * }
     */
    public static final OfInt dwOffset$layout() {
        return dwOffset$LAYOUT;
    }

    private static final long dwOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwOffset
     * }
     */
    public static final long dwOffset$offset() {
        return dwOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwOffset
     * }
     */
    public static int dwOffset(MemorySegment struct) {
        return struct.get(dwOffset$LAYOUT, dwOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwOffset
     * }
     */
    public static void dwOffset(MemorySegment struct, int fieldValue) {
        struct.set(dwOffset$LAYOUT, dwOffset$OFFSET, fieldValue);
    }

    private static final OfInt dwCommand$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCommand"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwCommand
     * }
     */
    public static final OfInt dwCommand$layout() {
        return dwCommand$LAYOUT;
    }

    private static final long dwCommand$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwCommand
     * }
     */
    public static final long dwCommand$offset() {
        return dwCommand$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwCommand
     * }
     */
    public static int dwCommand(MemorySegment struct) {
        return struct.get(dwCommand$LAYOUT, dwCommand$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwCommand
     * }
     */
    public static void dwCommand(MemorySegment struct, int fieldValue) {
        struct.set(dwCommand$LAYOUT, dwCommand$OFFSET, fieldValue);
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final OfInt dwMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwMode
     * }
     */
    public static final OfInt dwMode$layout() {
        return dwMode$LAYOUT;
    }

    private static final long dwMode$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwMode
     * }
     */
    public static final long dwMode$offset() {
        return dwMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwMode
     * }
     */
    public static int dwMode(MemorySegment struct) {
        return struct.get(dwMode$LAYOUT, dwMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwMode
     * }
     */
    public static void dwMode(MemorySegment struct, int fieldValue) {
        struct.set(dwMode$LAYOUT, dwMode$OFFSET, fieldValue);
    }

    private static final OfInt dwTVStandard$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwTVStandard"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwTVStandard
     * }
     */
    public static final OfInt dwTVStandard$layout() {
        return dwTVStandard$LAYOUT;
    }

    private static final long dwTVStandard$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwTVStandard
     * }
     */
    public static final long dwTVStandard$offset() {
        return dwTVStandard$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwTVStandard
     * }
     */
    public static int dwTVStandard(MemorySegment struct) {
        return struct.get(dwTVStandard$LAYOUT, dwTVStandard$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwTVStandard
     * }
     */
    public static void dwTVStandard(MemorySegment struct, int fieldValue) {
        struct.set(dwTVStandard$LAYOUT, dwTVStandard$OFFSET, fieldValue);
    }

    private static final OfInt dwAvailableModes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwAvailableModes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwAvailableModes
     * }
     */
    public static final OfInt dwAvailableModes$layout() {
        return dwAvailableModes$LAYOUT;
    }

    private static final long dwAvailableModes$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwAvailableModes
     * }
     */
    public static final long dwAvailableModes$offset() {
        return dwAvailableModes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwAvailableModes
     * }
     */
    public static int dwAvailableModes(MemorySegment struct) {
        return struct.get(dwAvailableModes$LAYOUT, dwAvailableModes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwAvailableModes
     * }
     */
    public static void dwAvailableModes(MemorySegment struct, int fieldValue) {
        struct.set(dwAvailableModes$LAYOUT, dwAvailableModes$OFFSET, fieldValue);
    }

    private static final OfInt dwAvailableTVStandard$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwAvailableTVStandard"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwAvailableTVStandard
     * }
     */
    public static final OfInt dwAvailableTVStandard$layout() {
        return dwAvailableTVStandard$LAYOUT;
    }

    private static final long dwAvailableTVStandard$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwAvailableTVStandard
     * }
     */
    public static final long dwAvailableTVStandard$offset() {
        return dwAvailableTVStandard$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwAvailableTVStandard
     * }
     */
    public static int dwAvailableTVStandard(MemorySegment struct) {
        return struct.get(dwAvailableTVStandard$LAYOUT, dwAvailableTVStandard$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwAvailableTVStandard
     * }
     */
    public static void dwAvailableTVStandard(MemorySegment struct, int fieldValue) {
        struct.set(dwAvailableTVStandard$LAYOUT, dwAvailableTVStandard$OFFSET, fieldValue);
    }

    private static final OfInt dwFlickerFilter$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlickerFilter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwFlickerFilter
     * }
     */
    public static final OfInt dwFlickerFilter$layout() {
        return dwFlickerFilter$LAYOUT;
    }

    private static final long dwFlickerFilter$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwFlickerFilter
     * }
     */
    public static final long dwFlickerFilter$offset() {
        return dwFlickerFilter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwFlickerFilter
     * }
     */
    public static int dwFlickerFilter(MemorySegment struct) {
        return struct.get(dwFlickerFilter$LAYOUT, dwFlickerFilter$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwFlickerFilter
     * }
     */
    public static void dwFlickerFilter(MemorySegment struct, int fieldValue) {
        struct.set(dwFlickerFilter$LAYOUT, dwFlickerFilter$OFFSET, fieldValue);
    }

    private static final OfInt dwOverScanX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOverScanX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwOverScanX
     * }
     */
    public static final OfInt dwOverScanX$layout() {
        return dwOverScanX$LAYOUT;
    }

    private static final long dwOverScanX$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwOverScanX
     * }
     */
    public static final long dwOverScanX$offset() {
        return dwOverScanX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwOverScanX
     * }
     */
    public static int dwOverScanX(MemorySegment struct) {
        return struct.get(dwOverScanX$LAYOUT, dwOverScanX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwOverScanX
     * }
     */
    public static void dwOverScanX(MemorySegment struct, int fieldValue) {
        struct.set(dwOverScanX$LAYOUT, dwOverScanX$OFFSET, fieldValue);
    }

    private static final OfInt dwOverScanY$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOverScanY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwOverScanY
     * }
     */
    public static final OfInt dwOverScanY$layout() {
        return dwOverScanY$LAYOUT;
    }

    private static final long dwOverScanY$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwOverScanY
     * }
     */
    public static final long dwOverScanY$offset() {
        return dwOverScanY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwOverScanY
     * }
     */
    public static int dwOverScanY(MemorySegment struct) {
        return struct.get(dwOverScanY$LAYOUT, dwOverScanY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwOverScanY
     * }
     */
    public static void dwOverScanY(MemorySegment struct, int fieldValue) {
        struct.set(dwOverScanY$LAYOUT, dwOverScanY$OFFSET, fieldValue);
    }

    private static final OfInt dwMaxUnscaledX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMaxUnscaledX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwMaxUnscaledX
     * }
     */
    public static final OfInt dwMaxUnscaledX$layout() {
        return dwMaxUnscaledX$LAYOUT;
    }

    private static final long dwMaxUnscaledX$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwMaxUnscaledX
     * }
     */
    public static final long dwMaxUnscaledX$offset() {
        return dwMaxUnscaledX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwMaxUnscaledX
     * }
     */
    public static int dwMaxUnscaledX(MemorySegment struct) {
        return struct.get(dwMaxUnscaledX$LAYOUT, dwMaxUnscaledX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwMaxUnscaledX
     * }
     */
    public static void dwMaxUnscaledX(MemorySegment struct, int fieldValue) {
        struct.set(dwMaxUnscaledX$LAYOUT, dwMaxUnscaledX$OFFSET, fieldValue);
    }

    private static final OfInt dwMaxUnscaledY$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMaxUnscaledY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwMaxUnscaledY
     * }
     */
    public static final OfInt dwMaxUnscaledY$layout() {
        return dwMaxUnscaledY$LAYOUT;
    }

    private static final long dwMaxUnscaledY$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwMaxUnscaledY
     * }
     */
    public static final long dwMaxUnscaledY$offset() {
        return dwMaxUnscaledY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwMaxUnscaledY
     * }
     */
    public static int dwMaxUnscaledY(MemorySegment struct) {
        return struct.get(dwMaxUnscaledY$LAYOUT, dwMaxUnscaledY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwMaxUnscaledY
     * }
     */
    public static void dwMaxUnscaledY(MemorySegment struct, int fieldValue) {
        struct.set(dwMaxUnscaledY$LAYOUT, dwMaxUnscaledY$OFFSET, fieldValue);
    }

    private static final OfInt dwPositionX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPositionX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwPositionX
     * }
     */
    public static final OfInt dwPositionX$layout() {
        return dwPositionX$LAYOUT;
    }

    private static final long dwPositionX$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwPositionX
     * }
     */
    public static final long dwPositionX$offset() {
        return dwPositionX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwPositionX
     * }
     */
    public static int dwPositionX(MemorySegment struct) {
        return struct.get(dwPositionX$LAYOUT, dwPositionX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwPositionX
     * }
     */
    public static void dwPositionX(MemorySegment struct, int fieldValue) {
        struct.set(dwPositionX$LAYOUT, dwPositionX$OFFSET, fieldValue);
    }

    private static final OfInt dwPositionY$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPositionY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwPositionY
     * }
     */
    public static final OfInt dwPositionY$layout() {
        return dwPositionY$LAYOUT;
    }

    private static final long dwPositionY$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwPositionY
     * }
     */
    public static final long dwPositionY$offset() {
        return dwPositionY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwPositionY
     * }
     */
    public static int dwPositionY(MemorySegment struct) {
        return struct.get(dwPositionY$LAYOUT, dwPositionY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwPositionY
     * }
     */
    public static void dwPositionY(MemorySegment struct, int fieldValue) {
        struct.set(dwPositionY$LAYOUT, dwPositionY$OFFSET, fieldValue);
    }

    private static final OfInt dwBrightness$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwBrightness"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwBrightness
     * }
     */
    public static final OfInt dwBrightness$layout() {
        return dwBrightness$LAYOUT;
    }

    private static final long dwBrightness$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwBrightness
     * }
     */
    public static final long dwBrightness$offset() {
        return dwBrightness$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwBrightness
     * }
     */
    public static int dwBrightness(MemorySegment struct) {
        return struct.get(dwBrightness$LAYOUT, dwBrightness$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwBrightness
     * }
     */
    public static void dwBrightness(MemorySegment struct, int fieldValue) {
        struct.set(dwBrightness$LAYOUT, dwBrightness$OFFSET, fieldValue);
    }

    private static final OfInt dwContrast$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwContrast"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwContrast
     * }
     */
    public static final OfInt dwContrast$layout() {
        return dwContrast$LAYOUT;
    }

    private static final long dwContrast$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwContrast
     * }
     */
    public static final long dwContrast$offset() {
        return dwContrast$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwContrast
     * }
     */
    public static int dwContrast(MemorySegment struct) {
        return struct.get(dwContrast$LAYOUT, dwContrast$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwContrast
     * }
     */
    public static void dwContrast(MemorySegment struct, int fieldValue) {
        struct.set(dwContrast$LAYOUT, dwContrast$OFFSET, fieldValue);
    }

    private static final OfInt dwCPType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCPType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwCPType
     * }
     */
    public static final OfInt dwCPType$layout() {
        return dwCPType$LAYOUT;
    }

    private static final long dwCPType$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwCPType
     * }
     */
    public static final long dwCPType$offset() {
        return dwCPType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwCPType
     * }
     */
    public static int dwCPType(MemorySegment struct) {
        return struct.get(dwCPType$LAYOUT, dwCPType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwCPType
     * }
     */
    public static void dwCPType(MemorySegment struct, int fieldValue) {
        struct.set(dwCPType$LAYOUT, dwCPType$OFFSET, fieldValue);
    }

    private static final OfInt dwCPCommand$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCPCommand"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwCPCommand
     * }
     */
    public static final OfInt dwCPCommand$layout() {
        return dwCPCommand$LAYOUT;
    }

    private static final long dwCPCommand$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwCPCommand
     * }
     */
    public static final long dwCPCommand$offset() {
        return dwCPCommand$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwCPCommand
     * }
     */
    public static int dwCPCommand(MemorySegment struct) {
        return struct.get(dwCPCommand$LAYOUT, dwCPCommand$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwCPCommand
     * }
     */
    public static void dwCPCommand(MemorySegment struct, int fieldValue) {
        struct.set(dwCPCommand$LAYOUT, dwCPCommand$OFFSET, fieldValue);
    }

    private static final OfInt dwCPStandard$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCPStandard"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwCPStandard
     * }
     */
    public static final OfInt dwCPStandard$layout() {
        return dwCPStandard$LAYOUT;
    }

    private static final long dwCPStandard$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwCPStandard
     * }
     */
    public static final long dwCPStandard$offset() {
        return dwCPStandard$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwCPStandard
     * }
     */
    public static int dwCPStandard(MemorySegment struct) {
        return struct.get(dwCPStandard$LAYOUT, dwCPStandard$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwCPStandard
     * }
     */
    public static void dwCPStandard(MemorySegment struct, int fieldValue) {
        struct.set(dwCPStandard$LAYOUT, dwCPStandard$OFFSET, fieldValue);
    }

    private static final OfInt dwCPKey$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCPKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG dwCPKey
     * }
     */
    public static final OfInt dwCPKey$layout() {
        return dwCPKey$LAYOUT;
    }

    private static final long dwCPKey$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG dwCPKey
     * }
     */
    public static final long dwCPKey$offset() {
        return dwCPKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG dwCPKey
     * }
     */
    public static int dwCPKey(MemorySegment struct) {
        return struct.get(dwCPKey$LAYOUT, dwCPKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG dwCPKey
     * }
     */
    public static void dwCPKey(MemorySegment struct, int fieldValue) {
        struct.set(dwCPKey$LAYOUT, dwCPKey$OFFSET, fieldValue);
    }

    private static final OfInt bCP_APSTriggerBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bCP_APSTriggerBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG bCP_APSTriggerBits
     * }
     */
    public static final OfInt bCP_APSTriggerBits$layout() {
        return bCP_APSTriggerBits$LAYOUT;
    }

    private static final long bCP_APSTriggerBits$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG bCP_APSTriggerBits
     * }
     */
    public static final long bCP_APSTriggerBits$offset() {
        return bCP_APSTriggerBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG bCP_APSTriggerBits
     * }
     */
    public static int bCP_APSTriggerBits(MemorySegment struct) {
        return struct.get(bCP_APSTriggerBits$LAYOUT, bCP_APSTriggerBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG bCP_APSTriggerBits
     * }
     */
    public static void bCP_APSTriggerBits(MemorySegment struct, int fieldValue) {
        struct.set(bCP_APSTriggerBits$LAYOUT, bCP_APSTriggerBits$OFFSET, fieldValue);
    }

    private static final SequenceLayout bOEMCopyProtection$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("bOEMCopyProtection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR bOEMCopyProtection[256]
     * }
     */
    public static final SequenceLayout bOEMCopyProtection$layout() {
        return bOEMCopyProtection$LAYOUT;
    }

    private static final long bOEMCopyProtection$OFFSET = 100;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR bOEMCopyProtection[256]
     * }
     */
    public static final long bOEMCopyProtection$offset() {
        return bOEMCopyProtection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR bOEMCopyProtection[256]
     * }
     */
    public static MemorySegment bOEMCopyProtection(MemorySegment struct) {
        return struct.asSlice(bOEMCopyProtection$OFFSET, bOEMCopyProtection$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR bOEMCopyProtection[256]
     * }
     */
    public static void bOEMCopyProtection(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bOEMCopyProtection$OFFSET, bOEMCopyProtection$LAYOUT.byteSize());
    }

    private static long[] bOEMCopyProtection$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * UCHAR bOEMCopyProtection[256]
     * }
     */
    public static long[] bOEMCopyProtection$dimensions() {
        return bOEMCopyProtection$DIMS;
    }
    private static final VarHandle bOEMCopyProtection$ELEM_HANDLE = bOEMCopyProtection$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * UCHAR bOEMCopyProtection[256]
     * }
     */
    public static byte bOEMCopyProtection(MemorySegment struct, long index0) {
        return (byte)bOEMCopyProtection$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * UCHAR bOEMCopyProtection[256]
     * }
     */
    public static void bOEMCopyProtection(MemorySegment struct, long index0, byte fieldValue) {
        bOEMCopyProtection$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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
