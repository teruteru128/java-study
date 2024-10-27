// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _STORAGE_ZONE_DESCRIPTOR {
 *     DWORD Size;
 *     STORAGE_ZONE_TYPES ZoneType;
 *     STORAGE_ZONE_CONDITION ZoneCondition;
 *     BOOLEAN ResetWritePointerRecommend;
 *     BYTE Reserved0[3];
 *     DWORDLONG ZoneSize;
 *     DWORDLONG WritePointerOffset;
 * } STORAGE_ZONE_DESCRIPTOR
 * }
 */
public class STORAGE_ZONE_DESCRIPTOR extends _STORAGE_ZONE_DESCRIPTOR {

    STORAGE_ZONE_DESCRIPTOR() {
        // Should not be called directly
    }
}

