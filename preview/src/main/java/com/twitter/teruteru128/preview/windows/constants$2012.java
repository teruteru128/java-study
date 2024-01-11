// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2012 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2012() {}
    static final VarHandle const$0 = constants$2011.const$3.varHandle(MemoryLayout.PathElement.groupElement("pszPrivateKeyObjId"));
    static final VarHandle const$1 = constants$2011.const$3.varHandle(MemoryLayout.PathElement.groupElement("pEncryptPrivateKeyFunc"));
    static final VarHandle const$2 = constants$2011.const$3.varHandle(MemoryLayout.PathElement.groupElement("pVoidEncryptFunc"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("SerialNumber"),
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
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("Issuer"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("NotBefore"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("NotAfter"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("Subject"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("pszObjId"),
                MemoryLayout.structLayout(
                    JAVA_INT.withName("cbData"),
                    MemoryLayout.paddingLayout(4),
                    RuntimeHelper.POINTER.withName("pbData")
                ).withName("Parameters")
            ).withName("Algorithm"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData"),
                JAVA_INT.withName("cUnusedBits"),
                MemoryLayout.paddingLayout(4)
            ).withName("PublicKey")
        ).withName("SubjectPublicKeyInfo"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData"),
            JAVA_INT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(4)
        ).withName("IssuerUniqueId"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData"),
            JAVA_INT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(4)
        ).withName("SubjectUniqueId"),
        JAVA_INT.withName("cExtension"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgExtension")
    ).withName("_CERT_INFO");
    static final VarHandle const$4 = constants$2012.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final VarHandle const$5 = constants$2012.const$3.varHandle(MemoryLayout.PathElement.groupElement("cExtension"));
}


