// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$854 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$854() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "GetCurrentActCtx",
        constants$18.const$5
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("cbSize"),
        JAVA_INT.withName("ulDataFormatVersion"),
        RuntimeHelper.POINTER.withName("lpData"),
        JAVA_INT.withName("ulLength"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("lpSectionGlobalData"),
        JAVA_INT.withName("ulSectionGlobalDataLength"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("lpSectionBase"),
        JAVA_INT.withName("ulSectionTotalLength"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("hActCtx"),
        JAVA_INT.withName("ulAssemblyRosterIndex"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagACTCTX_SECTION_KEYED_DATA_2600");
    static final VarHandle const$2 = constants$854.const$1.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    static final VarHandle const$3 = constants$854.const$1.varHandle(MemoryLayout.PathElement.groupElement("ulDataFormatVersion"));
    static final VarHandle const$4 = constants$854.const$1.varHandle(MemoryLayout.PathElement.groupElement("lpData"));
    static final VarHandle const$5 = constants$854.const$1.varHandle(MemoryLayout.PathElement.groupElement("ulLength"));
}


