// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$856 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$856() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpInformation"),
        RuntimeHelper.POINTER.withName("lpSectionBase"),
        JAVA_INT.withName("ulSectionLength"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("lpSectionGlobalDataBase"),
        JAVA_INT.withName("ulSectionGlobalDataLength"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagACTCTX_SECTION_KEYED_DATA_ASSEMBLY_METADATA");
    static final VarHandle const$1 = constants$856.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpInformation"));
    static final VarHandle const$2 = constants$856.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpSectionBase"));
    static final VarHandle const$3 = constants$856.const$0.varHandle(MemoryLayout.PathElement.groupElement("ulSectionLength"));
    static final VarHandle const$4 = constants$856.const$0.varHandle(MemoryLayout.PathElement.groupElement("lpSectionGlobalDataBase"));
    static final VarHandle const$5 = constants$856.const$0.varHandle(MemoryLayout.PathElement.groupElement("ulSectionGlobalDataLength"));
}

