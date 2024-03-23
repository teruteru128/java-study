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
 * typedef struct _DEVICE_MANAGE_DATA_SET_ATTRIBUTES {
 *     DWORD Size;
 *     DEVICE_DSM_ACTION Action;
 *     DWORD Flags;
 *     DWORD ParameterBlockOffset;
 *     DWORD ParameterBlockLength;
 *     DWORD DataSetRangesOffset;
 *     DWORD DataSetRangesLength;
 * } DEVICE_MANAGE_DATA_SET_ATTRIBUTES
 * }
 */
public class DEVICE_MANAGE_DATA_SET_ATTRIBUTES extends _DEVICE_MANAGE_DATA_SET_ATTRIBUTES {

    DEVICE_MANAGE_DATA_SET_ATTRIBUTES() {
        // Should not be called directly
    }
}

