// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2240 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2240() {}
    static final VarHandle const$0 = constants$2239.const$4.varHandle(MemoryLayout.PathElement.groupElement("pbEncoded"));
    static final VarHandle const$1 = constants$2239.const$4.varHandle(MemoryLayout.PathElement.groupElement("pTimeStamp"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pszTSAPolicyId"),
        JAVA_INT.withName("fRequestCerts"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("Nonce"),
        JAVA_INT.withName("cExtension"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("rgExtension")
    ).withName("_CRYPT_TIMESTAMP_PARA");
    static final VarHandle const$3 = constants$2240.const$2.varHandle(MemoryLayout.PathElement.groupElement("pszTSAPolicyId"));
    static final VarHandle const$4 = constants$2240.const$2.varHandle(MemoryLayout.PathElement.groupElement("fRequestCerts"));
    static final VarHandle const$5 = constants$2240.const$2.varHandle(MemoryLayout.PathElement.groupElement("cExtension"));
}

