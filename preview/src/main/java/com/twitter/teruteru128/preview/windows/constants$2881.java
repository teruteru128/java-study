// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2881 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2881() {}
    static final VarHandle const$0 = constants$2877.const$2.varHandle(MemoryLayout.PathElement.groupElement("pszzCoreDriverDependencies"));
    static final VarHandle const$1 = constants$2877.const$2.varHandle(MemoryLayout.PathElement.groupElement("dwlMinInboxDriverVerVersion"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
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
        RuntimeHelper.POINTER.withName("pszProvider"),
        RuntimeHelper.POINTER.withName("pszPrintProcessor"),
        RuntimeHelper.POINTER.withName("pszVendorSetup"),
        RuntimeHelper.POINTER.withName("pszzColorProfiles"),
        RuntimeHelper.POINTER.withName("pszInfPath"),
        JAVA_INT.withName("dwPrinterDriverAttributes"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pszzCoreDriverDependencies"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("dwLowDateTime"),
            JAVA_INT.withName("dwHighDateTime")
        ).withName("ftMinInboxDriverVerDate"),
        JAVA_LONG.withName("dwlMinInboxDriverVerVersion")
    ).withName("_DRIVER_INFO_8W");
    static final VarHandle const$3 = constants$2881.const$2.varHandle(MemoryLayout.PathElement.groupElement("cVersion"));
    static final VarHandle const$4 = constants$2881.const$2.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    static final VarHandle const$5 = constants$2881.const$2.varHandle(MemoryLayout.PathElement.groupElement("pEnvironment"));
}

