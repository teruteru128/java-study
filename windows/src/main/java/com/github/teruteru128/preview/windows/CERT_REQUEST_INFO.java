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
 * typedef struct _CERT_REQUEST_INFO {
 *     DWORD dwVersion;
 *     CERT_NAME_BLOB Subject;
 *     CERT_PUBLIC_KEY_INFO SubjectPublicKeyInfo;
 *     DWORD cAttribute;
 *     PCRYPT_ATTRIBUTE rgAttribute;
 * } CERT_REQUEST_INFO
 * }
 */
public class CERT_REQUEST_INFO extends _CERT_REQUEST_INFO {

    CERT_REQUEST_INFO() {
        // Should not be called directly
    }
}
