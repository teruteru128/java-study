// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2700 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2700() {}
    static final VarHandle const$0 = constants$2699.const$4.varHandle(MemoryLayout.PathElement.groupElement("KeepIntegrityStateUnchanged"));
    static final VarHandle const$1 = constants$2699.const$4.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    static final VarHandle const$2 = constants$2699.const$4.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    static final VarHandle const$3 = constants$2699.const$4.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("Flags"),
        JAVA_INT.withName("TokenTimeToLive"),
        JAVA_INT.withName("Reserved"),
        JAVA_LONG.withName("FileOffset"),
        JAVA_LONG.withName("CopyLength")
    ).withName("_FSCTL_OFFLOAD_READ_INPUT");
    static final VarHandle const$5 = constants$2700.const$4.varHandle(MemoryLayout.PathElement.groupElement("Size"));
}


