// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2891 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2891() {}
    static final VarHandle const$0 = constants$2890.const$4.varHandle(MemoryLayout.PathElement.groupElement("pOutputFile"));
    static final VarHandle const$1 = constants$2890.const$4.varHandle(MemoryLayout.PathElement.groupElement("pDatatype"));
    static final VarHandle const$2 = constants$2890.const$4.varHandle(MemoryLayout.PathElement.groupElement("dwMode"));
    static final VarHandle const$3 = constants$2890.const$4.varHandle(MemoryLayout.PathElement.groupElement("JobId"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pDocName"),
        RuntimeHelper.POINTER.withName("pOutputFile"),
        RuntimeHelper.POINTER.withName("pDatatype"),
        JAVA_INT.withName("dwMode"),
        JAVA_INT.withName("JobId")
    ).withName("_DOC_INFO_2W");
    static final VarHandle const$5 = constants$2891.const$4.varHandle(MemoryLayout.PathElement.groupElement("pDocName"));
}

