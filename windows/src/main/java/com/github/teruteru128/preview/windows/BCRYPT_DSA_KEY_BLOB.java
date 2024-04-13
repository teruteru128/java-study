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
 * typedef struct _BCRYPT_DSA_KEY_BLOB {
 *     ULONG dwMagic;
 *     ULONG cbKey;
 *     UCHAR Count[4];
 *     UCHAR Seed[20];
 *     UCHAR q[20];
 * } BCRYPT_DSA_KEY_BLOB
 * }
 */
public class BCRYPT_DSA_KEY_BLOB extends _BCRYPT_DSA_KEY_BLOB {

    BCRYPT_DSA_KEY_BLOB() {
        // Should not be called directly
    }
}
