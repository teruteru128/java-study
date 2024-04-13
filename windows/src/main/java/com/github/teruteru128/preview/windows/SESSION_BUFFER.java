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
 * typedef struct _SESSION_BUFFER {
 *     UCHAR lsn;
 *     UCHAR state;
 *     UCHAR local_name[16];
 *     UCHAR remote_name[16];
 *     UCHAR rcvs_outstanding;
 *     UCHAR sends_outstanding;
 * } SESSION_BUFFER
 * }
 */
public class SESSION_BUFFER extends _SESSION_BUFFER {

    SESSION_BUFFER() {
        // Should not be called directly
    }
}
