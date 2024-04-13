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
 * typedef struct _EXCEPTION_RECORD64 {
 *     DWORD ExceptionCode;
 *     DWORD ExceptionFlags;
 *     DWORD64 ExceptionRecord;
 *     DWORD64 ExceptionAddress;
 *     DWORD NumberParameters;
 *     DWORD __unusedAlignment;
 *     DWORD64 ExceptionInformation[15];
 * } EXCEPTION_RECORD64
 * }
 */
public class EXCEPTION_RECORD64 extends _EXCEPTION_RECORD64 {

    EXCEPTION_RECORD64() {
        // Should not be called directly
    }
}
