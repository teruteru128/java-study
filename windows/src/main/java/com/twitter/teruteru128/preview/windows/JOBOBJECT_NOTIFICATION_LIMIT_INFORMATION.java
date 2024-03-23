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
 * typedef struct _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION {
 *     DWORD64 IoReadBytesLimit;
 *     DWORD64 IoWriteBytesLimit;
 *     LARGE_INTEGER PerJobUserTimeLimit;
 *     DWORD64 JobMemoryLimit;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval;
 *     DWORD LimitFlags;
 * } JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION
 * }
 */
public class JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION extends _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION {

    JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION() {
        // Should not be called directly
    }
}

