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
 * typedef struct _PROCESS_MITIGATION_ASLR_POLICY {
 *     union {
 *         DWORD Flags;
 *         struct {
 *             DWORD EnableBottomUpRandomization : 1;
 *             DWORD EnableForceRelocateImages : 1;
 *             DWORD EnableHighEntropy : 1;
 *             DWORD DisallowStrippedImages : 1;
 *             DWORD ReservedFlags : 28;
 *         };
 *     };
 * } PROCESS_MITIGATION_ASLR_POLICY
 * }
 */
public class PROCESS_MITIGATION_ASLR_POLICY extends _PROCESS_MITIGATION_ASLR_POLICY {

    PROCESS_MITIGATION_ASLR_POLICY() {
        // Should not be called directly
    }
}

