// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2024 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2024() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cExtension"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgExtension")
    ).withName("_CERT_EXTENSIONS");
    static final VarHandle const$1 = constants$2024.const$0.varHandle(MemoryLayout.PathElement.groupElement("cExtension"));
    static final VarHandle const$2 = constants$2024.const$0.varHandle(MemoryLayout.PathElement.groupElement("rgExtension"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("KeyId"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("CertIssuer"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("CertSerialNumber")
    ).withName("_CERT_AUTHORITY_KEY_ID_INFO");
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("NotBefore"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("NotAfter")
    ).withName("_CERT_PRIVATE_KEY_VALIDITY");
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("KeyId"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData"),
            JAVA_INT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(4)
        ).withName("IntendedKeyUsage"),
        RuntimeHelper.POINTER.withName("pPrivateKeyUsagePeriod")
    ).withName("_CERT_KEY_ATTRIBUTES_INFO");
}


