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
 * typedef struct _CERT_BASIC_CONSTRAINTS_INFO {
 *     CRYPT_BIT_BLOB SubjectType;
 *     BOOL fPathLenConstraint;
 *     DWORD dwPathLenConstraint;
 *     DWORD cSubtreesConstraint;
 *     CERT_NAME_BLOB *rgSubtreesConstraint;
 * } CERT_BASIC_CONSTRAINTS_INFO
 * }
 */
public class CERT_BASIC_CONSTRAINTS_INFO extends _CERT_BASIC_CONSTRAINTS_INFO {

    CERT_BASIC_CONSTRAINTS_INFO() {
        // Should not be called directly
    }
}

