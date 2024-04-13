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
 * typedef struct _DUPLICATE_EXTENTS_DATA_EX {
 *     SIZE_T Size;
 *     HANDLE FileHandle;
 *     LARGE_INTEGER SourceFileOffset;
 *     LARGE_INTEGER TargetFileOffset;
 *     LARGE_INTEGER ByteCount;
 *     DWORD Flags;
 * } DUPLICATE_EXTENTS_DATA_EX
 * }
 */
public class DUPLICATE_EXTENTS_DATA_EX extends _DUPLICATE_EXTENTS_DATA_EX {

    DUPLICATE_EXTENTS_DATA_EX() {
        // Should not be called directly
    }
}
