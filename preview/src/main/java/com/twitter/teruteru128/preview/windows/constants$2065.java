// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2065 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2065() {}
    static final VarHandle const$0 = constants$2064.const$5.varHandle(MemoryLayout.PathElement.groupElement("cBiometricData"));
    static final VarHandle const$1 = constants$2064.const$5.varHandle(MemoryLayout.PathElement.groupElement("rgBiometricData"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("SignatureAlgorithm"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData"),
            JAVA_INT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(4)
        ).withName("Signature"),
        JAVA_INT.withName("cCertEncoded"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgCertEncoded")
    ).withName("_OCSP_SIGNATURE_INFO");
    static final VarHandle const$3 = constants$2065.const$2.varHandle(MemoryLayout.PathElement.groupElement("cCertEncoded"));
    static final VarHandle const$4 = constants$2065.const$2.varHandle(MemoryLayout.PathElement.groupElement("rgCertEncoded"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("ToBeSigned"),
        RuntimeHelper.POINTER.withName("pOptionalSignatureInfo")
    ).withName("_OCSP_SIGNED_REQUEST_INFO");
}


