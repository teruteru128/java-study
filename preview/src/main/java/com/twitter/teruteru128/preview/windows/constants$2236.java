// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2236 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2236() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "CertFreeCertificateChainList",
        constants$0.const$0
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("HashAlgorithm"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("HashedMessage"),
        RuntimeHelper.POINTER.withName("pszTSAPolicyId"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("Nonce"),
        JAVA_INT.withName("fCertReq"),
        JAVA_INT.withName("cExtension"),
        RuntimeHelper.POINTER.withName("rgExtension")
    ).withName("_CRYPT_TIMESTAMP_REQUEST");
    static final VarHandle const$2 = constants$2236.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final VarHandle const$3 = constants$2236.const$1.varHandle(MemoryLayout.PathElement.groupElement("pszTSAPolicyId"));
    static final VarHandle const$4 = constants$2236.const$1.varHandle(MemoryLayout.PathElement.groupElement("fCertReq"));
    static final VarHandle const$5 = constants$2236.const$1.varHandle(MemoryLayout.PathElement.groupElement("cExtension"));
}

