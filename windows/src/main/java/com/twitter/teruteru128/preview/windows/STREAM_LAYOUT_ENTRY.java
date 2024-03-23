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
 * typedef struct _STREAM_LAYOUT_ENTRY {
 *     DWORD Version;
 *     DWORD NextStreamOffset;
 *     DWORD Flags;
 *     DWORD ExtentInformationOffset;
 *     LARGE_INTEGER AllocationSize;
 *     LARGE_INTEGER EndOfFile;
 *     DWORD StreamInformationOffset;
 *     DWORD AttributeTypeCode;
 *     DWORD AttributeFlags;
 *     DWORD StreamIdentifierLength;
 *     WCHAR StreamIdentifier[1];
 * } STREAM_LAYOUT_ENTRY
 * }
 */
public class STREAM_LAYOUT_ENTRY extends _STREAM_LAYOUT_ENTRY {

    STREAM_LAYOUT_ENTRY() {
        // Should not be called directly
    }
}

