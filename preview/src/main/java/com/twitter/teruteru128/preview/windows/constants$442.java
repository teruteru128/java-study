// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$442 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$442() {}
    static final VarHandle const$0 = constants$441.const$5.varHandle(MemoryLayout.PathElement.groupElement("FuncStart"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("BeginAddress"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("UnwindData"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_IMAGE_ARM_RUNTIME_FUNCTION_ENTRY");
    static final VarHandle const$2 = constants$442.const$1.varHandle(MemoryLayout.PathElement.groupElement("BeginAddress"));
    static final VarHandle const$3 = constants$442.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("UnwindData"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("BeginAddress"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("UnwindData"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_IMAGE_ARM64_RUNTIME_FUNCTION_ENTRY");
    static final VarHandle const$5 = constants$442.const$4.varHandle(MemoryLayout.PathElement.groupElement("BeginAddress"));
}


