// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2856 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2856() {}
    static final VarHandle const$0 = constants$2852.const$4.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$1 = constants$2852.const$4.varHandle(MemoryLayout.PathElement.groupElement("Time"));
    static final VarHandle const$2 = constants$2852.const$4.varHandle(MemoryLayout.PathElement.groupElement("PagesPrinted"));
    static final VarHandle const$3 = constants$2852.const$4.varHandle(MemoryLayout.PathElement.groupElement("SizeHigh"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("Path"),
        JAVA_INT.withName("JobId"),
        MemoryLayout.paddingLayout(4)
    ).withName("_ADDJOB_INFO_1A");
    static final VarHandle const$5 = constants$2856.const$4.varHandle(MemoryLayout.PathElement.groupElement("Path"));
}

