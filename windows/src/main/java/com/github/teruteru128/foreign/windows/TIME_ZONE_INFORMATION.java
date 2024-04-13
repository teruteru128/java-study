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
 * typedef struct _TIME_ZONE_INFORMATION {
 *     LONG Bias;
 *     WCHAR StandardName[32];
 *     SYSTEMTIME StandardDate;
 *     LONG StandardBias;
 *     WCHAR DaylightName[32];
 *     SYSTEMTIME DaylightDate;
 *     LONG DaylightBias;
 * } TIME_ZONE_INFORMATION
 * }
 */
public class TIME_ZONE_INFORMATION extends _TIME_ZONE_INFORMATION {

    TIME_ZONE_INFORMATION() {
        // Should not be called directly
    }
}
