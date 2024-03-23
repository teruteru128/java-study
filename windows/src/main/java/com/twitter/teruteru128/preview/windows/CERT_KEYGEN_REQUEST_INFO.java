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
 * typedef struct _CERT_KEYGEN_REQUEST_INFO {
 *     DWORD dwVersion;
 *     CERT_PUBLIC_KEY_INFO SubjectPublicKeyInfo;
 *     LPWSTR pwszChallengeString;
 * } CERT_KEYGEN_REQUEST_INFO
 * }
 */
public class CERT_KEYGEN_REQUEST_INFO extends _CERT_KEYGEN_REQUEST_INFO {

    CERT_KEYGEN_REQUEST_INFO() {
        // Should not be called directly
    }
}

