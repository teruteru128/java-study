// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2238 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2238() {}
    static final VarHandle const$0 = constants$2237.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwSeconds"));
    static final VarHandle const$1 = constants$2237.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwMillis"));
    static final VarHandle const$2 = constants$2237.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwMicros"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pszTSAPolicyId"),
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
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("SerialNumber"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("ftTime"),
        RuntimeHelper.POINTER.withName("pvAccuracy"),
        JAVA_INT.withName("fOrdering"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("Nonce"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("Tsa"),
        JAVA_INT.withName("cExtension"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgExtension")
    ).withName("_CRYPT_TIMESTAMP_INFO");
    static final VarHandle const$4 = constants$2238.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final VarHandle const$5 = constants$2238.const$3.varHandle(MemoryLayout.PathElement.groupElement("pszTSAPolicyId"));
}


