// Generated by jextract

package com.twitter.teruteru128.preview.windows;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2405 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2405() {}
    static final VarHandle const$0 = constants$2403.const$4.varHandle(MemoryLayout.PathElement.groupElement("Interleave"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("Version"),
        JAVA_INT.withName("Size"),
        JAVA_INT.withName("SizeInBytes"),
        JAVA_INT.withName("MaxReliableWriteSizeInBytes"),
        JAVA_INT.withName("FrameFormat")
    ).withName("_STORAGE_RPMB_DESCRIPTOR");
    static final VarHandle const$2 = constants$2405.const$1.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    static final VarHandle const$3 = constants$2405.const$1.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    static final VarHandle const$4 = constants$2405.const$1.varHandle(MemoryLayout.PathElement.groupElement("SizeInBytes"));
    static final VarHandle const$5 = constants$2405.const$1.varHandle(MemoryLayout.PathElement.groupElement("MaxReliableWriteSizeInBytes"));
}

