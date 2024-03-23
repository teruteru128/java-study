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
 * typedef struct _FSCTL_GET_INTEGRITY_INFORMATION_BUFFER {
 *     WORD ChecksumAlgorithm;
 *     WORD Reserved;
 *     DWORD Flags;
 *     DWORD ChecksumChunkSizeInBytes;
 *     DWORD ClusterSizeInBytes;
 * } FSCTL_GET_INTEGRITY_INFORMATION_BUFFER
 * }
 */
public class FSCTL_GET_INTEGRITY_INFORMATION_BUFFER extends _FSCTL_GET_INTEGRITY_INFORMATION_BUFFER {

    FSCTL_GET_INTEGRITY_INFORMATION_BUFFER() {
        // Should not be called directly
    }
}

