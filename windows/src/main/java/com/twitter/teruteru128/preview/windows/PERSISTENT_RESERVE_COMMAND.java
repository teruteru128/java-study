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
 * typedef struct _PERSISTENT_RESERVE_COMMAND {
 *     DWORD Version;
 *     DWORD Size;
 *     union {
 *         struct {
 *             BYTE ServiceAction : 5;
 *             BYTE Reserved1 : 3;
 *             WORD AllocationLength;
 *         } PR_IN;
 *         struct {
 *             BYTE ServiceAction : 5;
 *             BYTE Reserved1 : 3;
 *             BYTE Type : 4;
 *             BYTE Scope : 4;
 *             BYTE ParameterList[0];
 *         } PR_OUT;
 *     };
 * } PERSISTENT_RESERVE_COMMAND
 * }
 */
public class PERSISTENT_RESERVE_COMMAND extends _PERSISTENT_RESERVE_COMMAND {

    PERSISTENT_RESERVE_COMMAND() {
        // Should not be called directly
    }
}

