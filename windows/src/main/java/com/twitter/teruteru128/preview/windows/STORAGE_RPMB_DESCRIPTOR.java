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
 * typedef struct _STORAGE_RPMB_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD SizeInBytes;
 *     DWORD MaxReliableWriteSizeInBytes;
 *     STORAGE_RPMB_FRAME_TYPE FrameFormat;
 * } STORAGE_RPMB_DESCRIPTOR
 * }
 */
public class STORAGE_RPMB_DESCRIPTOR extends _STORAGE_RPMB_DESCRIPTOR {

    STORAGE_RPMB_DESCRIPTOR() {
        // Should not be called directly
    }
}

