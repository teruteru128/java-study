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
 * typedef struct tagUPDATELAYEREDWINDOWINFO {
 *     DWORD cbSize;
 *     HDC hdcDst;
 *     const POINT *pptDst;
 *     const SIZE *psize;
 *     HDC hdcSrc;
 *     const POINT *pptSrc;
 *     COLORREF crKey;
 *     const BLENDFUNCTION *pblend;
 *     DWORD dwFlags;
 *     const RECT *prcDirty;
 * } UPDATELAYEREDWINDOWINFO
 * }
 */
public class UPDATELAYEREDWINDOWINFO extends tagUPDATELAYEREDWINDOWINFO {

    UPDATELAYEREDWINDOWINFO() {
        // Should not be called directly
    }
}
