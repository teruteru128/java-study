// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2502 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2502() {}
    static final VarHandle const$0 = constants$2499.const$2.varHandle(MemoryLayout.PathElement.groupElement("Reserved0"));
    static final VarHandle const$1 = constants$2499.const$2.varHandle(MemoryLayout.PathElement.groupElement("FixedProtocolReturnData"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("Action"),
        JAVA_INT.withName("Attribute")
    ).withName("_STORAGE_ATTRIBUTE_MGMT");
    static final VarHandle const$3 = constants$2502.const$2.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$4 = constants$2502.const$2.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$5 = constants$2502.const$2.varHandle(MemoryLayout.PathElement.groupElement("Action"));
}


