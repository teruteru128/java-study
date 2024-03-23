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
 * typedef struct _WIN32_FIND_DATAA {
 *     DWORD dwFileAttributes;
 *     FILETIME ftCreationTime;
 *     FILETIME ftLastAccessTime;
 *     FILETIME ftLastWriteTime;
 *     DWORD nFileSizeHigh;
 *     DWORD nFileSizeLow;
 *     DWORD dwReserved0;
 *     DWORD dwReserved1;
 *     CHAR cFileName[260];
 *     CHAR cAlternateFileName[14];
 * } WIN32_FIND_DATAA
 * }
 */
public class WIN32_FIND_DATAA extends _WIN32_FIND_DATAA {

    WIN32_FIND_DATAA() {
        // Should not be called directly
    }
}

