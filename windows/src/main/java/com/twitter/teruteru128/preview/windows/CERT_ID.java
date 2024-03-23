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
 * typedef struct _CERT_ID {
 *     DWORD dwIdChoice;
 *     union {
 *         CERT_ISSUER_SERIAL_NUMBER IssuerSerialNumber;
 *         CRYPT_HASH_BLOB KeyId;
 *         CRYPT_HASH_BLOB HashId;
 *     };
 * } CERT_ID
 * }
 */
public class CERT_ID extends _CERT_ID {

    CERT_ID() {
        // Should not be called directly
    }
}

