// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1832 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1832() {}
    static final VarHandle const$0 = constants$1831.const$3.varHandle(MemoryLayout.PathElement.groupElement("BufferSize"));
    static final VarHandle const$1 = constants$1831.const$3.varHandle(MemoryLayout.PathElement.groupElement("AddressFormat"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("ServerPrincipalNameBufferLength"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("ServerPrincipalName"),
        JAVA_INT.withName("ClientPrincipalNameBufferLength"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("ClientPrincipalName"),
        JAVA_INT.withName("AuthenticationLevel"),
        JAVA_INT.withName("AuthenticationService"),
        JAVA_INT.withName("NullSession"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagRPC_CALL_ATTRIBUTES_V1_W");
    static final VarHandle const$3 = constants$1832.const$2.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$4 = constants$1832.const$2.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$5 = constants$1832.const$2.varHandle(MemoryLayout.PathElement.groupElement("ServerPrincipalNameBufferLength"));
}

