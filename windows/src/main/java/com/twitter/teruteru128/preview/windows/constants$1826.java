// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1826 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1826() {}
    static final VarHandle const$0 = constants$1825.const$5.varHandle(MemoryLayout.PathElement.groupElement("AnsiString"));
    static final VarHandle const$1 = constants$1825.const$5.varHandle(MemoryLayout.PathElement.groupElement("UnicodeString"));
    static final VarHandle const$2 = constants$1825.const$5.varHandle(MemoryLayout.PathElement.groupElement("LVal"));
    static final VarHandle const$3 = constants$1825.const$5.varHandle(MemoryLayout.PathElement.groupElement("SVal"));
    static final VarHandle const$4 = constants$1825.const$5.varHandle(MemoryLayout.PathElement.groupElement("PVal"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("ComputerName"),
        JAVA_INT.withName("ProcessID"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("wYear"),
                JAVA_SHORT.withName("wMonth"),
                JAVA_SHORT.withName("wDayOfWeek"),
                JAVA_SHORT.withName("wDay"),
                JAVA_SHORT.withName("wHour"),
                JAVA_SHORT.withName("wMinute"),
                JAVA_SHORT.withName("wSecond"),
                JAVA_SHORT.withName("wMilliseconds")
            ).withName("SystemTime"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("dwLowDateTime"),
                JAVA_INT.withName("dwHighDateTime")
            ).withName("FileTime")
        ).withName("u"),
        JAVA_INT.withName("GeneratingComponent"),
        JAVA_INT.withName("Status"),
        JAVA_SHORT.withName("DetectionLocation"),
        JAVA_SHORT.withName("Flags"),
        JAVA_INT.withName("NumberOfParameters"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.sequenceLayout(4, MemoryLayout.structLayout(
            JAVA_INT.withName("ParameterType"),
            MemoryLayout.paddingLayout(4),
            MemoryLayout.unionLayout(
                RuntimeHelper.POINTER.withName("AnsiString"),
                RuntimeHelper.POINTER.withName("UnicodeString"),
                JAVA_INT.withName("LVal"),
                JAVA_SHORT.withName("SVal"),
                JAVA_LONG.withName("PVal"),
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("Buffer"),
                    JAVA_SHORT.withName("Size"),
                    MemoryLayout.paddingLayout(6)
                ).withName("BVal")
            ).withName("u")
        ).withName("tagRPC_EE_INFO_PARAM")).withName("Parameters")
    ).withName("tagRPC_EXTENDED_ERROR_INFO");
}

