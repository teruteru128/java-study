// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2530 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2530() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_SHORT.withName("GeneralStatus"),
        JAVA_SHORT.withName("ExtendedStatus"),
        JAVA_INT.withName("OutputDataLength"),
        MemoryLayout.sequenceLayout(1, JAVA_BYTE).withName("OutputData"),
        MemoryLayout.paddingLayout(3)
    ).withName("_SCM_PD_PASSTHROUGH_INVDIMM_OUTPUT");
    static final VarHandle const$1 = constants$2530.const$0.varHandle(MemoryLayout.PathElement.groupElement("GeneralStatus"));
    static final VarHandle const$2 = constants$2530.const$0.varHandle(MemoryLayout.PathElement.groupElement("ExtendedStatus"));
    static final VarHandle const$3 = constants$2530.const$0.varHandle(MemoryLayout.PathElement.groupElement("OutputDataLength"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(4)
        ).withName("Options")
    ).withName("_SCM_PD_REINITIALIZE_MEDIA_INPUT");
    static final VarHandle const$5 = constants$2530.const$4.varHandle(MemoryLayout.PathElement.groupElement("Version"));
}


