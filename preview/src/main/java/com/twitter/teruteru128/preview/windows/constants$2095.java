// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2095 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2095() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("Issuer"),
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
        ).withName("HashAlgorithm"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("HashEncryptionAlgorithm"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("EncryptedHash"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cAttr"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("rgAttr")
        ).withName("AuthAttrs"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cAttr"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("rgAttr")
        ).withName("UnauthAttrs")
    ).withName("_CMSG_SIGNER_INFO");
    static final VarHandle const$1 = constants$2095.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwIdChoice"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        JAVA_INT.withName("cbData"),
                        MemoryLayout.paddingLayout(4),
                        RuntimeHelper.POINTER.withName("pbData")
                    ).withName("Issuer"),
                    MemoryLayout.structLayout(
                        JAVA_INT.withName("cbData"),
                        MemoryLayout.paddingLayout(4),
                        RuntimeHelper.POINTER.withName("pbData")
                    ).withName("SerialNumber")
                ).withName("IssuerSerialNumber"),
                MemoryLayout.structLayout(
                    JAVA_INT.withName("cbData"),
                    MemoryLayout.paddingLayout(4),
                    RuntimeHelper.POINTER.withName("pbData")
                ).withName("KeyId"),
                MemoryLayout.structLayout(
                    JAVA_INT.withName("cbData"),
                    MemoryLayout.paddingLayout(4),
                    RuntimeHelper.POINTER.withName("pbData")
                ).withName("HashId")
            ).withName("$anon$0")
        ).withName("SignerId"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("HashAlgorithm"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("HashEncryptionAlgorithm"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("EncryptedHash"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cAttr"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("rgAttr")
        ).withName("AuthAttrs"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cAttr"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("rgAttr")
        ).withName("UnauthAttrs")
    ).withName("_CMSG_CMS_SIGNER_INFO");
    static final VarHandle const$3 = constants$2095.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwIdChoice"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        JAVA_INT.withName("cbData"),
                        MemoryLayout.paddingLayout(4),
                        RuntimeHelper.POINTER.withName("pbData")
                    ).withName("Issuer"),
                    MemoryLayout.structLayout(
                        JAVA_INT.withName("cbData"),
                        MemoryLayout.paddingLayout(4),
                        RuntimeHelper.POINTER.withName("pbData")
                    ).withName("SerialNumber")
                ).withName("IssuerSerialNumber"),
                MemoryLayout.structLayout(
                    JAVA_INT.withName("cbData"),
                    MemoryLayout.paddingLayout(4),
                    RuntimeHelper.POINTER.withName("pbData")
                ).withName("KeyId"),
                MemoryLayout.structLayout(
                    JAVA_INT.withName("cbData"),
                    MemoryLayout.paddingLayout(4),
                    RuntimeHelper.POINTER.withName("pbData")
                ).withName("HashId")
            ).withName("$anon$0")
        ).withName("RecipientId"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("cbData"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("KeyEncryptionAlgorithm"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("EncryptedKey")
    ).withName("_CMSG_KEY_TRANS_RECIPIENT_INFO");
    static final VarHandle const$5 = constants$2095.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
}


