// Generated by jextract

package com.github.teruteru128.foreign.windows;

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
 * typedef struct _TXFS_SAVEPOINT_INFORMATION {
 *     HANDLE KtmTransaction;
 *     DWORD ActionCode;
 *     DWORD SavepointId;
 * } TXFS_SAVEPOINT_INFORMATION
 * }
 */
public class TXFS_SAVEPOINT_INFORMATION extends _TXFS_SAVEPOINT_INFORMATION {

    TXFS_SAVEPOINT_INFORMATION() {
        // Should not be called directly
    }
}
