// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2836 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2836() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("JobId"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("pPrinterName"),
        RuntimeHelper.POINTER.withName("pMachineName"),
        RuntimeHelper.POINTER.withName("pUserName"),
        RuntimeHelper.POINTER.withName("pDocument"),
        RuntimeHelper.POINTER.withName("pDatatype"),
        RuntimeHelper.POINTER.withName("pStatus"),
        JAVA_INT.withName("Status"),
        JAVA_INT.withName("Priority"),
        JAVA_INT.withName("Position"),
        JAVA_INT.withName("TotalPages"),
        JAVA_INT.withName("PagesPrinted"),
        MemoryLayout.structLayout(
            JAVA_SHORT.withName("wYear"),
            JAVA_SHORT.withName("wMonth"),
            JAVA_SHORT.withName("wDayOfWeek"),
            JAVA_SHORT.withName("wDay"),
            JAVA_SHORT.withName("wHour"),
            JAVA_SHORT.withName("wMinute"),
            JAVA_SHORT.withName("wSecond"),
            JAVA_SHORT.withName("wMilliseconds")
        ).withName("Submitted"),
        MemoryLayout.paddingLayout(4)
    ).withName("_JOB_INFO_1A");
    static final VarHandle const$1 = constants$2836.const$0.varHandle(MemoryLayout.PathElement.groupElement("JobId"));
    static final VarHandle const$2 = constants$2836.const$0.varHandle(MemoryLayout.PathElement.groupElement("pPrinterName"));
    static final VarHandle const$3 = constants$2836.const$0.varHandle(MemoryLayout.PathElement.groupElement("pMachineName"));
    static final VarHandle const$4 = constants$2836.const$0.varHandle(MemoryLayout.PathElement.groupElement("pUserName"));
    static final VarHandle const$5 = constants$2836.const$0.varHandle(MemoryLayout.PathElement.groupElement("pDocument"));
}


