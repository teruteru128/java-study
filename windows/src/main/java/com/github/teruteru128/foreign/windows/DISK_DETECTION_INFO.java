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
 * typedef struct _DISK_DETECTION_INFO {
 *     DWORD SizeOfDetectInfo;
 *     DETECTION_TYPE DetectionType;
 *     union {
 *         struct {
 *             DISK_INT13_INFO Int13;
 *             DISK_EX_INT13_INFO ExInt13;
 *         };
 *     };
 * } DISK_DETECTION_INFO
 * }
 */
public class DISK_DETECTION_INFO extends _DISK_DETECTION_INFO {

    DISK_DETECTION_INFO() {
        // Should not be called directly
    }
}
