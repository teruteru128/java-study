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
 * typedef struct _VIDEOPARAMETERS {
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
 * } VIDEOPARAMETERS
 * }
 */
public class VIDEOPARAMETERS extends _VIDEOPARAMETERS {

    VIDEOPARAMETERS() {
        // Should not be called directly
    }
}

