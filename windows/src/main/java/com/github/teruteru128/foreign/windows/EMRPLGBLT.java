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
 * typedef struct tagEMRPLGBLT {
 *     EMR emr;
 *     RECTL rclBounds;
 *     POINTL aptlDest[3];
 *     LONG xSrc;
 *     LONG ySrc;
 *     LONG cxSrc;
 *     LONG cySrc;
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
 * } EMRPLGBLT
 * }
 */
public class EMRPLGBLT extends tagEMRPLGBLT {

    EMRPLGBLT() {
        // Should not be called directly
    }
}
