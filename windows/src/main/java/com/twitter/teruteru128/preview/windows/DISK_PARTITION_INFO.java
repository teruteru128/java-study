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
 * typedef struct _DISK_PARTITION_INFO {
 *     DWORD SizeOfPartitionInfo;
 *     PARTITION_STYLE PartitionStyle;
 *     union {
 *         struct {
 *             DWORD Signature;
 *             DWORD CheckSum;
 *         } Mbr;
 *         struct {
 *             GUID DiskId;
 *         } Gpt;
 *     };
 * } DISK_PARTITION_INFO
 * }
 */
public class DISK_PARTITION_INFO extends _DISK_PARTITION_INFO {

    DISK_PARTITION_INFO() {
        // Should not be called directly
    }
}

