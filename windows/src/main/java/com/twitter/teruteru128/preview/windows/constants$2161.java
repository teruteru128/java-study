// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2161 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2161() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CertCompareCertificateName",
        constants$569.const$3
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CertIsRDNAttrsInCertificateName",
        constants$2077.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CertComparePublicKeyInfo",
        constants$569.const$3
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CertGetPublicKeyLength",
        constants$12.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CryptVerifyCertificateSignature",
        constants$2161.const$4
    );
}

