// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2098 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2098() {}
    static final VarHandle const$0 = constants$2097.const$4.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pKeyTrans"));
    static final VarHandle const$1 = constants$2097.const$4.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pKeyAgree"));
    static final VarHandle const$2 = constants$2097.const$4.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pMailList"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "CryptMsgControl",
        constants$644.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("hCryptProv"),
        JAVA_INT.withName("dwSignerIndex"),
        JAVA_INT.withName("dwSignerType"),
        RuntimeHelper.POINTER.withName("pvSigner")
    ).withName("_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA");
    static final VarHandle const$5 = constants$2098.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
}

