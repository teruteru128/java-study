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
 * typedef struct _STORAGE_ALLOCATE_BC_STREAM_INPUT {
 *     DWORD Version;
 *     DWORD RequestsPerPeriod;
 *     DWORD Period;
 *     BOOLEAN RetryFailures;
 *     BOOLEAN Discardable;
 *     BOOLEAN Reserved1[2];
 *     DWORD AccessType;
 *     DWORD AccessMode;
 * } STORAGE_ALLOCATE_BC_STREAM_INPUT
 * }
 */
public class STORAGE_ALLOCATE_BC_STREAM_INPUT extends _STORAGE_ALLOCATE_BC_STREAM_INPUT {

    STORAGE_ALLOCATE_BC_STREAM_INPUT() {
        // Should not be called directly
    }
}

