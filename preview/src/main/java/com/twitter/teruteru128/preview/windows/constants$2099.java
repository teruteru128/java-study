// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2099 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2099() {}
    static final VarHandle const$0 = constants$2098.const$4.varHandle(MemoryLayout.PathElement.groupElement("hCryptProv"));
    static final VarHandle const$1 = constants$2098.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwSignerIndex"));
    static final VarHandle const$2 = constants$2098.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwSignerType"));
    static final VarHandle const$3 = constants$2098.const$4.varHandle(MemoryLayout.PathElement.groupElement("pvSigner"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            JAVA_LONG.withName("hCryptProv"),
            JAVA_LONG.withName("hNCryptKey")
        ).withName("$anon$0"),
        JAVA_INT.withName("dwKeySpec"),
        JAVA_INT.withName("dwRecipientIndex")
    ).withName("_CMSG_CTRL_DECRYPT_PARA");
    static final VarHandle const$5 = constants$2099.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
}

