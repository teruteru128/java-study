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
 * typedef struct _BCRYPT_ECCFULLKEY_BLOB {
 *     ULONG dwMagic;
 *     ULONG dwVersion;
 *     ECC_CURVE_TYPE_ENUM dwCurveType;
 *     ECC_CURVE_ALG_ID_ENUM dwCurveGenerationAlgId;
 *     ULONG cbFieldLength;
 *     ULONG cbSubgroupOrder;
 *     ULONG cbCofactor;
 *     ULONG cbSeed;
 * } BCRYPT_ECCFULLKEY_BLOB
 * }
 */
public class BCRYPT_ECCFULLKEY_BLOB extends _BCRYPT_ECCFULLKEY_BLOB {

    BCRYPT_ECCFULLKEY_BLOB() {
        // Should not be called directly
    }
}
