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
 * struct _IMAGE_OS2_HEADER {
 *     WORD ne_magic;
 *     CHAR ne_ver;
 *     CHAR ne_rev;
 *     WORD ne_enttab;
 *     WORD ne_cbenttab;
 *     LONG ne_crc;
 *     WORD ne_flags;
 *     WORD ne_autodata;
 *     WORD ne_heap;
 *     WORD ne_stack;
 *     LONG ne_csip;
 *     LONG ne_sssp;
 *     WORD ne_cseg;
 *     WORD ne_cmod;
 *     WORD ne_cbnrestab;
 *     WORD ne_segtab;
 *     WORD ne_rsrctab;
 *     WORD ne_restab;
 *     WORD ne_modtab;
 *     WORD ne_imptab;
 *     LONG ne_nrestab;
 *     WORD ne_cmovent;
 *     WORD ne_align;
 *     WORD ne_cres;
 *     BYTE ne_exetyp;
 *     BYTE ne_flagsothers;
 *     WORD ne_pretthunks;
 *     WORD ne_psegrefbytes;
 *     WORD ne_swaparea;
 *     WORD ne_expver;
 * }
 * }
 */
public class _IMAGE_OS2_HEADER {

    _IMAGE_OS2_HEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Windows_h.C_SHORT.withName("ne_magic"),
        Windows_h.C_CHAR.withName("ne_ver"),
        Windows_h.C_CHAR.withName("ne_rev"),
        Windows_h.C_SHORT.withName("ne_enttab"),
        Windows_h.C_SHORT.withName("ne_cbenttab"),
        Windows_h.align(Windows_h.C_LONG, 2).withName("ne_crc"),
        Windows_h.C_SHORT.withName("ne_flags"),
        Windows_h.C_SHORT.withName("ne_autodata"),
        Windows_h.C_SHORT.withName("ne_heap"),
        Windows_h.C_SHORT.withName("ne_stack"),
        Windows_h.align(Windows_h.C_LONG, 2).withName("ne_csip"),
        Windows_h.align(Windows_h.C_LONG, 2).withName("ne_sssp"),
        Windows_h.C_SHORT.withName("ne_cseg"),
        Windows_h.C_SHORT.withName("ne_cmod"),
        Windows_h.C_SHORT.withName("ne_cbnrestab"),
        Windows_h.C_SHORT.withName("ne_segtab"),
        Windows_h.C_SHORT.withName("ne_rsrctab"),
        Windows_h.C_SHORT.withName("ne_restab"),
        Windows_h.C_SHORT.withName("ne_modtab"),
        Windows_h.C_SHORT.withName("ne_imptab"),
        Windows_h.align(Windows_h.C_LONG, 2).withName("ne_nrestab"),
        Windows_h.C_SHORT.withName("ne_cmovent"),
        Windows_h.C_SHORT.withName("ne_align"),
        Windows_h.C_SHORT.withName("ne_cres"),
        Windows_h.C_CHAR.withName("ne_exetyp"),
        Windows_h.C_CHAR.withName("ne_flagsothers"),
        Windows_h.C_SHORT.withName("ne_pretthunks"),
        Windows_h.C_SHORT.withName("ne_psegrefbytes"),
        Windows_h.C_SHORT.withName("ne_swaparea"),
        Windows_h.C_SHORT.withName("ne_expver")
    ).withName("_IMAGE_OS2_HEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort ne_magic$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_magic
     * }
     */
    public static final OfShort ne_magic$layout() {
        return ne_magic$LAYOUT;
    }

    private static final long ne_magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_magic
     * }
     */
    public static final long ne_magic$offset() {
        return ne_magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_magic
     * }
     */
    public static short ne_magic(MemorySegment struct) {
        return struct.get(ne_magic$LAYOUT, ne_magic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_magic
     * }
     */
    public static void ne_magic(MemorySegment struct, short fieldValue) {
        struct.set(ne_magic$LAYOUT, ne_magic$OFFSET, fieldValue);
    }

    private static final OfByte ne_ver$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ne_ver"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR ne_ver
     * }
     */
    public static final OfByte ne_ver$layout() {
        return ne_ver$LAYOUT;
    }

    private static final long ne_ver$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR ne_ver
     * }
     */
    public static final long ne_ver$offset() {
        return ne_ver$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR ne_ver
     * }
     */
    public static byte ne_ver(MemorySegment struct) {
        return struct.get(ne_ver$LAYOUT, ne_ver$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR ne_ver
     * }
     */
    public static void ne_ver(MemorySegment struct, byte fieldValue) {
        struct.set(ne_ver$LAYOUT, ne_ver$OFFSET, fieldValue);
    }

    private static final OfByte ne_rev$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ne_rev"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR ne_rev
     * }
     */
    public static final OfByte ne_rev$layout() {
        return ne_rev$LAYOUT;
    }

    private static final long ne_rev$OFFSET = 3;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR ne_rev
     * }
     */
    public static final long ne_rev$offset() {
        return ne_rev$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR ne_rev
     * }
     */
    public static byte ne_rev(MemorySegment struct) {
        return struct.get(ne_rev$LAYOUT, ne_rev$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR ne_rev
     * }
     */
    public static void ne_rev(MemorySegment struct, byte fieldValue) {
        struct.set(ne_rev$LAYOUT, ne_rev$OFFSET, fieldValue);
    }

    private static final OfShort ne_enttab$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_enttab"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_enttab
     * }
     */
    public static final OfShort ne_enttab$layout() {
        return ne_enttab$LAYOUT;
    }

    private static final long ne_enttab$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_enttab
     * }
     */
    public static final long ne_enttab$offset() {
        return ne_enttab$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_enttab
     * }
     */
    public static short ne_enttab(MemorySegment struct) {
        return struct.get(ne_enttab$LAYOUT, ne_enttab$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_enttab
     * }
     */
    public static void ne_enttab(MemorySegment struct, short fieldValue) {
        struct.set(ne_enttab$LAYOUT, ne_enttab$OFFSET, fieldValue);
    }

    private static final OfShort ne_cbenttab$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_cbenttab"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_cbenttab
     * }
     */
    public static final OfShort ne_cbenttab$layout() {
        return ne_cbenttab$LAYOUT;
    }

    private static final long ne_cbenttab$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_cbenttab
     * }
     */
    public static final long ne_cbenttab$offset() {
        return ne_cbenttab$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_cbenttab
     * }
     */
    public static short ne_cbenttab(MemorySegment struct) {
        return struct.get(ne_cbenttab$LAYOUT, ne_cbenttab$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_cbenttab
     * }
     */
    public static void ne_cbenttab(MemorySegment struct, short fieldValue) {
        struct.set(ne_cbenttab$LAYOUT, ne_cbenttab$OFFSET, fieldValue);
    }

    private static final OfInt ne_crc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ne_crc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG ne_crc
     * }
     */
    public static final OfInt ne_crc$layout() {
        return ne_crc$LAYOUT;
    }

    private static final long ne_crc$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG ne_crc
     * }
     */
    public static final long ne_crc$offset() {
        return ne_crc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG ne_crc
     * }
     */
    public static int ne_crc(MemorySegment struct) {
        return struct.get(ne_crc$LAYOUT, ne_crc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG ne_crc
     * }
     */
    public static void ne_crc(MemorySegment struct, int fieldValue) {
        struct.set(ne_crc$LAYOUT, ne_crc$OFFSET, fieldValue);
    }

    private static final OfShort ne_flags$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_flags
     * }
     */
    public static final OfShort ne_flags$layout() {
        return ne_flags$LAYOUT;
    }

    private static final long ne_flags$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_flags
     * }
     */
    public static final long ne_flags$offset() {
        return ne_flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_flags
     * }
     */
    public static short ne_flags(MemorySegment struct) {
        return struct.get(ne_flags$LAYOUT, ne_flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_flags
     * }
     */
    public static void ne_flags(MemorySegment struct, short fieldValue) {
        struct.set(ne_flags$LAYOUT, ne_flags$OFFSET, fieldValue);
    }

    private static final OfShort ne_autodata$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_autodata"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_autodata
     * }
     */
    public static final OfShort ne_autodata$layout() {
        return ne_autodata$LAYOUT;
    }

    private static final long ne_autodata$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_autodata
     * }
     */
    public static final long ne_autodata$offset() {
        return ne_autodata$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_autodata
     * }
     */
    public static short ne_autodata(MemorySegment struct) {
        return struct.get(ne_autodata$LAYOUT, ne_autodata$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_autodata
     * }
     */
    public static void ne_autodata(MemorySegment struct, short fieldValue) {
        struct.set(ne_autodata$LAYOUT, ne_autodata$OFFSET, fieldValue);
    }

    private static final OfShort ne_heap$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_heap"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_heap
     * }
     */
    public static final OfShort ne_heap$layout() {
        return ne_heap$LAYOUT;
    }

    private static final long ne_heap$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_heap
     * }
     */
    public static final long ne_heap$offset() {
        return ne_heap$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_heap
     * }
     */
    public static short ne_heap(MemorySegment struct) {
        return struct.get(ne_heap$LAYOUT, ne_heap$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_heap
     * }
     */
    public static void ne_heap(MemorySegment struct, short fieldValue) {
        struct.set(ne_heap$LAYOUT, ne_heap$OFFSET, fieldValue);
    }

    private static final OfShort ne_stack$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_stack"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_stack
     * }
     */
    public static final OfShort ne_stack$layout() {
        return ne_stack$LAYOUT;
    }

    private static final long ne_stack$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_stack
     * }
     */
    public static final long ne_stack$offset() {
        return ne_stack$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_stack
     * }
     */
    public static short ne_stack(MemorySegment struct) {
        return struct.get(ne_stack$LAYOUT, ne_stack$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_stack
     * }
     */
    public static void ne_stack(MemorySegment struct, short fieldValue) {
        struct.set(ne_stack$LAYOUT, ne_stack$OFFSET, fieldValue);
    }

    private static final OfInt ne_csip$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ne_csip"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG ne_csip
     * }
     */
    public static final OfInt ne_csip$layout() {
        return ne_csip$LAYOUT;
    }

    private static final long ne_csip$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG ne_csip
     * }
     */
    public static final long ne_csip$offset() {
        return ne_csip$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG ne_csip
     * }
     */
    public static int ne_csip(MemorySegment struct) {
        return struct.get(ne_csip$LAYOUT, ne_csip$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG ne_csip
     * }
     */
    public static void ne_csip(MemorySegment struct, int fieldValue) {
        struct.set(ne_csip$LAYOUT, ne_csip$OFFSET, fieldValue);
    }

    private static final OfInt ne_sssp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ne_sssp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG ne_sssp
     * }
     */
    public static final OfInt ne_sssp$layout() {
        return ne_sssp$LAYOUT;
    }

    private static final long ne_sssp$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG ne_sssp
     * }
     */
    public static final long ne_sssp$offset() {
        return ne_sssp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG ne_sssp
     * }
     */
    public static int ne_sssp(MemorySegment struct) {
        return struct.get(ne_sssp$LAYOUT, ne_sssp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG ne_sssp
     * }
     */
    public static void ne_sssp(MemorySegment struct, int fieldValue) {
        struct.set(ne_sssp$LAYOUT, ne_sssp$OFFSET, fieldValue);
    }

    private static final OfShort ne_cseg$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_cseg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_cseg
     * }
     */
    public static final OfShort ne_cseg$layout() {
        return ne_cseg$LAYOUT;
    }

    private static final long ne_cseg$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_cseg
     * }
     */
    public static final long ne_cseg$offset() {
        return ne_cseg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_cseg
     * }
     */
    public static short ne_cseg(MemorySegment struct) {
        return struct.get(ne_cseg$LAYOUT, ne_cseg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_cseg
     * }
     */
    public static void ne_cseg(MemorySegment struct, short fieldValue) {
        struct.set(ne_cseg$LAYOUT, ne_cseg$OFFSET, fieldValue);
    }

    private static final OfShort ne_cmod$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_cmod"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_cmod
     * }
     */
    public static final OfShort ne_cmod$layout() {
        return ne_cmod$LAYOUT;
    }

    private static final long ne_cmod$OFFSET = 30;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_cmod
     * }
     */
    public static final long ne_cmod$offset() {
        return ne_cmod$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_cmod
     * }
     */
    public static short ne_cmod(MemorySegment struct) {
        return struct.get(ne_cmod$LAYOUT, ne_cmod$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_cmod
     * }
     */
    public static void ne_cmod(MemorySegment struct, short fieldValue) {
        struct.set(ne_cmod$LAYOUT, ne_cmod$OFFSET, fieldValue);
    }

    private static final OfShort ne_cbnrestab$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_cbnrestab"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_cbnrestab
     * }
     */
    public static final OfShort ne_cbnrestab$layout() {
        return ne_cbnrestab$LAYOUT;
    }

    private static final long ne_cbnrestab$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_cbnrestab
     * }
     */
    public static final long ne_cbnrestab$offset() {
        return ne_cbnrestab$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_cbnrestab
     * }
     */
    public static short ne_cbnrestab(MemorySegment struct) {
        return struct.get(ne_cbnrestab$LAYOUT, ne_cbnrestab$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_cbnrestab
     * }
     */
    public static void ne_cbnrestab(MemorySegment struct, short fieldValue) {
        struct.set(ne_cbnrestab$LAYOUT, ne_cbnrestab$OFFSET, fieldValue);
    }

    private static final OfShort ne_segtab$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_segtab"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_segtab
     * }
     */
    public static final OfShort ne_segtab$layout() {
        return ne_segtab$LAYOUT;
    }

    private static final long ne_segtab$OFFSET = 34;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_segtab
     * }
     */
    public static final long ne_segtab$offset() {
        return ne_segtab$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_segtab
     * }
     */
    public static short ne_segtab(MemorySegment struct) {
        return struct.get(ne_segtab$LAYOUT, ne_segtab$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_segtab
     * }
     */
    public static void ne_segtab(MemorySegment struct, short fieldValue) {
        struct.set(ne_segtab$LAYOUT, ne_segtab$OFFSET, fieldValue);
    }

    private static final OfShort ne_rsrctab$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_rsrctab"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_rsrctab
     * }
     */
    public static final OfShort ne_rsrctab$layout() {
        return ne_rsrctab$LAYOUT;
    }

    private static final long ne_rsrctab$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_rsrctab
     * }
     */
    public static final long ne_rsrctab$offset() {
        return ne_rsrctab$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_rsrctab
     * }
     */
    public static short ne_rsrctab(MemorySegment struct) {
        return struct.get(ne_rsrctab$LAYOUT, ne_rsrctab$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_rsrctab
     * }
     */
    public static void ne_rsrctab(MemorySegment struct, short fieldValue) {
        struct.set(ne_rsrctab$LAYOUT, ne_rsrctab$OFFSET, fieldValue);
    }

    private static final OfShort ne_restab$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_restab"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_restab
     * }
     */
    public static final OfShort ne_restab$layout() {
        return ne_restab$LAYOUT;
    }

    private static final long ne_restab$OFFSET = 38;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_restab
     * }
     */
    public static final long ne_restab$offset() {
        return ne_restab$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_restab
     * }
     */
    public static short ne_restab(MemorySegment struct) {
        return struct.get(ne_restab$LAYOUT, ne_restab$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_restab
     * }
     */
    public static void ne_restab(MemorySegment struct, short fieldValue) {
        struct.set(ne_restab$LAYOUT, ne_restab$OFFSET, fieldValue);
    }

    private static final OfShort ne_modtab$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_modtab"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_modtab
     * }
     */
    public static final OfShort ne_modtab$layout() {
        return ne_modtab$LAYOUT;
    }

    private static final long ne_modtab$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_modtab
     * }
     */
    public static final long ne_modtab$offset() {
        return ne_modtab$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_modtab
     * }
     */
    public static short ne_modtab(MemorySegment struct) {
        return struct.get(ne_modtab$LAYOUT, ne_modtab$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_modtab
     * }
     */
    public static void ne_modtab(MemorySegment struct, short fieldValue) {
        struct.set(ne_modtab$LAYOUT, ne_modtab$OFFSET, fieldValue);
    }

    private static final OfShort ne_imptab$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_imptab"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_imptab
     * }
     */
    public static final OfShort ne_imptab$layout() {
        return ne_imptab$LAYOUT;
    }

    private static final long ne_imptab$OFFSET = 42;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_imptab
     * }
     */
    public static final long ne_imptab$offset() {
        return ne_imptab$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_imptab
     * }
     */
    public static short ne_imptab(MemorySegment struct) {
        return struct.get(ne_imptab$LAYOUT, ne_imptab$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_imptab
     * }
     */
    public static void ne_imptab(MemorySegment struct, short fieldValue) {
        struct.set(ne_imptab$LAYOUT, ne_imptab$OFFSET, fieldValue);
    }

    private static final OfInt ne_nrestab$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ne_nrestab"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG ne_nrestab
     * }
     */
    public static final OfInt ne_nrestab$layout() {
        return ne_nrestab$LAYOUT;
    }

    private static final long ne_nrestab$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG ne_nrestab
     * }
     */
    public static final long ne_nrestab$offset() {
        return ne_nrestab$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG ne_nrestab
     * }
     */
    public static int ne_nrestab(MemorySegment struct) {
        return struct.get(ne_nrestab$LAYOUT, ne_nrestab$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG ne_nrestab
     * }
     */
    public static void ne_nrestab(MemorySegment struct, int fieldValue) {
        struct.set(ne_nrestab$LAYOUT, ne_nrestab$OFFSET, fieldValue);
    }

    private static final OfShort ne_cmovent$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_cmovent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_cmovent
     * }
     */
    public static final OfShort ne_cmovent$layout() {
        return ne_cmovent$LAYOUT;
    }

    private static final long ne_cmovent$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_cmovent
     * }
     */
    public static final long ne_cmovent$offset() {
        return ne_cmovent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_cmovent
     * }
     */
    public static short ne_cmovent(MemorySegment struct) {
        return struct.get(ne_cmovent$LAYOUT, ne_cmovent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_cmovent
     * }
     */
    public static void ne_cmovent(MemorySegment struct, short fieldValue) {
        struct.set(ne_cmovent$LAYOUT, ne_cmovent$OFFSET, fieldValue);
    }

    private static final OfShort ne_align$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_align"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_align
     * }
     */
    public static final OfShort ne_align$layout() {
        return ne_align$LAYOUT;
    }

    private static final long ne_align$OFFSET = 50;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_align
     * }
     */
    public static final long ne_align$offset() {
        return ne_align$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_align
     * }
     */
    public static short ne_align(MemorySegment struct) {
        return struct.get(ne_align$LAYOUT, ne_align$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_align
     * }
     */
    public static void ne_align(MemorySegment struct, short fieldValue) {
        struct.set(ne_align$LAYOUT, ne_align$OFFSET, fieldValue);
    }

    private static final OfShort ne_cres$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_cres"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_cres
     * }
     */
    public static final OfShort ne_cres$layout() {
        return ne_cres$LAYOUT;
    }

    private static final long ne_cres$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_cres
     * }
     */
    public static final long ne_cres$offset() {
        return ne_cres$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_cres
     * }
     */
    public static short ne_cres(MemorySegment struct) {
        return struct.get(ne_cres$LAYOUT, ne_cres$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_cres
     * }
     */
    public static void ne_cres(MemorySegment struct, short fieldValue) {
        struct.set(ne_cres$LAYOUT, ne_cres$OFFSET, fieldValue);
    }

    private static final OfByte ne_exetyp$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ne_exetyp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ne_exetyp
     * }
     */
    public static final OfByte ne_exetyp$layout() {
        return ne_exetyp$LAYOUT;
    }

    private static final long ne_exetyp$OFFSET = 54;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ne_exetyp
     * }
     */
    public static final long ne_exetyp$offset() {
        return ne_exetyp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ne_exetyp
     * }
     */
    public static byte ne_exetyp(MemorySegment struct) {
        return struct.get(ne_exetyp$LAYOUT, ne_exetyp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ne_exetyp
     * }
     */
    public static void ne_exetyp(MemorySegment struct, byte fieldValue) {
        struct.set(ne_exetyp$LAYOUT, ne_exetyp$OFFSET, fieldValue);
    }

    private static final OfByte ne_flagsothers$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ne_flagsothers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ne_flagsothers
     * }
     */
    public static final OfByte ne_flagsothers$layout() {
        return ne_flagsothers$LAYOUT;
    }

    private static final long ne_flagsothers$OFFSET = 55;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ne_flagsothers
     * }
     */
    public static final long ne_flagsothers$offset() {
        return ne_flagsothers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ne_flagsothers
     * }
     */
    public static byte ne_flagsothers(MemorySegment struct) {
        return struct.get(ne_flagsothers$LAYOUT, ne_flagsothers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ne_flagsothers
     * }
     */
    public static void ne_flagsothers(MemorySegment struct, byte fieldValue) {
        struct.set(ne_flagsothers$LAYOUT, ne_flagsothers$OFFSET, fieldValue);
    }

    private static final OfShort ne_pretthunks$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_pretthunks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_pretthunks
     * }
     */
    public static final OfShort ne_pretthunks$layout() {
        return ne_pretthunks$LAYOUT;
    }

    private static final long ne_pretthunks$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_pretthunks
     * }
     */
    public static final long ne_pretthunks$offset() {
        return ne_pretthunks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_pretthunks
     * }
     */
    public static short ne_pretthunks(MemorySegment struct) {
        return struct.get(ne_pretthunks$LAYOUT, ne_pretthunks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_pretthunks
     * }
     */
    public static void ne_pretthunks(MemorySegment struct, short fieldValue) {
        struct.set(ne_pretthunks$LAYOUT, ne_pretthunks$OFFSET, fieldValue);
    }

    private static final OfShort ne_psegrefbytes$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_psegrefbytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_psegrefbytes
     * }
     */
    public static final OfShort ne_psegrefbytes$layout() {
        return ne_psegrefbytes$LAYOUT;
    }

    private static final long ne_psegrefbytes$OFFSET = 58;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_psegrefbytes
     * }
     */
    public static final long ne_psegrefbytes$offset() {
        return ne_psegrefbytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_psegrefbytes
     * }
     */
    public static short ne_psegrefbytes(MemorySegment struct) {
        return struct.get(ne_psegrefbytes$LAYOUT, ne_psegrefbytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_psegrefbytes
     * }
     */
    public static void ne_psegrefbytes(MemorySegment struct, short fieldValue) {
        struct.set(ne_psegrefbytes$LAYOUT, ne_psegrefbytes$OFFSET, fieldValue);
    }

    private static final OfShort ne_swaparea$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_swaparea"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_swaparea
     * }
     */
    public static final OfShort ne_swaparea$layout() {
        return ne_swaparea$LAYOUT;
    }

    private static final long ne_swaparea$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_swaparea
     * }
     */
    public static final long ne_swaparea$offset() {
        return ne_swaparea$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_swaparea
     * }
     */
    public static short ne_swaparea(MemorySegment struct) {
        return struct.get(ne_swaparea$LAYOUT, ne_swaparea$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_swaparea
     * }
     */
    public static void ne_swaparea(MemorySegment struct, short fieldValue) {
        struct.set(ne_swaparea$LAYOUT, ne_swaparea$OFFSET, fieldValue);
    }

    private static final OfShort ne_expver$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ne_expver"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ne_expver
     * }
     */
    public static final OfShort ne_expver$layout() {
        return ne_expver$LAYOUT;
    }

    private static final long ne_expver$OFFSET = 62;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ne_expver
     * }
     */
    public static final long ne_expver$offset() {
        return ne_expver$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ne_expver
     * }
     */
    public static short ne_expver(MemorySegment struct) {
        return struct.get(ne_expver$LAYOUT, ne_expver$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ne_expver
     * }
     */
    public static void ne_expver(MemorySegment struct, short fieldValue) {
        struct.set(ne_expver$LAYOUT, ne_expver$OFFSET, fieldValue);
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

