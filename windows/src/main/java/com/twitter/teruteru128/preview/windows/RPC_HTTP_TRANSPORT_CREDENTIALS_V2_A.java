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
 * typedef struct _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A {
 *     SEC_WINNT_AUTH_IDENTITY_A *TransportCredentials;
 *     unsigned long Flags;
 *     unsigned long AuthenticationTarget;
 *     unsigned long NumberOfAuthnSchemes;
 *     unsigned long *AuthnSchemes;
 *     unsigned char *ServerCertificateSubject;
 *     SEC_WINNT_AUTH_IDENTITY_A *ProxyCredentials;
 *     unsigned long NumberOfProxyAuthnSchemes;
 *     unsigned long *ProxyAuthnSchemes;
 * } RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A
 * }
 */
public class RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A extends _RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A {

    RPC_HTTP_TRANSPORT_CREDENTIALS_V2_A() {
        // Should not be called directly
    }
}

