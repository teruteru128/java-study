// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2676 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2676() {}
    static final VarHandle const$0 = constants$2675.const$5.varHandle(MemoryLayout.PathElement.groupElement("NextOffset"));
    static final VarHandle const$1 = constants$2675.const$5.varHandle(MemoryLayout.PathElement.groupElement("NumSDEntriesReturned"));
    static final VarHandle const$2 = constants$2675.const$5.varHandle(MemoryLayout.PathElement.groupElement("NumSDBytesReturned"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("ChangeType"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                JAVA_SHORT.withName("CurrentMachineSIDOffset"),
                JAVA_SHORT.withName("CurrentMachineSIDLength"),
                JAVA_SHORT.withName("NewMachineSIDOffset"),
                JAVA_SHORT.withName("NewMachineSIDLength")
            ).withName("SdChange"),
            MemoryLayout.structLayout(
                JAVA_INT.withName("Reserved")
            ).withName("SdQueryStats"),
            MemoryLayout.structLayout(
                JAVA_LONG.withName("StartingOffset"),
                JAVA_LONG.withName("MaxSDEntriesToReturn")
            ).withName("SdEnumSds")
        ).withName("$anon$0")
    ).withName("_SD_GLOBAL_CHANGE_INPUT");
    static final VarHandle const$4 = constants$2676.const$3.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$5 = constants$2676.const$3.varHandle(MemoryLayout.PathElement.groupElement("ChangeType"));
}


