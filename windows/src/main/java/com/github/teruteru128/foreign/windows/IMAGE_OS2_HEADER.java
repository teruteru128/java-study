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
 * typedef struct _IMAGE_OS2_HEADER {
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
 * } IMAGE_OS2_HEADER
 * }
 */
public class IMAGE_OS2_HEADER extends _IMAGE_OS2_HEADER {

    IMAGE_OS2_HEADER() {
        // Should not be called directly
    }
}
