// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2515 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2515() {}
    static final VarHandle const$0 = constants$2514.const$5.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$1 = constants$2514.const$5.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$2 = constants$2514.const$5.varHandle(MemoryLayout.PathElement.groupElement("PropertyId"));
    static final VarHandle const$3 = constants$2514.const$5.varHandle(MemoryLayout.PathElement.groupElement("SetType"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("ArmState")
    ).withName("_SCM_PD_RUNTIME_FW_ACTIVATION_ARM_STATE");
    static final VarHandle const$5 = constants$2515.const$4.varHandle(MemoryLayout.PathElement.groupElement("ArmState"));
}

