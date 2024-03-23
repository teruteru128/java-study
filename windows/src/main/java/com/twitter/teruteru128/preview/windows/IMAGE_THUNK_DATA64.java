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
 * typedef struct _IMAGE_THUNK_DATA64 {
 *     union {
 *         ULONGLONG ForwarderString;
 *         ULONGLONG Function;
 *         ULONGLONG Ordinal;
 *         ULONGLONG AddressOfData;
 *     } u1;
 * } IMAGE_THUNK_DATA64
 * }
 */
public class IMAGE_THUNK_DATA64 extends _IMAGE_THUNK_DATA64 {

    IMAGE_THUNK_DATA64() {
        // Should not be called directly
    }
}

