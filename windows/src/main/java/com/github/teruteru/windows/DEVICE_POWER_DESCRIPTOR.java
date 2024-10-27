// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _DEVICE_POWER_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     BOOLEAN DeviceAttentionSupported;
 *     BOOLEAN AsynchronousNotificationSupported;
 *     BOOLEAN IdlePowerManagementEnabled;
 *     BOOLEAN D3ColdEnabled;
 *     BOOLEAN D3ColdSupported;
 *     BOOLEAN NoVerifyDuringIdlePower;
 *     BYTE Reserved[2];
 *     DWORD IdleTimeoutInMS;
 * } DEVICE_POWER_DESCRIPTOR
 * }
 */
public class DEVICE_POWER_DESCRIPTOR extends _DEVICE_POWER_DESCRIPTOR {

    DEVICE_POWER_DESCRIPTOR() {
        // Should not be called directly
    }
}

