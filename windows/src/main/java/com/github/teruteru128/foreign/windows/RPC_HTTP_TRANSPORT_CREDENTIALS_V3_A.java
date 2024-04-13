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
 * typedef struct _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A {
 *     RPC_AUTH_IDENTITY_HANDLE TransportCredentials;
 *     unsigned long Flags;
 *     unsigned long AuthenticationTarget;
 *     unsigned long NumberOfAuthnSchemes;
 *     unsigned long *AuthnSchemes;
 *     unsigned char *ServerCertificateSubject;
 *     RPC_AUTH_IDENTITY_HANDLE ProxyCredentials;
 *     unsigned long NumberOfProxyAuthnSchemes;
 *     unsigned long *ProxyAuthnSchemes;
 * } RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A
 * }
 */
public class RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A extends _RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A {

    RPC_HTTP_TRANSPORT_CREDENTIALS_V3_A() {
        // Should not be called directly
    }
}
