// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2200 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2200() {}
    static final VarHandle const$0 = constants$2199.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwSyncDeltaTime"));
    static final VarHandle const$1 = constants$2199.const$4.varHandle(MemoryLayout.PathElement.groupElement("cGroup"));
    static final VarHandle const$2 = constants$2199.const$4.varHandle(MemoryLayout.PathElement.groupElement("rgcGroupEntry"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CryptGetObjectUrl",
        constants$717.const$2
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pCertContext"),
        RuntimeHelper.POINTER.withName("pCrlContext")
    ).withName("_CERT_CRL_CONTEXT_PAIR");
    static final VarHandle const$5 = constants$2200.const$4.varHandle(MemoryLayout.PathElement.groupElement("pCertContext"));
}


