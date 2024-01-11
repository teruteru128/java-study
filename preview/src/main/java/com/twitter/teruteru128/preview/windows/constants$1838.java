// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1838 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1838() {}
    static final VarHandle const$0 = constants$1835.const$4.varHandle(MemoryLayout.PathElement.groupElement("CallStatus"));
    static final VarHandle const$1 = constants$1835.const$4.varHandle(MemoryLayout.PathElement.groupElement("CallType"));
    static final VarHandle const$2 = constants$1835.const$4.varHandle(MemoryLayout.PathElement.groupElement("CallLocalAddress"));
    static final VarHandle const$3 = constants$1835.const$4.varHandle(MemoryLayout.PathElement.groupElement("OpNum"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
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
        JAVA_INT.withName("KernelModeCaller"),
        JAVA_INT.withName("ProtocolSequence"),
        JAVA_INT.withName("IsClientLocal"),
        RuntimeHelper.POINTER.withName("ClientPID"),
        JAVA_INT.withName("CallStatus"),
        JAVA_INT.withName("CallType"),
        RuntimeHelper.POINTER.withName("CallLocalAddress"),
        JAVA_SHORT.withName("OpNum"),
        MemoryLayout.paddingLayout(2),
        MemoryLayout.structLayout(
            JAVA_INT.withName("Data1"),
            JAVA_SHORT.withName("Data2"),
            JAVA_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("Data4")
        ).withName("InterfaceUuid"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagRPC_CALL_ATTRIBUTES_V2_A");
    static final VarHandle const$5 = constants$1838.const$4.varHandle(MemoryLayout.PathElement.groupElement("Version"));
}


