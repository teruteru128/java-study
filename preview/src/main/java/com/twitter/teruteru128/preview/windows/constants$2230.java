// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2230 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2230() {}
    static final VarHandle const$0 = constants$2229.const$4.varHandle(MemoryLayout.PathElement.groupElement("hNcryptDescriptor"));
    static final VarHandle const$1 = constants$2229.const$4.varHandle(MemoryLayout.PathElement.groupElement("pwszPbes2Alg"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "PFXExportCertStore",
        constants$607.const$3
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pbEncodedOcspResponse"),
        JAVA_INT.withName("cbEncodedOcspResponse"),
        MemoryLayout.paddingLayout(4)
    ).withName("_CERT_SERVER_OCSP_RESPONSE_CONTEXT");
    static final VarHandle const$4 = constants$2230.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$5 = constants$2230.const$3.varHandle(MemoryLayout.PathElement.groupElement("pbEncodedOcspResponse"));
}

