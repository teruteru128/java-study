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
 * typedef struct _ASYNC_DUPLICATE_EXTENTS_STATUS {
 *     DWORD Version;
 *     DUPLICATE_EXTENTS_STATE State;
 *     DWORDLONG SourceFileOffset;
 *     DWORDLONG TargetFileOffset;
 *     DWORDLONG ByteCount;
 *     DWORDLONG BytesDuplicated;
 * } ASYNC_DUPLICATE_EXTENTS_STATUS
 * }
 */
public class ASYNC_DUPLICATE_EXTENTS_STATUS extends _ASYNC_DUPLICATE_EXTENTS_STATUS {

    ASYNC_DUPLICATE_EXTENTS_STATUS() {
        // Should not be called directly
    }
}
