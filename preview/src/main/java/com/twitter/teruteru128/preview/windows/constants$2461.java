// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2461 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2461() {}
    static final VarHandle const$0 = constants$2460.const$3.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    static final VarHandle const$1 = constants$2460.const$3.varHandle(MemoryLayout.PathElement.groupElement("Reserved0"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_LONG.withName("LengthInBytes"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("AllFlags"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0")
        ).withName("$anon$0"),
        JAVA_INT.withName("Reserved")
    ).withName("_DEVICE_STORAGE_RANGE_ATTRIBUTES");
    static final VarHandle const$3 = constants$2461.const$2.varHandle(MemoryLayout.PathElement.groupElement("LengthInBytes"));
    static final VarHandle const$4 = constants$2461.const$2.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("AllFlags"));
    static final VarHandle const$5 = constants$2461.const$2.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
}


