// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1512 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1512() {}
    static final VarHandle const$0 = constants$1511.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpRemoteName"));
    static final VarHandle const$1 = constants$1511.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbStructure"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hwndOwner"),
        RuntimeHelper.POINTER.withName("lpLocalName"),
        RuntimeHelper.POINTER.withName("lpRemoteName"),
        JAVA_INT.withName("dwFlags"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DISCDLGSTRUCTW");
    static final VarHandle const$3 = constants$1512.const$2.varHandle(MemoryLayout.PathElement.groupElement("cbStructure"));
    static final VarHandle const$4 = constants$1512.const$2.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    static final VarHandle const$5 = constants$1512.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpLocalName"));
}

