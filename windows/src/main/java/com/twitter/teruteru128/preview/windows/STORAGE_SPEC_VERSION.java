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
 * typedef union _STORAGE_SPEC_VERSION {
 *     struct {
 *         union {
 *             struct {
 *                 BYTE SubMinor;
 *                 BYTE Minor;
 *             };
 *             WORD AsUshort;
 *         } MinorVersion;
 *         WORD MajorVersion;
 *     };
 *     DWORD AsUlong;
 * } STORAGE_SPEC_VERSION
 * }
 */
public class STORAGE_SPEC_VERSION extends _STORAGE_SPEC_VERSION {

    STORAGE_SPEC_VERSION() {
        // Should not be called directly
    }
}

