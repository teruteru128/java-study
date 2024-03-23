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
 * typedef struct _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER {
 *     ULONG Version;
 *     ULONG KeyUsage;
 *     ULONG PerBootKey : 1;
 *     ULONG Reserved : 31;
 *     ULONG cbAlgName;
 *     ULONG cbNonce;
 *     ULONG cbAuthTag;
 *     ULONG cbWrappingKey;
 *     ULONG cbIsolatedKey;
 * } NCRYPT_EXPORTED_ISOLATED_KEY_HEADER
 * }
 */
public class NCRYPT_EXPORTED_ISOLATED_KEY_HEADER extends _NCRYPT_EXPORTED_ISOLATED_KEY_HEADER {

    NCRYPT_EXPORTED_ISOLATED_KEY_HEADER() {
        // Should not be called directly
    }
}

