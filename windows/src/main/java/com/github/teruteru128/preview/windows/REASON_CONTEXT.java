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
 * typedef struct _REASON_CONTEXT {
 *     ULONG Version;
 *     DWORD Flags;
 *     union {
 *         struct {
 *             HMODULE LocalizedReasonModule;
 *             ULONG LocalizedReasonId;
 *             ULONG ReasonStringCount;
 *             LPWSTR *ReasonStrings;
 *         } Detailed;
 *         LPWSTR SimpleReasonString;
 *     } Reason;
 * } REASON_CONTEXT
 * }
 */
public class REASON_CONTEXT extends _REASON_CONTEXT {

    REASON_CONTEXT() {
        // Should not be called directly
    }
}
