// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$152 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$152() {}
    static final VarHandle const$0 = constants$151.const$4.varHandle(MemoryLayout.PathElement.groupElement("SidStart"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("AceType"),
            JAVA_BYTE.withName("AceFlags"),
            JAVA_SHORT.withName("AceSize")
        ).withName("Header"),
        JAVA_INT.withName("Mask"),
        JAVA_INT.withName("SidStart")
    ).withName("_SYSTEM_AUDIT_CALLBACK_ACE");
    static final VarHandle const$2 = constants$152.const$1.varHandle(MemoryLayout.PathElement.groupElement("Mask"));
    static final VarHandle const$3 = constants$152.const$1.varHandle(MemoryLayout.PathElement.groupElement("SidStart"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_BYTE.withName("AceType"),
            JAVA_BYTE.withName("AceFlags"),
            JAVA_SHORT.withName("AceSize")
        ).withName("Header"),
        JAVA_INT.withName("Mask"),
        JAVA_INT.withName("SidStart")
    ).withName("_SYSTEM_ALARM_CALLBACK_ACE");
    static final VarHandle const$5 = constants$152.const$4.varHandle(MemoryLayout.PathElement.groupElement("Mask"));
}


