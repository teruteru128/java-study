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
 * typedef struct _CSV_QUERY_MDS_PATH_V2 {
 *     LONGLONG Version;
 *     DWORD RequiredSize;
 *     DWORD MdsNodeId;
 *     DWORD DsNodeId;
 *     DWORD Flags;
 *     CSVFS_DISK_CONNECTIVITY DiskConnectivity;
 *     GUID VolumeId;
 *     DWORD IpAddressOffset;
 *     DWORD IpAddressLength;
 *     DWORD PathOffset;
 *     DWORD PathLength;
 * } CSV_QUERY_MDS_PATH_V2
 * }
 */
public class CSV_QUERY_MDS_PATH_V2 extends _CSV_QUERY_MDS_PATH_V2 {

    CSV_QUERY_MDS_PATH_V2() {
        // Should not be called directly
    }
}
