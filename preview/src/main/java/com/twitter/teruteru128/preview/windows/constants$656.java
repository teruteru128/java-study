// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$656 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$656() {}
    static final VarHandle const$0 = constants$655.const$3.varHandle(MemoryLayout.PathElement.groupElement("StateMask"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("ProtectionLevel")
    ).withName("PROCESS_PROTECTION_LEVEL_INFORMATION");
    static final VarHandle const$2 = constants$656.const$1.varHandle(MemoryLayout.PathElement.groupElement("ProtectionLevel"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("Reserved")
    ).withName("_PROCESS_LEAP_SECOND_INFO");
    static final VarHandle const$4 = constants$656.const$3.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$5 = constants$656.const$3.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
}


