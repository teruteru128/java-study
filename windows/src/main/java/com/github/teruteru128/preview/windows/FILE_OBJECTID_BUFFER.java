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
 * typedef struct _FILE_OBJECTID_BUFFER {
 *     BYTE ObjectId[16];
 *     union {
 *         struct {
 *             BYTE BirthVolumeId[16];
 *             BYTE BirthObjectId[16];
 *             BYTE DomainId[16];
 *         };
 *         BYTE ExtendedInfo[48];
 *     };
 * } FILE_OBJECTID_BUFFER
 * }
 */
public class FILE_OBJECTID_BUFFER extends _FILE_OBJECTID_BUFFER {

    FILE_OBJECTID_BUFFER() {
        // Should not be called directly
    }
}
