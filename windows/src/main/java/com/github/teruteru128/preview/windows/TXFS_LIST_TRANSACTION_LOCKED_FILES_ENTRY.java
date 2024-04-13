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
 * typedef struct _TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY {
 *     DWORDLONG Offset;
 *     DWORD NameFlags;
 *     LONGLONG FileId;
 *     DWORD Reserved1;
 *     DWORD Reserved2;
 *     LONGLONG Reserved3;
 *     WCHAR FileName[1];
 * } TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY
 * }
 */
public class TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY extends _TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY {

    TXFS_LIST_TRANSACTION_LOCKED_FILES_ENTRY() {
        // Should not be called directly
    }
}
