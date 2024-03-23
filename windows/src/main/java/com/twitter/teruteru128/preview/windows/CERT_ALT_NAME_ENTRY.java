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
 * typedef struct _CERT_ALT_NAME_ENTRY {
 *     DWORD dwAltNameChoice;
 *     union {
 *         PCERT_OTHER_NAME pOtherName;
 *         LPWSTR pwszRfc822Name;
 *         LPWSTR pwszDNSName;
 *         CERT_NAME_BLOB DirectoryName;
 *         LPWSTR pwszURL;
 *         CRYPT_DATA_BLOB IPAddress;
 *         LPSTR pszRegisteredID;
 *     };
 * } CERT_ALT_NAME_ENTRY
 * }
 */
public class CERT_ALT_NAME_ENTRY extends _CERT_ALT_NAME_ENTRY {

    CERT_ALT_NAME_ENTRY() {
        // Should not be called directly
    }
}

