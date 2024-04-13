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
 * typedef struct _DEVICEDUMP_PUBLIC_SUBSECTION {
 *     DWORD dwFlags;
 *     GP_LOG_PAGE_DESCRIPTOR GPLogTable[16];
 *     CHAR szDescription[16];
 *     BYTE bData[1];
 * } DEVICEDUMP_PUBLIC_SUBSECTION
 * }
 */
public class DEVICEDUMP_PUBLIC_SUBSECTION extends _DEVICEDUMP_PUBLIC_SUBSECTION {

    DEVICEDUMP_PUBLIC_SUBSECTION() {
        // Should not be called directly
    }
}
