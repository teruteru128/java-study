// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _DEVICEDUMP_SECTION_HEADER {
 *     GUID guidDeviceDataId;
 *     BYTE sOrganizationID[16];
 *     DWORD dwFirmwareRevision;
 *     BYTE sModelNumber[32];
 *     BYTE szDeviceManufacturingID[32];
 *     DWORD dwFlags;
 *     DWORD bRestrictedPrivateDataVersion;
 *     DWORD dwFirmwareIssueId;
 *     BYTE szIssueDescriptionString[132];
 * } DEVICEDUMP_SECTION_HEADER
 * }
 */
public class DEVICEDUMP_SECTION_HEADER extends _DEVICEDUMP_SECTION_HEADER {

    DEVICEDUMP_SECTION_HEADER() {
        // Should not be called directly
    }
}

