// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2683 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2683() {}
    static final VarHandle const$0 = constants$2682.const$5.varHandle(MemoryLayout.PathElement.groupElement("MdsNodeId"));
    static final VarHandle const$1 = constants$2682.const$5.varHandle(MemoryLayout.PathElement.groupElement("DsNodeId"));
    static final VarHandle const$2 = constants$2682.const$5.varHandle(MemoryLayout.PathElement.groupElement("PathLength"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("MdsNodeId"),
        JAVA_INT.withName("DsNodeId"),
        JAVA_BYTE.withName("IsDiskConnected"),
        JAVA_BYTE.withName("ClusterEnableDirectIo"),
        MemoryLayout.paddingLayout(2),
        JAVA_INT.withName("DiskConnectivity")
    ).withName("_CSV_QUERY_VOLUME_REDIRECT_STATE");
    static final VarHandle const$4 = constants$2683.const$3.varHandle(MemoryLayout.PathElement.groupElement("MdsNodeId"));
    static final VarHandle const$5 = constants$2683.const$3.varHandle(MemoryLayout.PathElement.groupElement("DsNodeId"));
}

