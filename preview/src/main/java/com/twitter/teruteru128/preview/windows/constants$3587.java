// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3587 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3587() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("cElems"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pElems")
    ).withName("tagCAFLT");
    static final VarHandle const$1 = constants$3587.const$0.varHandle(MemoryLayout.PathElement.groupElement("cElems"));
    static final VarHandle const$2 = constants$3587.const$0.varHandle(MemoryLayout.PathElement.groupElement("pElems"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("cElems"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pElems")
    ).withName("tagCADBL");
    static final VarHandle const$4 = constants$3587.const$3.varHandle(MemoryLayout.PathElement.groupElement("cElems"));
    static final VarHandle const$5 = constants$3587.const$3.varHandle(MemoryLayout.PathElement.groupElement("pElems"));
}


