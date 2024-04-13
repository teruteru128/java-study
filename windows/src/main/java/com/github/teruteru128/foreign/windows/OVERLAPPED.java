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
 * typedef struct _OVERLAPPED {
 *     ULONG_PTR Internal;
 *     ULONG_PTR InternalHigh;
 *     union {
 *         struct {
 *             DWORD Offset;
 *             DWORD OffsetHigh;
 *         };
 *         PVOID Pointer;
 *     };
 *     HANDLE hEvent;
 * } OVERLAPPED
 * }
 */
public class OVERLAPPED extends _OVERLAPPED {

    OVERLAPPED() {
        // Should not be called directly
    }
}
