// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2871 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2871() {}
    static final VarHandle const$0 = constants$2870.const$0.varHandle(MemoryLayout.PathElement.groupElement("pConfigFile"));
    static final VarHandle const$1 = constants$2870.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwDriverAttributes"));
    static final VarHandle const$2 = constants$2870.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwConfigVersion"));
    static final VarHandle const$3 = constants$2870.const$0.varHandle(MemoryLayout.PathElement.groupElement("dwDriverVersion"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("cVersion"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pName"),
        RuntimeHelper.POINTER.withName("pEnvironment"),
        RuntimeHelper.POINTER.withName("pDriverPath"),
        RuntimeHelper.POINTER.withName("pDataFile"),
        RuntimeHelper.POINTER.withName("pConfigFile"),
        RuntimeHelper.POINTER.withName("pHelpFile"),
        RuntimeHelper.POINTER.withName("pDependentFiles"),
        RuntimeHelper.POINTER.withName("pMonitorName"),
        RuntimeHelper.POINTER.withName("pDefaultDataType"),
        RuntimeHelper.POINTER.withName("pszzPreviousNames"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("ftDriverDate"),
        JAVA_LONG.withName("dwlDriverVersion"),
        RuntimeHelper.POINTER.withName("pszMfgName"),
        RuntimeHelper.POINTER.withName("pszOEMUrl"),
        RuntimeHelper.POINTER.withName("pszHardwareID"),
        RuntimeHelper.POINTER.withName("pszProvider")
    ).withName("_DRIVER_INFO_6A");
    static final VarHandle const$5 = constants$2871.const$4.varHandle(MemoryLayout.PathElement.groupElement("cVersion"));
}


