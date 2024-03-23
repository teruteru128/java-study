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
 * typedef struct _FORMAT_EX_PARAMETERS {
 *     MEDIA_TYPE MediaType;
 *     DWORD StartCylinderNumber;
 *     DWORD EndCylinderNumber;
 *     DWORD StartHeadNumber;
 *     DWORD EndHeadNumber;
 *     WORD FormatGapLength;
 *     WORD SectorsPerTrack;
 *     WORD SectorNumber[1];
 * } FORMAT_EX_PARAMETERS
 * }
 */
public class FORMAT_EX_PARAMETERS extends _FORMAT_EX_PARAMETERS {

    FORMAT_EX_PARAMETERS() {
        // Should not be called directly
    }
}

