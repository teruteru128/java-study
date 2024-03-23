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
 * typedef union _STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE {
 *     struct {
 *         DWORD RetainAsynEvent : 1;
 *         DWORD LogSpecificField : 4;
 *         DWORD Reserved : 27;
 *     };
 *     DWORD AsUlong;
 * } STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE
 * }
 */
public class STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE extends _STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE {

    STORAGE_PROTOCOL_DATA_SUBVALUE_GET_LOG_PAGE() {
        // Should not be called directly
    }
}

