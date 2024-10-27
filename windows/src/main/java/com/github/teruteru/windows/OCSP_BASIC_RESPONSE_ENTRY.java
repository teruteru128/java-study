// Generated by jextract

package com.github.teruteru.windows;

/**
 * {@snippet lang=c :
 * typedef struct _OCSP_BASIC_RESPONSE_ENTRY {
 *     OCSP_CERT_ID CertId;
 *     DWORD dwCertStatus;
 *     union {
 *         POCSP_BASIC_REVOKED_INFO pRevokedInfo;
 *     };
 *     FILETIME ThisUpdate;
 *     FILETIME NextUpdate;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * } OCSP_BASIC_RESPONSE_ENTRY
 * }
 */
public class OCSP_BASIC_RESPONSE_ENTRY extends _OCSP_BASIC_RESPONSE_ENTRY {

    OCSP_BASIC_RESPONSE_ENTRY() {
        // Should not be called directly
    }
}

