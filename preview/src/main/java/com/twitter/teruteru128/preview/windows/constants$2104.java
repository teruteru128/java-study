// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2104 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2104() {}
    static final VarHandle const$0 = constants$2103.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwKeyChoice"));
    static final VarHandle const$1 = constants$2103.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hKeyEncryptionKey"));
    static final VarHandle const$2 = constants$2103.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pvKeyEncryptionKey"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("dwSignerIndex"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("cbData"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("pbData")
        ).withName("blob")
    ).withName("_CMSG_CTRL_ADD_SIGNER_UNAUTH_ATTR_PARA");
    static final VarHandle const$4 = constants$2104.const$3.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$5 = constants$2104.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwSignerIndex"));
}


