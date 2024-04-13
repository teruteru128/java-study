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
 * typedef struct _TP_CALLBACK_ENVIRON_V3 {
 *     TP_VERSION Version;
 *     PTP_POOL Pool;
 *     PTP_CLEANUP_GROUP CleanupGroup;
 *     PTP_CLEANUP_GROUP_CANCEL_CALLBACK CleanupGroupCancelCallback;
 *     PVOID RaceDll;
 *     struct _ACTIVATION_CONTEXT *ActivationContext;
 *     PTP_SIMPLE_CALLBACK FinalizationCallback;
 *     union {
 *         DWORD Flags;
 *         struct {
 *             DWORD LongFunction : 1;
 *             DWORD Persistent : 1;
 *             DWORD Private : 30;
 *         } s;
 *     } u;
 *     TP_CALLBACK_PRIORITY CallbackPriority;
 *     DWORD Size;
 * } TP_CALLBACK_ENVIRON_V3
 * }
 */
public class TP_CALLBACK_ENVIRON_V3 extends _TP_CALLBACK_ENVIRON_V3 {

    TP_CALLBACK_ENVIRON_V3() {
        // Should not be called directly
    }
}
