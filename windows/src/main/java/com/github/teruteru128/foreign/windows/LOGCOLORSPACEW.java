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
 * typedef struct tagLOGCOLORSPACEW {
 *     DWORD lcsSignature;
 *     DWORD lcsVersion;
 *     DWORD lcsSize;
 *     LCSCSTYPE lcsCSType;
 *     LCSGAMUTMATCH lcsIntent;
 *     CIEXYZTRIPLE lcsEndpoints;
 *     DWORD lcsGammaRed;
 *     DWORD lcsGammaGreen;
 *     DWORD lcsGammaBlue;
 *     WCHAR lcsFilename[260];
 * } LOGCOLORSPACEW
 * }
 */
public class LOGCOLORSPACEW extends tagLOGCOLORSPACEW {

    LOGCOLORSPACEW() {
        // Should not be called directly
    }
}
