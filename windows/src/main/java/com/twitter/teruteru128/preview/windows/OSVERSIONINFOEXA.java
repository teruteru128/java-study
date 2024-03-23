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
 * typedef struct _OSVERSIONINFOEXA {
 *     DWORD dwOSVersionInfoSize;
 *     DWORD dwMajorVersion;
 *     DWORD dwMinorVersion;
 *     DWORD dwBuildNumber;
 *     DWORD dwPlatformId;
 *     CHAR szCSDVersion[128];
 *     WORD wServicePackMajor;
 *     WORD wServicePackMinor;
 *     WORD wSuiteMask;
 *     BYTE wProductType;
 *     BYTE wReserved;
 * } OSVERSIONINFOEXA
 * }
 */
public class OSVERSIONINFOEXA extends _OSVERSIONINFOEXA {

    OSVERSIONINFOEXA() {
        // Should not be called directly
    }
}

