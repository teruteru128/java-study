// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4489 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4489() {}
    static final VarHandle const$0 = constants$4487.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwWaitHint"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwServiceType"),
        JAVA_INT.withName("dwCurrentState"),
        JAVA_INT.withName("dwControlsAccepted"),
        JAVA_INT.withName("dwWin32ExitCode"),
        JAVA_INT.withName("dwServiceSpecificExitCode"),
        JAVA_INT.withName("dwCheckPoint"),
        JAVA_INT.withName("dwWaitHint"),
        JAVA_INT.withName("dwProcessId"),
        JAVA_INT.withName("dwServiceFlags")
    ).withName("_SERVICE_STATUS_PROCESS");
    static final VarHandle const$2 = constants$4489.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwServiceType"));
    static final VarHandle const$3 = constants$4489.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwCurrentState"));
    static final VarHandle const$4 = constants$4489.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwControlsAccepted"));
    static final VarHandle const$5 = constants$4489.const$1.varHandle(MemoryLayout.PathElement.groupElement("dwWin32ExitCode"));
}

