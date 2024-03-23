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
 * typedef struct _STORAGE_PHYSICAL_DEVICE_DATA {
 *     DWORD DeviceId;
 *     DWORD Role;
 *     STORAGE_COMPONENT_HEALTH_STATUS HealthStatus;
 *     STORAGE_PROTOCOL_TYPE CommandProtocol;
 *     STORAGE_SPEC_VERSION SpecVersion;
 *     STORAGE_DEVICE_FORM_FACTOR FormFactor;
 *     BYTE Vendor[8];
 *     BYTE Model[40];
 *     BYTE FirmwareRevision[16];
 *     DWORDLONG Capacity;
 *     BYTE PhysicalLocation[32];
 *     DWORD Reserved[2];
 * } STORAGE_PHYSICAL_DEVICE_DATA
 * }
 */
public class STORAGE_PHYSICAL_DEVICE_DATA extends _STORAGE_PHYSICAL_DEVICE_DATA {

    STORAGE_PHYSICAL_DEVICE_DATA() {
        // Should not be called directly
    }
}

