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
 * typedef struct _MEMORY_BASIC_INFORMATION64 {
 *     ULONGLONG BaseAddress;
 *     ULONGLONG AllocationBase;
 *     DWORD AllocationProtect;
 *     DWORD __alignment1;
 *     ULONGLONG RegionSize;
 *     DWORD State;
 *     DWORD Protect;
 *     DWORD Type;
 *     DWORD __alignment2;
 * } MEMORY_BASIC_INFORMATION64
 * }
 */
public class MEMORY_BASIC_INFORMATION64 extends _MEMORY_BASIC_INFORMATION64 {

    MEMORY_BASIC_INFORMATION64() {
        // Should not be called directly
    }
}
