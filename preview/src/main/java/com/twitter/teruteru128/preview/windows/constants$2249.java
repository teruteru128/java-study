// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2249 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2249() {}
    static final VarHandle const$0 = constants$2248.const$4.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    static final VarHandle const$1 = constants$2248.const$4.varHandle(MemoryLayout.PathElement.groupElement("pbData"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwVersion"),
        JAVA_INT.withName("Entropy"),
        JAVA_INT.withName("Algorithm"),
        JAVA_INT.withName("KeyLength")
    ).withName("_EFS_KEY_INFO");
    static final VarHandle const$3 = constants$2249.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final VarHandle const$4 = constants$2249.const$2.varHandle(MemoryLayout.PathElement.groupElement("Entropy"));
    static final VarHandle const$5 = constants$2249.const$2.varHandle(MemoryLayout.PathElement.groupElement("Algorithm"));
}


