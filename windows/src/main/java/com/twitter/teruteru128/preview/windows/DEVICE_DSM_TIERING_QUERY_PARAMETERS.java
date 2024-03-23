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
 * typedef struct _DEVICE_DSM_TIERING_QUERY_INPUT {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD Flags;
 *     DWORD NumberOfTierIds;
 *     GUID TierIds[1];
 * } DEVICE_DSM_TIERING_QUERY_PARAMETERS
 * }
 */
public class DEVICE_DSM_TIERING_QUERY_PARAMETERS extends _DEVICE_DSM_TIERING_QUERY_INPUT {

    DEVICE_DSM_TIERING_QUERY_PARAMETERS() {
        // Should not be called directly
    }
}

