// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2901 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2901() {}
    static final VarHandle const$0 = constants$2900.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwStatus"));
    static final VarHandle const$1 = constants$2900.const$5.varHandle(MemoryLayout.PathElement.groupElement("pszStatus"));
    static final VarHandle const$2 = constants$2900.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwSeverity"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pName")
    ).withName("_MONITOR_INFO_1A");
    static final VarHandle const$4 = constants$2901.const$3.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pName")
    ).withName("_MONITOR_INFO_1W");
}


