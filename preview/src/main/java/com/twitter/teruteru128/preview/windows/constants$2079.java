// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2079 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2079() {}
    static final VarHandle const$0 = constants$2078.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pvInfo"));
    static final VarHandle const$1 = constants$2078.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pSerializedInfo"));
    static final VarHandle const$2 = constants$2078.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pszOID"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
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
    ).withName("_CERT_ISSUER_SERIAL_NUMBER");
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
    ).withName("_CERT_ID");
    static final VarHandle const$5 = constants$2079.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwIdChoice"));
}

