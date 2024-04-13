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
 * typedef struct _BCRYPT_DSA_PARAMETER_HEADER_V2 {
 *     ULONG cbLength;
 *     ULONG dwMagic;
 *     ULONG cbKeyLength;
 *     HASHALGORITHM_ENUM hashAlgorithm;
 *     DSAFIPSVERSION_ENUM standardVersion;
 *     ULONG cbSeedLength;
 *     ULONG cbGroupSize;
 *     UCHAR Count[4];
 * } BCRYPT_DSA_PARAMETER_HEADER_V2
 * }
 */
public class BCRYPT_DSA_PARAMETER_HEADER_V2 extends _BCRYPT_DSA_PARAMETER_HEADER_V2 {

    BCRYPT_DSA_PARAMETER_HEADER_V2() {
        // Should not be called directly
    }
}
