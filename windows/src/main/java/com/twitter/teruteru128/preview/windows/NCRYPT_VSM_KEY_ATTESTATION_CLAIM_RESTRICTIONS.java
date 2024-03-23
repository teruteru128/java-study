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
 * typedef struct _NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS {
 *     ULONG Version;
 *     ULONGLONG TrustletId;
 *     ULONG MinSvn;
 *     ULONG FlagsMask;
 *     ULONG FlagsExpected;
 *     ULONG AllowDebugging : 1;
 *     ULONG Reserved : 31;
 * } NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS
 * }
 */
public class NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS extends _NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS {

    NCRYPT_VSM_KEY_ATTESTATION_CLAIM_RESTRICTIONS() {
        // Should not be called directly
    }
}

