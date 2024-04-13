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
 * typedef struct _CERT_POLICY95_QUALIFIER1 {
 *     LPWSTR pszPracticesReference;
 *     LPSTR pszNoticeIdentifier;
 *     LPSTR pszNSINoticeIdentifier;
 *     DWORD cCPSURLs;
 *     CPS_URLS *rgCPSURLs;
 * } CERT_POLICY95_QUALIFIER1
 * }
 */
public class CERT_POLICY95_QUALIFIER1 extends _CERT_POLICY95_QUALIFIER1 {

    CERT_POLICY95_QUALIFIER1() {
        // Should not be called directly
    }
}
