// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2499 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2499() {}
    static final VarHandle const$0 = constants$2498.const$3.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$1 = constants$2498.const$3.varHandle(MemoryLayout.PathElement.groupElement("Slot"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Length"),
        JAVA_INT.withName("ProtocolType"),
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("ReturnStatus"),
        JAVA_INT.withName("ErrorCode"),
        JAVA_INT.withName("CommandLength"),
        JAVA_INT.withName("ErrorInfoLength"),
        JAVA_INT.withName("DataToDeviceTransferLength"),
        JAVA_INT.withName("DataFromDeviceTransferLength"),
        JAVA_INT.withName("TimeOutValue"),
        JAVA_INT.withName("ErrorInfoOffset"),
        JAVA_INT.withName("DataToDeviceBufferOffset"),
        JAVA_INT.withName("DataFromDeviceBufferOffset"),
        JAVA_INT.withName("CommandSpecific"),
        JAVA_INT.withName("Reserved0"),
        JAVA_INT.withName("FixedProtocolReturnData"),
        MemoryLayout.sequenceLayout(3, JAVA_INT).withName("Reserved1"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("Command"),
        MemoryLayout.paddingLayout(3)
    ).withName("_STORAGE_PROTOCOL_COMMAND");
    static final VarHandle const$3 = constants$2499.const$2.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$4 = constants$2499.const$2.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    static final VarHandle const$5 = constants$2499.const$2.varHandle(MemoryLayout.PathElement.groupElement("ProtocolType"));
}


