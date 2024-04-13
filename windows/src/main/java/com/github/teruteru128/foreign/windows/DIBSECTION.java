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
 * typedef struct tagDIBSECTION {
 *     BITMAP dsBm;
 *     BITMAPINFOHEADER dsBmih;
 *     DWORD dsBitfields[3];
 *     HANDLE dshSection;
 *     DWORD dsOffset;
 * } DIBSECTION
 * }
 */
public class DIBSECTION extends tagDIBSECTION {

    DIBSECTION() {
        // Should not be called directly
    }
}
