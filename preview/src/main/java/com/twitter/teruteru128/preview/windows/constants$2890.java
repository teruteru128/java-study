// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2890 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2890() {}
    static final VarHandle const$0 = constants$2889.const$1.varHandle(MemoryLayout.PathElement.groupElement("pMuiDll"));
    static final VarHandle const$1 = constants$2889.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwResourceId"));
    static final VarHandle const$2 = constants$2889.const$1.varHandle(MemoryLayout.PathElement.groupElement("pDisplayName"));
    static final VarHandle const$3 = constants$2889.const$1.varHandle(MemoryLayout.PathElement.groupElement("wLangId"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pDocName"),
        RuntimeHelper.POINTER.withName("pOutputFile"),
        RuntimeHelper.POINTER.withName("pDatatype"),
        JAVA_INT.withName("dwMode"),
        JAVA_INT.withName("JobId")
    ).withName("_DOC_INFO_2A");
    static final VarHandle const$5 = constants$2890.const$4.varHandle(MemoryLayout.PathElement.groupElement("pDocName"));
}


