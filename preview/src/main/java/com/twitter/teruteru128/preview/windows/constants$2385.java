// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2385 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2385() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("PropertyId"),
        JAVA_INT.withName("SetType"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("AdditionalParameters"),
        MemoryLayout.paddingLayout(3)
    ).withName("_STORAGE_PROPERTY_SET");
    static final VarHandle const$1 = constants$2385.const$0.varHandle(MemoryLayout.PathElement.groupElement("PropertyId"));
    static final VarHandle const$2 = constants$2385.const$0.varHandle(MemoryLayout.PathElement.groupElement("SetType"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size")
    ).withName("_STORAGE_DESCRIPTOR_HEADER");
    static final VarHandle const$4 = constants$2385.const$3.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$5 = constants$2385.const$3.varHandle(MemoryLayout.PathElement.groupElement("Size"));
}

