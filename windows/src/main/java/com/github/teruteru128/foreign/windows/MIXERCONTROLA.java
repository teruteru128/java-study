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
 * typedef struct tagMIXERCONTROLA {
 *     DWORD cbStruct;
 *     DWORD dwControlID;
 *     DWORD dwControlType;
 *     DWORD fdwControl;
 *     DWORD cMultipleItems;
 *     CHAR szShortName[16];
 *     CHAR szName[64];
 *     union {
 *         struct {
 *             LONG lMinimum;
 *             LONG lMaximum;
 *         };
 *         struct {
 *             DWORD dwMinimum;
 *             DWORD dwMaximum;
 *         };
 *         DWORD dwReserved[6];
 *     } Bounds;
 *     union {
 *         DWORD cSteps;
 *         DWORD cbCustomData;
 *         DWORD dwReserved[6];
 *     } Metrics;
 * } MIXERCONTROLA
 * }
 */
public class MIXERCONTROLA extends tagMIXERCONTROLA {

    MIXERCONTROLA() {
        // Should not be called directly
    }
}
