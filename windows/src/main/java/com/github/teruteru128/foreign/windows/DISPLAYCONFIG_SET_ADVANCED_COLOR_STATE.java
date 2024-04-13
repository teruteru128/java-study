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
