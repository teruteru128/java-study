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
 * typedef struct _MALLOC_FREE_STRUCT {
 *     void *(*pfnAllocate)(size_t) __attribute__((stdcall));
 *     void (*pfnFree)(void *) __attribute__((stdcall));
 * } MALLOC_FREE_STRUCT
 * }
 */
public class MALLOC_FREE_STRUCT extends _MALLOC_FREE_STRUCT {

    MALLOC_FREE_STRUCT() {
        // Should not be called directly
    }
}
