// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1398 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1398() {}
    static final VarHandle const$0 = constants$1397.const$0.varHandle(MemoryLayout.PathElement.groupElement("unitExponent"));
    static final VarHandle const$1 = constants$1397.const$0.varHandle(MemoryLayout.PathElement.groupElement("usagePageId"));
    static final VarHandle const$2 = constants$1397.const$0.varHandle(MemoryLayout.PathElement.groupElement("usageId"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cursorId"),
        JAVA_INT.withName("cursor")
    ).withName("tagPOINTER_DEVICE_CURSOR_INFO");
    static final VarHandle const$4 = constants$1398.const$3.varHandle(MemoryLayout.PathElement.groupElement("cursorId"));
    static final VarHandle const$5 = constants$1398.const$3.varHandle(MemoryLayout.PathElement.groupElement("cursor"));
}


