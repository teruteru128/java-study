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
 * typedef union _ULARGE_INTEGER {
 *     struct {
 *         DWORD LowPart;
 *         DWORD HighPart;
 *     };
 *     struct {
 *         DWORD LowPart;
 *         DWORD HighPart;
 *     } u;
 *     ULONGLONG QuadPart;
 * } ULARGE_INTEGER
 * }
 */
public class ULARGE_INTEGER extends _ULARGE_INTEGER {

    ULARGE_INTEGER() {
        // Should not be called directly
    }
}
