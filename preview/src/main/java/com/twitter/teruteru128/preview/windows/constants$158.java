// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$158 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$158() {}
    static final VarHandle const$0 = constants$156.const$5.varHandle(MemoryLayout.PathElement.groupElement("Dacl"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("Revision"),
        JAVA_BYTE.withName("Sbz1"),
        JAVA_SHORT.withName("Control"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("Owner"),
        RuntimeHelper.POINTER.withName("Group"),
        RuntimeHelper.POINTER.withName("Sacl"),
        RuntimeHelper.POINTER.withName("Dacl")
    ).withName("_SECURITY_DESCRIPTOR");
    static final VarHandle const$2 = constants$158.const$1.varHandle(MemoryLayout.PathElement.groupElement("Revision"));
    static final VarHandle const$3 = constants$158.const$1.varHandle(MemoryLayout.PathElement.groupElement("Sbz1"));
    static final VarHandle const$4 = constants$158.const$1.varHandle(MemoryLayout.PathElement.groupElement("Control"));
    static final VarHandle const$5 = constants$158.const$1.varHandle(MemoryLayout.PathElement.groupElement("Owner"));
}


