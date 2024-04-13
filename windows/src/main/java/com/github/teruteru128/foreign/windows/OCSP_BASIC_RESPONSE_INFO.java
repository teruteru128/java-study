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
 * typedef struct _OCSP_BASIC_RESPONSE_INFO {
 *     DWORD dwVersion;
 *     DWORD dwResponderIdChoice;
 *     union {
 *         CERT_NAME_BLOB ByNameResponderId;
 *         CRYPT_HASH_BLOB ByKeyResponderId;
 *     };
 *     FILETIME ProducedAt;
 *     DWORD cResponseEntry;
 *     POCSP_BASIC_RESPONSE_ENTRY rgResponseEntry;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * } OCSP_BASIC_RESPONSE_INFO
 * }
 */
public class OCSP_BASIC_RESPONSE_INFO extends _OCSP_BASIC_RESPONSE_INFO {

    OCSP_BASIC_RESPONSE_INFO() {
        // Should not be called directly
    }
}
