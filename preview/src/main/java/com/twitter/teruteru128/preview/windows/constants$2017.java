// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2017 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2017() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("ToBeSigned"),
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
        ).withName("Signature")
    ).withName("_CERT_SIGNED_CONTENT_INFO");
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cUsageIdentifier"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgpszUsageIdentifier")
    ).withName("_CTL_USAGE");
    static final VarHandle const$2 = constants$2017.const$1.varHandle(MemoryLayout.PathElement.groupElement("cUsageIdentifier"));
    static final VarHandle const$3 = constants$2017.const$1.varHandle(MemoryLayout.PathElement.groupElement("rgpszUsageIdentifier"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("SubjectIdentifier"),
        JAVA_INT.withName("cAttribute"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgAttribute")
    ).withName("_CTL_ENTRY");
    static final VarHandle const$5 = constants$2017.const$4.varHandle(MemoryLayout.PathElement.groupElement("cAttribute"));
}


