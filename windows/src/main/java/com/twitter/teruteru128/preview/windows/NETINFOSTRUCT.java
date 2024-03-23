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
 * typedef struct _NETINFOSTRUCT {
 *     DWORD cbStructure;
 *     DWORD dwProviderVersion;
 *     DWORD dwStatus;
 *     DWORD dwCharacteristics;
 *     ULONG_PTR dwHandle;
 *     WORD wNetType;
 *     DWORD dwPrinters;
 *     DWORD dwDrives;
 * } NETINFOSTRUCT
 * }
 */
public class NETINFOSTRUCT extends _NETINFOSTRUCT {

    NETINFOSTRUCT() {
        // Should not be called directly
    }
}

