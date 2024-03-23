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
 * typedef struct _PRINTER_NOTIFY_INFO {
 *     DWORD Version;
 *     DWORD Flags;
 *     DWORD Count;
 *     PRINTER_NOTIFY_INFO_DATA aData[1];
 * } PRINTER_NOTIFY_INFO
 * }
 */
public class PRINTER_NOTIFY_INFO extends _PRINTER_NOTIFY_INFO {

    PRINTER_NOTIFY_INFO() {
        // Should not be called directly
    }
}

