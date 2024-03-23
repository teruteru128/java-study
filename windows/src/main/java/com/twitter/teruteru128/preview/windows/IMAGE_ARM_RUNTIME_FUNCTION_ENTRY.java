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
 * typedef struct _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY {
 *     DWORD BeginAddress;
 *     union {
 *         DWORD UnwindData;
 *         struct {
 *             DWORD Flag : 2;
 *             DWORD FunctionLength : 11;
 *             DWORD Ret : 2;
 *             DWORD H : 1;
 *             DWORD Reg : 3;
 *             DWORD R : 1;
 *             DWORD L : 1;
 *             DWORD C : 1;
 *             DWORD StackAdjust : 10;
 *         };
 *     };
 * } IMAGE_ARM_RUNTIME_FUNCTION_ENTRY
 * }
 */
public class IMAGE_ARM_RUNTIME_FUNCTION_ENTRY extends _IMAGE_ARM_RUNTIME_FUNCTION_ENTRY {

    IMAGE_ARM_RUNTIME_FUNCTION_ENTRY() {
        // Should not be called directly
    }
}

