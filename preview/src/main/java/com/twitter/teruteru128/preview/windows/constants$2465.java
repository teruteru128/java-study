// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2465 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2465() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("MaximumRequestsPerPeriod"),
        JAVA_INT.withName("MinimumPeriod"),
        JAVA_LONG.withName("MaximumRequestSize"),
        JAVA_INT.withName("EstimatedTimePerRequest"),
        JAVA_INT.withName("NumOutStandingRequests"),
        JAVA_LONG.withName("RequestSize")
    ).withName("_STORAGE_GET_BC_PROPERTIES_OUTPUT");
    static final VarHandle const$1 = constants$2465.const$0.varHandle(MemoryLayout.PathElement.groupElement("MaximumRequestsPerPeriod"));
    static final VarHandle const$2 = constants$2465.const$0.varHandle(MemoryLayout.PathElement.groupElement("MinimumPeriod"));
    static final VarHandle const$3 = constants$2465.const$0.varHandle(MemoryLayout.PathElement.groupElement("MaximumRequestSize"));
    static final VarHandle const$4 = constants$2465.const$0.varHandle(MemoryLayout.PathElement.groupElement("EstimatedTimePerRequest"));
    static final VarHandle const$5 = constants$2465.const$0.varHandle(MemoryLayout.PathElement.groupElement("NumOutStandingRequests"));
}


