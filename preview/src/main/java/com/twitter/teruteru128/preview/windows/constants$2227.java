// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2227 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2227() {}
    static final VarHandle const$0 = constants$2226.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    static final VarHandle const$1 = constants$2226.const$4.varHandle(MemoryLayout.PathElement.groupElement("pwszServerName"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("lError"),
        MemoryLayout.sequenceLayout(512, JAVA_SHORT).withName("wszErrorText")
    ).withName("_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_STATUS");
    static final VarHandle const$3 = constants$2227.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$4 = constants$2227.const$2.varHandle(MemoryLayout.PathElement.groupElement("lError"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "CryptStringToBinaryA",
        constants$1283.const$2
    );
}


