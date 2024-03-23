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
 * typedef struct _TRANSACTION_NOTIFICATION {
 *     PVOID TransactionKey;
 *     ULONG TransactionNotification;
 *     LARGE_INTEGER TmVirtualClock;
 *     ULONG ArgumentLength;
 * } TRANSACTION_NOTIFICATION
 * }
 */
public class TRANSACTION_NOTIFICATION extends _TRANSACTION_NOTIFICATION {

    TRANSACTION_NOTIFICATION() {
        // Should not be called directly
    }
}

