// Generated by jextract

package com.twitter.teruteru128.preview.opencl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$33 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$33() {}
    static final VarHandle const$0 = constants$32.const$4.varHandle(MemoryLayout.PathElement.groupElement("rem"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("quot"),
        JAVA_INT.withName("rem")
    ).withName("_ldiv_t");
    static final VarHandle const$2 = constants$33.const$1.varHandle(MemoryLayout.PathElement.groupElement("quot"));
    static final VarHandle const$3 = constants$33.const$1.varHandle(MemoryLayout.PathElement.groupElement("rem"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_LONG.withName("quot"),
        JAVA_LONG.withName("rem")
    ).withName("_lldiv_t");
    static final VarHandle const$5 = constants$33.const$4.varHandle(MemoryLayout.PathElement.groupElement("quot"));
}

