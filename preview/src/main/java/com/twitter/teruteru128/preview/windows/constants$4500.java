// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4500 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4500() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(LPHANDLER_FUNCTION_EX.class, "apply", constants$2077.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(PFN_SC_NOTIFY_CALLBACK.class, "apply", constants$0.const$0);
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwVersion"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pfnNotifyCallback"),
        RuntimeHelper.POINTER.withName("pContext"),
        JAVA_INT.withName("dwNotificationStatus"),
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
        ).withName("ServiceStatus")
    ).withName("_SERVICE_NOTIFY_1");
    static final VarHandle const$3 = constants$4500.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    static final VarHandle const$4 = constants$4500.const$2.varHandle(MemoryLayout.PathElement.groupElement("pfnNotifyCallback"));
    static final VarHandle const$5 = constants$4500.const$2.varHandle(MemoryLayout.PathElement.groupElement("pContext"));
}


