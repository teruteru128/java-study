// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2826 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2826() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("pServerName"),
        RuntimeHelper.POINTER.withName("pPrinterName"),
        RuntimeHelper.POINTER.withName("pShareName"),
        RuntimeHelper.POINTER.withName("pPortName"),
        RuntimeHelper.POINTER.withName("pDriverName"),
        RuntimeHelper.POINTER.withName("pComment"),
        RuntimeHelper.POINTER.withName("pLocation"),
        RuntimeHelper.POINTER.withName("pDevMode"),
        RuntimeHelper.POINTER.withName("pSepFile"),
        RuntimeHelper.POINTER.withName("pPrintProcessor"),
        RuntimeHelper.POINTER.withName("pDatatype"),
        RuntimeHelper.POINTER.withName("pParameters"),
        RuntimeHelper.POINTER.withName("pSecurityDescriptor"),
        JAVA_INT.withName("Attributes"),
        JAVA_INT.withName("Priority"),
        JAVA_INT.withName("DefaultPriority"),
        JAVA_INT.withName("StartTime"),
        JAVA_INT.withName("UntilTime"),
        JAVA_INT.withName("Status"),
        JAVA_INT.withName("cJobs"),
        JAVA_INT.withName("AveragePPM")
    ).withName("_PRINTER_INFO_2W");
    static final VarHandle const$1 = constants$2826.const$0.varHandle(MemoryLayout.PathElement.groupElement("pServerName"));
    static final VarHandle const$2 = constants$2826.const$0.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    static final VarHandle const$3 = constants$2826.const$0.varHandle(MemoryLayout.PathElement.groupElement("pShareName"));
    static final VarHandle const$4 = constants$2826.const$0.varHandle(MemoryLayout.PathElement.groupElement("pPortName"));
    static final VarHandle const$5 = constants$2826.const$0.varHandle(MemoryLayout.PathElement.groupElement("pDriverName"));
}


