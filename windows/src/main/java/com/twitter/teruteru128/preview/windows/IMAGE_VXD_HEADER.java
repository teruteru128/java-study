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
 * typedef struct _IMAGE_VXD_HEADER {
 *     WORD e32_magic;
 *     BYTE e32_border;
 *     BYTE e32_worder;
 *     DWORD e32_level;
 *     WORD e32_cpu;
 *     WORD e32_os;
 *     DWORD e32_ver;
 *     DWORD e32_mflags;
 *     DWORD e32_mpages;
 *     DWORD e32_startobj;
 *     DWORD e32_eip;
 *     DWORD e32_stackobj;
 *     DWORD e32_esp;
 *     DWORD e32_pagesize;
 *     DWORD e32_lastpagesize;
 *     DWORD e32_fixupsize;
 *     DWORD e32_fixupsum;
 *     DWORD e32_ldrsize;
 *     DWORD e32_ldrsum;
 *     DWORD e32_objtab;
 *     DWORD e32_objcnt;
 *     DWORD e32_objmap;
 *     DWORD e32_itermap;
 *     DWORD e32_rsrctab;
 *     DWORD e32_rsrccnt;
 *     DWORD e32_restab;
 *     DWORD e32_enttab;
 *     DWORD e32_dirtab;
 *     DWORD e32_dircnt;
 *     DWORD e32_fpagetab;
 *     DWORD e32_frectab;
 *     DWORD e32_impmod;
 *     DWORD e32_impmodcnt;
 *     DWORD e32_impproc;
 *     DWORD e32_pagesum;
 *     DWORD e32_datapage;
 *     DWORD e32_preload;
 *     DWORD e32_nrestab;
 *     DWORD e32_cbnrestab;
 *     DWORD e32_nressum;
 *     DWORD e32_autodata;
 *     DWORD e32_debuginfo;
 *     DWORD e32_debuglen;
 *     DWORD e32_instpreload;
 *     DWORD e32_instdemand;
 *     DWORD e32_heapsize;
 *     BYTE e32_res3[12];
 *     DWORD e32_winresoff;
 *     DWORD e32_winreslen;
 *     WORD e32_devid;
 *     WORD e32_ddkver;
 * } IMAGE_VXD_HEADER
 * }
 */
public class IMAGE_VXD_HEADER extends _IMAGE_VXD_HEADER {

    IMAGE_VXD_HEADER() {
        // Should not be called directly
    }
}

