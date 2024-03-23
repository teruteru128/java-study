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
 * typedef struct _CMSG_KEY_TRANS_RECIPIENT_INFO {
 *     DWORD dwVersion;
 *     CERT_ID RecipientId;
 *     CRYPT_ALGORITHM_IDENTIFIER KeyEncryptionAlgorithm;
 *     CRYPT_DATA_BLOB EncryptedKey;
 * } CMSG_KEY_TRANS_RECIPIENT_INFO
 * }
 */
public class CMSG_KEY_TRANS_RECIPIENT_INFO extends _CMSG_KEY_TRANS_RECIPIENT_INFO {

    CMSG_KEY_TRANS_RECIPIENT_INFO() {
        // Should not be called directly
    }
}

