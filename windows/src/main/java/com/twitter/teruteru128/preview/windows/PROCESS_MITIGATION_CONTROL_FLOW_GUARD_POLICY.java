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
 * typedef struct _PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY {
 *     union {
 *         DWORD Flags;
 *         struct {
 *             DWORD EnableControlFlowGuard : 1;
 *             DWORD EnableExportSuppression : 1;
 *             DWORD StrictMode : 1;
 *             DWORD EnableXfg : 1;
 *             DWORD EnableXfgAuditMode : 1;
 *             DWORD ReservedFlags : 27;
 *         };
 *     };
 * } PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY
 * }
 */
public class PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY extends _PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY {

    PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY() {
        // Should not be called directly
    }
}

