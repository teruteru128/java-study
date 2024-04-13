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
 * typedef struct _IMAGE_THUNK_DATA32 {
 *     union {
 *         DWORD ForwarderString;
 *         DWORD Function;
 *         DWORD Ordinal;
 *         DWORD AddressOfData;
 *     } u1;
 * } IMAGE_THUNK_DATA32
 * }
 */
public class IMAGE_THUNK_DATA32 extends _IMAGE_THUNK_DATA32 {

    IMAGE_THUNK_DATA32() {
        // Should not be called directly
    }
}
