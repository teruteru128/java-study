// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$198 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$198() {}
    static final VarHandle const$0 = constants$197.const$5.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Flags"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            JAVA_INT.withName("Flags"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_PROCESS_MITIGATION_EXTENSION_POINT_DISABLE_POLICY");
    static final VarHandle const$2 = constants$198.const$1.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Flags"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            JAVA_INT.withName("Flags"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_PROCESS_MITIGATION_DYNAMIC_CODE_POLICY");
    static final VarHandle const$4 = constants$198.const$3.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Flags"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            JAVA_INT.withName("Flags"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$0")
        ).withName("$anon$0")
    ).withName("_PROCESS_MITIGATION_CONTROL_FLOW_GUARD_POLICY");
}

