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
 * typedef struct _EXCEPTION_RECORD32 {
 *     DWORD ExceptionCode;
 *     DWORD ExceptionFlags;
 *     DWORD ExceptionRecord;
 *     DWORD ExceptionAddress;
 *     DWORD NumberParameters;
 *     DWORD ExceptionInformation[15];
 * } EXCEPTION_RECORD32
 * }
 */
public class EXCEPTION_RECORD32 extends _EXCEPTION_RECORD32 {

    EXCEPTION_RECORD32() {
        // Should not be called directly
    }
}

