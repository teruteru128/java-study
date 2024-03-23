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
 * typedef struct _CMSG_CONTENT_ENCRYPT_INFO {
 *     DWORD cbSize;
 *     HCRYPTPROV_LEGACY hCryptProv;
 *     CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm;
 *     void *pvEncryptionAuxInfo;
 *     DWORD cRecipients;
 *     PCMSG_RECIPIENT_ENCODE_INFO rgCmsRecipients;
 *     PFN_CMSG_ALLOC pfnAlloc;
 *     PFN_CMSG_FREE pfnFree;
 *     DWORD dwEncryptFlags;
 *     union {
 *         HCRYPTKEY hContentEncryptKey;
 *         BCRYPT_KEY_HANDLE hCNGContentEncryptKey;
 *     };
 *     DWORD dwFlags;
 *     BOOL fCNG;
 *     BYTE *pbCNGContentEncryptKeyObject;
 *     BYTE *pbContentEncryptKey;
 *     DWORD cbContentEncryptKey;
 * } CMSG_CONTENT_ENCRYPT_INFO
 * }
 */
public class CMSG_CONTENT_ENCRYPT_INFO extends _CMSG_CONTENT_ENCRYPT_INFO {

    CMSG_CONTENT_ENCRYPT_INFO() {
        // Should not be called directly
    }
}

