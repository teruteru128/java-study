// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1485 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1485() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("ve_valuename"),
        JAVA_INT.withName("ve_valuelen"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("ve_valueptr"),
        JAVA_INT.withName("ve_type"),
        MemoryLayout.paddingLayout(4)
    ).withName("value_entW");
    static final VarHandle const$1 = constants$1485.const$0.varHandle(MemoryLayout.PathElement.groupElement("ve_valuename"));
    static final VarHandle const$2 = constants$1485.const$0.varHandle(MemoryLayout.PathElement.groupElement("ve_valuelen"));
    static final VarHandle const$3 = constants$1485.const$0.varHandle(MemoryLayout.PathElement.groupElement("ve_valueptr"));
    static final VarHandle const$4 = constants$1485.const$0.varHandle(MemoryLayout.PathElement.groupElement("ve_type"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "RegCloseKey",
        constants$18.const$5
    );
}

