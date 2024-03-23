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
 * typedef struct _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT {
 *     DWORD Size;
 *     DEVICE_DSM_ACTION Action;
 *     DWORD Flags;
 *     DWORD OperationStatus;
 *     DWORD ExtendedError;
 *     DWORD TargetDetailedError;
 *     DWORD ReservedStatus;
 *     DWORD OutputBlockOffset;
 *     DWORD OutputBlockLength;
 * } DEVICE_DSM_OUTPUT
 * }
 */
public class DEVICE_DSM_OUTPUT extends _DEVICE_MANAGE_DATA_SET_ATTRIBUTES_OUTPUT {

    DEVICE_DSM_OUTPUT() {
        // Should not be called directly
    }
}

