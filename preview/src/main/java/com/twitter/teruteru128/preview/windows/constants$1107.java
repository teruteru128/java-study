// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1107 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1107() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        JAVA_INT.withName("ihBrush"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("lbStyle"),
            JAVA_INT.withName("lbColor"),
            JAVA_INT.withName("lbHatch")
        ).withName("lb")
    ).withName("tagEMRCREATEBRUSHINDIRECT");
    static final VarHandle const$1 = constants$1107.const$0.varHandle(MemoryLayout.PathElement.groupElement("ihBrush"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_INT.withName("iType"),
            JAVA_INT.withName("nSize")
        ).withName("emr"),
        JAVA_INT.withName("ihBrush"),
        JAVA_INT.withName("iUsage"),
        JAVA_INT.withName("offBmi"),
        JAVA_INT.withName("cbBmi"),
        JAVA_INT.withName("offBits"),
        JAVA_INT.withName("cbBits")
    ).withName("tagEMRCREATEMONOBRUSH");
    static final VarHandle const$3 = constants$1107.const$2.varHandle(MemoryLayout.PathElement.groupElement("ihBrush"));
    static final VarHandle const$4 = constants$1107.const$2.varHandle(MemoryLayout.PathElement.groupElement("iUsage"));
    static final VarHandle const$5 = constants$1107.const$2.varHandle(MemoryLayout.PathElement.groupElement("offBmi"));
}

