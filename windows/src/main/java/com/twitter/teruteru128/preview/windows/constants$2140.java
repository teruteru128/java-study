// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2140 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2140() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CertEnumCRLContextProperties",
        constants$65.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "CertFindCertificateInCRL",
        constants$588.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "CertIsValidCRLForCertificate",
        constants$586.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CertAddEncodedCertificateToStore",
        constants$726.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "CertAddCertificateContextToStore",
        constants$586.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "CertAddSerializedElementToStore",
        constants$2140.const$5
    );
}

