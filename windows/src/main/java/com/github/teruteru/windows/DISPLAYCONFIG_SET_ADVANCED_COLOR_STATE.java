// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE {
 *     DISPLAYCONFIG_DEVICE_INFO_HEADER header;
 *     union {
 *         struct {
 *             UINT32 enableAdvancedColor : 1;
 *             UINT32 reserved : 31;
 *         };
 *         UINT32 value;
 *     };
 * } DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE
 * }
 */
public class DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE extends _DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE {

    DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE() {
        // Should not be called directly
    }
}

