// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$444 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$444() {}
    static final VarHandle const$0 = constants$443.const$3.varHandle(MemoryLayout.PathElement.groupElement("ExceptionHandler"));
    static final VarHandle const$1 = constants$443.const$3.varHandle(MemoryLayout.PathElement.groupElement("HandlerData"));
    static final VarHandle const$2 = constants$443.const$3.varHandle(MemoryLayout.PathElement.groupElement("PrologEndAddress"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("BeginAddress"),
        JAVA_INT.withName("EndAddress"),
        JAVA_INT.withName("ExceptionHandler"),
        JAVA_INT.withName("HandlerData"),
        JAVA_INT.withName("PrologEndAddress")
    ).withName("_IMAGE_ALPHA_RUNTIME_FUNCTION_ENTRY");
    static final VarHandle const$4 = constants$444.const$3.varHandle(MemoryLayout.PathElement.groupElement("BeginAddress"));
    static final VarHandle const$5 = constants$444.const$3.varHandle(MemoryLayout.PathElement.groupElement("EndAddress"));
}

