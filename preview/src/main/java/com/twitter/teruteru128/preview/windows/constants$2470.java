// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2470 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2470() {}
    static final VarHandle const$0 = constants$2469.const$2.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("StartingElement"),
        JAVA_BYTE.withName("Filter"),
        JAVA_BYTE.withName("ReportType"),
        MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("Reserved")
    ).withName("_PHYSICAL_ELEMENT_STATUS_REQUEST");
    static final VarHandle const$2 = constants$2470.const$1.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$3 = constants$2470.const$1.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$2470.const$1.varHandle(MemoryLayout.PathElement.groupElement("StartingElement"));
    static final VarHandle const$5 = constants$2470.const$1.varHandle(MemoryLayout.PathElement.groupElement("Filter"));
}


