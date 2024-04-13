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
 * typedef struct _STORAGE_ADAPTER_SERIAL_NUMBER {
 *     DWORD Version;
 *     DWORD Size;
 *     WCHAR SerialNumber[128];
 * } STORAGE_ADAPTER_SERIAL_NUMBER
 * }
 */
public class STORAGE_ADAPTER_SERIAL_NUMBER extends _STORAGE_ADAPTER_SERIAL_NUMBER {

    STORAGE_ADAPTER_SERIAL_NUMBER() {
        // Should not be called directly
    }
}
