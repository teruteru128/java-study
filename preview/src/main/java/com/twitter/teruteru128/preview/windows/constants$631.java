// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$631 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$631() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "QueryDepthSList",
        constants$64.const$3
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("hProcess"),
        RuntimeHelper.POINTER.withName("hThread"),
        JAVA_INT.withName("dwProcessId"),
        JAVA_INT.withName("dwThreadId")
    ).withName("_PROCESS_INFORMATION");
    static final VarHandle const$2 = constants$631.const$1.varHandle(MemoryLayout.PathElement.groupElement("hProcess"));
    static final VarHandle const$3 = constants$631.const$1.varHandle(MemoryLayout.PathElement.groupElement("hThread"));
    static final VarHandle const$4 = constants$631.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwProcessId"));
    static final VarHandle const$5 = constants$631.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwThreadId"));
}


