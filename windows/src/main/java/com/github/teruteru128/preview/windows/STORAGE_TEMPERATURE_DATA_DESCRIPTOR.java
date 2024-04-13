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
 * typedef struct _STORAGE_TEMPERATURE_DATA_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     SHORT CriticalTemperature;
 *     SHORT WarningTemperature;
 *     WORD InfoCount;
 *     BYTE Reserved0[2];
 *     DWORD Reserved1[2];
 *     STORAGE_TEMPERATURE_INFO TemperatureInfo[1];
 * } STORAGE_TEMPERATURE_DATA_DESCRIPTOR
 * }
 */
public class STORAGE_TEMPERATURE_DATA_DESCRIPTOR extends _STORAGE_TEMPERATURE_DATA_DESCRIPTOR {

    STORAGE_TEMPERATURE_DATA_DESCRIPTOR() {
        // Should not be called directly
    }
}
