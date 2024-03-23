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
 * typedef struct _CRYPT_ENCRYPT_MESSAGE_PARA {
 *     DWORD cbSize;
 *     DWORD dwMsgEncodingType;
 *     HCRYPTPROV_LEGACY hCryptProv;
 *     CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm;
 *     void *pvEncryptionAuxInfo;
 *     DWORD dwFlags;
 *     DWORD dwInnerContentType;
 * } CRYPT_ENCRYPT_MESSAGE_PARA
 * }
 */
public class CRYPT_ENCRYPT_MESSAGE_PARA extends _CRYPT_ENCRYPT_MESSAGE_PARA {

    CRYPT_ENCRYPT_MESSAGE_PARA() {
        // Should not be called directly
    }
}

