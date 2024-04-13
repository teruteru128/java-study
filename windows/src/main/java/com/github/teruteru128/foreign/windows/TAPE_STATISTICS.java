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
 * typedef struct _TAPE_STATISTICS {
 *     DWORD Version;
 *     DWORD Flags;
 *     LARGE_INTEGER RecoveredWrites;
 *     LARGE_INTEGER UnrecoveredWrites;
 *     LARGE_INTEGER RecoveredReads;
 *     LARGE_INTEGER UnrecoveredReads;
 *     BYTE CompressionRatioReads;
 *     BYTE CompressionRatioWrites;
 * } TAPE_STATISTICS
 * }
 */
public class TAPE_STATISTICS extends _TAPE_STATISTICS {

    TAPE_STATISTICS() {
        // Should not be called directly
    }
}
