// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _STORAGE_MINIPORT_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     STORAGE_PORT_CODE_SET Portdriver;
 *     BOOLEAN LUNResetSupported;
 *     BOOLEAN TargetResetSupported;
 *     WORD IoTimeoutValue;
 *     BOOLEAN ExtraIoInfoSupported;
 *     union {
 *         struct {
 *             BYTE LogicalPoFxForDisk : 1;
 *             BYTE Reserved : 7;
 *         };
 *         BYTE AsBYTE;
 *     } Flags;
 *     BYTE Reserved0[2];
 *     DWORD Reserved1;
 * } STORAGE_MINIPORT_DESCRIPTOR
 * }
 */
public class STORAGE_MINIPORT_DESCRIPTOR extends _STORAGE_MINIPORT_DESCRIPTOR {

    STORAGE_MINIPORT_DESCRIPTOR() {
        // Should not be called directly
    }
}

