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
 * typedef struct _CRYPT_ECC_PRIVATE_KEY_INFO {
 *     DWORD dwVersion;
 *     CRYPT_DER_BLOB PrivateKey;
 *     LPSTR szCurveOid;
 *     CRYPT_BIT_BLOB PublicKey;
 * } CRYPT_ECC_PRIVATE_KEY_INFO
 * }
 */
public class CRYPT_ECC_PRIVATE_KEY_INFO extends _CRYPT_ECC_PRIVATE_KEY_INFO {

    CRYPT_ECC_PRIVATE_KEY_INFO() {
        // Should not be called directly
    }
}

