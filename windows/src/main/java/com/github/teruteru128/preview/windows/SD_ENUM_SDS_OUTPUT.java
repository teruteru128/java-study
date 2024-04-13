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
 * typedef struct _SD_ENUM_SDS_OUTPUT {
 *     DWORDLONG NextOffset;
 *     DWORDLONG NumSDEntriesReturned;
 *     DWORDLONG NumSDBytesReturned;
 *     SD_ENUM_SDS_ENTRY SDEntry[1];
 * } SD_ENUM_SDS_OUTPUT
 * }
 */
public class SD_ENUM_SDS_OUTPUT extends _SD_ENUM_SDS_OUTPUT {

    SD_ENUM_SDS_OUTPUT() {
        // Should not be called directly
    }
}
