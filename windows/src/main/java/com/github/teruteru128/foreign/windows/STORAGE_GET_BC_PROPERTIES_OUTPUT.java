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
 * typedef struct _STORAGE_GET_BC_PROPERTIES_OUTPUT {
 *     DWORD MaximumRequestsPerPeriod;
 *     DWORD MinimumPeriod;
 *     DWORDLONG MaximumRequestSize;
 *     DWORD EstimatedTimePerRequest;
 *     DWORD NumOutStandingRequests;
 *     DWORDLONG RequestSize;
 * } STORAGE_GET_BC_PROPERTIES_OUTPUT
 * }
 */
public class STORAGE_GET_BC_PROPERTIES_OUTPUT extends _STORAGE_GET_BC_PROPERTIES_OUTPUT {

    STORAGE_GET_BC_PROPERTIES_OUTPUT() {
        // Should not be called directly
    }
}
