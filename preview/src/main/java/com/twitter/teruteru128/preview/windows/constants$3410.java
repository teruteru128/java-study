// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3410 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3410() {}
    static final VarHandle const$0 = constants$3409.const$4.varHandle(MemoryLayout.PathElement.groupElement("aBstr"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Size"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("apUnknown")
    ).withName("_wireSAFEARR_UNKNOWN");
    static final VarHandle const$2 = constants$3410.const$1.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$3 = constants$3410.const$1.varHandle(MemoryLayout.PathElement.groupElement("apUnknown"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("Size"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("apDispatch")
    ).withName("_wireSAFEARR_DISPATCH");
    static final VarHandle const$5 = constants$3410.const$4.varHandle(MemoryLayout.PathElement.groupElement("Size"));
}

