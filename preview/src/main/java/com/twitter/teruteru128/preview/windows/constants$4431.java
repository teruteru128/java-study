// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4431 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4431() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("hwndFrom"),
            JAVA_LONG.withName("idFrom"),
            JAVA_INT.withName("code"),
            MemoryLayout.paddingLayout(4)
        ).withName("hdr"),
        RuntimeHelper.POINTER.withName("lpOFN"),
        RuntimeHelper.POINTER.withName("pszFile")
    ).withName("_OFNOTIFYA");
    static final VarHandle const$1 = constants$4431.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpOFN"));
    static final VarHandle const$2 = constants$4431.const$0.varHandle(MemoryLayout.PathElement.groupElement("pszFile"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("hwndFrom"),
            JAVA_LONG.withName("idFrom"),
            JAVA_INT.withName("code"),
            MemoryLayout.paddingLayout(4)
        ).withName("hdr"),
        RuntimeHelper.POINTER.withName("lpOFN"),
        RuntimeHelper.POINTER.withName("pszFile")
    ).withName("_OFNOTIFYW");
    static final VarHandle const$4 = constants$4431.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpOFN"));
    static final VarHandle const$5 = constants$4431.const$3.varHandle(MemoryLayout.PathElement.groupElement("pszFile"));
}


