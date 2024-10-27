// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _DISK_PERFORMANCE {
 *     LARGE_INTEGER BytesRead;
 *     LARGE_INTEGER BytesWritten;
 *     LARGE_INTEGER ReadTime;
 *     LARGE_INTEGER WriteTime;
 *     LARGE_INTEGER IdleTime;
 *     DWORD ReadCount;
 *     DWORD WriteCount;
 *     DWORD QueueDepth;
 *     DWORD SplitCount;
 *     LARGE_INTEGER QueryTime;
 *     DWORD StorageDeviceNumber;
 *     WCHAR StorageManagerName[8];
 * } DISK_PERFORMANCE
 * }
 */
public class DISK_PERFORMANCE extends _DISK_PERFORMANCE {

    DISK_PERFORMANCE() {
        // Should not be called directly
    }
}

