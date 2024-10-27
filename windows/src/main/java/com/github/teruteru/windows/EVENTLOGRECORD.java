// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _EVENTLOGRECORD {
 *     DWORD Length;
 *     DWORD Reserved;
 *     DWORD RecordNumber;
 *     DWORD TimeGenerated;
 *     DWORD TimeWritten;
 *     DWORD EventID;
 *     WORD EventType;
 *     WORD NumStrings;
 *     WORD EventCategory;
 *     WORD ReservedFlags;
 *     DWORD ClosingRecordNumber;
 *     DWORD StringOffset;
 *     DWORD UserSidLength;
 *     DWORD UserSidOffset;
 *     DWORD DataLength;
 *     DWORD DataOffset;
 * } EVENTLOGRECORD
 * }
 */
public class EVENTLOGRECORD extends _EVENTLOGRECORD {

    EVENTLOGRECORD() {
        // Should not be called directly
    }
}

