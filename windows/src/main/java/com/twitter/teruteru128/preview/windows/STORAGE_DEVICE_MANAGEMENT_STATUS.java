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
 * typedef struct _STORAGE_DEVICE_MANAGEMENT_STATUS {
 *     DWORD Version;
 *     DWORD Size;
 *     STORAGE_DISK_HEALTH_STATUS Health;
 *     DWORD NumberOfOperationalStatus;
 *     DWORD NumberOfAdditionalReasons;
 *     STORAGE_DISK_OPERATIONAL_STATUS OperationalStatus[16];
 *     STORAGE_OPERATIONAL_REASON AdditionalReasons[1];
 * } STORAGE_DEVICE_MANAGEMENT_STATUS
 * }
 */
public class STORAGE_DEVICE_MANAGEMENT_STATUS extends _STORAGE_DEVICE_MANAGEMENT_STATUS {

    STORAGE_DEVICE_MANAGEMENT_STATUS() {
        // Should not be called directly
    }
}

