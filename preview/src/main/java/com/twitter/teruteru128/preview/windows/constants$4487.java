// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$4487 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$4487() {}
    static final VarHandle const$0 = constants$4486.const$5.varHandle(MemoryLayout.PathElement.groupElement("dwLaunchProtected"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("unused")
    ).withName("SC_HANDLE__");
    static final VarHandle const$2 = constants$4487.const$1.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("unused")
    ).withName("SERVICE_STATUS_HANDLE__");
    static final VarHandle const$4 = constants$4487.const$3.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("dwServiceType"),
        JAVA_INT.withName("dwCurrentState"),
        JAVA_INT.withName("dwControlsAccepted"),
        JAVA_INT.withName("dwWin32ExitCode"),
        JAVA_INT.withName("dwServiceSpecificExitCode"),
        JAVA_INT.withName("dwCheckPoint"),
        JAVA_INT.withName("dwWaitHint")
    ).withName("_SERVICE_STATUS");
}


