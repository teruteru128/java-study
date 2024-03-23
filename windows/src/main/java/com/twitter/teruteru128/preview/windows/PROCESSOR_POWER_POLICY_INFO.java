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
 * typedef struct _PROCESSOR_POWER_POLICY_INFO {
 *     DWORD TimeCheck;
 *     DWORD DemoteLimit;
 *     DWORD PromoteLimit;
 *     BYTE DemotePercent;
 *     BYTE PromotePercent;
 *     BYTE Spare[2];
 *     DWORD AllowDemotion : 1;
 *     DWORD AllowPromotion : 1;
 *     DWORD Reserved : 30;
 * } PROCESSOR_POWER_POLICY_INFO
 * }
 */
public class PROCESSOR_POWER_POLICY_INFO extends _PROCESSOR_POWER_POLICY_INFO {

    PROCESSOR_POWER_POLICY_INFO() {
        // Should not be called directly
    }
}

