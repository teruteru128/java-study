// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4525 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4525() {}
    static final VarHandle const$0 = constants$4524.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwCompStrOffset"));
    static final VarHandle const$1 = constants$4524.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwTargetStrLen"));
    static final VarHandle const$2 = constants$4524.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwTargetStrOffset"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwStyle"),
        MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("szDescription")
    ).withName("tagSTYLEBUFA");
    static final VarHandle const$4 = constants$4525.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwStyle"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwStyle"),
        MemoryLayout.sequenceLayout(32, JAVA_SHORT).withName("szDescription")
    ).withName("tagSTYLEBUFW");
}


