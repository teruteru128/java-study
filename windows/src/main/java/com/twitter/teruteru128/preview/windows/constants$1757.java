// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1757 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1757() {}
    static final VarHandle const$0 = constants$1756.const$0.varHandle(MemoryLayout.PathElement.groupElement("SecurityQos"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("ServerPrincName"),
        JAVA_INT.withName("AuthnLevel"),
        JAVA_INT.withName("AuthnSvc"),
        RuntimeHelper.POINTER.withName("AuthIdentity"),
        RuntimeHelper.POINTER.withName("SecurityQos")
    ).withName("_RPC_BINDING_HANDLE_SECURITY_V1_A");
    static final VarHandle const$2 = constants$1757.const$1.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$3 = constants$1757.const$1.varHandle(MemoryLayout.PathElement.groupElement("ServerPrincName"));
    static final VarHandle const$4 = constants$1757.const$1.varHandle(MemoryLayout.PathElement.groupElement("AuthnLevel"));
    static final VarHandle const$5 = constants$1757.const$1.varHandle(MemoryLayout.PathElement.groupElement("AuthnSvc"));
}

