// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1672 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1672() {}
    static final VarHandle const$0 = constants$1669.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("lMaximum"));
    static final VarHandle const$1 = constants$1669.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("dwMinimum"));
    static final VarHandle const$2 = constants$1669.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("dwMaximum"));
    static final VarHandle const$3 = constants$1670.const$2.varHandle(MemoryLayout.PathElement.groupElement("cSteps"));
    static final VarHandle const$4 = constants$1670.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbCustomData"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withByteAlignment(1).withName("cbStruct"),
        JAVA_INT.withByteAlignment(1).withName("dwLineID"),
        MemoryLayout.unionLayout(
            JAVA_INT.withByteAlignment(1).withName("dwControlID"),
            JAVA_INT.withByteAlignment(1).withName("dwControlType")
        ).withName("$anon$0"),
        JAVA_INT.withByteAlignment(1).withName("cControls"),
        JAVA_INT.withByteAlignment(1).withName("cbmxctrl"),
        RuntimeHelper.POINTER.withByteAlignment(1).withName("pamxctrl")
    ).withName("tagMIXERLINECONTROLSA");
}

