// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3434 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3434() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pparamdescex"),
        JAVA_SHORT.withName("wParamFlags"),
        MemoryLayout.paddingLayout(6)
    ).withName("tagPARAMDESC");
    static final VarHandle const$1 = constants$3434.const$0.varHandle(MemoryLayout.PathElement.groupElement("pparamdescex"));
    static final VarHandle const$2 = constants$3434.const$0.varHandle(MemoryLayout.PathElement.groupElement("wParamFlags"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_LONG.withName("dwReserved"),
        JAVA_SHORT.withName("wIDLFlags"),
        MemoryLayout.paddingLayout(6)
    ).withName("tagIDLDESC");
    static final VarHandle const$4 = constants$3434.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    static final VarHandle const$5 = constants$3434.const$3.varHandle(MemoryLayout.PathElement.groupElement("wIDLFlags"));
}


