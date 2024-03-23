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
 * typedef struct _WIN32_STREAM_ID {
 *     DWORD dwStreamId;
 *     DWORD dwStreamAttributes;
 *     LARGE_INTEGER Size;
 *     DWORD dwStreamNameSize;
 *     WCHAR cStreamName[1];
 * } WIN32_STREAM_ID
 * }
 */
public class WIN32_STREAM_ID extends _WIN32_STREAM_ID {

    WIN32_STREAM_ID() {
        // Should not be called directly
    }
}

