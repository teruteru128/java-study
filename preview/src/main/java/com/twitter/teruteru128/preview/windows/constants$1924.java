// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1924 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1924() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("magic"),
        JAVA_INT.withName("bitlen"),
        JAVA_INT.withName("pubexp")
    ).withName("_RSAPUBKEY");
    static final VarHandle const$1 = constants$1924.const$0.varHandle(MemoryLayout.PathElement.groupElement("magic"));
    static final VarHandle const$2 = constants$1924.const$0.varHandle(MemoryLayout.PathElement.groupElement("bitlen"));
    static final VarHandle const$3 = constants$1924.const$0.varHandle(MemoryLayout.PathElement.groupElement("pubexp"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("magic"),
        JAVA_INT.withName("bitlen")
    ).withName("_PUBKEY");
    static final VarHandle const$5 = constants$1924.const$4.varHandle(MemoryLayout.PathElement.groupElement("magic"));
}

