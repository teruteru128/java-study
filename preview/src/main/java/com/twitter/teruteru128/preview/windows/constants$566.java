// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$566 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$566() {}
    static final VarHandle const$0 = constants$565.const$2.varHandle(MemoryLayout.PathElement.groupElement("nDebugInfoSize"));
    static final VarHandle const$1 = constants$565.const$2.varHandle(MemoryLayout.PathElement.groupElement("lpImageName"));
    static final VarHandle const$2 = constants$565.const$2.varHandle(MemoryLayout.PathElement.groupElement("fUnicode"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpBaseOfDll")
    ).withName("_UNLOAD_DLL_DEBUG_INFO");
    static final VarHandle const$4 = constants$566.const$3.varHandle(MemoryLayout.PathElement.groupElement("lpBaseOfDll"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("lpDebugStringData"),
        JAVA_SHORT.withName("fUnicode"),
        JAVA_SHORT.withName("nDebugStringLength"),
        MemoryLayout.paddingLayout(4)
    ).withName("_OUTPUT_DEBUG_STRING_INFO");
}

