// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4503 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4503() {}
    static final VarHandle const$0 = constants$4502.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwNotificationStatus"));
    static final VarHandle const$1 = constants$4502.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwNotificationTriggered"));
    static final VarHandle const$2 = constants$4502.const$2.varHandle(MemoryLayout.PathElement.groupElement("pszServiceNames"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwReason"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pszComment"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwServiceType"),
            JAVA_INT.withName("dwCurrentState"),
            JAVA_INT.withName("dwControlsAccepted"),
            JAVA_INT.withName("dwWin32ExitCode"),
            JAVA_INT.withName("dwServiceSpecificExitCode"),
            JAVA_INT.withName("dwCheckPoint"),
            JAVA_INT.withName("dwWaitHint"),
            JAVA_INT.withName("dwProcessId"),
            JAVA_INT.withName("dwServiceFlags")
        ).withName("ServiceStatus"),
        MemoryLayout.paddingLayout(4)
    ).withName("_SERVICE_CONTROL_STATUS_REASON_PARAMSA");
    static final VarHandle const$4 = constants$4503.const$3.varHandle(MemoryLayout.PathElement.groupElement("dwReason"));
    static final VarHandle const$5 = constants$4503.const$3.varHandle(MemoryLayout.PathElement.groupElement("pszComment"));
}

