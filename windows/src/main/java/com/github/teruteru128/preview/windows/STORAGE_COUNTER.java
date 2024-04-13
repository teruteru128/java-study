// Generated by jextract

package com.github.teruteru128.preview.windows;

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
 * typedef struct _STORAGE_COUNTER {
 *     STORAGE_COUNTER_TYPE Type;
 *     union {
 *         struct {
 *             DWORD Week;
 *             DWORD Year;
 *         } ManufactureDate;
 *         DWORDLONG AsUlonglong;
 *     } Value;
 * } STORAGE_COUNTER
 * }
 */
public class STORAGE_COUNTER extends _STORAGE_COUNTER {

    STORAGE_COUNTER() {
        // Should not be called directly
    }
}
